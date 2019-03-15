//ye:跳转到的页数
//cdn:那个页面跳转
function FY(ye,cdn){
	var lianjie=$("#url").val();
	if("DealingJYB" == cdn){
		//交易记录分页
		lianjie+="/JL/Dealing.html?pageNo="+ye+"&memberID="+$("#DealingJY").val();;
	}
	
	$("#maindiv").load(lianjie);
}

//交易详情模态框弹出并赋值
function js_JYXQ(data1) {
	$.ajax({
		type :"POST",
		url:$("#url").val()+"/JL/Sale.html",
		data:{dealingID:data1},
		dataType:"JSON",
		success : function(data2) {
			var data=eval("("+data2+")")
			var ht="<p class='text-uppercase'><h4>交易单号："+data1+"</p><dl class='dl-horizontal'>";
			var ml=0;
			for(var i = 0; i < data.length; i++){
				ht+="<dt>"+data[i].merchName+"</dt><dd>&nbsp;&nbsp;&nbsp;"+data[i].merchPrice+"￥*"+data[i].saleNum+"</dd>";
				 ml+=data[i].saleNum*data[i].merchPrice;
				}
			ht+="<p class=''text-right'>总计"+ml+"￥</p>";
			$("#JYXQmdod").html(ht);
		}
	
	})
	$("#JYXQ").modal({backdrop:"static"});
}