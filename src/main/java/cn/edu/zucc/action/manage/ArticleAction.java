package cn.edu.zucc.action.manage;

import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.model.ToparticlesEntity;
import cn.edu.zucc.service.Article.ArticleService;
import cn.edu.zucc.service.Article.ArticleServiceImpl;
import cn.edu.zucc.service.Category.CategoryService;
import cn.edu.zucc.service.Category.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by shentao on 2016/5/31.
 */
public class ArticleAction extends ActionSupport {
    private ArticleService articleService;
    private CategoryService categoryService;
    private TbArticleEntity tbArticleEntity;
    private TbCategoryEntity tbCategoryEntity;
    private String method;

    public CategoryService getCategoryService() {
        return categoryService;
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
    public ArticleService getArticleService() {
        return articleService;
    }
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
    public TbArticleEntity getTbArticleEntity() {
        return tbArticleEntity;
    }
    public void setTbArticleEntity(TbArticleEntity tbArticleEntity) {
        this.tbArticleEntity = tbArticleEntity;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {this.method = method;}


    //添加文章界面
    public String addui() {

        List<TbCategoryEntity> categories = null;
        try {
            System.out.println("加载类别");
            categories = getCategoryService().getAllCategories();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ServletActionContext.getRequest().setAttribute("categories", categories);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("method", "add");
        request.setAttribute("pageTitle", "添加文章");
        return SUCCESS;
    }


    //添加文章操作
    public String add() throws Exception {
        //封装博文体
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(false);
        TbUserEntity user = (TbUserEntity) session.getAttribute("user");

        TbArticleEntity article = initAddArticle();
        article.setUserId(user.getUserId());
        article.setArticleAuthor(user.getUserName());

        //保存博文
        articleService.addArticle(article, ServletActionContext.getRequest().getContextPath(), ServletActionContext.getServletContext().getRealPath("/blog"));
        request.setAttribute("message", "博文录入成功！！！");
        request.setAttribute("url", request.getContextPath() + "/article.action");
        return "message";
    }


    //删除操作
    public String delete() throws Exception {
        int articleId = Integer.parseInt(ServletActionContext.getRequest().getParameter("articleId"));
        articleService.deleteArticle(articleId, ServletActionContext.getServletContext().getRealPath("/"));
        return "delete";
    }


    //修改文章界面
    public String updateui() throws Exception {
        int articleId = Integer.parseInt(ServletActionContext.getRequest().getParameter("articleId"));
        //查询要修改的文章
        TbArticleEntity article = articleService.findById(articleId);

        System.out.println("update Article ------------------------------");
        System.out.println(article.getArticleContent());

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("article", article);
        //查询所有类别
        List<TbCategoryEntity> categories = categoryService.getAllCategories();

        request.setAttribute("categories", categories);
        request.setAttribute("artid", articleId);
        request.setAttribute("method", "update");
        request.setAttribute("pageTitle", "修改文章");
        return SUCCESS;
    }


    //修改文章操作
    public String update() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        //修改博文

        TbArticleEntity article = initUpdateArticle();
        article.setArticleId(tbArticleEntity.getArticleId());
        articleService.updateArticle(article, ServletActionContext.getRequest().getContextPath(), ServletActionContext.getServletContext().getRealPath("/blog"));

        request.setAttribute("message", "博文修改成功！！！");
        request.setAttribute("url", request.getContextPath() + "/manage/article.action");
        return "message";
    }

    //初始化封装文章实体
    private TbArticleEntity initUpdateArticle() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        TbArticleEntity article = new TbArticleEntity();
        article.setCategoryId(tbArticleEntity.getCategoryId());
        article.setArticleMdate(now);
        article.setArticleTitle(tbArticleEntity.getArticleTitle());
        article.setArticleType(tbArticleEntity.getArticleType());
        article.setArticleTop(tbArticleEntity.getArticleTop());

        //截取正文部分
        String content = tbArticleEntity.getArticleContent();

        content = content.substring(content.indexOf("<body>") + 6);
        content = content.substring(0, content.indexOf("</body>"));
        article.setArticleContent(content);
        //提取文章摘要
        article.setArticleMeta(tbArticleEntity.getArticleMeta());
        return article;
    }



    //(分页)-暂时不做
    //查询文章
    public String query() throws Exception {
        List<ToparticlesEntity> articleList = articleService.getArtclesList();
        ServletActionContext.getRequest().setAttribute("page", articleList);
        return "query";
    }



    //初始化封装文章实体
    private TbArticleEntity initAddArticle() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        TbArticleEntity article = new TbArticleEntity();
        article.setCategoryId(tbArticleEntity.getCategoryId());
        article.setArticleCdate(now);
        article.setArticleTitle(tbArticleEntity.getArticleTitle());
        article.setArticleType(tbArticleEntity.getArticleType());
        article.setArticleTop(tbArticleEntity.getArticleTop());


        System.out.println("categoryId=" + tbArticleEntity.getCategoryId());
        System.out.println("cdate=" + now);
        System.out.println("articleTitle=" + tbArticleEntity.getArticleTitle());
        System.out.println("articleType=" + tbArticleEntity.getArticleType());
        System.out.println("articleTop=" + tbArticleEntity.getArticleTop());
        System.out.println("articleMeta=" + tbArticleEntity.getArticleMeta());


        //截取正文部分
        String content = tbArticleEntity.getArticleContent();
        System.out.println(content);
        content = content.substring(content.indexOf("<body>") + 6);
        content = content.substring(0, content.indexOf("</body>"));
        article.setArticleContent(content);
        //提取文章摘要
        if (content.length() > 250) {
            int start = content.indexOf("<span style=\"font-family:") + 25;
            String meta = content.substring(start, start + 220);
            meta = meta.substring(meta.indexOf(">") + 1);
            meta = "<span style=\"font-family:微软雅黑;\">" + meta + "</span>";
            article.setArticleMeta(meta);
        } else article.setArticleMeta(content);
        return article;
    }



    //默认情况下，查询文章列表
    @Override
    public String execute() throws Exception {
        return query();
    }

}
