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
        <h1 class="title article-title">问题记录</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=4" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：java</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-07 12:37</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-45.html">http://localhost:8080/stblog/blog/4/4-45.html</a></p>
        
<p>2016-5-20</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 在做文件上传与下载的时候遇到导入了struts2-spring-plugin-2.3.1.2包就启动不了的情况，</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 创建action对象是由struts2的ObjctFactory的方法创建，你加了这个包后struts的过滤器会加载struts-plugin.xml配置文件，这个包的任物就是创建action的</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 对象由原来的struts转到了spring创建，所以你必须要在spring配置文件中配置，才能正确。这个包只有struts2和spring做整合的时候才能加</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;packagesToScan、</p>

<p>&nbsp;</p>

<p>2016-5-28</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; url跳转问题，404提示。得不到应有的路径。</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; url中的路径需要注意</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; opensession改成getcurrentsession</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 出现Exception in thread &quot;main&quot; org.hibernate.HibernateException: Could not obtain transaction-synchronized Session for current thread &nbsp; &nbsp;&nbsp;</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;getcurrentsession 是事务形式的，需要在配置文件中配置事务才能获取！</p>

<p>&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;aop:advisor&nbsp; pointcut=&quot;execution(*&nbsp;cn.edu.zucc.service..*.*(..))&quot;&nbsp;advice-ref=&quot;txAdvice&quot;/&gt;</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 注意service后需要2个点！！！！！！！！！！！</p>

<p>&nbsp;</p>

<p>2016-6-01</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;无法加载js</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;得到的页面无法拥有富文本编辑器的效果，在更改js路径之后解决问题。</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>2016-6-03</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;数据库异常报错</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;org.hibernate.exception.SQLGrammarException: could not extract ResultSet</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; Caused by: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Unknown column &#39;this_.category&#39; in &#39;field list&#39;</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; 数据库中不许有-作为中间连接件。比如category-date是错误的。需要改成category_date</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;在inteliij idea中 hibernate自动映射注解，将数据库中int的字段自动更变为integer</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;nullexpction !!!!!!!!!!会报空指针异常，因为integer是int的包装类，是个类。所以的话默认值为null &nbsp;而null在做插入数据库处理的时候是不被允许的</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;谨记！！！！！！！！！！！！！！！！！！！！！</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>2016-6-04</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;hql 中select 某列，某列，某列，得到的是object类而不是对应的实体类。</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1.网上教程</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.建立一个有特定需要的视图！！</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>2016-6-06</p>

<p>Done：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;在filter中注入service</p>

<p>E&amp;S：</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;空指针异常。得不到service</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 先filter中加入DelegatingFilterProxy类，&quot;targetFilterLifecycle&quot;指明作用于filter的所有生命周期。</p>

<p>原理是，DelegatingFilterProxy类是一个代理类，所有的请求都会首先发到这个filter代理，然后再按照&quot;filter-name&quot;委派到spring中的这个bean。</p>

<p>在Spring中配置的bean的name要和web.xml中的&lt;filter-name&gt;一样.</p>

<p>此外，spring bean实现了Filter接口，但默认情况下，是由spring容器来管理其生命周期的(不是由tomcat这种服务器容器来管理)。如果设置&quot;targetFilterLifecycle&quot;为True，则spring来管理Filter.init()和Filter.destroy()；若为false，则这两个方法失效！！</p>

<p>B和A最大的不同是，A是一个filter，优先被加载到container中，无法调用spring中后续的bean；而B是一个spring bean，可以引用其他的bean，而请求都通过DelegatingFilterProxy类委派给B！</p>

<p><a href="http://blog.csdn.net/whuslei/article/details/8134848">http://blog.csdn.net/whuslei/article/details/8134848</a></p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-45.html">http://localhost:8080/stblog/blog/4/4-45.html</a></p>
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
                <a href="${lastArticle.articleStaticUrl}" title="上一篇">
                    <i class="icon-double-angle-left"></i>${lastArticle.articleTitle}
                </a>
            </div>
            <div>
                <a href="${nextArticle.articleStaticUrl}" title="下一篇">
                    <i class="icon-double-angle-right"></i>${nextArticle.articleTitle}
                </a>
            </div>
        </div>
    </div>

    <div class="sidebar box">
        <div class="sidebox widget">
            <h3 class="widget-title">最近更新</h3>
            <ul class="post-list">
                <#list lastArticlesList as la>
                    <li>
                        <div class="meta">
                            <h5><a href="/stblog${la.articleStaticUrl}.html">${la.articleTitle}</a></h5>
                            <em>${la.articleCdate?string("yyyy-MM-dd HH:mm")}</em>
                        </div>
                    </li>
                </#list>
                <li class="more"><a href="/stblog/listArticle.action">more</a></li>
            </ul>
        </div>

        <div class="sidebox widget">
            <h3 class="widget-title"><i class="icon-search icon"></i></h3>
            <form class="searchform" method="post" action="/stblog/search.action">
                <input type="text" name="key" value="输入关键字搜索博客..." onFocus="this.value=''" onBlur="this.value='输入关键字搜索博客...'"/>
            </form>
        </div>

        <div class="sidebox widget">
            <h3 class="widget-title categories">分类</h3>
            <ul class="categories">
                <#list categoryList as cl>
                    <li><a href="/stblog/listArticle.action?cid=${cl.categoryId}">${cl.categoryName}</a></li>
                </#list>
            </ul>
        </div>
    </div>

    <div class="clear"></div>

</div>

<div class="footer-wrapper">
    <div id="footer" class="four">
        <a href="/s/">短网址</a>&nbsp;&nbsp;
        <a href="/WorkUpload/">作业提交系统</a>&nbsp;&nbsp;
    </div>
</div>
<div class="site-generator-wrapper">
    <div class="site-generator">
        Copyright &copy;2016.Coselding &nbsp;Design by <a href="http://elemisfreebies.com">elemis.</a> All rights reserved.<a href="http://www.miitbeian.gov.cn">鲁ICP备15036981号-2</a>
    </div>
</div>

<#--<script type="text/javascript" src="/stblog/style/js/scripts.js"></script>-->
<#--<script type="text/javascript">-->
    <#--window.onload = function(){-->
        <#--like("/stblog/likeAction_getData.action?artid=${artid}");-->
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
        <#--input.value = "问题记录";-->
        <#--form.appendChild(input);-->

        <#--var input2 = document.createElement("input");-->
        <#--input2.name = "artid";-->
        <#--input2.value = "45";-->
        <#--form.appendChild(input2);-->

        <#--document.body.appendChild(form);-->
        <#--form.submit();-->
    <#--}-->
<#--</script>-->
</body>
</html>