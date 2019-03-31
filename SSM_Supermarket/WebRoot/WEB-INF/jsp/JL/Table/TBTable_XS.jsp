<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
  </head>
  
  <body>
    <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="labelClose">
                            <div class="title-alt"></div>
                            <div class="body-nest" id="label">
                                <canvas id="canvas1" class="myChart" height="416" width="900"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
    <script type="text/javascript">
    	$.ajax({
		type :"get",
		url:$("#url").val()+"/table/XSTBXJ.html",
		dataType:"json",
		success : function(data1) {
						var o=new Array();
						var p=new Array();
						var data=eval("("+data1+")");
						for(var i=0;i<data.length;i++){
							o[i]=data[i].merchName;
							p[i]=data[i].saleNum;
						}
						var name=[o[0],o[1],o[2],o[3],o[4],o[5],o[6],o[7],o[8],o[9],o[10],o[11],o[12],o[13]];
    					var num=[p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9],p[10],p[11],p[12],p[13]];
						var barChartData = {
					        labels : name,
					        datasets : [
					            {
					                fillColor : "rgba(106, 218, 228, 0.8)",
					                data : num
					            }
					        ]
					    }
						var myLine = new Chart(document.getElementById("canvas1").getContext("2d")).Bar(barChartData,{
						    scaleShowLabels : true,
						    pointLabelFontSize : 100
						});
					},
		});
	</script>
  </body>
</html>
