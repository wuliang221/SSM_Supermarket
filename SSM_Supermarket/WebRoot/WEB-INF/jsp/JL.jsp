<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  
  <meta charset="utf-8">
    <title>经理端v1.0</title>

    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/jquery.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/loader-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/bootstrap.css">
    
  </head>
  
  <body>
  		<!-- 引入模态框 -->
		<jsp:includepage="JL/module/modal_box.jsp"/>
  		<!-- 引入网页头部 -->
		<jsp:includepage="JL/module/head.jsp"/>
		<!-- 引入左侧选择框 -->
		<jsp:includepage="JL/module/JLleft.jsp"/>
    <div class="wrap-fluid">
        <div class="container-fluid paper-wrap bevel tlbr">
            <div class="row">
                <div id="paper-top">
                    <div class="col-sm-3">
                        <h2 class="tittle-content-header">
                            <i class="icon-document-edit"></i>
                            <span id="biaodanname">表单元素
                            </span>
                        </h2>

                    </div>

                    <div class="col-sm-7">
                        <div class="devider-vertical visible-lg"></div>
                        <div class="tittle-middle-header">

                            <div class="alert">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                <span class="tittle-alert entypo-info-circled"></span>
                                欢迎回来
                                <strong>${admin }${userName}</strong>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            <!-- 引入表单 -->
			<div class="content-wrap" id="maindiv"></div>
        </div>
        </div>
    </div>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/app.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/load.js"></script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/skin-select/jquery.cookie.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/main.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/JL/JL.js"></script>
	
	<input type="hidden" id="url" value="${pageContext.request.contextPath }">
	
  <%-- 	<script src="${pageContext.request.contextPath }/statics/js/JL/Table_js/goods.js"></script> --%>
 <%--  	<script src="${pageContext.request.contextPath }/statics/js/JL/Table_js/supplier.js"></script> --%>
  	<script src="${pageContext.request.contextPath }/statics/js/JL/Table_js/worker.js"></script>
  	<!-- 时间控件 -->
	<script src="${pageContext.request.contextPath }/statics/layDate-v5.0.9/laydate/laydate.js"></script>
	<script type="text/javascript">
	$(document).on('click', "#YG2", function(){
		laydate.render({
	    elem: '#YG2'
	    ,show: true //直接显示
	    ,closeStop: '#YG2' //这里代表的意思是：点击 test1 所在元素阻止关闭事件冒泡。如果不设定，则无法弹出控件
	  });
	});
	</script>
  </body>
</html>
