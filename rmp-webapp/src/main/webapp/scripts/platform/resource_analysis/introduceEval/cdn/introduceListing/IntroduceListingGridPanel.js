function getIntroduceListing(record){
	var yesOrno = new Ext.ux.seraph.DictCombo( {
		url: 'parmInfoProvider.do?parmType=YES_NO',
		displayField: 'parmName',
		valueField: 'parmCode'
	});
    var gridColumns = [new Ext.grid.RowNumberer(), {
        header: '域名',
        width: 120,
        sortable: true,
        dataIndex: 'domain',
        hidden: false,
        hideable: false
    }, {
        header: "域名级别",
        width: 100,
        sortable: true,
        dataIndex: "domainLevel",
        hidden: false,
        hideable: false
    }, {
        header: "URL资源数量",
        width: 120,
        sortable: true,
        dataIndex: "urlResNum",
        hidden: false,
        hideable: false
    }, {
        header: 'URL资源大小(MB)',
        width: 120,
        sortable: true,
        dataIndex: 'urlResSize',
		align: 'right',
        hidden: false,
        hideable: false,
		renderer: function(value){
			
			return Main.fun.getMFromByte(value);
		}
    }, {
        header: '可缓存资源数量',
        width: 120,
        sortable: true,
        dataIndex: 'cacheResNum',
		align: 'right',
        hidden: false,
        hideable: false
    }, {
        header: '可缓存资源大小(MB)',
        width: 130,
        sortable: true,
        dataIndex: 'cacheResSize',
		align: 'right',
        hidden: false,
        hideable: false,
		renderer: function(value){
			
			return Main.fun.getMFromByte(value);
		}
    }, {
        header: '可缓存资源数量占比',
        width: 140,
        sortable: true,
        dataIndex: 'cacheResNumProportion',
		align: 'right',
        hidden: false,
        hideable: false,
        renderer: function(value){
            return Main.fun.getPerByReal(value);
        }
    }, {
        header: '可缓存资源大小占比',
        width: 140,
        sortable: true,
        dataIndex: 'cacheResSizeProportion',
		align: 'right',
        hidden: false,
        hideable: false,
        renderer: function(value){
            return Main.fun.getPerByReal(value);
        }
    }, {
		header: 'DNS解析次数',
		width: 120,
		sortable: true,
		dataIndex: 'DNSResolNum',
		hidden: false,
		align: 'right',
		hideable: false
	}/*, {
		header: '请求次数',
		width: 80,
		sortable: true,
		dataIndex: 'reqNum',
		hidden: false,
		align: 'right',
		hideable: false
	}, {
		header: '总流量(MB)',
		width: 110,
		sortable: true,
		dataIndex: 'allFlow',
		hidden: false,
		align: 'right',
		hideable: false,
		renderer: function(value){
			
			return Main.fun.getMFromByte(value);
		}
	}, {
		header: '上行流量(MB)',
		width: 110,
		sortable: true,
		dataIndex: 'upFlow',
		hidden: false,
		align: 'right',
		hideable: false,
		renderer: function(value){
			
			return Main.fun.getMFromByte(value);
		}
	}, {
		header: '下行流量(MB)',
		width: 110,
		sortable: true,
		dataIndex: 'downFlow',
		hidden: false,
		align: 'right',
		hideable: false,
		renderer: function(value){
			
			return Main.fun.getMFromByte(value);
		}
	}*/, {
        header: '是否已引入',
        width: 90,
        sortable: true,
        dataIndex: 'ableIntroduce',
        hidden: false,
        hideable: false,
		renderer: Ext.ux.renderer.Combo(yesOrno)
    }, {
        header: '更新日期',
        width: 90,
        sortable: true,
        dataIndex: 'updateDate',
        hidden: false,
        hideable: false
    }];
    
    this.detailGrid = new Ext.ux.Grid({
        dataMethod: 'dmCDNIntroduceEvalAction.getCDNIntroduceListing',
        columns: gridColumns,
        fetchSize: 15,
        sm: new Ext.grid.RowSelectionModel({
            singleSelect: true
        }),
        columnLines: true,
        tbar : new Ext.Toolbar({}),
        height: 370,
        width:885,
        frame: false,
        border: false,
        bodyBorder: false,
        viewData: false
    });
    
    this.detailGrid.getTopToolbar().add("排序依据：");
    this.detailGrid.getTopToolbar().add({
        xtype: 'dictcombo',
		url: 'parmInfoProvider.do?parmType=HOT_BASIS_ALL',
		displayField: 'parmName',
		valueField: 'parmCode',
		value: 'DNSResolNum',
        hiddenName: 'hotBasis',
        maxLength: 128,
        anchor: '95%'
    });
    this.detailGrid.getTopToolbar().addSeparator();
    this.detailGrid.getTopToolbar().add("TOP：");
    this.detailGrid.getTopToolbar().add({
        xtype: 'dictcombo',
		url: 'parmInfoProvider.do?parmType=TOPN',
		displayField: 'parmName',
		valueField: 'parmCode',
        hiddenName: 'topN',
		value: '1000'
    });
	
	/*var IntroduceListingSearchFormPanel = new Ext.introduceEval.IntroduceListing.SearchFormPanel({
		webSiteID: record.get('webSiteID')
	});*/
    var windows = new Ext.Window({
        title: "引入清单",
        width: 900,
        height: 436,
        border: false,
		//layout: 'border',
        bodyBorder: false,
        autoScroll: true,
		modal: true,
        items: [/*{
	        region: 'north',
	        iconCls: 'panel-search-icon',
			title: '查询条件',
	        height: 90,
	        margins: '5 5 5 5',
	        collapsible: true,
	        layout: 'fit',
	        items: IntroduceListingSearchFormPanel
	    }, {
	        region: 'center',
	        iconCls: 'panel-grid-icon',
			title: '查询结果',
	        autoScroll: true,
	        margins: '0 5 5 5',
	        layout: 'fit',
	        // 设置默认查询条件
	        items: detailGrid
	    }*/detailGrid]
    });
    
    windows.show();
    var data = {};//IntroduceListingSearchFormPanel.getForm().getValues();
	var tbar = this.detailGrid.getTopToolbar();
	var queryFields = tbar.findByType('field');
	for(var i = 0; i < queryFields.length;i++)
	{
		data[queryFields[i].getName()] = queryFields[i].getValue();
	}
	data.province = record.get('province');
	data.webSiteID = record.get('webSiteID');
    searchDetailGrid(data);
}

function searchDetailGrid(data){
    this.detailGrid.setParams(data);
    this.detailGrid.doSearchList();
}