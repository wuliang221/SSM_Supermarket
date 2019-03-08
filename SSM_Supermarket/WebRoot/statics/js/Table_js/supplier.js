function supplierfirstPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	$("#maindiv").load(lianjie+"/supplier/suppslelct.html?pageNo=1")
}	

function supplierupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
		$("#maindiv").load(lianjie+"/supplier/suppslelct.html?pageNo="+page)
		
}




function supplierdowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	$("#maindiv").load(lianjie+"/supplier/suppslelct.html?pageNo="+page)
}	

function supplierlastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	$("#maindiv").load(lianjie+"/supplier/suppslelct.html?pageNo="+page)
}	