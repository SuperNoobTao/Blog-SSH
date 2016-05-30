<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/13 0013
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>首页</title>

</head>

<frameset cols="10%,*">
  <frame name="menu" src="${pageContext.request.contextPath }/public/menu.jsp">
  <frame name="body" src="${pageContext.request.contextPath }/public/show.jsp">
</frameset>

</html>
