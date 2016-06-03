package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_article", schema = "blogs", catalog = "")
public class TbArticleEntity {
    private int articleId;
    private String articleAuthor;
    private int articleLikes;
    private int articleLooks;
    private String articleTitle;
    private String articleMeta;
    private String articleContent;
    private String articleStaticUrl;
    private String articleType;
    private int articleTop;
    private String articleRemark;
    private Timestamp articleCdate;
    private Timestamp articleMdate;
    private Timestamp articleRdate;
    private int userId;
    private int categoryId;


    public String staticPath(){
        return "/blog/" + getCategoryId() + "/" + getCategoryId() + "-" + articleId;
    }

    @Override
    public String toString() {
        return "TbArticleEntity{" +
                "articleId=" + articleId +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", articleLikes=" + articleLikes +
                ", articleLooks=" + articleLooks +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleMeta='" + articleMeta + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleStaticUrl='" + articleStaticUrl + '\'' +
                ", articleType='" + articleType + '\'' +
                ", articleTop=" + articleTop +
                ", articleRemark='" + articleRemark + '\'' +
                ", articleCdate=" + articleCdate +
                ", articleMdate=" + articleMdate +
                ", articleRdate=" + articleRdate +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "article_author")
    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    @Basic
    @Column(name = "article_likes")
    public int getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(int articleLikes) {
        this.articleLikes = articleLikes;
    }

    @Basic
    @Column(name = "article_looks")
    public int getArticleLooks() {
        return articleLooks;
    }

    public void setArticleLooks(int articleLooks) {
        this.articleLooks = articleLooks;
    }

    @Basic
    @Column(name = "article_title")
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "article_meta")
    public String getArticleMeta() {
        return articleMeta;
    }

    public void setArticleMeta(String articleMeta) {
        this.articleMeta = articleMeta;
    }

    @Basic
    @Column(name = "article_content")
    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Basic
    @Column(name = "article_staticUrl")
    public String getArticleStaticUrl() {
        return articleStaticUrl;
    }

    public void setArticleStaticUrl(String articleStaticUrl) {
        this.articleStaticUrl = articleStaticUrl;
    }

    @Basic
    @Column(name = "article_type")
    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    @Basic
    @Column(name = "article_top")
    public int getArticleTop() {
        return articleTop;
    }

    public void setArticleTop(int articleTop) {
        this.articleTop = articleTop;
    }

    @Basic
    @Column(name = "article_remark")
    public String getArticleRemark() {
        return articleRemark;
    }

    public void setArticleRemark(String articleRemark) {
        this.articleRemark = articleRemark;
    }

    @Basic
    @Column(name = "article_cdate")
    public Timestamp getArticleCdate() {
        return articleCdate;
    }

    public void setArticleCdate(Timestamp articleCdate) {
        this.articleCdate = articleCdate;
    }

    @Basic
    @Column(name = "article_mdate")
    public Timestamp getArticleMdate() {
        return articleMdate;
    }

    public void setArticleMdate(Timestamp articleMdate) {
        this.articleMdate = articleMdate;
    }

    @Basic
    @Column(name = "article_rdate")
    public Timestamp getArticleRdate() {
        return articleRdate;
    }

    public void setArticleRdate(Timestamp articleRdate) {
        this.articleRdate = articleRdate;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbArticleEntity that = (TbArticleEntity) o;

        if (articleId != that.articleId) return false;
        if (articleLikes != that.articleLikes) return false;
        if (articleLooks != that.articleLooks) return false;
        if (articleTop != that.articleTop) return false;
        if (userId != that.userId) return false;
        if (categoryId != that.categoryId) return false;
        if (articleAuthor != null ? !articleAuthor.equals(that.articleAuthor) : that.articleAuthor != null)
            return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;
        if (articleMeta != null ? !articleMeta.equals(that.articleMeta) : that.articleMeta != null) return false;
        if (articleContent != null ? !articleContent.equals(that.articleContent) : that.articleContent != null)
            return false;
        if (articleStaticUrl != null ? !articleStaticUrl.equals(that.articleStaticUrl) : that.articleStaticUrl != null)
            return false;
        if (articleType != null ? !articleType.equals(that.articleType) : that.articleType != null) return false;
        if (articleRemark != null ? !articleRemark.equals(that.articleRemark) : that.articleRemark != null)
            return false;
        if (articleCdate != null ? !articleCdate.equals(that.articleCdate) : that.articleCdate != null) return false;
        if (articleMdate != null ? !articleMdate.equals(that.articleMdate) : that.articleMdate != null) return false;
        return articleRdate != null ? articleRdate.equals(that.articleRdate) : that.articleRdate == null;

    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (articleAuthor != null ? articleAuthor.hashCode() : 0);
        result = 31 * result + articleLikes;
        result = 31 * result + articleLooks;
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + (articleMeta != null ? articleMeta.hashCode() : 0);
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (articleStaticUrl != null ? articleStaticUrl.hashCode() : 0);
        result = 31 * result + (articleType != null ? articleType.hashCode() : 0);
        result = 31 * result + articleTop;
        result = 31 * result + (articleRemark != null ? articleRemark.hashCode() : 0);
        result = 31 * result + (articleCdate != null ? articleCdate.hashCode() : 0);
        result = 31 * result + (articleMdate != null ? articleMdate.hashCode() : 0);
        result = 31 * result + (articleRdate != null ? articleRdate.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + categoryId;
        return result;
    }
}
