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
                                                <label class="control-label" for="subject">商品名称</label>
                                                <div class="controls">
                                                    <select class="form-control" namr="" id="s">
                                                    	<option value="0">请选择商品</option>
	                                                    <c:forEach items="${type }" var="t">
	                                                   		<option value="${t.typeno }">${t.typename }</option>
	                                                    </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">订单数量</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="s" placeholder="请输入商品数量">
                                                </div>
                                            </div>
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