<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <div id="skin-select">
        <div id="logo">
         <h1>超市经理端<span>v1.0</span></h1>
        </div>

        <a id="toggle">
            <span class="entypo-menu"></span>
        </a>

        <div class="search-hover">
            <form id="demo-2">
                <input type="search" placeholder="Search Menu..." class="id_search">
            </form>
        </div>

        <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar">
                	
                	<ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="">销售管理</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="销售详情">
                                <i class="icon icon-align-justify"></i>
                                <span>销售详情</span>
                            </a>
                            <ul>
                                <li><a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="" title="商品销售排行榜"><i class="icon-attachment"></i><span>销售排行榜</span></a></li>
                                <li><a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="" title="销售记录"><i class="icon-view-list-large"></i><span>销售记录</span></a></li>
                                <li><a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="" title="资金流动表"><i class="icon-view-list-large"></i><span>资金流动表</span></a></li>
                            </ul>
                        </li>
                    </ul>
                    
                    
                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">
                                <span class="">进货管理</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                            </a>
                        </li>
                         <li>
                            <a class="tooltip-tip" href="#" title="进货详情">
                                <i class="icon icon-align-justify"></i>
                                <span>进货详情</span>
                            </a>
                            <ul>
                                <li><a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="" title="进货计划"><i class="icon-attachment"></i><span>进货计划</span></a></li>
                                <li><a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="" title="进货记录"><i class="icon-view-list-large"></i><span>进货记录</span></a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_add('addYG')" title="入库登记">
                                <i class="entypo-user-add"></i>
                                <span>入库登记</span>
                            </a>
                        </li>
                    </ul>
                	
                
                
                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="">库存管理</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="#" title="商品详情">
                                <i class="icon icon-align-justify"></i>
                                <span>商品详情</span>

                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('11')" title="商品信息"><i class="entypo-doc-text"></i><span>商品信息</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('12')" title="库存记录"><i class="entypo-newspaper"></i><span>库存记录</span></a>
                                </li>
                                <li>
                            	<a class="tooltip-tip ajax-load" href="javascript:void(0);" onclick="js_add('addSP')" title="商品添加"><i class="icon icon-plus"></i><span>商品添加</span></a>
                           		</li> 
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="供应商详情">
                                <i class="icon icon-align-justify"></i>
                                <span>供应商详情</span>
                            </a>
                            <ul>
                                 <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('21')" title="供应商信息"><i class="entypo-archive"></i><span>供应商信息</span></a>
                                	<li><a class="tooltip-tip" href="javascript:void(0);" onclick="js_add('addGYS')" title="供应商添加"><i class="icon icon-plus"></i><span>供应商添加</span></a></li>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    </ul>

                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">
                                <span class="">人员管理</span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="员工详情">
                                <i class="icon icon-align-justify"></i>
                                <span>员工详情</span>
                            </a>
                            <ul>
                                 <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('User')" title="员工信息"><i class="entypo-archive"></i><span>员工信息</span></a>
                                	<a class="tooltip-tip" href="javascript:void(0);" onclick="js_add('addYG')" title="员工添加"><i class="icon icon-plus"></i><span>员工添加</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="会员详情">
                                <i class="icon icon-align-justify"></i>
                                <span>会员详情</span>
                            </a>
                            <ul>
                                 <li>
                                    <a class="tooltip-tip2 ajax-load" href="javascript:void(0);" onclick="js_table('Menber')" title="会员信息"><i class="entypo-archive"></i><span>会员信息</span></a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>