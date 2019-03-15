//ye:跳转到的页数
//cdn:那个页面跳转
function FY(ye,cdn){
	var lianjie=$("#url").val();
	if("Dealing" == cdn){
		//交易记录分页
		var ii=$("#DealingJY").val();
		lianjie+="/JL/Dealing.html?pageNo="+ye+"&memberID="+ii;
	}
	$("#maindiv").load(lianjie);
}



//首页
function firstPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo=1"+"&typeNo="+type+"&goodsName="+goodsName)
}	
//上一页
function upPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName);
}



//下一页
function dowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName)
}	

//末页
function lastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName)
}	


//根据条件查询
function chazhao() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo=1&typeNo="+type+"&goodsName="+goodsName)
}

//删除刷新
function shuaxin() {
	var lianjie=$("#url").val();
	var page=$("#pageNothis").val();
	var type=$("#typeno").val();
	var goodsName=$("#filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoods.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName)
}	







//查询库存分页
//首页
function SP2firstPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#SP2typeno").val();
	var goodsName=$("#SP2filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoodscount.html?pageNo=1"+"&typeNo="+type+"&goodsName="+goodsName)
}	
//上一页
function SP2upPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#SP2typeno").val();
	var goodsName=$("#SP2filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoodscount.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName);
}



//下一页
function SP2dowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	var type=$("#SP2typeno").val();
	var goodsName=$("#SP2filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoodscount.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName)
}	

//末页
function SP2lastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	var type=$("#SP2typeno").val();
	var goodsName=$("#SP2filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoodscount.html?pageNo="+page+"&typeNo="+type+"&goodsName="+goodsName)
}	


//根据条件查询
function SP2chazhao() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	var type=$("#SP2typeno").val();
	var goodsName=$("#SP2filter").val();
	$("#maindiv").load(lianjie+"/goods/findgoodscount.html?pageNo=1&typeNo="+type+"&goodsName="+goodsName)
}



