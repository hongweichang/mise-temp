// -> Action URL
var URL = {
	queryList : 'otherAreaCacheDispatcherListProvider.do',
	action : 'clearDNSDispathcherAction.do'
};

var storeFields = [{
			name : 'domainId'
		}, {
			name : 'domainName'
		}, {
			name : 'viewcount'
		}, {
			name : 'rate'
		}, {
			name : 'websiteName'
		}, {
			name : 'lastDayId'
		}, {
			name : 'lastIPs'
		}, {
			name : 'dispatchType'
		}, {
			name : 'freq'
		}];

var userColumns = [{
			header : 'id',
			width : 500,
			dataIndex : 'domainId',
			hidden : true,
			hideable : false
		}, {
			header : '域名',
			width : 120,
			sortable : true,
			dataIndex : 'domainName',
			hidden : false,
			hideable : false
		}, {
			header : '访问次数',
			width : 120,
			sortable : true,
			dataIndex : 'viewcount',
			hidden : false,
			hideable : false
		}, {
			header : '流量',
			width : 120,
			sortable : true,
			dataIndex : 'rate',
			hidden : false,
			hideable : false
		}, {
			header : '所属网站',
			width : 120,
			sortable : true,
			dataIndex : 'websiteName',
			hidden : false,
			hideable : false
		}, {
			header : '最后一次调度方式',
			width : 120,
			sortable : true,
			dataIndex : 'dispatchType',
			renderer:function(value)
			{
				if(value==0) return '成本优先';
				else if(value==1) return '质量优先';
				else if(value==2) return '阀值优先';
			},
			hidden : false,
			hideable : false
		}, {
			header : '最后一次调度时间',
			width : 120,
			sortable : true,
			dataIndex : 'lastDayId',
			hidden : false,
			hideable : false
		}, {
			header : '最后一次调度IP',
			width : 120,
			sortable : true,
			dataIndex : 'lastIPs',
			hidden : false,
			hideable : false
		}];

var orgCodeField = new Ext.ux.seraph.DictCombo( {
	url : 'systemParmsProvider.do?type=TB_OP_W_0103_LIST',
	displayField : 'codeLabel',
	valueField : 'codeValue'
});
var operatorCodeField = new Ext.ux.seraph.DictCombo( {
	url : 'systemParmsProvider.do?type=TB_OP_W_0001_LIST',
	displayField : 'codeLabel',
	valueField : 'codeValue'
});
var systemParamsField = new Ext.ux.seraph.DictCombo( {
	url : 'systemParmsProvider.do?type=TB_OP_W_0002_LIST',
	displayField : 'codeLabel',
	valueField : 'codeValue'
});


//调度IP
//domain - 域名
//iplist - 需要调度的ip 列表，多个ip之间用逗号隔开的字符串
function dispatchIP(dispatchBean)
{
	   Ext.MessageBox.show({
           msg: '正在对IP进行探测, 请稍候 ...',
           progressText: 'IP进行探测中...',
           width:300,
           wait:true
       });
	M.rpc._call(testCallBack,'otherAreaCacheDispatcherAction.testValiadIps',dispatchBean.ips,dispatchBean.domainName);
	
	function testCallBack(ips,error)
	{
		if(error)
			Ext.Msg.alert('提示','探测失败');
			
			Ext.MessageBox.hide();
			if(ips)
				dispatchBean.ips = ips.join(",");
			if(dispatchBean.ips==null ||dispatchBean.ips.trim() =="" )
			{
				Ext.Msg.alert('提示','没有找到符合条件且能够被调度的IP');
				return;
			}else
			{
				Ext.Msg.confirm("提示","经网络测试可以被调度的IP为：<br>"+dispatchBean.ips.split(",").join("<br>")+'<br>是否进行调度?',function(button,text){
					if(button=='yes')
					{
						var result = M.rpc._call('otherAreaCacheDispatcherAction.dispathIPs',dispatchBean);
						if(result)
						{
							Ext.Msg.alert('提示','DNS服务器已接收到调度命令!<br>被调度IP为：<br>'+dispatchBean.ips.split(",").join("<br>"));
						}else
						{
							Ext.Msg.alert('提示','DNS服务器未收到调度命令,调度失败!');
						}
					}
				});
			}
	}
}

function ipDisaptcher(data) {
	var domainId = data.domainId;
	var domainName = data.domainName;
	var ipList = M.rpc._call(
			"otherAreaCacheDispatcherAction.getIPListByDomainId",domainId,data.freq);
	ipList= ipList;
	var columns = [{
				header : 'ip',
				width : 200,
				dataIndex : 'ip',
				hidden : false,
				hideable : false
			}, {
				header : '质量分',
				width : 120,
				sortable : true,
				dataIndex : 'score',
				hidden : false,
				hideable : false
			}, {
				header : '所属运营商',
				width : 120,
				sortable : true,
				dataIndex : 'operator',
				renderer: Ext.ux.renderer.Combo(operatorCodeField),
				hidden : false,
				hideable : false
			}, {
				header : '所属地域',
				width : 120,
				sortable : true,
				dataIndex : 'area',
				renderer: Ext.ux.renderer.Combo(orgCodeField),
				hidden : false,
				hideable : false
			}, {
				header : '所属运营商系统',
				width : 120,
				sortable : true,
				dataIndex : 'system',
				renderer: Ext.ux.renderer.Combo(systemParamsField),
				hidden : false,
				hideable : false
			}];

	var store = new Ext.data.JsonStore({
				fields : ['ip', 'score', 'operator', 'area', 'system'],
				data:ipList
			});
var sm = new Ext.grid.CheckboxSelectionModel();
	var ipgrid = new Ext.grid.GridPanel({
				height:300,
				columns : [sm].concat(columns),
				sm:sm,
				store : store
			})

	var dispatcher = new Ext.Button({
				text : '调度',
				handler:function()
				{
						var record = ipgrid.getSelectionModel().getSelected();
						if (!record) {
							Ext.Msg.alert('提示', '请先选择一条记录！');
							return;
						}
					var ips = [];
					var records = ipgrid.getSelectionModel().getSelections();
					for(var i = 0; i < records.length;i++)
					{
						var rec = records[i];
						ips[ips.length]= rec.data.ip;
					}
					dispatchIP({domainName:domainName,ips:ips.join(",")});
				}
			});

	var form = new Ext.Panel({
				frame : true,
				layout : 'form',
				title : '域名:' + domainName,
				items : [ipgrid]
			});

	var window = new Ext.Window({
				title : '手动调度',
				width:800,
				items : form,
				buttonAlign:'center',
				buttons : [dispatcher,{
							text : '取消',
							handler : function() {
								window.hide()
							}
						}]
			});
	window.show();
}

Ext.onReady(function() {

	Ext.QuickTips.init();

	Ext.override(Ext.ux.seraph.FormEditorGrid, {
				initComponent : function() {

					// build selection model
					this.sm = this.buildSelectionModel();

					// build columns model
					var originCM = this.buildColumnModels();
					var customerCM = this.columns;
					this.columns = originCM.concat(customerCM);

					// build form
					this.formPanel = this.buildForm();

					// build editor
					this.editor = this.buildEditor();

					// build Tbar
					// this.tbar = this.buildTbar(this.queryFields);

					// build store
					this.store = this.buildStore();

					// build pagingToolbar
					this.pagingToolbar = this.buildPagingToolbar();
					this.bbar = this.pagingToolbar;

					// Set auto-column width, viewConfig:
					// {forceFit:true}
					// this.getView().forceFit = true;

					// this.on('rowdblclick',
					// userGrid.showVideoUrlDetail, this);
					this.on('load', this.loadData(), this);

					// super
					Ext.ux.seraph.FormEditorGrid.superclass.initComponent
							.apply(this, arguments);
				}
			});

	var yjstore = new Ext.data.SimpleStore({
				fields : ['value', 'text'],
				data : [['rate', '流量'], ['viewcount', '访问次数']]
			});
	var zqstore = new Ext.data.SimpleStore({
				fields : ['value', 'text'],
				data : [['RD1', '一天'], ['RW1', '一周'], ['RM1', '一月']]
			});

	var queryFields = [{
				text : '域名地址'
			}, {
				xtype : 'textfield',
				id : '#domainName',
				width : 90

			}, {
				text : '热点排序'
			}, new Ext.form.ComboBox({
						id : '#orderby',
						width : 90,
						store : yjstore,
						mode : 'local',
						triggerAction : 'all',
						showAllSelect : true,
						displayField : 'text',
						valueField : 'value',
						value : 'viewcount'
					}), {
				text : '周期'
			}, new Ext.form.ComboBox({
						id : '#cycle',
						width : 90,
						store : zqstore,
						mode : 'local',
						triggerAction : 'all',
						showAllSelect : true,
						displayField : 'text',
						valueField : 'value',
						value : 'RW1'
					})];

	var queryParms = [{
				name : 'domainName',
				indicator : 'EXAMPLE_LIKE'
			}, {
				name : 'orderby',
				indicator : 'EXAMPLE_EQUALS'
			}, {
				name : 'cycle',
				indicator : 'EXAMPLE_EQUALS'
			}];

	var userGrid = new Ext.ux.self.FormEditorGrid({
		renderTo : 'user-grid',
		width : Ext.get("content").getWidth(),
		height : Ext.get("content").getHeight(),
		storeFields : storeFields,
		formFields : [],
		queryFields : queryFields,
		queryParms : queryParms,
		columns : userColumns,
		pk : 'domainId',
		url : URL,
		tbar : [{
					text : '手动调度',
					iconCls : 'dataTableList-modify-icon',
					handler : function() {
						var record = userGrid.getSelectionModel().getSelected();
						if (!record) {
							Ext.Msg.alert('提示', '请先选择一条记录！');
							return;
						}

						ipDisaptcher(record.data);
						// todo
					}
				}, '-',queryFields, {
					text : '查询',
					iconCls : 'dataTable-preview-icon',
					handler : function() {
						userGrid.loadData();
					}
				}, '-', {
					text : '刷新',
					iconCls : 'role-user-reset',
					handler : function() {
						Ext.getCmp('#domainName').setValue();
						Ext.getCmp('#orderby').setValue('viewcount');
						Ext.getCmp('#cycle').setValue('RW1');
						userGrid.loadData();
					}
				}]
	});
	userGrid.purgeListeners();
});