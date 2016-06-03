package cn.edu.zucc.action;

import cn.edu.zucc.model.TbArticleEntity;
import cn.edu.zucc.model.TbCategoryEntity;
import cn.edu.zucc.model.TbUserEntity;
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

        article.setUserId(32);
        article.setArticleAuthor("st1");
        System.out.println("action 中articleLikes="+article.getArticleLikes());
        System.out.println("action 中articleLooked="+article.getArticleLooks());
        System.out.println("action 中articleTitle="+article.getArticleTitle());


        //保存博文

        articleService.addArticle(article, ServletActionContext.getRequest().getContextPath(), ServletActionContext.getServletContext().getRealPath("/blog"));

        request.setAttribute("message", "博文录入成功！！！");
        request.setAttribute("url", request.getContextPath() + "/admin-article-manage.jsp");
        return "message";
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


}
