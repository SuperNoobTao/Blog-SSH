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
        $.backstretch("/stblog/style/images/bg/16.jpg");
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
        <h1 class="title article-title">5.8笔记第六章概览</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=4" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：java</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-07 01:24</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-54.html">http://localhost:8080/stblog/blog/4/4-54.html</a></p>
        
<p>java的自动包装机制</p>

<p>1.因为封装的数据类型就是一个对象,可以拥有属性和方法,有了这些属性和方法,我们就可以用它们来处理数据.比如Integer对象里的parseInt(String&nbsp;s),可以把字符串转换成int类型等.</p>

<p>&nbsp; &nbsp; 2.java是面向对象的一门语言,到处都是对象,有些时候我们需要传递的值必须是对象类型的.比如:structs框架里的DynaActionForm,当JSP页面数据传到dform中时,我们需要(Integer)dform.get(&quot;qty&quot;);,而(int)dform.get(&quot;qty&quot;);这样是错误的.</p>

<p>&nbsp; &nbsp; 终上所述,封装数据类型可以弥补基础数据类型的一些不足之处.</p>

<p>&nbsp;</p>

<p>main()中的可变参数：</p>

<p>当你在命令行编译的时候输入参数，会返回相应的结果。</p>

<p>&nbsp;</p>

<p>枚举类型enum在项目中的实际应用：</p>

<p>http://www.cnblogs.com/mcgrady/archive/2015/08/14/4730747.html</p>

<p>&nbsp;</p>

<p>java解释器</p>

<p>应该说&ldquo;java解释器就是把在java虚拟机上运行的目标代码（字节码）解释成为具体平台的机器码的程序。</p>

<p>&rdquo;即jdk或jre目录下bin目录中的java.exe文件，而javac.exe是编译器。</p>

<p>运行java程序的过程是先用javac编译，然后用java解释。</p>

<p>而一经编译成功后，就可以直接用java.exe随处解释运行了</p>

<p>&nbsp;</p>

<p>import static 和import 的区别</p>

<p>import statics是导入类中的静态方法，只需要直接用方法名调用静态方法，而不必用ClassName.方法名 的方式来调用。</p>

<p>&nbsp;</p>

<p>java中，实例方法可直接调用超类的实例方法，这句话哪错了？</p>

<p>如果超类的实例方法没有在子类中被重写的就可以直接调用，但如果经过子类重写了的话就被覆盖了，这时需要通过super关键字来调用了。</p>

<p>&nbsp;</p>

<p>继承与组合？</p>

<p>http://blog.csdn.net/taoshengyang/article/details/7310883</p>

<p>继承与组合是两个不同方向的思考，继承思考is a &nbsp;组合思考has a 比如 你拿鸭子来做一个测试，当你想到is a你会想到给鸭子定义一个通用类鸭子类，但是当你想到has a 的时候你会想鸭子会具有哪些行为特征，用这些去描述它。从继承角度说：继承在初始化的时候确实带给人一种非常简单清晰的思路，但是在往后的更变上比较的麻烦，首先如果要加一个行为，那么就代表所有的导出类都要加一个行为，使代码复杂， 其次，当这个行为在一些对象可用时，一些对象不可用时，你还需要做另外的事来保证。所以这个时候我们可以思考组合。</p>

<p>&nbsp;</p>

<p>第六章：</p>

<p>第六章初以为很简单，在看了之后才发现没想象中那么简单。</p>

<p>1.类库的概念。---其实就是一个包。怎么让这个包变得无冲突，让客户端程序员用的放心。</p>

<p>2.java解释器。</p>

<p>3.public，private，protected，包访问权限。</p>

<p>4.当创建一个public的构造器，并用构造器.方法 &nbsp;来访问方法时，如果方法不提供public权限那是无法被访问的，但是如果两个类处于相同的目录并没有设定任何的包的名称，java自动看作是属于默认包的，所以是可以访问的。</p>

<p>5.一般都是把成员变量设为private，而构造器和方法是public的，这样别的类就触不到核心的成员变量。但是也可以将构造器设为private，设定一个静态的方法来new一个这样的构造器！</p>

<p>6.在设计程序时，一般都是把接口留给客户端程序员</p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-54.html">http://localhost:8080/stblog/blog/4/4-54.html</a></p>
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

</body>
</html>