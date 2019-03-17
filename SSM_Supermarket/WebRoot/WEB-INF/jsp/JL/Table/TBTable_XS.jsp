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
	var barChartData = {
        
        labels : ["商品1","商品2","商品3","商品4","商品5","商品6","商品7","商品8","商品9","商品10","商品11","商品12","商品13","商品14",],
        datasets : [
            {
                fillColor : "rgba(106, 218, 228, 0.8)",
                data : [25,48,90,81,56,55,40,55,55,55,55,55,55,55]
            }
        ]

        
    }

var myLine = new Chart(document.getElementById("canvas1").getContext("2d")).Bar(barChartData,{
    scaleShowLabels : true,
    pointLabelFontSize : 100
});
	</script>
  </body>
</html>
