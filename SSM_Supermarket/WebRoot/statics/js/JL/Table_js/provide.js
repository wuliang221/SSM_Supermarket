


//首页
function providefirstPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo=1"+"&GYSprovideName="+GYSName)
}	
//上一页
function provideupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo="+page+"&GYSprovideName="+GYSName);
}



//下一页
function providedowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo="+page+"&GYSprovideName="+GYSName)
}	

//末页
function providelastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo="+page+"&GYSprovideName="+GYSName)
}	


//根据条件查询
function providechazhao() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo=1&GYSprovideName="+GYSName)
}

//删除刷新
function provideshuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var GYSName=$("#providefilter").val();
	$("#maindiv").load(lianjie+"/GYS/GYSselect.html?pageNo="+page+"&GYSprovideName="+GYSName)
}	







