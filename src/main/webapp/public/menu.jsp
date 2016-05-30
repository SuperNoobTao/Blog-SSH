<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/15 0015
  Time: 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主菜单</title>
  <style type="text/css">
    body{
      background: #86a2bf;
    }
  </style>
</head>
<body>
  <br/><br/>
  <a href="${pageContext.request.contextPath}/manage/article.action" target="body">文章管理</a><br/>
    ----<a href="${pageContext.request.contextPath}/manage/article_addui.action" target="body">添加文章</a><br/>
  <br/>
  <a href="${pageContext.request.contextPath}/manage/category.action" target="body">类别管理</a><br/>
    ----<a href="${pageContext.request.contextPath}/manage/category_addui.action" target="body">添加类别</a><br/>
  <br/>
  <a href="${pageContext.request.contextPath}/manage/user.action" target="body">用户管理</a><br/>
    ----<a href="${pageContext.request.contextPath}/manage/user_addui.action" target="body">添加用户</a><br/>
  <br/>
  <a href="${pageContext.request.contextPath}/manage/guest.action" target="body">客户管理</a><br/>
    ----<a href="${pageContext.request.contextPath}/manage/guest_addui.action" target="body">添加客户</a><br/>
  <br/>
  <a href="${pageContext.request.contextPath}/manage/comment.action" target="body">留言管理</a><br/>
    ----<a href="${pageContext.request.contextPath}/manage/comment_addui.action" target="body">添加留言</a><br/>
</body>
</html>
