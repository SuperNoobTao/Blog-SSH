<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/15 0015
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>文章管理</title><style type="text/css">
  body{
    background: #86a2bf;
  }
  .content{
    font-size: 20px;
    margin-top: 20px;
    text-align: center;
    color: #aa1111;
    background: #86a2bf;
  }
</style>
</head>
<body>
<div class="content">
  文章管理&nbsp;<div><a href="javascript:reloadAllArticles()">重新静态化所有文章</a></div><br/>
  <table style="text-align: left;border: 5px;width: 100%">
    <thead>
    <tr>
      <th>id</th>
      <th>标题</th>
      <th>作者</th>
      <th>时间</th>
      <th>类型</th>
      <th>阅读数</th>
      <th>喜爱数</th>
      <th>是否顶置</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="art">
      <tr>
        <td>${art.artid}</td>
        <td><a href="${pageContext.request.contextPath}${art.staticURL}.html">${art.title}</a></td>
        <td>${art.author}</td>
        <td>${art.time}</td>
        <td><a href="${pageContext.request.contextPath}/listArticle.action?cid=${art.cid}">${art.cid}</a></td>
        <td>${art.looked}</td>
        <td>${art.likes}</td>
        <td>${art.top==0?'未顶置':'顶置'}</td>
        <td>
          <a href="javascript:deleteConfirm('${art.title}','${art.artid}')">删除</a>&nbsp;
          <a href="javascript:reloadArticle('${art.title}','${art.artid}')">重新静态化</a>&nbsp;
          <a href="${pageContext.request.contextPath}/manage/article_updateui.action?artid=${art.artid}">修改</a>&nbsp;
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <br/>
  <%@include file="/public/page.jsp" %>
</div>
</body>
<script type="text/javascript">
  function deleteConfirm(title,artid){
    var result = window.confirm("您确认删除 "+title+" 这篇博文吗？");
    if(result)
      window.location.href = "${pageContext.request.contextPath}/manage/article_delete.action?artid="+artid;
  }

  function reloadArticle(title,artid){
    var result = window.confirm("您确认重新静态化 "+title+" 这篇博文吗？");
    if(result)
      window.location.href = "${pageContext.request.contextPath}/manage/article_reload.action?artid="+artid;
  }

  function reloadAllArticles(){
    var result = window.confirm("您确认重新静态化所有博文吗？");
    if(result)
      window.location.href = "${pageContext.request.contextPath}/manage/article_reloadAll.action";
  }
</script>
</html>
