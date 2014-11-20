<#include "/common/header.ftl" >
<link href="${rc.contextPath}/assets/css/pages/blog.css" rel="stylesheet" type="text/css"/>
<!-- BEGIN PAGE HEADER-->
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
        <h3 class="page-title">
            Blog <small>blog listing</small>
        </h3>
        <ul class="page-breadcrumb breadcrumb">
            <#--<li class="btn-group">-->
                <#--<button type="button" class="btn blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">-->
                    <#--<span>Actions</span> <i class="fa fa-angle-down"></i>-->
                <#--</button>-->
                <#--<ul class="dropdown-menu pull-right" role="menu">-->
                    <#--<li><a href="#">Action</a></li>-->
                    <#--<li><a href="#">Another action</a></li>-->
                    <#--<li><a href="#">Something else here</a></li>-->
                    <#--<li class="divider"></li>-->
                    <#--<li><a href="#">Separated link</a></li>-->
                <#--</ul>-->
            <#--</li>-->
            <li>
                <i class="fa fa-home"></i>
                <a href="${rc.contextPath}/home">Home</a>
                <i class="fa fa-angle-right"></i>
            </li>
            <li>
                <a href="#">Pages</a>
                <i class="fa fa-angle-right"></i>
            </li>
            <li><a href="#">Blog</a></li>
        </ul>
        <!-- END PAGE TITLE & BREADCRUMB-->
    </div>
</div>
<!-- END PAGE HEADER-->
<!-- BEGIN PAGE CONTENT-->
<div class="row">
<div class="col-md-12 blog-page">
<div class="row">
<div class="col-md-9 col-sm-8 article-block">
    <h1>Latest Blog</h1>

    <#if pageBean??>
        <#list pageBean.content as blog>
            <div class="row">
                <div class="col-md-4 blog-img blog-tag-data">
                    <img src="${rc.contextPath}/assets/img/gallery/image${blog.id%5+1}.jpg" alt="" class="img-responsive">
                    <ul class="list-inline">
                        <li><i class="fa fa-calendar"></i> <a href="#">${blog.createdAt}</a></li>
                        <li><i class="fa fa-comments"></i> <a href="#">38 Comments</a></li>
                    </ul>
                    <ul class="list-inline blog-tags">
                        <li>
                            <i class="fa fa-tags"></i>
                            <a href="#">Technology</a>
                            <a href="#">Education</a>
                            <a href="#">Internet</a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-8 blog-article">
                    <h3><a href="page/${blog.id}">${blog.title}</a></h3>
                    <p>${blog.content}</p>
                    <a class="btn blue" href="page/${blog.id}">
                        Read more
                        <i class="m-icon-swapright m-icon-white"></i>
                    </a>
                </div>
            </div>
            <hr>
        </#list>
    </#if>
</div>
<!--end col-md-9-->
<div class="col-md-3 col-sm-4 blog-sidebar">
    <h3>Top Entiries</h3>
    <div class="top-news">
        <a href="#" class="btn red">
            <span>Metronic News</span>
            <em>Posted on: April 16, 2013</em>
            <em>
                <i class="fa fa-tags"></i>
                Money, Business, Google
            </em>
            <i class="fa fa-briefcase top-news-icon"></i>
        </a>
        <a href="#" class="btn green">
            <span>Top Week</span>
            <em>Posted on: April 15, 2013</em>
            <em>
                <i class="fa fa-tags"></i>
                Internet, Music, People
            </em>
            <i class="fa fa-music top-news-icon"></i>
        </a>
        <a href="#" class="btn blue">
            <span>Gold Price Falls</span>
            <em>Posted on: April 14, 2013</em>
            <em>
                <i class="fa fa-tags"></i>
                USA, Business, Apple
            </em>
            <i class="fa fa-globe top-news-icon"></i>
        </a>
        <a href="#" class="btn yellow">
            <span>Study Abroad</span>
            <em>Posted on: April 13, 2013</em>
            <em>
                <i class="fa fa-tags"></i>
                Education, Students, Canada
            </em>
            <i class="fa fa-book top-news-icon"></i>
        </a>
        <a href="#" class="btn purple">
            <span>Top Destinations</span>
            <em>Posted on: April 12, 2013</em>
            <em>
                <i class="fa fa-tags"></i>
                Places, Internet, Google Map
            </em>
            <i class="fa fa-bolt top-news-icon"></i>
        </a>
    </div>
    <div class="space20"></div>
    <h3>Flickr</h3>
    <ul class="list-inline blog-images">
        <li>
            <a  class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="${rc.contextPath}/assets/img/blog/1.jpg">
                <img alt="" src="${rc.contextPath}/assets/img/blog/1.jpg">
            </a>
        </li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/2.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/3.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/4.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/5.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/6.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/8.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/10.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/11.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/1.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/2.jpg"></a></li>
        <li><a href="#"><img alt="" src="${rc.contextPath}/assets/img/blog/7.jpg"></a></li>
    </ul>
    <div class="space20"></div>
    <h3>Tabs</h3>
    <div class="tabbable tabbable-custom">
        <ul class="nav nav-tabs">
            <li class="active"><a data-toggle="tab" href="#tab_1_1">Section 1</a></li>
            <li ><a data-toggle="tab" href="#tab_1_2">Section 2</a></li>
        </ul>
        <div class="tab-content">
            <div id="tab_1_1" class="tab-pane active">
                <p>I'm in Section 1.</p>
                <p>
                    Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat.
                </p>
            </div>
            <div id="tab_1_2" class="tab-pane">
                <p>Howdy, I'm in Section 2.</p>
                <p>
                    Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat. Ut wisi enim ad minim veniam, quis nostrud exerci tation.
                </p>
            </div>
        </div>
    </div>
    <div class="space20"></div>
    <h3>Recent Twitts</h3>
    <div class="blog-twitter">
        <div class="blog-twitter-block">
            <a href="">@keenthemes</a>
            <p>At vero eos et accusamus et iusto odio.</p>
            <a href="#"><em>http://t.co/sBav7dm</em></a>
            <span>2 hours ago</span>
            <i class="fa fa-twitter blog-twiiter-icon"></i>
        </div>
        <div class="blog-twitter-block">
            <a href="">@keenthemes</a>
            <p>At vero eos et accusamus et iusto odio.</p>
            <a href="#"><em>http://t.co/sBav7dm</em></a>
            <span>5 hours ago</span>
            <i class="fa fa-twitter blog-twiiter-icon"></i>
        </div>
        <div class="blog-twitter-block">
            <a href="">@keenthemes</a>
            <p>At vero eos et accusamus et iusto odio.</p>
            <a href="#"><em>http://t.co/sBav7dm</em></a>
            <span>7 hours ago</span>
            <i class="fa fa-twitter blog-twiiter-icon"></i>
        </div>
    </div>
</div>
<!--end col-md-3-->
</div>
<#assign sp=8>
<#if pageBean?? && pageBean.totalPages gt 1>
<!-- 分页算法参考新浪博客页面, 保持选中的在中间, 永远有page1 -->
    <ul class="pagination pull-right">
        <#if !pageBean.firstPage>
            <li><a href="?page=${pageBean.number}"><i class="fa fa-angle-left"></i></a></li>
        </#if>
        <#if pageBean.totalPages lte sp>
            <#list 1..pageBean.totalPages as num>
                <li <#if pageBean.number == num -1>class="active"</#if>><a href="?page=${num}">${num}</a></li>
            </#list>
        <#elseif pageBean.number lt sp/2 >
            <#list 1..sp as num>
                <li <#if pageBean.number == num -1 >class="active"</#if>><a href="?page=${num}">${num}</a></li>
            </#list>
            <li><a>..</a></li>
        <#elseif pageBean.totalPages - pageBean.number - 1 lt sp/2 >
            <li><a href="?page=1">1</a></li>
            <li><a>..</a></li>
            <#list (pageBean.number + 1 - sp/2 + 1)..sp as num>
                <li <#if pageBean.number == num -1 >class="active"</#if>><a href="?page=${num}">${num}</a></li>
            </#list>
        <#else>
            <li><a href="?page=1">1</a></li>
            <li><a>..</a></li>
            <#list (pageBean.number + 1 - sp/2 + 1)..(pageBean.number + 1 + sp/2 -1) as num>
                <li <#if pageBean.number == num -1 >class="active"</#if>><a href="?page=${num}">${num}</a></li>
            </#list>
            <li><a>..</a></li>
        </#if>
        <#if !pageBean.lastPage>
            <li><a href="?page=${pageBean.number+2}"><i class="fa fa-angle-right"></i></a></li>
        </#if>
        <li><a>共 ${pageBean.totalPages} 页</a></li>
    </ul>
</#if>

</div>

<#include "/common/footer.ftl" >
