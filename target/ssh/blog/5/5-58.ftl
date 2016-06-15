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
        <h1 class="title article-title">132123</h1>
        <div class="info">
            <div><a href="/stblog/listArticle.action?cid=5" title="查看该类型博文"><i class="icon-folder-open-alt"></i>：android</a></div>
            <div><a href="#"><i class="icon-user"></i>：st1</a></div>
            <div><i class="icon-time"></i>：2016-06-07 08:43</div>
        </div>
        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/5/5-58.html">http://localhost:8080/stblog/blog/5/5-58.html</a></p>
        
<p>最近在做一个ssh的框架遇到了一些问题，把这些错误的情况都记下来</p>

<p>&nbsp;</p>

<p>（1）启动失败</p>

<p>在web.xml配置Listener的时候</p>

<p>&nbsp;</p>

<pre>
&lt;listener&gt;
    &lt;listener-class&gt;org.springframework.web.context.ContextLoaderListener&lt;/listener-class&gt;
&lt;/listener&gt;</pre>

<p>只导入了Spring-web.jar包，显示无错，但是编译不起来。</p>

<p>&nbsp;</p>

<p>最后导入了<a href="http://lib.csdn.net/base/17" target="_blank" title="Java EE知识库">spring</a>-webmvc系列的包才得以解决。</p>

<p>&nbsp;</p>

<p>（2）NullPointerException</p>

<p>在struct.xml中需要配置</p>

<pre>
&lt;struts&gt;
    &lt;constant name=&quot;struts.objectFactory&quot; value=&quot;spring&quot; /&gt;
&lt;/struts&gt;</pre>

<p>在访问该Action时，会通过class对应值去spring中寻找相同id值的bean。&nbsp;也可以复制struts2-spring-plugin-x-x-x.jar到WEB-INF/lib目录下。&nbsp;<br />
在struts2-spring-plugin-x-x-x.jar中有一个struts-plugin.xml配置文件</p>

<p>&nbsp;</p>

<p>下面是一个ssh的简单的例子，</p>

<p>&nbsp;</p>

<p>首先这是项目结构，这是一个登录的例子，那么先介绍一个been</p>

<p>&nbsp;</p>

<pre>
@Entity
@Table(name = &quot;tb_user&quot;, schema = &quot;test&quot;)
public class TbUserEntity {
    private Integer id;
    private String username;
    private String pwd;
    private String usertype;


    @Id
    @Column(name = &quot;id&quot;)
    @GeneratedValue(strategy=GenerationType.<em>AUTO</em>)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = &quot;username&quot;)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = &quot;pwd&quot;)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = &quot;usertype&quot;)
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>我们来编写一个通用dao</p>

<p>&nbsp;</p>

<pre>
public abstract class BaseDao&lt;T&gt; {
    private Class&lt;T&gt; entityClass;

    @SuppressWarnings(&quot;unchecked&quot;)
    public BaseDao() {
        Type type=getClass().getGenericSuperclass();
        entityClass=(Class&lt;T&gt;) ((ParameterizedType)type).getActualTypeArguments()[0];
    }

    @SuppressWarnings(&quot;unchecked&quot;)
    public List&lt;T&gt; getList() {
        Session session = HibernateUtil.getSession();
        List&lt;T&gt; list=null;
        try {
            list=session.createCriteria(entityClass).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return list;
    }

    @SuppressWarnings(&quot;unchecked&quot;)
    public T getById(String id) {
        Session session = HibernateUtil.getSession();
        try {
            return (T) session.get(entityClass, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int add(T t) {
        Session session = HibernateUtil.getSession();
        try {
            session.save(t);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return -1;
    }



    public int delete(T t) {
        Session session = HibernateUtil.getSession();
        try {
            session.delete(t);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int update(T t) {
        Session session = HibernateUtil.getSession();
        try {
            session.update(t);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return -1;
    }
    

}</pre>

<p>通用dao中实现了crud</p>

<p>&nbsp;</p>

<p>下面定义一个userdao的接口</p>

<p>&nbsp;</p>

<pre>
public interface UserDao {
    public TbUserEntity login(String username, String password);
   
}</pre>

<p>以及它的实现</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>
public class UserDaoImpl extends BaseDao&lt;TbUserEntity&gt; implements  UserDao{
    @Override
    public TbUserEntity login(String username, String password) {
        try {
            Session session= HibernateUtil.getSession();
            return (TbUserEntity) session.createQuery(&quot;from TbUserEntity where username=:username and pwd=:pwd&quot;)
                    .setString(&quot;username&quot;, username)
                    .setString(&quot;pwd&quot;,password)
                    .uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    }}
</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>在service中写入userservice 以及它的实现</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>
public interface UserService {

    public int add(TbUserEntity webUser);
    public TbUserEntity login(String username, String password);
}

</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

   
    @Override
    public TbUserEntity login(String username, String password) {
        return userDao.login(username,password);
    }

     
}
</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>下面配置<a href="http://lib.csdn.net/base/17" target="_blank" title="Java EE知识库">hibernate</a>：</p>

<p>利用hibernate 的注解配置，下面是hibernate的工具类</p>

<p>&nbsp;</p>

<pre>
package cn.edu.zucc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
   private static Configuration <em>configuration</em>=null;
   private static ServiceRegistry <em>registry</em>=null;
   private static SessionFactory <em>factory</em>=null;
   private static ThreadLocal&lt;Session&gt; <em>threadLocal</em>=null;
   static {
      <em>configuration</em>=new Configuration().configure();
      <em>registry</em>=new StandardServiceRegistryBuilder().applySettings(<em>configuration</em>.getProperties()).build();
      <em>factory</em>=<em>configuration</em>.buildSessionFactory(<em>registry</em>);
      <em>threadLocal</em>=new ThreadLocal&lt;Session&gt;();
   }
   public static Session getSession(){
      Session session=<em>threadLocal</em>.get();
      if(session==null){
         <em>threadLocal</em>.set(<em>factory</em>.openSession());
         session=<em>threadLocal</em>.get();
      }
      return session;
   }
   public static void closeSession(){
      Session session=<em>threadLocal</em>.get();
      if(session!=null){
         session.close();
         <em>threadLocal</em>.set(null);
      }
   }
}
</pre>

<p>hibernate .cfg.xml我在这里就不多说了</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>
&lt;?xml version=&#39;1.0&#39; encoding=&#39;utf-8&#39;?&gt;
&lt;!DOCTYPE hibernate-configuration PUBLIC
        &quot;-//Hibernate/Hibernate Configuration DTD 3.0//EN&quot;
        &quot;http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd&quot;&gt;

&lt;hibernate-configuration&gt;
    &lt;session-factory&gt;
<em>
</em><em>        </em>&lt;property name=&quot;connection.driver_class&quot;&gt;com.mysql.jdbc.Driver&lt;/property&gt;
        &lt;property name=&quot;connection.url&quot;&gt;jdbc:mysql://localhost:3306/test&lt;/property&gt;
        &lt;property name=&quot;connection.useUnicode&quot;&gt;true&lt;/property&gt;
        &lt;property name=&quot;connection.characterEncoding&quot;&gt;utf8&lt;/property&gt;
        <em>&lt;!-- JDBC connection pool (use the built-in) --&gt;
</em><em>        </em>&lt;property name=&quot;connection.pool_size&quot;&gt;1&lt;/property&gt;
        &lt;property name=&quot;connection.username&quot;&gt;root&lt;/property&gt;
        &lt;property name=&quot;connection.password&quot;&gt;zucc&lt;/property&gt;

      <em>
</em><em>        </em>&lt;property name=&quot;dialect&quot;&gt;org.hibernate.dialect.MySQLDialect&lt;/property&gt;


        <em>&lt;!-- Enable Hibernate&#39;s automatic session context management --&gt;
</em><em>        </em>&lt;property name=&quot;current_session_context_class&quot;&gt;thread&lt;/property&gt;
<em>
</em><em>        </em>&lt;property name=&quot;show_sql&quot;&gt;true&lt;/property&gt;

        &lt;mapping class=&quot;cn.edu.zucc.model.TbUserEntity&quot;/&gt; //been的路径

    &lt;/session-factory&gt;

</pre>

<p>好了首先这样一个hibernate简单的就完成了，我们可以简易</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>

&nbsp;</pre>

<pre>
public class test { public static void main(String[] args) { /**  * 测试hibernate  */ System.<em>out</em>.println(&quot;Hibernate测试，取得用户列表：&quot;);  Session session = HibernateUtil.getSession();  List list=session.createCriteria(TbUserEntity.class).list();  Iterator iterator = list.iterator();  while(iterator.hasNext()){ TbUserEntity userEntity = (TbUserEntity) iterator.next();  System.<em>out</em>.print(userEntity.getUsername()+ &quot;\t&quot;);  System.<em>out</em>.println(userEntity.getPwd());   }}</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>可以看到结果。</p>

<p>接下来配置struct2</p>

<p>写一个UserAction.<a href="http://lib.csdn.net/base/17" target="_blank" title="Java EE知识库">Java</a></p>

<p>&nbsp;</p>

<pre>
public class UserAction extends ActionSupport {
    private UserService userService;
    private TbUserEntity user = new TbUserEntity();
    public UserAction(){}


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void setUser(TbUserEntity user) {
        this.user = user;
    }

    public TbUserEntity getUser() {
        return user;
    }


    public String login() throws Exception {
        System.<em>out</em>.println(&quot;username=&quot; + this.getUser().getUsername());
        System.<em>out</em>.println(&quot;pwd=&quot; + this.getUser().getPwd());
        user = userService.login(this.getUser().getUsername(), this.getUser().getPwd());
        if (user != null) {
            ActionContext.getContext().getSession().put(&quot;username&quot;,
                    this.getUser().getUsername());
            if(user.getUsertype().equals(&quot;normal&quot;)){
            return &quot;showuser&quot;;}
            else if(user.getUsertype().equals(&quot;admin&quot;)){
            return &quot;admin&quot;;
            }
        }
        return &quot;error&quot;;
    }
</pre>

<pre>
 可以看到  这里  private UserService userService;</pre>

<p>使用了依赖注入的方法。这是在之后配置spring做的铺垫。</p>

<p>&nbsp;</p>

<p>下面是struct.xml</p>

<p>&nbsp;</p>

<pre>
&lt;struts&gt;



    &lt;package name=&quot;cn.edu.zucc.action&quot; extends=&quot;struts-default&quot;&gt;
        &lt;action name=&quot;UserAction_login&quot; class=&quot;cn.edu.zucc.action.UserAction&quot; method=&quot;login&quot;&gt;
            &lt;result name=&quot;showuser&quot;&gt;/showuser.jsp&lt;/result&gt;
            &lt;result name=&quot;error&quot;&gt;/index.jsp&lt;/result&gt;
            &lt;result name=&quot;admin&quot;&gt;/admin.jsp&lt;/result&gt;
        &lt;/action&gt;

&lt;/package&gt;
&lt;/struts&gt;</pre>

<p>&nbsp;</p>

<p>可以看到它的名字是</p>

<pre>
UserAction_login 以及它的所在类</pre>

<p>&nbsp;</p>

<p>我们在index.jsp中写一个账户登录的页面</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<pre>
&lt;%@ <strong>page </strong><strong>language</strong>=&quot;java&quot; <strong>contentType</strong>=&quot;text/html; charset=utf-8&quot;
         <strong>pageEncoding</strong>=&quot;utf-8&quot;%&gt;
&lt;%@ <strong>taglib </strong><strong>prefix</strong>=&quot;s&quot; <strong>uri</strong>=&quot;/struts-tags&quot; %&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01 Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;
&lt;html&gt;
&lt;head&gt;
  &lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=utf-8&quot;&gt;
  &lt;title&gt;first struts2&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;form action=&quot;UserAction_login.action&quot; method=&quot;post&quot;&gt;
  &lt;input   type=&quot;text&quot; name=&quot;user.username&quot; /&gt;
  &lt;input   type=&quot;text&quot; name=&quot;user.pwd&quot;  /&gt;
  &lt;input    type=&quot;submit&quot; value=&quot;登录&quot; /&gt;
  &lt;input    type=&quot;reset&quot; value=&quot;重填&quot; /&gt;
  &lt;input    type=&quot;button&quot; value=&quot;注册&quot; onclick=&quot;window.location.href=&#39;register.jsp&#39;;&quot;/&gt;

&lt;/form&gt;
&lt;/body&gt;
&lt;/html&gt;</pre>

<p>action指向我们写好的structs.xml中，找到这个名字，然后到达所在的action类，并使用login方法</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>下面介绍的是spring</p>

<p>先构建一个ApplicationContext.xml</p>

<p>&nbsp;</p>

<pre>
&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
&lt;beans xmlns=&quot;http://www.springframework.org/schema/beans&quot;
      xmlns:xsi=&quot;http://www.w3.org/2001/XMLSchema-instance&quot;
      xsi:schemaLocation=&quot;http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd&quot;&gt;

   &lt;bean id=&quot;UserAction&quot; class=&quot;cn.edu.zucc.action.UserAction&quot;  &gt;
      &lt;property name=&quot;userService&quot; ref=&quot;userService&quot; &gt;&lt;/property&gt;
   &lt;/bean&gt;
   &lt;bean id=&quot;userService&quot; class=&quot;cn.edu.zucc.service.UserServiceImpl&quot; /&gt;

&lt;/beans&gt;</pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>写入对应的名字以及类。</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>在web.xml中的listener会自动加载ApplicationContext.xml，将userService注入到action中，供action使用。</p>

<p>&nbsp;</p>

<p>第一次写，可能写的不是太清晰，见谅。。</p>

        <p>本文为博主原创，允许转载，但请声明原文地址：<a href="http://localhost:8080/stblog/blog/5/5-58.html">http://localhost:8080/stblog/blog/5/5-58.html</a></p>
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