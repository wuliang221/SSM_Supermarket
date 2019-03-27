<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                            <div class="body-nest" id="Filtering">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="MerchinfoFilter" placeholder="商品名称..." type="text" value="${MerchinName }">
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#api" class="pull-right btn btn-info filter-api" href="javascript:void(0);" onclick="Merchinfochazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                    	<th>条形码</th>
                                        <th>商品名称</th>
                                        <th>商品价格</th>
                                        <th>库存</th>
                                        <th>供应商</th>
                                        <th>是否允许打折</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${Merchinfo }" var="m">
                                    <tr>
                                    	<td>${m.barCode }</td>
                                        <td>${m.merchName }</td>
                                        <td>${m.merchPrice }</td>
                                        <td>${m.merchNum }</td>
                                        <td>${m.provideName }</td>
                                         <td><c:if test="${m.allowAbate==1}">
                                       		允许
                                        </c:if>
                                        <c:if test="${m.allowAbate==0}">
                                       		 不允许
                                        </c:if>
                                        </td>
                                        <td>
                                        	<%-- <button type="button" onclick="js_xiu1('${m.merchID }','',
                                        	'','','',''
                                        	,'')" class="btn btn-primary btn-xs">详情</button>
                                        	 --%>
                                        	 <button type="button" onclick="js_xiu1('${m.merchID }','${m.merchName }','${m.provideID }',
                                        	'${m.merchPrice }','${m.merchNum}','${m.barCode}','${m.allowAbate }')" class="btn btn-primary btn-xs">修改</button>
                                            <button type="button" onclick="js_shanchu('${m.merchID }','SP1','${m.merchName}')" class="btn btn-danger btn-xs">删除</button> 
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    </tbody>
                                </table>

                                 <ul>
				<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
				</li>
				<button class="btn btn-default" href="javascript:void(0);" onclick="MerchinfofirstPage()">首页</button>
				<button class="btn btn-default" onclick="MerchinfoupPage()">上一页</button>
				<button class="btn btn-default" onclick="MerchinfodowmPage()">下一页</button>
				<button class="btn btn-default" href="javascript:void(0);" onclick="MerchinfolastPage()">末页</button>
				&nbsp;&nbsp;
			</ul>
                            </div>
                        </div>
                    </div>
                </div>

<input type="hidden" id="pageNothis" value="${ps.currPageNo}"/>
<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>
