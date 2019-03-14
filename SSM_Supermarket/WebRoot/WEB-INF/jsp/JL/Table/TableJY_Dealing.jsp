<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="FilteringClose1">
                            <div class="body-nest" id="Filtering1">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="SP2filter" placeholder="交易日期..." type="text" value="${goodsName }">
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#api" class="pull-right btn btn-info filter-api" title="Filter using the Filter API" onclick="SP2chazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>交易编号</th>
                                        <th>会员卡号</th>
                                        <th>交易金额</th>
                                        <th>交易日期</th>
                                        <th>操作员工</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${dealing }" var="d">
                                    <tr>
                                        <td>${d.dealingID }</td>
                                        <td>${d.memberCard }</td>
                                        <td>${d.dealingPrice }</td>
                                        <td>${d.dealingStringDate }</td>
                                        <td>${d.userName}</td>
                                        <td>
                                        	<button type="button" onclick="js_xiu2('','','','')" class="btn btn-primary btn-xs">详细信息</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    
                                    </tbody>
                                </table>

                                  <ul>
				<li>共${fy.tiao }条记录&nbsp;&nbsp; 第${fy.dang }/${fy.ye }页
				</li>
				<button class="btn btn-default"  onclick="SP2firstPage()">首页</button>
				<button class="btn btn-default" onclick="SP2upPage()">上一页</button>
				<button class="btn btn-default" onclick="SP2dowmPage()">下一页</button>
				<button class="btn btn-default" onclick="SP2lastPage()">末页</button>
				&nbsp;&nbsp;
			</ul>
                               
                               
                            </div>

                        </div>


                    </div>

                </div>
<input type="hidden" id="pageNoUp" value="${fy.dang-1}"/>
<input type="hidden" id="pageNoDom" value="${fy.dang}"/>
<input type="hidden" id="pageNoLast" value="${fy.ye}"/>
