//首页
function MerchinfoCXfirstPage() {
	var lianjie=$("#url").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo=1&MerchinName="+MerchinName)
}	
//上一页
function MerchinfoCXupPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
	}



//下一页
function MerchinfoCXdowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)}	

//末页
function MerchinfoCXlastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
}	


//根据条件查询
function MerchinfoCXchazhao() {
	var lianjie=$("#url").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo=1&MerchinName="+MerchinName)
}

//删除刷新
function MerchinfoCXshuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var MerchinName=$("#merchinfocxfilter").val();
	$("#maindiv").load(lianjie+"/Merchin/AllowAbateMerchinSelect.html?pageNo="+page+"&MerchinName="+MerchinName)
}	
