<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/platform/includes.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/styles/platform/main.css">
	<!--<link rel="stylesheet" type="text/css" href="test.css">-->
	<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/platform/resource_manager/ext-basex.js"></script>
	<%@ include file="/WEB-INF/jsp/platform/portal/abstractPortal.jsp"%>
	<script type="text/JavaScript" src="<%=request.getContextPath()%>/scripts/platform/resource_analysis/analysisReport/dmAnalysisReportWebSiteResDistrDetail.js"></script>
	<script type="text/JavaScript">
	var websiteID = null;
	  function noticeHandler(params) {
		var data = {};
		if (typeof (params) == "string") {
			eval('data = ' + params);
		} else if (typeof (params) == 'object') {
			data = params;
		}
		websiteID = data.webSiteId;
		getChartData(data);	
	 }
	 var noticeNeighbour = function(params) {
		// 通知邻居Cell,并传递参数
		parent.EventHandler.cellLevelNotice(cellId, params);
	 }

	 function updateData(data){
		 barData.setSeries(data);
		 barData.setTitle('各省域名本网引入率');
		 domainIntroRate.setJSData(barData.getData());
	 }
	 
	 function onCheck(){
		 var str=document.getElementsByName("checkType");
		 var checkArr = '';
		 var map = {};
		 for(i=0; i<str.length; i++){
			 if(str[i].checked == true){
				 checkArr += str[i].value + ",";
			 }
		 }
		 map.type = checkArr;
		 map.webSiteId = websiteID;
		 M.rpc._call(updateData, 'analysisReportNetWorkWebSiteResDistrService.getAnalysisReportDomainIntroRate',{
			javaClass : 'java.util.HashMap',
			map : map
		});
	 }
	</script>
	
</head>
<body>
  <div>
     <div class="w1" id="domainNumChart" style="width:48%"> </div>
     <div class="w1" id="outerLinkResChart" style="width:48%"> </div>
     <div class="w2" id="barData" style="width:100% ;overflow:auto;height:400;" >
      	<div id="checkBoxID" style="width:100% ;overflow:auto;height:30;" >
		请选择类型：<input type="checkbox" name="checkType" value="1100">IDC
				   <input type="checkbox" name="checkType" value="9999">其他
				   <input type="checkbox" name="checkType" value="1200">Cache
				   <input type="checkbox" name="checkType" value="1300">对等直连
				   <input type="checkbox" name="checkType" value="1800">CDN
				   <input type="button" name="clickBtm" value="查询" onClick="onCheck();">
				
	 	</div>
      	<div id="barChart" style="width:100% ;overflow:auto;height:370;" ></div>
     </div>
     <div class="w2" id="lineData" style="width:100% ;overflow:auto;height:370;" >
      <div id="lineChart"></div>
     </div>
  </div>
</body>