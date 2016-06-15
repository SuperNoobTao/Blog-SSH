package test.cn.edu.zucc.service.User; 

import cn.edu.zucc.dao.User.UserDao;
import cn.edu.zucc.model.TbUserEntity;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 3, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserServiceImplTest { 

    @Resource
    UserDao userDao;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUserDao() 
* 
*/ 
@Test
public void testGetUserDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUserDao(UserDao userDao) 
* 
*/ 
@Test
public void testSetUserDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateByQuery(String hql) 
* 
*/ 
@Test
public void testUpdateByQuery() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findById(Integer id) 
* 
*/ 
@Test
public void testFindById() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findByqQuery(String hql) 
* 
*/ 
@Test
public void testFindByqQuery() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUserList() 
* 
*/ 
@Test
public void testGetUserList() throws Exception { 
//TODO: Test goes here...
    List list =userDao.findAll();
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
        TbUserEntity users = (TbUserEntity) iterator.next();
        System.out.println(users.getUserName());
    }
} 

/** 
* 
* Method: queryForPage(String hql, int offset, int length) 
* 
*/ 
@Test
public void testQueryForPage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: register(TbUserEntity usertableBean) 
* 
*/ 
@Test
public void testRegister() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(TbUserEntity tbUserEntity) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(TbUserEntity tbUserEntity) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: login(String uAcount, String uPwd) 
* 
*/ 
@Test
public void testLogin() throws Exception { 
//TODO: Test goes here... 
} 


} 
