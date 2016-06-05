<%--
  Created by IntelliJ IDEA.
  User: shentao
  Date: 2016/6/4
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>红茶先森的博客</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/style.css" />
    <link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/style/css/font-awesome.min.css" />
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,400italic,300italic,300,700,700italic|Open+Sans+Condensed:300,700" rel="stylesheet" type="text/css">
    <!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/font-awesome-ie7.min.css"/>
    <![endif]-->
    <!--[if IE 8]>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/ie8.css" media="all" />
    <![endif]-->
    <!--[if IE 9]>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/ie9.css" media="all" />
    <![endif]-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/ddsmoothmenu.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/retina.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/selectnav.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jquery.backstretch.min.js"></script>
    <script type="text/javascript">
        $.backstretch("${pageContext.request.contextPath}/style/images/bg/1.jpg");
    </script>
</head>
<body>
<%@include file="/public/header.jsp"%>

<div class="wrapper">
    <div class="content">
        <c:forEach items="${params.topArticles}" var="art">
            <div class="post format-image box">
                <div class="details">
                    <span class="icon-image">${fn:substring(art.articleCdate,0,16)}</span>
            <span class="likes"><a href="#"
                                   class="likeThis">${art.articleLikes}</a></span>
                    <span class="comments"><a href="#">${art.articleLooks}</a></span>
                </div>
                <h1 class="title"><a href="${pageContext.request.contextPath}${art.articleStaticUrl}.html">${art.articleTitle}</a></h1>

                <p>${art.articleMeta}</p>

                <div class="tags"><a href="#">${art.articleType}</a></div>
                <div class="post-nav">
            <span class="nav-prev"><a
                    href="${pageContext.request.contextPath}/listArticle.action?cid=${art.categoryId}">类型：${art.categoryName}</a></span>
                    <span class="nav-next"><a href="#">作者：${art.articleAuthor}</a></span>

                    <div class="clear"></div>
                </div>
            </div>
        </c:forEach>
        <div class="post format-image box">
            <h3 style="text-align:center"><a href="${pageContext.request.contextPath}/listArticle.action">查看更多</a></h3>
        </div>
    </div>

    <div class="sidebar box">
        <div class="sidebox widget">
            <h3 class="widget-title">最近更新</h3>
            <ul class="post-list">
                <c:forEach items="${params.lastArticlesList}" var="art">
                    <li>
                        <div class="meta">
                            <h5><a href="${pageContext.request.contextPath}${art.articleStaticUrl}.html">${art.articleTitle}</a></h5>
                            <em>${fn:substring(art.articleCdate,0,16)}</em>
                        </div>
                    </li>
                </c:forEach>
                <li class="more"><a href="${pageContext.request.contextPath}/listArticle.action">more</a></li>
            </ul>
        </div>

        <div class="sidebox widget">
            <h3 class="widget-title"><i class="icon-search icon"></i></h3>

            <form class="searchform" method="post" action="${pageContext.request.contextPath}/search.action">
                <input type="text" name="key" value="输入关键字搜索博客..." onFocus="this.value=''"
                       onBlur="this.value='输入关键字搜索博客...'"/>
            </form>
        </div>

        <div class="sidebox widget">
            <h3 class="widget-title categories">分类</h3>
            <ul class="categories">
                <c:forEach items="${params.categories}" var="cate">
                    <li><a href="${pageContext.request.contextPath}/listArticle.action?cid=${cate.categoryId}">${cate.categoryName}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>

<%@include file="/public/footer.jsp"%>
</body>
</html>
