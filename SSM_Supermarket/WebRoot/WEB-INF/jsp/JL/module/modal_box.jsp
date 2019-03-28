<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- 交易记录详情模态框 -->
<div class="modal fade" id="JYXQ" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel4"></h4>
      </div>
      <div id="JYXQmdod" class="modal-body">
      	
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>



<!-- 手动添加进货订单模态框 -->
<div class="modal fade" id="SDJYDD" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" >计划订单添加</h4>
      </div>
      <div id="" class="modal-body">
      <form class="form-horizontal">
      	 <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品</label>
		    <div class="col-sm-10" id="SDJYDDname">
		     <select class="form-control" id="SDJYDDid">
		     		<option value="0" >=请选择商品=</option>
                   <c:forEach items="${merchinfo}" var="m">
	                 <option value="${m.merchID }" >${m.merchName }</option>
	               </c:forEach>
              </select>
			</div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">进货数量</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="SDJYDDnum" >
		    </div>
		  </div>
		  </from>
      </div>
      <div class="modal-footer">
      	<button type="button" class="btn btn-default" onclick="js_tianjia('交易订单修改保存')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>







<!-- 进货订单修改模态框 -->
<div class="modal fade" id="SDJYDD1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" >计划订单修改</h4>
      </div>
      <div id="" class="modal-body">
	     <form class="form-horizontal">
	     <input type="hidden" id="SDJYDDid1" value=""/>
      	 <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品</label>
		    <div class="col-sm-10" id="SDJYDDname">
		     <select class="form-control" id="SDJYDDname1">
		     		<option value="0" >=请选择商品=</option>
                   <c:forEach items="${merchinfo}" var="m">
	                 <option value="${m.merchID }" >${m.merchName }</option>
	               </c:forEach>
              </select>
			</div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">进货数量</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="SDJYDDnum1" >
		    </div>
		  </div>
		  </from>
      </div>
      <div class="modal-footer">
      	<button type="button" class="btn btn-default" onclick="js_js_xiugai('计划订单修改')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>








<!-- 商品修改模态框 -->
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel1">商品修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail10" value="商品编号">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail11" >
		    </div>
		  </div>
		    <%-- <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品类别</label>
		    <div class="col-sm-10" id="depart">
		      <select class="form-control" id="inputEmail12">
		      <c:forEach items="${type }" var="t">
	             <option value="${t.typeno }">${t.typename }</option>
	          </c:forEach>
				</select>
		    </div>
		  </div> --%>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">供应商</label>
		    <div class="col-sm-10" id="depart">
		     <select class="form-control" id="inputEmail12">
                   <c:forEach items="${pro}" var="s">
	                 <option value="${s.provideID }" >${s.provideName }</option>
	                 </c:forEach>
              </select>
			</div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品价格</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail13" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">库存</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail14" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">条形码</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail15" >
		    </div>
		      <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">是否允许打折</label>
		    <div class="col-sm-10" id="depart">
		     <select class="form-control" id="inputEmail16">
                   <option value="1" >允许</option>
	                 <option value="0" >不允许</option>
	                
              </select>
			</div>
		  </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  		<button type="button" class="btn btn-default" onclick="js_js_xiugai('spxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>





<!-- 商品库存修改模态框 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel2">商品修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail20" value="商品编号">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail21" disabled>
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">库存</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail22" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">规格</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail23" >
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  		<button type="button" class="btn btn-default" onclick="js_js_xiugai('spxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>




<!-- 供应商修改模态框 -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel3">供应商修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail30" value="供应商编号">
        	
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">供应商名称</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail31">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">供应商地址</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail32">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">联系人姓名</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail33">
			    </div>
		   </div>
		   <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">联系人电话</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmail34">
			    </div>
		   </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('gyxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>






<!-- 销售信息模态框 -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel3"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">员工姓名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail31" placeholder="姓名">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">基本工资</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail32" placeholder="工资">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">职校补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail33" placeholder="职校补贴">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">工龄补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail34" placeholder="工龄补贴">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="jjs_js_xiugai('ygxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>









<!-- 员工修改模态框 -->
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel4"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">类别编号</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail41" placeholder="编号">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产类名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail42" placeholder="名称">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('lbxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>



<%-- 
<!-- 商品详细模态框 -->
<div class="modal fade" id="myModal8" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel1">商品修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 隐藏框，保存ID -->
        	<input type="hidden" id="inputEmail10" value="商品编号">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail11" >
		    </div>
		  </div>
		    <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品类别</label>
		    <div class="col-sm-10" id="depart">
		      <select class="form-control" id="inputEmail12">
		      <c:forEach items="${type }" var="t">
	             <option value="${t.typeno }">${t.typename }</option>
	          </c:forEach>
				</select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">供应商</label>
		    <div class="col-sm-10" id="depart">
		     <select class="form-control" id="inputEmail12">
                   <c:forEach items="${pro}" var="s">
	                 <option value="${s.provideID }" >${s.provideName }</option>
	                 </c:forEach>
              </select>
			</div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">商品价格</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail13" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">库存</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail14" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">条形码</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="wagecoefficient" id="inputEmail15" >
		    </div>
		      <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">是否允许打折</label>
		    <div class="col-sm-10" id="depart">
		     <select class="form-control" id="inputEmail16">
                   <option value="1" >允许</option>
	                 <option value="0" >不允许</option>
	                
              </select>
			</div>
		  </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  		<button type="button" class="btn btn-default" onclick="js_js_xiugai('spxiu')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>


 --%>




<!-- 供应商修改信息模态框 -->
<div class="modal fade" id="myModal6" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel6"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">供应商名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="GYSX1" placeholder="请输入供应商的名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">联系人姓名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="GYSX2" placeholder="请输入联系人的姓名">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">联系人电话</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="GYSX3" placeholder="请输入联系人的电话">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">供应商地址</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="GYSX4" placeholder="请输入供应商的地址">
		    </div>
		  </div>
		  <input type="hidden" id="GYSX0" value="商品编号">
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('GYSX')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>







<!-- 商品促销信息模态框 -->
<div class="modal fade" id="myModal7" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel7"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">促销商品名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="CX11"  readonly>
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">促销金额（元）</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="CX12" >
		    </div>
		  </div>
	  <div class="control-group">
              <label class="control-label" for="subject">促销开始日期</label>
                     <div class="controls">
                             <a class='input-group date' id='datetimepicker1' >
							 <input type="text" class="form-control" id='CX13'  placeholder="请选择日期" />
					         <span class="input-group-addon" >
					     		 <span class="glyphicon glyphicon-calendar" ></span>
					     	 </span>
							</a>
                      </div>
                      </div>
                           <div class="control-group">
                                 <label class="control-label" for="subject">促销结束日期</label>
                                 <div class="controls">
                                      <a class='input-group date' id='datetimepicker1' >
										     <input type='text' class="form-control" id='CX14' placeholder="请选择日期" />
										     <span class="input-group-addon" >
										           <span class="glyphicon glyphicon-calendar" ></span>
										      </span>
										</a>
                                   </div>
                     	</div>
		   <input type="hidden" id="CX10" value="商品编号">
		   
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_js_xiugai('CXSP')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>

