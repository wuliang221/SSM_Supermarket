//首页
function JLMenderfirstPage() {
	var lianjie=$("#url").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo=1&jlMenberPhone="+jlMenberPhone)
}	
//上一页
function JLMenderupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo="+page+"&jlMenberPhone="+jlMenberPhone)
	}



//下一页
function JLMenderdowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo="+page+"&jlMenberPhone="+jlMenberPhone)}	

//末页
function JLMenderlastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo="+page+"&jlMenberPhone="+jlMenberPhone)
}	


//根据条件查询
function HYchazhao() {
	var lianjie=$("#url").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo=1&jlMenberPhone="+jlMenberPhone)
}

//删除刷新
function HYshuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var jlMenberPhone=$("#HYfilter").val();
	$("#maindiv").load(lianjie+"/JL/Menber.html?pageNo="+page+"&jlMenberPhone="+jlMenberPhone)
}	
