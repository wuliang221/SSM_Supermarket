//首页
function MerchinfofirstPage() {
	var lianjie=$("#url").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo=1&MerchinName="+MerchinName)
}	
//上一页
function MerchinfoupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
	}



//下一页
function MerchinfodowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)}	

//末页
function MerchinfolastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
}	


//根据条件查询
function Merchinfochazhao() {
	var lianjie=$("#url").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo=1&MerchinName="+MerchinName)
}

//删除刷新
function Merchinfoshuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var MerchinName=$("#MerchinfoFilter").val();
	$("#maindiv").load(lianjie+"/Merchin/MerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
}	
