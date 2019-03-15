<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="nest" id="FilteringClose"> 
                        
                            <div class="body-nest" id="Filtering">
                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="HYfilter" placeholder="会员手机号..." type="text" value="${jlMenberPhone}">
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#api" class="pull-right btn btn-info filter-api" title="Filter using the Filter API" onclick="ygchazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>会员卡号</th>
                                        <th>会员姓名</th>
                                        <th>会员电话</th>
                                        <th>会员地址</th>
                                        <th>累计消费金额</th>
                                        <th>注册日期</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${allMenber }" var="m">
                                    <tr>
                                        <td>${m.memberCard }</td>
                                        <td>${m.memberName }</td>
                                        <td>${m.memberPhone }</td>
                                        <td>${m.membersite }</td>
                                        <td> </td>
                                        
                                        <td><fmt:formatDate value="${m.regDate}" pattern="yyyy-MM-dd"/></td>
                                    </tr>
                                    </c:forEach>
                                    
                                    </tbody>
                                </table>

                <ul>
					<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
					</li>
					<button class="btn btn-default"  onclick="JLMenderfirstPage()">首页</button>
					<button class="btn btn-default" onclick="JLMenderupPage()">上一页</button>
					<button class="btn btn-default" onclick="JLMenderdowmPage()">下一页</button>
					<button class="btn btn-default"  onclick="JLMenderlastPage()">末页</button>
					&nbsp;&nbsp;
				</ul>
                            </div>

                        </div>


                    </div>

                </div>


<%-- <script src="${pageContext.request.contextPath }/statics/js/Table_js/supplier.js"></script> --%>
<input type="hidden" id="pageNothis" value="${ps.currPageNo}"/>
<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>
