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
