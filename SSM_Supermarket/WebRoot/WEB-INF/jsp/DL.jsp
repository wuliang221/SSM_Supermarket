<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品进销存系统1.0</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/jquery.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/signin.css">

    <link rel="shortcut icon" href="${pageContext.request.contextPath }/statics/assets/ico/minus.png">
  </head>
  
  <body>
	<div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    <div class="container">
        <div class="" id="login-wrapper">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div id="logo-login">
                        <h1>超市进销存系统
                            <span>v1.0</span>
                        </h1>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="account-box"> 
                        <%-- <form id="from" action="${pageContext.request.contextPath }/fin/z.html" method="post"> --%>
                            <div class="form-group">
                                <input type="text"  id="inputUsernameEmail" class="form-control" placeholder="请输入用户名">
                            </div>
                            <div class="form-group">
                                <input type="password"  id="inputPassword" class="form-control" placeholder="请输入密码">
                            </div>
                            <div class="form-group">
                            </div>
                            <button class="btn btn-primary btn-lg btn-block" type="submit" id="form">
                                	登 录
                            </button>
                            
                      <!--   </form> -->
                       
                        <div class="row-block">
	                        <div class="row">
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
 		<p>&nbsp;</p>
        <div style="text-align:center;margin:0 auto;">
            <h6 style="color:#fff;">员工账号注册请联系管理员<br />
				管理员账号注册请联系超级管理员</h6>
        </div>
    </div>
    <div id="test1" class="gmap3"></div>
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/bootstrap.js"></script>
	 <script src="${pageContext.request.contextPath }/statics/assets/js/jquery-1.12.4.js"></script>
    <script>
	
		//表单非空验证
        $("#form").click(function(e){
        	var pd=false;
        	//获取账号
        	var id=$("#inputUsernameEmail").val();
        	//获取密码
        	var pass=$("#inputPassword").val();
        	//获取身份
        	var status=$("#signin-status").val();
        	//获取url
        	var url=$("#url").val();
        	$.ajax({
				type :"post",
				url:url+"/fin/dl.json",
				data:{UserPhone:id,UserPW:pass},
				dataType:"json",	
				success : function(data) {
				if(data == "success1"){
						window.location.href=url+"/fin/JL.html";
						return true;
					}
				if(data == "success2"){
						window.location.href=url+"/fin/YG.html";
						return true;
					}
					
					
				},
				error : function() {
					alert("账号密码有误，请重新登陆！");
					return false;
				}
			});
        	
        	
		});
		
        
    </script>    


	<input type="hidden" id="url" value="${pageContext.request.contextPath }">
  </body>
</html>
