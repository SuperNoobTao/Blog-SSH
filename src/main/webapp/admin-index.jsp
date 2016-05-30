<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js fixed-layout">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Amaze UI Admin index Examples</title>
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
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->

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
        <li><a href="admin-index.jsp"><span class="am-icon-home"></span> 首页</a></li>

        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-file"></span> 用户模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
            <li><a href="admin-user.jsp" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="#"><span class="am-icon-calendar"></span> 系统日志</a></li>
          </ul>
        </li>


        <li><a href="admin-article-manage.jsp"><span class="am-icon-table"></span>文章模块</a></li>
        <li><a href="admin-category-manage.jsp"><span class="am-icon-table"></span>管理模块</a></li>
        <li><a href="#"><span class="am-icon-table"></span>客户模块</a></li>
        <li><a href="admin-comment-manage.jsp"><span class="am-icon-table"></span> 管理留言</a></li>

        <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
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
      <div class="am-cf am-padding">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">首页</strong> / <small>一些常用模块</small></div>
      </div>

      <ul class="am-avg-sm-1 am-avg-md-4 am-margin am-padding am-text-center admin-content-list ">
        <li><a href="#" class="am-text-success"><span class="am-icon-btn am-icon-file-text"></span><br/>新增页面<br/>2300</a></li>
        <li><a href="#" class="am-text-warning"><span class="am-icon-btn am-icon-briefcase"></span><br/>成交订单<br/>308</a></li>
        <li><a href="#" class="am-text-danger"><span class="am-icon-btn am-icon-recycle"></span><br/>昨日访问<br/>80082</a></li>
        <li><a href="#" class="am-text-secondary"><span class="am-icon-btn am-icon-user-md"></span><br/>在线用户<br/>3000</a></li>
      </ul>

      <div class="am-g">
        <div class="am-u-sm-12">
          <table class="am-table am-table-bd am-table-striped admin-content-table">
            <thead>
            <tr>
              <th>ID</th><th>用户名</th><th>最后成交任务</th><th>成交订单</th><th>管理</th>
            </tr>
            </thead>
            <tbody>
            <tr><td>1</td><td>John Clark</td><td><a href="#">Business management</a></td> <td><span class="am-badge am-badge-success">+20</span></td>
              <td>
                <div class="am-dropdown" data-am-dropdown>
                  <button class="am-btn am-btn-default am-btn-xs am-dropdown-toggle" data-am-dropdown-toggle><span class="am-icon-cog"></span> <span class="am-icon-caret-down"></span></button>
                  <ul class="am-dropdown-content">
                    <li><a href="#">1. 编辑</a></li>
                    <li><a href="#">2. 下载</a></li>
                    <li><a href="#">3. 删除</a></li>
                  </ul>
                </div>
              </td>
            </tr>
            <tr><td>2</td><td>风清扬</td><td><a href="#">公司LOGO设计</a> </td><td><span class="am-badge am-badge-danger">+2</span></td>
              <td>
                <div class="am-dropdown" data-am-dropdown>
                  <button class="am-btn am-btn-default am-btn-xs am-dropdown-toggle" data-am-dropdown-toggle><span class="am-icon-cog"></span> <span class="am-icon-caret-down"></span></button>
                  <ul class="am-dropdown-content">
                    <li><a href="#">1. 编辑</a></li>
                    <li><a href="#">2. 下载</a></li>
                    <li><a href="#">3. 删除</a></li>
                  </ul>
                </div>
              </td>
            </tr>
            <tr><td>3</td><td>詹姆斯</td><td><a href="#">开发一款业务数据软件</a></td><td><span class="am-badge am-badge-warning">+10</span></td>
              <td>
                <div class="am-dropdown" data-am-dropdown>
                  <button class="am-btn am-btn-default am-btn-xs am-dropdown-toggle" data-am-dropdown-toggle><span class="am-icon-cog"></span> <span class="am-icon-caret-down"></span></button>
                  <ul class="am-dropdown-content">
                    <li><a href="#">1. 编辑</a></li>
                    <li><a href="#">2. 下载</a></li>
                    <li><a href="#">3. 删除</a></li>
                  </ul>
                </div>
              </td>
            </tr>
            <tr><td>4</td><td>云适配</td><td><a href="#">适配所有网站</a></td><td><span class="am-badge am-badge-secondary">+50</span></td>
              <td>
                <div class="am-dropdown" data-am-dropdown>
                  <button class="am-btn am-btn-default am-btn-xs am-dropdown-toggle" data-am-dropdown-toggle><span class="am-icon-cog"></span> <span class="am-icon-caret-down"></span></button>
                  <ul class="am-dropdown-content">
                    <li><a href="#">1. 编辑</a></li>
                    <li><a href="#">2. 下载</a></li>
                    <li><a href="#">3. 删除</a></li>
                  </ul>
                </div>
              </td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>



          <div class="am-panel am-panel-default">
            <div class="am-panel-hd am-cf" data-am-collapse="{target: '#collapse-panel-3'}">最近留言<span class="am-icon-chevron-down am-fr" ></span></div>
            <div class="am-panel-bd am-collapse am-in am-cf" id="collapse-panel-3">
              <ul class="am-comments-list admin-content-comment">
                <li class="am-comment">
                  <a href="#"><img src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/96/h/96" alt="" class="am-comment-avatar" width="48" height="48"></a>
                  <div class="am-comment-main">
                    <header class="am-comment-hd">
                      <div class="am-comment-meta"><a href="#" class="am-comment-author">某人</a> 评论于 <time>2014-7-12 15:30</time></div>
                    </header>
                    <div class="am-comment-bd"><p>遵循 “移动优先（Mobile First）”、“渐进增强（Progressive enhancement）”的理念，可先从移动设备开始开发网站，逐步在扩展的更大屏幕的设备上，专注于最重要的内容和交互，很好。</p>
                    </div>
                  </div>
                </li>

                <li class="am-comment">
                  <a href="#"><img src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/96/h/96" alt="" class="am-comment-avatar" width="48" height="48"></a>
                  <div class="am-comment-main">
                    <header class="am-comment-hd">
                      <div class="am-comment-meta"><a href="#" class="am-comment-author">某人</a> 评论于 <time>2014-7-12 15:30</time></div>
                    </header>
                    <div class="am-comment-bd"><p>有效减少为兼容旧浏览器的臃肿代码；基于 CSS3 的交互效果，平滑、高效。AMUI专注于现代浏览器（支持HTML5），不再为过时的浏览器耗费资源，为更有价值的用户提高更好的体验。</p>
                    </div>
                  </div>
                </li>

              </ul>
              <ul class="am-pagination am-fr admin-content-pagination">
                <li class="am-disabled"><a href="#">&laquo;</a></li>
                <li class="am-active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <footer class="admin-content-footer">
      <hr>
      <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </footer>
  </div>
  <!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

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
</html>
