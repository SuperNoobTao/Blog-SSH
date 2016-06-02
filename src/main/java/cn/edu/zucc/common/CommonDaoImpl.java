package cn.edu.zucc.common;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public abstract class CommonDaoImpl<T> implements CommonDAO<T> {
    private SessionFactory sessionFactory;//加载数据库连接（使用spring实现加载）
    private Class<T> persistentClass;

    //sessionFactory的get和set方法。
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //用构造方法处理Class<T>以下为固定模式
    public CommonDaoImpl()
    {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }



    //对表的操作（增删改查）
    //保存
    public boolean save(T transientInstance) throws Exception
    {
        try {
            sessionFactory.getCurrentSession().save(transientInstance);
            return true;
        } catch (RuntimeException e) {
           return false;
        }
    }

    //删除
    public boolean delete(T persistentInstance) throws Exception
    {
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            return true;
        } catch (RuntimeException e) {
            return  false;
        }
    }


    //更新
    public boolean update(T instance) throws Exception
    {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            return true;
        } catch (RuntimeException e) {
            // TODO: handle exception
            return false;
        }
    }


    //根据传进来的HQL语句更新，返回受影响行数
    public int updateByQuery(String hql)
    {
        int k=0;
        try {
            k=sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
        return k;
    }

    //根据传进来的ID进行查询
    public T findById(Integer id)
    {

        try {
            T instance = (T) sessionFactory.getCurrentSession().get(getPersistentClass(), id);
            return instance;
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }

    //根据传进来的hql查询
    public List<T> findByqQuery(String hql)
    {
        try {
            return sessionFactory.getCurrentSession().createQuery(hql).list();
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }

    //查找所有表里的所有内容
    public List<T> findAll()
    {
        try {
            return findByCriteria();//调用下面的findByCriteria方法
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }

    //查找表里的所有内容并返回
    protected List<T> findByCriteria(Criterion... criterion) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                getPersistentClass());
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
    }

    //jQuery Easyui Datagrid需要的方法，根据传进来的hql，当前页数，页面长度返回数据列
    public List<T> queryForPage(String hql, int offset, int length) {
        try{
            List<T> results=sessionFactory.getCurrentSession().createQuery(hql)
                    .setFirstResult(offset)
                    .setMaxResults(length)
                    .list();
            return results;
        }catch (RuntimeException re) {
            throw re;
        }
    }


}
