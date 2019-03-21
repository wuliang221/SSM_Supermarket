












//分页跳转
function FY(ye,cdn){
	var lianjie=$("#url").val();
	if(cdn == "DealingJYB"){
		//交易记录分页
		lianjie+="/JL/Dealing.html?pageNo="+ye+"&memberID="+$("#DealingJY").val();
	}else if(cdn == "stock1"){
		//计划进货分页
		lianjie+="/stock/stock1.html?pageNo="+ye;
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
			ht+="<p class=''text-right'>总计</p><span class='label label-danger'>"+ml+"</span>"+"<p class=''text-right'>￥</p>";
			$("#JYXQmdod").html(ht);
		}
	
	})
	$("#JYXQ").modal({backdrop:"static"});
}

//主页时间显示
function shu() {
    var date=new Date();
    document.getElementById("data").innerHTML=(date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日");
    document.getElementById("shi").innerHTML=(date.getHours());
    document.getElementById("fen").innerHTML=(date.getMinutes());
    document.getElementById("miao").innerHTML=(date.getSeconds());
    if(date.getHours()==0){
        document.getElementById("wu").innerHTML=("午夜");
    }else if(date.getHours()>=1 && date.getHours()<=4) {
        document.getElementById("wu").innerHTML=("凌晨");
    }else if(date.getHours()==5) {
        document.getElementById("wu").innerHTML=("清晨");
    }else if(date.getHours()>=6 && date.getHours()<=7) {
        document.getElementById("wu").innerHTML=("早上");
    }else if(date.getHours()>=8 && date.getHours()<=10) {
        document.getElementById("wu").innerHTML=("上午");
    }else if(date.getHours()>=11 && date.getHours()<=12) {
        document.getElementById("wu").innerHTML=("中午");
    }else if(date.getHours()>=13 && date.getHours()<=16) {
        document.getElementById("wu").innerHTML=("下午");
    }else if(date.getHours()==17) {
        document.getElementById("wu").innerHTML=("傍晚");
    }else if(date.getHours()>=18 && date.getHours()<=23) {
        document.getElementById("wu").innerHTML=("晚上");
    }
}
var myTime=window.setInterval("shu()",100);