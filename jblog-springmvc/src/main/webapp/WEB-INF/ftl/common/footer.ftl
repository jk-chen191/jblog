<!DOCTYPE html>
<html>
<head>
    <title><%= title %></title>
    <meta charset="utf-8">
    <link href="/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/stylesheets/bootstrap-responsive.min.css" rel="stylesheet">
    <link rel='stylesheet' href='/stylesheets/style.css' />
    <script type="text/javascript" src="/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/fuc.js"></script>

    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/3.0.2/css/font-awesome.css" rel="stylesheet">
    <link href="/stylesheets/index.css" rel="stylesheet">

</head>
<body>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12 navbar navbar-fixed-top navbar-inner">
            <ul class="nav nav-pills">
                <!--                        <li >
                                            <a href="#">首页</a>
                                        </li>-->
                <% productorList.forEach(function (productor, index) { %>
                <li <% if(curProductor == index) { %> class="active" <% } %> >
                <a href="/p?productor=<%= index %>&classification=0"><i class="icon-star"></i> <%= productor %></a>
                </li>
                <% }) %>
                <% if(user) { %>
                <li class="dropdown pull-right">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle"><%= user.name %><strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="/post">发表</a>
                        </li>
                        <li>
                            <a href="/upload">上传</a>
                        </li>
                        <li>
                            <a href="/logout">登出</a>
                        </li>
                    </ul>
                </li>
                <% } else { %>
                <li class="pull-right">
                    <a  href="/login"><span class="btn-block">登陆</span></a>
                </li>
                <% } %>
                <li class="pull-right">
                    <form class="form-search" action="/p" method="get">
                        <input  name='searchType' value='title' type="hidden" />
                        <input class="input-medium search-query" <% if (typeof keyword !== 'undefined') { %>value="<%= keyword %>" <% } %> name='keyword' type="text" /> <button type="submit" class="btn">查找</button>
                    </form>
                </li>
            </ul>
        </div>
    </div>
    <!--<header class="jumbotron subhead" id="overview">-->
    <!--<div class="container">-->
    <!--<h1>组件</h1>-->
    <!--<p class="lead">无数可复用的组件，包括导航、警告框、弹出框等更多功能。</p>-->
    <!--</div>-->
    <!--</header>-->

    <article  >
        <% if (success) { %>
        <div class="alert alert-success">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <h4>Well done!</h4>
            <%= success %>.
        </div>
        <% } %>
        <% if (error) { %>
        <div class="alert alert-block">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <h4>Warning!</h4>
            <%= error %>
        </div>
        <% } %>
    </article>

    <div class="row-fluid m-top3">