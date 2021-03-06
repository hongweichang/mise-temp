base.portal.DmWebsiteDelongevaluationAllsystem = Ext.extend(Main.portal.PortalPage, {
				    init : function(params) {
				    	var orgCodeField = new Ext.ux.seraph.DictCombo( {
						url : 'systemParmsProvider.do?type=TB_OP_W_0002_LIST',
						displayField : 'codeLabel',
						valueField : 'codeValue'
						});
				    	var columns = [new Ext.grid.RowNumberer(),
				    	 {header:'id',dataIndex:'id',hidden:true,width:220},
				    	 {header:'系统',dataIndex:'system',hidden:false,width:220,renderer:Ext.ux.renderer.Combo(orgCodeField)},
				    	 {header:'网站数量',dataIndex:'webSiteNum',hidden:false,width:220},
				    	 {header:'热点匹配度',dataIndex:'HotMatchingDegree',hidden:false,width:220,renderer:Main.fun.getPerByReal},			
				    	 {header:'更新日期',dataIndex:'updatedate',hidden:false,width:220}
				    	];
				    	var self=this;
				      	this.data={};					   
				  	    this.grid = new Ext.ux.Grid({
				  	    	dataMethod:'dmWebsiteSystemViewAction.getListMatchDegree',
				  			frame : false,
				  			border: false,
				  			columns:columns,
				  	    	columnLines : true,
				  	    	fetchSize : 15,
				  			width : 1100,
				  			height:260,
				  			listeners : {
				  	    		rowclick : Main.fun.Fun(self, self.onRowClick)
				  		    }
				  			});								  
				  	    },		
				  	    onRowClick:function(data){
				  		       var grid=this.grid;
				  			   var record = grid.getSelectionModel().getSelected();			    		
				  			   this.data.system = record.data.system;
				  			   this.data.webSiteNum=record.data.webSiteNum;
				  			   this.notice(this.data);
				  		    },
				  	    getGridData : function(data) {
				  	    	this.grid.updateParams(data);
				  		},
				  		render : function(div) {
				  			var obj = (Ext.getDom(div));
				  			this.grid.width = obj.offsetWidth-15;
				  			this.grid.height = obj.offsetHeight-15;
				  			this.grid.render(div);
				  		},
				  		refresh : function(data) {
				  			//alert(Ext.encode(data));
				  			this.getGridData(data);
				  		}						       
				  });