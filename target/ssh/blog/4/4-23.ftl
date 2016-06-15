<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1,user-scalable=no">
    <title>Coselding博客</title>
    <link rel="stylesheet" type="text/css" media="all" href="/stblog/style.css" />
    <link rel="stylesheet" type="text/css" media="all" href="/stblog/style/css/font-awesome.min.css" />
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,400italic,300italic,300,700,700italic|Open+Sans+Condensed:300,700" rel="stylesheet" type="text/css">
    <!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="/stblog/style/css/font-awesome-ie7.min.css"/>
    <![endif]-->
    <!--[if IE 8]>
    <link rel="stylesheet" type="text/css" href="/stblog/style/css/ie8.css" media="all" />
    <![endif]-->
    <!--[if IE 9]>
    <link rel="stylesheet" type="text/css" href="/stblog/style/css/ie9.css" media="all" />
    <![endif]-->
    <script type="text/javascript" src="/stblog/style/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="/stblog/style/js/ddsmoothmenu.js"></script>
    <script type="text/javascript" src="/stblog/style/js/retina.js"></script>
    <script type="text/javascript" src="/stblog/style/js/selectnav.js"></script>
    <script type="text/javascript" src="/stblog/style/js/jquery.backstretch.min.js"></script>
    <script type="text/javascript">
        $.backstretch("/stblog/style/images/bg/1.jpg");
    </script>
</head>
<body>
<div class="scanlines"></div>

<div class="header-wrapper opacity">
    <div class="header">
        <div class="logo">
            <a href="/stblog">
                <h1>Coselding博客</h1>
            </a>
        </div>

        <div id="menu-wrapper">
            <div id="menu" class="menu">
                <ul id="tiny">
                    <li class="active">
                        <a href="/stblog">博客</a>
                        <ul>
                            <li><a href="/stblog/listArticle.action/listArticle.action">所有博文</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="https://github.com/Coselding" title="进入我的Github">Github</a>
                    </li>
                    <li>
                        <a href="http://blog.csdn.net/u014394255" title="进入我的CSDN博客">CSDN博客</a>
                    </li>
                    <li>
                        <a href="/stblog/commentUI.action" title="给我留言">留言板</a>
                    </li>
                    <li><a href="#">Menu</a>
                        <ul>
                            <li><a href="/s/">短网址</a></li>
                            <li><a href="/WorkUpload/">作业提交系统</a></li>
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
        <li><a class="rss" href="/stblog/rssBlogUI.action" title="博客订阅"></a></li>
        <li><a class="qq" href="tencent://message/?uin=1098129797&Site=&Menu=yes" title="QQ"></a></li>
        <li><a class="weibo" href="http://weibo.com/u/2671168890" title="新浪微博"></a></li>
        <li><a class="wechat" href="/stblog/public/wechat.jsp" title="微信"></a></li>
        <li><a class="email" href="mailto:1098129797@qq.com" title="邮件"></a></li>
        <li><a class="phone" href="tel:13210135013" title="手机"></a></li>
    </ul>
    <div class="intro">你不是人,你是天使!遇上你是我这辈子最大的狗屎运。</div>

    <div class="content box">
        <h1 class="title article-title">222</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=4" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：java</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-06 09:57</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-23.html">http://localhost:8080/stblog/blog/4/4-23.html</a></p>
        
<p>222</p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-23.html">http://localhost:8080/stblog/blog/4/4-23.html</a></p>
        <div class="record">
            <div>
                <a id="looked" href="#"><i class="icon-eye-open"></i> ${looked} 已阅</a>
            </div>
            &nbsp;&nbsp;
            <div>
                <a id="likes" href="javascript:like('/stblog/likeAction.action?artid=${artid}')"><i class="icon-heart-empty"></i> ${likes} 喜爱</a>
            </div>
            <a class="comment-btn" href="javascript:onComment('/stblog/commentUI.action')"><i class="icon-comments"></i> 给我留言</a>
        </div>
        <div class="last-next">
            <div>
                <a href="${lastArticle.staticURL}" title="上一篇">
                    <i class="icon-double-angle-left"></i>${lastArticle.title}
                </a>
            </div>
            <div>
                <a href="${nextArticle.staticURL}" title="下一篇">
                    <i class="icon-double-angle-right"></i>${nextArticle.title}
                </a>
            </div>
        </div>
    </div>

    <#--<div class="sidebar box">-->
        <#--<div class="sidebox widget">-->
            <#--<h3 class="widget-title">最近更新</h3>-->
            <#--<ul class="post-list">-->
                <#--<#list lastArticlesList as la>-->
                    <#--<li>-->
                        <#--<div class="meta">-->
                            <#--<h5><a href="/stblog${la.staticURL}.html">${la.title}</a></h5>-->
                            <#--<em>${la.time?string("yyyy-MM-dd HH:mm")}</em>-->
                        <#--</div>-->
                    <#--</li>-->
                <#--</#list>-->
                <#--<li class="more"><a href="/stblog/listArticle.action">more</a></li>-->
            <#--</ul>-->
        <#--</div>-->

        <#--<div class="sidebox widget">-->
            <#--<h3 class="widget-title"><i class="icon-search icon"></i></h3>-->
            <#--<form class="searchform" method="post" action="/stblog/search.action">-->
                <#--<input type="text" name="key" value="输入关键字搜索博客..." onFocus="this.value=''" onBlur="this.value='输入关键字搜索博客...'"/>-->
            <#--</form>-->
        <#--</div>-->

        <#--<div class="sidebox widget">-->
            <#--<h3 class="widget-title categories">分类</h3>-->
            <#--<ul class="categories">-->
                <#--<#list categoryList as cl>-->
                    <#--<li><a href="/stblog/listArticle.action?cid=${cl.cid}">${cl.cname}</a></li>-->
                <#--</#list>-->
            <#--</ul>-->
        <#--</div>-->
    <#--</div>-->

    <#--<div class="clear"></div>-->

<#--</div>-->

<#--<div class="footer-wrapper">-->
    <#--<div id="footer" class="four">-->
        <#--<a href="/s/">短网址</a>&nbsp;&nbsp;-->
        <#--<a href="/WorkUpload/">作业提交系统</a>&nbsp;&nbsp;-->
    <#--</div>-->
<#--</div>-->
<#--<div class="site-generator-wrapper">-->
    <#--<div class="site-generator">-->
        <#--Copyright &copy;2016.Coselding &nbsp;Design by <a href="http://elemisfreebies.com">elemis.</a> All rights reserved.<a href="http://www.miitbeian.gov.cn">鲁ICP备15036981号-2</a>-->
    <#--</div>-->
<#--</div>-->

<#--<script type="text/javascript" src="/stblog/style/js/scripts.js"></script>-->
<#--<script type="text/javascript">-->
    <#--window.onload = function(){-->
        <#--like("/stblog/likeAction_getData.action?artid=${artid}");-->
    <#--};-->

    <#--function like(url){-->
        <#--var xmlhttp;-->
        <#--if (window.XMLHttpRequest)-->
        <#--{// code for IE7+, Firefox, Chrome, Opera, Safari-->
            <#--xmlhttp=new XMLHttpRequest();-->
        <#--}-->
        <#--else-->
        <#--{// code for IE6, IE5-->
            <#--xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");-->
        <#--}-->

        <#--xmlhttp.onreadystatechange=function()-->
        <#--{-->
            <#--if (xmlhttp.readyState==4 && xmlhttp.status==200)-->
            <#--{-->
                <#--var text = xmlhttp.responseText.split(";");-->

                <#--var looked = document.getElementById("looked");-->
                <#--looked.innerHTML = "<i class='icon-eye-open'></i> "+text[0]+" 已阅";-->

                <#--var likes = document.getElementById("likes");-->
                <#--likes.innerHTML = "<i class='icon-heart-empty'></i> "+text[1]+" 喜爱";-->
            <#--}-->
        <#--}-->

        <#--xmlhttp.open("GET",url,true);-->
        <#--xmlhttp.send();-->
    <#--}-->

    <#--function onComment(url){-->
        <#--var form = document.createElement('form');-->
        <#--form.action = url;-->
        <#--form.method = "post";-->
        <#--form.style.display =  "none";-->

        <#--var input = document.createElement("input");-->
        <#--input.name = "title";-->
        <#--input.value = "222";-->
        <#--form.appendChild(input);-->

        <#--var input2 = document.createElement("input");-->
        <#--input2.name = "artid";-->
        <#--input2.value = "23";-->
        <#--form.appendChild(input2);-->

        <#--document.body.appendChild(form);-->
        <#--form.submit();-->
    <#--}-->
<#--</script>-->
</body>
</html>