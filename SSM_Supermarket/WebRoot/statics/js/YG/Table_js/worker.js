//首页
function workerfirstPage() {
	var lianjie=$("#url").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo=1&ygworkername="+workername)
}	
//上一页
function workerupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo="+page+"&ygworkername="+workername)
	}



//下一页
function workerdowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo="+page+"&ygworkername="+workername)}	

//末页
function workerlastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo="+page+"&ygworkername="+workername)
}	


//根据条件查询
function ygchazhao() {
	var lianjie=$("#url").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo=1&ygworkername="+workername)
}

//删除刷新
function ygshuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var workername=$("#YGfilter").val();
	$("#maindiv").load(lianjie+"/yg/worker.html?pageNo="+page+"&ygworkername="+workername)
}	
