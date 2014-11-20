<!-- BEGIN SIDEBAR -->
<div class="page-sidebar navbar-collapse collapse">
    <!-- BEGIN SIDEBAR MENU -->
    <ul class="page-sidebar-menu">
        <li>
            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
            <div class="sidebar-toggler hidden-phone"></div>
            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
        </li>
        <li>
            <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
            <form class="sidebar-search" action="extra_search.html" method="POST">
                <div class="form-container">
                    <div class="input-box">
                        <a href="javascript:;" class="remove"></a>
                        <input type="text" placeholder="Search..."/>
                        <input type="button" class="submit" value=" "/>
                    </div>
                </div>
            </form>
            <!-- END RESPONSIVE QUICK SEARCH FORM -->
        </li>
        <li class="start ">
            <a href="${rc.contextPath}/home">
                <i class="fa fa-home"></i>
                <span class="title">首页</span>
                <span class="selected"></span>
            </a>
        </li>
        <li class="">
            <a href="javascript:;">
                <i class="fa fa-user"></i>
                <span class="title">博客管理</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a href="${rc.contextPath}/blog/create">
                        发表博客</a>
                </li>
                <li>
                    <a href="${rc.contextPath}/blog/author/${Session["loginUser"].id}">
                        我的博客</a>
                </li>
            </ul>
        </li>
        <#--<li class="">-->
            <#--<a href="javascript:;">-->
                <#--<i class="fa fa-th"></i>-->
                <#--<span class="title">定制图文消息</span>-->
                <#--<span class="arrow"></span>-->
            <#--</a>-->
            <#--<ul class="sub-menu">-->
                <#--<li>-->
                    <#--<a href="/new_picmsg">-->
                        <#--创建图文消息</a>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<a href="/picmsg_list">-->
                        <#--图文消息列表</a>-->
                <#--</li>-->
                <#--<!--<li>&ndash;&gt;-->
                <#--<!--<a href="table_managed.html">&ndash;&gt;-->
                <#--<!--图文消息组合</a>&ndash;&gt;-->
                <#--<!--</li>&ndash;&gt;-->
                <#--<!--<li>&ndash;&gt;-->
                <#--<!--<a href="table_editable.html">&ndash;&gt;-->
                <#--<!--图文消息皮肤</a>&ndash;&gt;-->
                <#--<!--</li>&ndash;&gt;-->
                <#--<li class="disabled">-->
                    <#--<a href="#">-->
                        <#--图文消息数据</a>-->
                <#--</li>-->
            <#--</ul>-->
        <#--</li>-->
        <#--<li class="">-->
            <#--<a href="javascript:;">-->
                <#--<i class="fa fa-file-text"></i>-->
                <#--<span class="title">自定义菜单</span>-->
                <#--<span class="arrow"></span>-->
            <#--</a>-->
            <#--<ul class="sub-menu">-->
                <#--<li>-->
                    <#--<a href="/edit_menus">-->
                        <#--自定义菜单设置</a>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<a href="/menus_status" class="ajaxify">-->
                        <#--菜单点击统计</a>-->
                <#--</li>-->
            <#--</ul>-->
        <#--</li>-->
        <li class="">
            <a href="javascript:;">
                <i class="fa fa-sitemap"></i>
                <span class="title">其他设置</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a href="#">
                        功能建设中..</a>
                </li>
                <li>
                    <a href="#">
                        功能建设中..</a>
                </li>
            </ul>
        </li>


    </ul>
    <!-- END SIDEBAR MENU -->
</div>
<!-- END SIDEBAR -->

