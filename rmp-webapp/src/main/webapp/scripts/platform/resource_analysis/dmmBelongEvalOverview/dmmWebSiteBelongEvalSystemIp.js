base.portal.dmmWebSiteBelongEvalSystemIp = Ext.extend(Main.portal.PortalPage, {
					 init : function(params){
	                       var columns = [
	                                      new Ext.grid.RowNumberer(),
	                                      {header:'IP',dataIndex:'IP',hidden:false },
	                                      {header:'网站数量',dataIndex:'webSiteNum',hidden:false },
	                                      {header:'热点匹配度',dataIndex:'hotMatchDegree',hidden:false,renderer:Main.fun.getPerByReal},
	                                      {header:'更新日期',dataIndex:'updateDate',hidden:false }
	                                      ];
				                      	var self=this;
								        this.data={};
									    this.detailGrid = new Ext.ux.Grid({
									    	dataMethod:'dmmBelongEvalOverviewAction.getListWebSiteBelongEvalSystemIp',
									    	viewData:false,
											frame : false,
											border: false,
											columns:columns,
									    	columnLines : true,
									    	fetchSize : 10,		
									    	litePagingBar:true,									    	
									    	sortBar : false,
											height:260
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