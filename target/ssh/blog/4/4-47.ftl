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
        <h1 class="title article-title">think in java 5.9笔记</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=4" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：java</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-07 12:39</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-47.html">http://localhost:8080/stblog/blog/4/4-47.html</a></p>
        
<p>子类能继承父类的private 成员以及方法吗？</p>

<p>子类继承父类，子类拥有了父类的所有属性和方法。</p>

<p>程序验证，父类的私有属性和方法子类是无法直接访问的。当然私有属性可以通过public修饰的getter和setter方法访问到的，但是私有方法不行。</p>

<p>假设：子类不能够继承父类的私有属性和方法</p>

<p>那么：分析内存后，会发现，当一个子类被实例化的时候，默认会先调用父类的构造方法对父类进行初始化，即在内存中创建一个父类对象，然后再父类对象的外部放上子类独有的属性，两者合起来成为一个子类的对象。</p>

<p>所以：子类继承了父类的所有属性和方法或子类拥有父类的所有属性和方法是对的，只不过父类的私有属性和方法，子类是无法直接访问到的。即只是拥有，但是无法使用。</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>当你在子类中覆盖了父类的private方法？</p>

<p>public&nbsp;class&nbsp;FinalTest1{</p>

<p>private&nbsp;void&nbsp;test(){</p>

<p>&nbsp;</p>

<p>System.out.println(&quot;s&quot;);</p>

<p>}</p>

<p>class&nbsp;FinalTest&nbsp;extends&nbsp;FinalTest1{</p>

<p>void&nbsp;test&nbsp;(){</p>

<p>&nbsp;</p>

<p>int&nbsp;b&nbsp;=&nbsp;1;</p>

<p>&nbsp;</p>

<p>System.out.print(b);</p>

<p>&nbsp;</p>

<p>}</p>

<p>}</p>

<p>public&nbsp;static&nbsp;void&nbsp;main(String&nbsp;[]&nbsp;args){</p>

<p>&nbsp;</p>

<p>FinalTest&nbsp;start&nbsp;=&nbsp;new&nbsp;FinalTest();</p>

<p>&nbsp;</p>

<p>start.test();</p>

<p>}</p>

<p>这是错误的。</p>

<p>这不是覆盖</p>

<p>FinalTest&nbsp;start&nbsp;=&nbsp;new&nbsp;FinalTest();</p>

<p>start.test();</p>

<p>start.test();调用的是FinalTest的test()方法，而父类的test()不是覆盖了，而是子类FinalTest根本访问不到！所以只是子类和父类方法名相同罢了。</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>vector与final</p>

<p>vector中的类都是final的，但是</p>

<p>1、stack类继承了vector，在创建stack时会有不方便之处</p>

<p>2、vector中的方法，addElement()和elementAt()是final的，但是这两种方法是同步的会导致很大的执行开销抹煞了final提高性能的好处。</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>HashMap、HashTable的区别及其优缺点</p>

<p>&nbsp;</p>

<p>HashTable 中的方法是同步的 HashMap的方法在缺省情况下是非同步的 因此在多线程环境下需要做额外的同步机制</p>

<p>HashTable不允许有null值 key和value都不允许，而HashMap允许有null值 key和value都允许 因此HashMap 使用containKey（）来判断是否存在某个键</p>

<p>HashTable 使用Enumeration ，而HashMap使用iterator</p>

<p>Hashtable是Dictionary的子类，HashMap是Map接口的一个实现类</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>当子类重写了父类方法，向上造成后调用的是子类方法；</p>

<p>子类没有重写父类方法，向上造型后调用的是父类方法。</p>

<p>public&nbsp;class&nbsp;Test1&nbsp;{</p>

<p>&nbsp;public&nbsp;static&nbsp;void&nbsp;main(String[]&nbsp;args)&nbsp; {</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;A&nbsp;k=new&nbsp;B();</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; k.sayHi();</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; k.hello();</p>

<p>&nbsp; }</p>

<p>&nbsp; &nbsp; }</p>

<p>class&nbsp;A&nbsp;{</p>

<p>&nbsp; &nbsp; &nbsp; public&nbsp;void&nbsp;sayHi(){</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;我是父类&quot;);</p>

<p>&nbsp;}</p>

<p>&nbsp; &nbsp;public&nbsp;void&nbsp;hello(){</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;我是父类hello&quot;);</p>

<p>&nbsp; &nbsp; }</p>

<p>}</p>

<p>class&nbsp;B&nbsp;extends&nbsp;A{</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; public&nbsp;void&nbsp;sayHi(){</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;我是子类&quot;);</p>

<p>&nbsp;}</p>

<p>}</p>

<p>输出结果:</p>

<p>我是子类</p>

<p>我是父类hello</p>

<p>&nbsp;</p>

<p>ArrayList和Vector在使用上有什么区别啊</p>

<p>Vector和ArrayList在使用上非常相似,都可用来表示一组数量可变的对象应用的集合,并且可以随机地访问其中的元素。</p>

<p>1 Vector的方法都是同步的(Synchronized),是线程安全的(thread-safe)，而ArrayList的方法不是，由于线程的同步必然要影响性能，因此,ArrayList的性能比Vector好。</p>

<p>2 当Vector或ArrayList中的元素超过它的初始大小时,Vector会将它的容量翻倍,而ArrayList只增加50%的大小，这样,ArrayList就有利于节约内存空间。</p>

<p>&nbsp;</p>

<p>static final &nbsp;static final</p>

<p>static是类静态量所有的对象共享这个</p>

<p>final是常量，每个对象都拥有而且是不变的</p>

<p>static final 是类静态常量，在加载这个类以后都不会变</p>

<p>&nbsp;</p>

<p>在用dispose释放成员对象的时候，如果成员对象被对个对象共享，那么需要使这个成员对象变为具有引用计数的共享对象。</p>

<p>&nbsp;</p>

<p>静态绑定：</p>

<p>在程序执行前方法已经被绑定，此时由编译器或其它连接程序实现。例如：C。</p>

<p>针对java简单的可以理解为程序编译期的绑定；这里特别说明一点，java当中的方法只有final，static，private和构造方法是前期绑定</p>

<p>&nbsp;</p>

<p>动态绑定：</p>

<p>后期绑定：在运行时根据具体对象的类型进行绑定。</p>

<p>若一种语言实现了后期绑定，同时必 须提供一些机制，可在运行期间判断对象的类型，并分别调用适当的方法。也就是说，编译器此时依然不知道对象的类型，但方法调用机制能自己去调查，找到正确 的方法主体。不同的语言对后期绑定的实现方法是有所区别的。但我们至少可以这样认为：它们都要在对象中安插某些特殊类型的信息。</p>

<p>&nbsp;</p>

<p>动态绑定的过程：</p>

<p>虚拟机提取对象的实际类型的方法表；</p>

<p>虚拟机搜索方法签名；</p>

<p>调用方法。</p>

<p>&nbsp;</p>

<p>关于绑定相关的总结：</p>

<p>在了解了三者的概念之后，很明显我们发现java属于后期绑定。在java中，几 乎所有的方法都是后期绑定的，在运行时动态绑定方法属于子类还是基类。但是也有特殊，针对static方法和final方法由于不能被继承，因此在编译时 就可以确定他们的值，他们是属于前期绑定的。特别说明的一点是，private声明的方法和成员变量不能被子类继承，所有的private方法都被隐式的 指定为final的(由此我们也可以知道：将方法声明为final类型的一是为了防止方法被覆盖，二是为了有效的关闭java中的动态绑定)。java中 的后期绑定是有JVM来实现的，我们不用去显式的声明它，而C++则不同,必须明确的声明某个方法具备后期绑定。</p>

<p>&nbsp;</p>

<p>java当中的向上转型或者说多态是借助于动态绑定实现的，所以理解了动态绑定，也就搞定了向上转型和多态。</p>

<p>前面已经说了对于java当中的方法而言，除了final，static，private和构造方法是前期绑定外，其他的方法全部为动态绑定。而动态绑定的典型发生在父类和子类的转换声明之下：</p>

<p>比如：Parent p = new Children();</p>

<p>其具体过程细节如下：</p>

<p>1：编译器检查对象的声明类型和方法名。假设我们调用x.f(args)方法，并且x已经被声明为C类的对象，那么编译器会列举出C类中所有的名称为f的方法和从C类的超类继承过来的f方法</p>

<p>2：接下来编译器检查方法调用中提供的参数类型。如果在所有名称为f 的方法中有一个参数类型和调用提供的参数类型最为匹配，那么就调用这个方法，这个过程叫做&ldquo;重载解析&rdquo;</p>

<p>3：当程序运行并且使用动态绑定调用方法时，虚拟机必须调用同x所指向的对象的实际类型相匹配的方法版本。假设实际类型为D(C的子类)，如果D类定义了f(String)那么该方法被调用，否则就在D的超类中搜寻方法f(String),依次类推</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>继承、重载、覆盖、多态</p>

<p>http://blog.chinaunix.net/uid-375137-id-2413340.html</p>

<p>&nbsp;</p>

<p>当Sub对象转型为Super引用时，Super sup=new Sub();任何域访问操作都将由编译器解析，因此不少多态的。所以sup.field访问的将是父类的变量，而不是子类的变量。子类Sub包含两个域，this.field和super.field，默认是this.field。</p>

<p>&nbsp;</p>

<p>在Java中，final修饰的类有什么特点</p>

<p>- final修饰的类不能被继承。</p>

<p>- Sting就是一个被final修饰的类，我们只能用，不用继承</p>

<p>- final不仅可以修饰类，还可以修饰变量，被final修饰的变量就是一个常量，只能赋值一次</p>

<p>&nbsp;</p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/4/4-47.html">http://localhost:8080/stblog/blog/4/4-47.html</a></p>
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
        <#--input.value = "think in java 5.9笔记";-->
        <#--form.appendChild(input);-->

        <#--var input2 = document.createElement("input");-->
        <#--input2.name = "artid";-->
        <#--input2.value = "47";-->
        <#--form.appendChild(input2);-->

        <#--document.body.appendChild(form);-->
        <#--form.submit();-->
    <#--}-->
<#--</script>-->
</body>
</html>