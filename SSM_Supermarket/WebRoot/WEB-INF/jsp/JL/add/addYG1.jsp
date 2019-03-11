<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<script src="${pageContext.request.contextPath }/statics/layDate-v5.0.9/laydate/laydate.js"></script>
	<script type="text/javascript">
	lay('#version').html('-v'+ laydate.v);
	//执行一个laydate实例
	laydate.render({
	elem: '#YG222' //指定元素
	});
	</script>
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
                                                <label class="control-label" for="name">员工名</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="YG1" placeholder="请输入员工名称">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">性别</label>
                                                <div class="controls">
                                                    <select class="form-control" namr="" id="YG2">
	                                                   		<option value="男">男</option>
	                                                   		<option value="女">女</option>
                                                    </select>
                                                </div>
                                            </div>
                                            
                                            <div class="control-group">
                                                <label class="control-label" for="subject">年龄</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="YG3" placeholder="请输入年龄">
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">入职日期</label>
                                                <div class="controls">
                                                     <a class='input-group date' id='datetimepicker1' >
										                <input type='text' class="form-control" id='YG4' placeholder="请选择日期" />
										                <span class="input-group-addon" >
										                    <span class="glyphicon glyphicon-calendar" ></span>
										                </span>
										            </a>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label" for="subject">联系电话</label>
                                                <div class="controls">
                                                    <input type="text" class="form-control" name="" id="YG5" placeholder="请输入联系电话">
                                                </div>
                                            </div>
                                            
                                            <div class="control-group">
                                                <label class="control-label" for="subject">职位</label>
                                                <div class="controls">
                                                    <select class="form-control" namr="" id="YG6">
	                                                   		<option value="1">员工</option>
	                                                   		<option value="2">经理</option>
                                                    </select>
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