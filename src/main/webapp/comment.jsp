<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/13 0013
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <title>添加留言</title>
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
    <style type="text/css">
        body{
            background: #86a2bf;
        }
    </style>
</head>
<body>
<%@include file="/public/header.jsp"%>

<div class="content1 box1">
    <h1 class="title1">留言板</h1>
    <div class="form-container">
        <form class="forms" action="${pageContext.request.contextPath}/comment.action" method="post">
            <input type="hidden" name="artid" value="${artid}">
            <fieldset>
                <ol>
                    <li class="form-row text-input-row">
                        <label><h5>您的昵称：${errors.nickname[0]}</h5></label>
                        <input type="text" name="nickname" value="${fn:escapeXml(nickname)}" class="text-input-email required">
                    </li>
                    <li class="form-row text-input-row">
                        <label><h5>您的email：${errors.email[0]}</h5></label>
                        <input type="text" name="email" value="${fn:escapeXml(email)}" class="text-input-email required">
                    </li>
                    <li class="form-row text-input-row">
                        <label><h5>说几句话吧：${errors.comcontent[0]}</h5></label>
                        <textarea name="comcontent" class="text-area required"><c:if test="${!empty(title)}">#${title}#</c:if>${fn:escapeXml(comcontent)}</textarea>
                    </li>
                    <li class="button-row">
                        <input type="submit" value="留言" name="submit" class="btn-submit">
                    </li>
                </ol>
            </fieldset>
        </form>
    </div>
</div>

<c:forEach items="${page.list}" var="com">
    <div class="wrapper2">
        <div class="content2">
            <div class="post format-image box">
                <div class="details">
                    <span class="icon-image">${fn:substring(com.comtime,0,19)}</span>
                </div>
                <h1 class="title">${fn:escapeXml(com.gname)}</h1>
                <p>${fn:escapeXml(com.comcontent)}</p>
                <div class="tags"><a href="mailto:${com.gemail}">${com.gemail}</a></div>
            </div>
        </div>
    </div>
</c:forEach>
<div class="wrapper2">
    <div class="content2">
        <div class="post format-image box">
            <h5 class="title">
                <%@include file="/public/page.jsp"%>
            </h5>
        </div>
    </div>
</div>
<%@include file="/public/footer.jsp"%>
</body>
</html>
