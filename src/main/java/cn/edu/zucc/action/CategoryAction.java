package cn.edu.zucc.action;

import cn.edu.zucc.dao.Category.CategoryDao;
import cn.edu.zucc.exception.ForeignKeyException;
import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.ToparticlesEntity;
import cn.edu.zucc.service.Category.CategoryService;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.AccessibleObject;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public class CategoryAction extends ActionSupport{
    private CategoryService categoryService;
    private TbCategoryEntity tbCategoryEntity;
    private String pagenum;
    public String getPagenum() {
        return pagenum;
    }


    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    public TbCategoryEntity getTbCategoryEntity() {
        return tbCategoryEntity;
    }
    public void setTbCategoryEntity(TbCategoryEntity tbCategoryEntity) {
        this.tbCategoryEntity = tbCategoryEntity;
    }
    public void setPagenum(String pagenum) {
        this.pagenum = pagenum;
    }
    public CategoryService getCategoryService() {
        return categoryService;
    }

    //添加类别界面
    public String addui(){
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("method","add");
        request.setAttribute("pageTitle", "添加类别");
        return SUCCESS;
    }

    //添加类别操作
    public String add(){
        Timestamp now = new Timestamp(System.currentTimeMillis());
        tbCategoryEntity.setCategoryCdate(now);
        tbCategoryEntity.setCategoryName(this.getTbCategoryEntity().getCategoryName());
        tbCategoryEntity.setCategoryRemark(this.getTbCategoryEntity().getCategoryRemark());

        boolean result = false;
        try {
            result = categoryService.addCategory(tbCategoryEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result)
            ServletActionContext.getRequest().setAttribute("message", "类型添加成功！！！");
        else
            ServletActionContext.getRequest().setAttribute("message", "类型已存在！！！");
            ServletActionContext.getRequest().setAttribute("url", ServletActionContext.getRequest().getContextPath() + "/category_query.action");
        return "message";
    }



    //分页查询类别界面
    public String query() throws Exception {
        //分页查询所有类型
        String url = ServletActionContext.getRequest().getContextPath()+"/category_query.action";
        Page<TbCategoryEntity> page = categoryService.queryPageCategory(pagenum,url);

        ServletActionContext.getRequest().setAttribute("page",page);
        return "query";
    }

    //删除类别操作
    public String delete() throws Exception {
        try {
            int categoryId = Integer.parseInt(ServletActionContext.getRequest().getParameter("categoryId"));
            categoryService.deleteCategory(categoryId);
            System.out.println("你要删除的categoryId是"+categoryId);
        }catch (ForeignKeyException e){
            ServletActionContext.getRequest().setAttribute("message","您要删除的类别下有文章，不能删除");
            ServletActionContext.getRequest().setAttribute("url", ServletActionContext.getRequest().getContextPath() + "/category_query.action");
            return "message";
        }
        return "delete";
    }
    //修改类别
    public String modifyCategory() throws Exception {
        TbCategoryEntity category = new TbCategoryEntity();
        category.setCategoryName(this.getTbCategoryEntity().getCategoryName());
        category.setCategoryRemark(this.getTbCategoryEntity().getCategoryRemark());
        category.setCategoryId(this.getTbCategoryEntity().getCategoryId());
        categoryService.updateCategory(category);
        ServletActionContext.getRequest().setAttribute("message", "类型修改成功！！！");
        ServletActionContext.getRequest().setAttribute("url", ServletActionContext.getRequest().getContextPath() + "/category_query.action");
        return "message";
    }

    //修改类别界面
    public String updateui() throws Exception {
        int categoryId = Integer.parseInt(ServletActionContext.getRequest().getParameter("categoryId"));
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("category", categoryService.queryCategory(categoryId));
        request.setAttribute("categoryId",categoryId);
        System.out.println("点击编辑后获取到的categoryId="+categoryId);
        request.setAttribute("method","update");
        request.setAttribute("pageTitle", "修改类别");
        return SUCCESS;
    }





}
