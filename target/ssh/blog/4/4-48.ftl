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
        <h1 class="title article-title">11111</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=4" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：java</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-07 12:45</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-48.html">http://localhost:8080/stblog/blog/4/4-48.html</a></p>
        
<p>5.22</p>

<p>tomcat的线上部署</p>

<p>maven</p>

<p>&nbsp;</p>

<p>5.23</p>

<p>uml</p>

<p>设计模式</p>

<p>web.xml的作用：</p>

<p>每个javaEE工程中都有web.xml文件，那么它的作用是什么呢？它是每个web.xml工程都必须的吗？&nbsp;</p>

<p>一个web中可以没有web.xml文件，也就是说，web.xml文件并不是web工程必须的。</p>

<p>web.xml文件是用来初始化配置信息：比如Welcome页面、servlet、servlet-mapping、filter、listener、启动加载级别等。</p>

<p>1、指定欢迎页面</p>

<p>2、命名与定制URL。我们可以为Servlet和JSP文件命名并定制URL,其中定制URL是依赖命名的，命名必须在定制URL前。</p>

<p>3、定制初始化参数：可以定制servlet、JSP、Context的初始化参数，然后可以再servlet、JSP、Context中获取这些参数值。&nbsp;</p>

<p>4、指定错误处理页面，可以通过&ldquo;异常类型&rdquo;或&ldquo;错误码&rdquo;来指定错误处理页面。&nbsp;</p>

<p>5、设置过滤器：比如设置一个编码过滤器，过滤所有资源</p>

<p>6、设置监听器</p>

<p>7、设置会话(Session)过期时间，其中时间以分钟为单位，假如设置60分钟超时</p>

<p>&nbsp;</p>

<p>软件生命周期：</p>

<p>问题定义、可行性分析、总体描述、<a href="http://baike.baidu.com/view/170106.htm" target="_blank">系统设计</a>、编码、调试和测试、验收与运行、维护升级到废弃等阶</p>

<p>&nbsp;</p>

<p>线程创建的两种方式：</p>

<p>需要从Java.lang.Thread类派生一个新的线程类，重载它的run()方法</p>

<p>实现Runnalbe接口，重载Runnalbe接口中的run()方法。</p>

<p>&nbsp;</p>

<p>stringbuilder 和stringbuffer</p>

<p>1.&nbsp; 在执行速度方面的比较：StringBuilder&nbsp;&gt;&nbsp; StringBuffer&nbsp; &nbsp;<br />
2.&nbsp; StringBuffer与StringBuilder，他们是字符串变量，是可改变的对象，每当我们用它们对字符串做操作时，实际上是在一个对象上操作的，不像String一样创建一些对象进行操作，所以速度就快了。<br />
3.&nbsp; StringBuilder：线程非安全的<br />
&nbsp; StringBuffer：<a href="https://www.baidu.com/s?wd=%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8&amp;tn=44039180_cpr&amp;fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1YYrj7WuHD3uWfYrjubmWn10ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EPjRvnHm3PH04" rel="nofollow" target="_blank">线程安全</a>的<br />
&nbsp; &nbsp; 当我们在字符串缓冲去被多个线程使用是，<a href="https://www.baidu.com/s?wd=JVM&amp;tn=44039180_cpr&amp;fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1YYrj7WuHD3uWfYrjubmWn10ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EPjRvnHm3PH04" rel="nofollow" target="_blank">JVM</a>不能保证StringBuilder的操作是安全的，虽然他的速度最快，但是可以保证StringBuffer是可以正确操作的。当然大多数情况下就是我们是在单线程下进行的操作，所以大多数情况下是建议用StringBuilder而不用StringBuffer的，就是速度的原因。<br />
<br />
对于三者使用的总结：1.如果要操作少量的数据用&nbsp;=&nbsp;String<br />
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 2.单线程操作字符串缓冲区&nbsp;下操作大量数据&nbsp;=&nbsp;StringBuilder<br />
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3.多线程操作字符串缓冲区&nbsp;下操作大量数据&nbsp;=&nbsp;StringBuffer</p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-48.html">http://localhost:8080/stblog/blog/4/4-48.html</a></p>
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

<script type="text/javascript" src="/stblog/style/js/scripts.js"></script>
<script type="text/javascript">
    window.onload = function(){
        like("/stblog/likeAction_getData.action?artid=${artid}");
        like("/stblog/likeAction_getData.action?artid=${artid}");
    };

    function like(url){
        var xmlhttp;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp=new XMLHttpRequest();
        }
        else
        {// code for IE6, IE5
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.onreadystatechange=function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                var text = xmlhttp.responseText.split(";");

                var looked = document.getElementById("looked");
                looked.innerHTML = "<i class='icon-eye-open'></i> "+text[0]+" 已阅";

                var likes = document.getElementById("likes");
                likes.innerHTML = "<i class='icon-heart-empty'></i> "+text[1]+" 喜爱";
            }
        }

        xmlhttp.open("GET",url,true);
        xmlhttp.send();
    }

    function onComment(url){
        var form = document.createElement('form');
        form.action = url;
        form.method = "post";
        form.style.display =  "none";

        var input = document.createElement("input");
        input.name = "title";
        input.value = "11111";
        form.appendChild(input);

        var input2 = document.createElement("input");
        input2.name = "artid";
        input2.value = "48";
        form.appendChild(input2);

        document.body.appendChild(form);
        form.submit();
    }
</script>
</body>
</html>