<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <div class="content-wrap">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="validationClose">
                            <div class="title-alt">
                                <div class="titleClose">
                                </div>
                            </div>

                            <div class="body-nest" id="validation">
                                <div class="form_center">
                                        <fieldset>
                                            <div class="control-group">
                                                <label class="control-label" for="name">商品名称</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="merchName" id="SP1" placeholder="请输入商品名称">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="name">条形码</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="barCode" id="SP2" placeholder="请输入商品条形码">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">供应商</label>
                                                <div class="controls">
                                                    <select class="form-control" name="provideID" id="SP3">
                                                    	<option value="0">请选择供应商</option>
                                                        <c:forEach items="${pro }" var="s">
	                                                   		<option value="${s.provideID }">${s.provideName }</option>
	                                                    </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">零售价</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="merchPrice" id="SP4" placeholder="请输入商品零售价（￥）">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">进货价</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="merchCost" id="SP5" placeholder="请输入商品（￥）">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">库存报警数量</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="cautionNum" id="SP6" placeholder="请输入库存报警数量">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">计划进货数</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="planNum" id="SP7" placeholder="请输入商品（￥）">
                                                </div>
                                            </div>
                                            
                                                <div class="control-group">
                                                <label class="control-label" for="subject">是否允打折</label>
                                                <div class="controls">
                                                    <select class="form-control" name="allowAbate" id="SP8">
                                                    	<option value="1">允许</option>
                                                    	<option value="0">不允许</option>
                                                    </select>
                                                </div>
                                            </div>
                                           <!--  <div class="control-group">
                                                <label class="control-label" for="name">促销开始日期</label>
                                                <div class="controls">
                                                    <a class='input-group date' id='datetimepicker1' >
									                	<input type='text' class="form-control" id='test1' placeholder="请选择日期" />
										               		 <span class="input-group-addon" >
										                  	<span class="glyphicon glyphicon-calendar" ></span>
										                </span>
									           		 </a>
                                                </div>
                                            </div>
                                           <div class="control-group">
                                                <label class="control-label" for="name">促销结束日期</label>
                                                <div class="controls">
                                                    <a class='input-group date' id='datetimepicker1' >
									                	<input type='text' class="form-control" id='test1' placeholder="请选择日期" />
										               		 <span class="input-group-addon" >
										                  	<span class="glyphicon glyphicon-calendar" ></span>
										                </span>
									           		 </a>
                                                </div>
                                            </div> -->
                                            
                                            <div class="form-actions" style="margin:20px 0 0 0;">
                                                <button onclick="js_tianjia('1')" class="btn btn-primary">保存</button>
                                                <button type="reset" class="btn">清空</button>
                                            </div>
                                        </fieldset>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>