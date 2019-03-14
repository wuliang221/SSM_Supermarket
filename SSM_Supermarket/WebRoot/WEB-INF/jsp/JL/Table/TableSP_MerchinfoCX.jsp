<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
                <div class="row">
                    <div class="col-sm-12">
                            <div class="body-nest" id="Filtering">

                                <div class="row" style="margin-bottom:10px;">
                                    <div class="col-sm-4">
                                        <input class="form-control" id="filter" placeholder="商品名称..." type="text" value="${goodsName }">
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="#api" class="pull-right btn btn-info filter-api" href="javascript:void(0);" onclick="chazhao()">查找</a>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>商品名称</th>
                                        <th>商品价格</th>
                                        <th>促销价格</th>
                                        <th>促销起始时间</th>
                                        <th>促销结束时间</th>
                                        <th>是否允许打折</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${merchinfo }" var="m">
                                    <tr id="${m.m }">
                                        <td>${m.m }</td>
                                        <td>${m.m }</td>
                                        <td>${m.m }</td>
                                        <td>${m.m }</td>
                                        <td>${m.m}</td>
                                        <td>${m.m }</td>
                                        <td>
                                        	<button type="button" onclick="js_xiu1('${m.m }','${m.m }',
                                        	'${m.m }','${m.m }','${m.m}','${m.m }'
                                        	,'${m.m }')" class="btn btn-primary btn-xs">修改</button>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    </tbody>
                                </table>

                                 <ul>
				<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
				</li>
				<button class="btn btn-default" href="javascript:void(0);" onclick="firstPage()">首页</button>
				<button class="btn btn-default" onclick="upPage()">上一页</button>
				<button class="btn btn-default" onclick="dowmPage()">下一页</button>
				<button class="btn btn-default" href="javascript:void(0);" onclick="lastPage()">末页</button>
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
