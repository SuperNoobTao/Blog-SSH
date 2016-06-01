

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

  <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html class="no-js fixed-layout">\
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>博客后台管理</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
  <script type="text/javascript" src="js/ckeditor.js"></script>

</head>
<body>

<header class="am-topbar am-topbar-inverse admin-header">
  <div class="am-topbar-brand">
    <strong></strong> <small>博客后台管理</small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">1</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
      <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li><a href="admin-index.jsp"><span class="am-icon-home"></span>首页</a></li>

        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-file"></span> 用户模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
            <li><a href="admin-user.jsp" class="am-cf"><span class="am-icon-check"></span>个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="#"><span class="am-icon-calendar"></span>系统日志</a></li>
          </ul>
        </li>


        <li><a href="admin-article-manage.jsp"><span class="am-icon-table"></span>文章模块</a></li>
        <li><a href="admin-category-manage.jsp"><span class="am-icon-table"></span>类别模块</a></li>
        <li><a href="#"><span class="am-icon-table"></span>客户模块</a></li>
        <li><a href="admin-comment-manage.jsp"><span class="am-icon-table"></span>管理留言</a></li>

        <li><a href="#"><span class="am-icon-sign-out"></span>注销</a></li>
      </ul>


      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-tag"></span> to</p>
          <p>你不是人，你是天使，遇到你是我最大的狗屎运</p>
        </div>
      </div>
    </div>
  </div>
  <!-- sidebar end -->

<!-- content start -->
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">表单</strong> /
        <small>form</small>
      </div>
    </div>


    <form action="${pageContext.request.contextPath}/manage/article_${method}.action" method="post">



<%--所属类别--%>
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">所属类别</div>
              <div class="am-u-sm-8 am-u-md-10">
                <select data-am-selected="{btnSize: 'sm'}">
                  <option value="option1">选项一...</option>
                  <option value="option2">选项二.....</option>
                  <option value="option3">选项三........</option>
                </select>
              <td>
                <a href="javascript:addCategory('${pageContext.request.contextPath}/manage/category_add.action')">添加类别</a>
              </td>
            </div>
          </div>

<%--类型--%>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">类型</div>
            <div class="am-u-sm-8 am-u-md-10">
              <div class="am-btn-group" data-am-button>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="options" id="option4" value="原创"> 原创
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="options" id="option5" value="转载"> 转载
                </label>
              </div>
            </div>
          </div>

<%--是否置顶--%>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">是否置顶</div>
            <div class="am-u-sm-8 am-u-md-10">
              <div class="am-btn-group" data-am-button>
                <div class="am-btn-group" data-am-button>
                  <label class="am-btn am-btn-default am-btn-xs">
                    <input type="radio" name="options" id="option7" value="置顶"> 置顶
                  </label>
                  <label class="am-btn am-btn-default am-btn-xs">
                    <input type="radio" name="options" id="option8" value="不置顶"> 不置顶
                  </label>
                </div>
              </div>
            </div>
          </div>

<%--文章标题--%>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">文章标题</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" class="am-input-sm">
            </div>
          </div>

<%--内容摘要--%>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">内容摘要</div>
            <div class="am-u-sm-8 am-u-md-10">
              <td><textarea name="meta" cols="50" rows="4">${fn:escapeXml(article.meta)}</textarea></td>
            </div>
          </div>

<%--内容描述--%>

              <div class="am-u-sm-4 am-u-md-2 am-text-right">内容描述</div>


            <div class="am-u-sm-8 am-u-md-10">
              <td><textarea      name="content" id="content">${fn:escapeXml(article.content)}</textarea></td>
          </div>







    <div class="am-margin">
      <button type="button" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
      <button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
    </div>
    </form>
  </div>


  <footer class="admin-content-footer">
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
  </footer>
</div>
<!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
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
