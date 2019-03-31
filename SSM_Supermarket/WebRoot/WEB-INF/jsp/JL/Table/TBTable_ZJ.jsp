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
    <div class="content-wrap">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="lineClose">
                            <div class="title-alt">
                            </div>
                            <div class="body-nest" id="line">
                                <canvas id="canvas4" class="myChart" height="416" width="900"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    <script type="text/javascript">
    	var yueDate = 1+(new Date().getMonth());
    	var yue = ["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"];
    	var yf=new Array(7);
    	if(yueDate >= 7 ){
    		for(var i=(yueDate-7);i<yueDate;i++){
    			yf[i] = yue[i];
    		}
    	}else {
    		var ii=0;
    		for(var i=(yueDate-6);i<yueDate;i++){
    			if(i>=0){
    				yf[ii++] = yue[i];
    			}else {
    				yf[ii++] = yue[i+12];
    			}
    		}
    	}
    	$.ajax({
		type :"get",
		url:$("#url").val()+"/table/ZJTBXJ.html",
		dataType:"json",
		success : function(data1) {
				var jin=new Array();
		    	var chu=new Array();
		    	var data=eval("("+data1+")");
						for(var i=0;i<data.salePrice.length;i++){
							jin[i]=data.salePrice[i].salePrice;
							chu[i]=data.totalPrice[i].totalPrice;
						}
				var lineChartData = {
			        labels : [yf[0],yf[1],yf[2],yf[3],yf[4],yf[5]],
			        datasets : [
				            {
				                fillColor : "rgba(49, 195, 166, 0.2)",
				                
				                strokeColor : "rgba(49, 195, 166, 1)",
				                pointColor : "rgba(49, 195, 166, 1)",
				                pointStrokeColor : "#fff",
				                data : [jin[0],jin[1],jin[2],jin[3],jin[4],jin[5]]
				            },
				            {
				                fillColor : "rgba(151,187,205,0.5)",
				                strokeColor : "rgba(151,187,205,1)",
				                pointColor : "rgba(151,187,205,1)",
				                pointStrokeColor : "#fff",
				                data : [chu[0],chu[1],chu[2],chu[3],chu[4],chu[5]]
				            }
			        	]
				    }
					var myLine = new Chart(document.getElementById("canvas4").getContext("2d")).Line(lineChartData);
			}
		});
		
    	
	</script>
  </body>
</html>
