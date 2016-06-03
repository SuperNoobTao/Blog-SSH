<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/12 0012
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>消息页面</title>
    <meta http-equiv="refresh" content="3;url=${url}">
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

<div class="content1 box2">
    <h1 class="title1">执行信息报告：${message}</h1>
    <h3><a href="${url}">3秒后自动跳转回主页，若未自动跳转，可点击此链接回主页</a></h3>
</div>

<%@include file="/public/footer.jsp"%>
</body>
</html>
