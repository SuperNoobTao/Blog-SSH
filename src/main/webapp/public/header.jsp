<%--
  Created by IntelliJ IDEA.
  User: 宇强
  Date: 2016/3/16 0016
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="scanlines"></div>
<div class="header-wrapper opacity">
  <div class="header">
    <div class="logo">
      <a href="${pageContext.request.contextPath}/">
        <h1>Coselding博客</h1>
      </a>
    </div>

    <div id="menu-wrapper">
      <div id="menu" class="menu">
        <ul id="tiny">
          <li class="active">
            <a href="${pageContext.request.contextPath}/">博客</a>
            <ul>
              <li><a href="${pageContext.request.contextPath}/listArticle.action">所有博文</a></li>
            </ul>
          </li>
          <li>
            <a href="https://github.com/Coselding" title="进入我的Github">Github</a>
          </li>
          <li>
            <a href="http://blog.csdn.net/u014394255" title="进入我的CSDN博客">CSDN博客</a>
          </li>
          <li>
            <a href="${pageContext.request.contextPath}/commentUI.action" title="给我留言">留言板</a>
          </li>
          <li><a href="#">Menu</a>
            <ul>
              <li><a href="/s/">短网址</a></li>
              <li><a href="/WorkUpload/">作业提交系统</a></li>
              <li><a href="/uShare/">uShare</a></li>
              <li><a href="/smartor/">Smartor</a></li>
              <li><a href="/PlaneWar/">飞机大战</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>

<div class="wrapper">
  <ul class="social">
    <li><a class="rss" href="${pageContext.request.contextPath}/rssBlogUI.action" title="博客订阅"></a></li>
    <li><a class="qq" href="tencent://message/?uin=1098129797&Site=&Menu=yes" title="QQ"></a></li>
    <li><a class="weibo" href="http://weibo.com/u/2671168890" title="新浪微博"></a></li>
    <li><a class="wechat" href="${pageContext.request.contextPath}/public/wechat.jsp" title="微信"></a></li>
    <li><a class="email" href="mailto:1098129797@qq.com" title="邮件"></a></li>
    <li><a class="phone" href="tel:13210135013" title="手机"></a></li>
  </ul>
  <div class="intro">非淡泊无以明志，非宁静无以致远。</div>
</div>
