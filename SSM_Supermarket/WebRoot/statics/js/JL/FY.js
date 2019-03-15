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
function js_JYXQ(data) {
	$("#JYXQ").modal({backdrop:"static"});
}