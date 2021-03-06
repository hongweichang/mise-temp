base.portal.dmResourceFlowViewChannelDomain = Ext.extend(Main.portal.PortalPage, {
	    init : function(params){
			
		  var row = [
		       { colspan: 1},
	           { colspan: 1},
	           { header: '总体情况', colspan: 8, align: 'center'},
	           { header: '各流向流量结构(占比)', colspan: 6, align: 'center' },
	           { colspan: 1}
		  ];
		  var group = new Ext.ux.grid.ColumnHeaderGroup({
		       rows: [row]
		  });
			
	       var columns = [ new Ext.grid.RowNumberer(),
	             {header:'ID',dataIndex:'dmResourceFlowViewChannelDomainId',hidden:true},
	             {header:'ICP',dataIndex:'ICP',width:100,hidden:false},
	             {header:'Host',dataIndex:'host',width:100,hidden:false},
	             {header:'Host IP',dataIndex:'hostIP',width:100,hidden:false},
	             {header:'请求次数',dataIndex:'reqNum',width:100,hidden:false},
	             {header:'总流量(MB)',dataIndex:'allFlow',hidden:false,width:100,renderer:Main.fun.getMFromByte},
	             {header:'上行流量(MB)',dataIndex:'uploadFlow',hidden:false,width:100,renderer:Main.fun.getMFromByte},
	             {header:'下行流量(MB)',dataIndex:'downloadFlow',hidden:false,width:100,renderer:Main.fun.getMFromByte},
	             {header:'DNS解析次数',dataIndex:'DNSResolNum',hidden:false,width:100},
	             {header:'本省',dataIndex:'local',hidden:false,width:100,
	            	 renderer:function(value){
	            	  return (value*100).toFixed(2)+'%';
	          	  	}},
	             {header:'外省',dataIndex:'otherProvince',hidden:false,width:100,
		            	 renderer:function(value){
		            	  return (value*100).toFixed(2)+'%';
		          	  	}},
	             {header:'电信',dataIndex:'CT',hidden:false,width:100,
			            	 renderer:function(value){
			            	  return (value*100).toFixed(2)+'%';
			          	  	}},
	             {header:'联通',dataIndex:'CUCC',hidden:false,width:100,
				            	 renderer:function(value){
				            	  return (value*100).toFixed(2)+'%';
				          	  	}},
	             {header:'铁通',dataIndex:'CTT',hidden:false,width:100,
					            	 renderer:function(value){
					            	  return (value*100).toFixed(2)+'%';
					          	  	}},
	             {header:'其他',dataIndex:'otherOperators',hidden:false,width:100,
						            	 renderer:function(value){
						            	  return (value*100).toFixed(2)+'%';
						          	  	}},
	             {header:'更新日期',dataIndex:'updateDate',hidden:false,width:100}
	              ];
		       	var self=this;
		       	var data={};
			    this.detailGrid = new Ext.ux.Grid({
			    	dataMethod:'dmResourceFlowViewICPAction.getChannelDomainList',
			    	viewData:false,
					frame : false,
					border: false,
					columns:columns,
			    	columnLines : true,
			    	sortBar : false,
			    	plugins: group,
			    	fetchSize : 15,		
					height:362
		    	});
	           },
				render : function(div) {
					this.detailGrid.render(div);
				},
				refresh : function(data) {
					this.updateData(data);
				}, 
				updateData : function(data) {
					this.detailGrid.updateParams(data);
				}
			});
