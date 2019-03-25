
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="FilteringClose1">
                            <div class="body-nest" id="Filtering1">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-8">
                                    </div>
                                    <div class="col-sm-4">
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>订单编号</th>
                                        <th>商品名</th>
                                        <th>订单数量</th>
                                        <th>订单金额</th>
                                        <th>订单下单日期</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${stock }" var="s">
                                    <tr>
                                        <td>${s.stockID }</td>
                                        <td>${s.merchName }</td>
                                        <td>${s.merchNum }</td>
                                        <td>${s.totalPrice }</td>
                                        <td> <fmt:formatDate type="date" value="${s.planDate}"  pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                        <td>
                                        	<button type="button" onclick="js_DDZTXG('${s.stockID }','3',this)"" class="btn btn-warning">入库</button>
                                        	<button type="button" onclick=" js_shan('DD','${s.stockID }','${s.merchName }',this)" class="btn btn-danger">删除</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                                  <ul>
									<li>共${fy.tiao }条记录&nbsp;&nbsp; 第${fy.dang }/${fy.ye }页
									</li>
									<button class="btn btn-default"  onclick="FY('1','stock3')">首页</button>
									<button class="btn btn-default" onclick="FY('${fy.dang-1 }','stock3')">上一页</button>
									<button class="btn btn-default" onclick="FY('${fy.dang+1 }','stock3')">下一页</button>
									<button class="btn btn-default" onclick="FY('${fy.ye }','stock3')">末页</button>
									&nbsp;&nbsp;
								</ul>
                            </div>
                        </div>
                    </div>
                </div>