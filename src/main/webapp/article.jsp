<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/12 0012
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
  <title>${pageTitle}</title>
  <script type="text/javascript" src="../js/ckeditor.js"></script>
  <style type="text/css">
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
  ${pageTitle}<br/>

  <form action="${pageContext.request.contextPath}/manage/article_${method}.action" method="post">
    <input type="hidden" name="artid" value="${artid}">
    <table style="text-align: left;border: 1px;margin: auto">
      <tr>
        <td>文章标题：</td>
        <td><input type="text" name="title" value="${article.title}"></td>
        <td>${errors.title[0]}</td>
      </tr>
      <tr>
        <td>类别：</td>
        <td>
          <select id="cid" name="cid">
            <c:forEach items="${categories}" var="cate">
              <option value="${cate.cid}" ${article.cid==cate.cid?'selected':''}>${cate.cname}</option>
            </c:forEach>
          </select>
        </td>
        <td>
          <a href="javascript:addCategory('${pageContext.request.contextPath}/manage/category_add.action')">添加类别</a>
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <select id="type" name="type">
            <option value="原创" ${article.type=='原创'?'selected':''}>原创</option>
            <option value="转载" ${article.type=='转载'?'selected':''}>转载</option>
          </select>
        </td>
        <td></td>
      </tr>
      <tr>
        <td>时间：</td>
        <td><input type="datetime-local" name="time" value="${article.showtime}"></td>
        <td>${errors.time[0]}</td>
      </tr>
      <tr>
        <td>是否顶置：</td>
        <td>
          <select id="top" name="top">
            <option value="0" ${article.top==0?'selected':''}>不顶置</option>
            <option value="1" ${article.top==1?'selected':''}>顶置</option>
          </select>
        </td>
        <td></td>
      </tr>
      <c:if test="${method=='update'}">
        <tr>
          <td>摘要：</td>
          <td><textarea name="meta" cols="80" rows="8">${fn:escapeXml(article.meta)}</textarea></td>
          <td>${errors.meta[0]}</td>
        </tr>
      </c:if>
      <tr>
        <td></td>
        <td>文章内容:</td>
        <td></td>
      </tr>
    </table>
    ${errors.content[0]}<br/>
    <textarea name="content" id="content">${fn:escapeXml(article.content)}</textarea>
    <input type="submit" value="提交" width="150" height="75">
  </form>
</div>
</body>
<script type="text/javascript">
  CKEDITOR.replace('content');
  function addCategory(url){
    var categoryName = window.prompt("添加文章类别");
    if(categoryName==null||categoryName.trim().length<=0) {
      alert("文章类别不能为空哦！");
      return;
    }

    //类别已存在
    var select = document.getElementById('cid');
    var options = select.options;
    for(var i=0;i<options.length;i++){
      if(options[i].innerHTML==categoryName.trim()) {
        alert("你添加的类别已存在！");
        return;
      }
    }
    //符合条件，进行请求,模拟post表单
    var form = document.createElement("form");
    form.action = url;
    form.method = 'post';
    form.style.display = 'none';
    var input = document.createElement("input");
    input.type = "text";
    input.name = "cname";
    input.value = categoryName;
    form.appendChild(input);
    document.body.appendChild(form);
    form.submit();
  }
</script>
</html>
