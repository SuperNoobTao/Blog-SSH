# MyBlog
ssh
基于SSH的个人博客

-*- 中文版 -*-
框架 Maven + struts2 +spring + Hibernate(这个后期会加上)

Action：包括UserAction, 
	ArtileAction, 
	CategoryAction

Dao：包括commonDao(目前只有一个SessionFactory), 
	ArtileDao(文章所有数据库操作的集合类), 
	CategoryDao(类别所有数据库操作的集合类)
	UserDao(管理员所有数据库操作的集合类)
	
Service：包括ArtcieService(文章所有操作的逻辑层), 
	UserService(管理员所有操作的逻辑层) 
	CategoryService(类别所有操作的逻辑层) 
	同Dao一样，后期需要整理分成几个小的子类

filter：过滤器，进行文章的静态化

exception:包括sql语句外键等异常

管理员：
  管理员通过在后台拥有对博客的增删改权限，以及对类别的增删改

未完待续...

