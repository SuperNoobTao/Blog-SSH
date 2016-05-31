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
    private Integer articleLikes;
    private Integer articleLooks;
    private String articleTitle;
    private String articleMeta;
    private String articleContent;
    private String articleStaticUrl;
    private String articleType;
    private Integer articleTop;
    private String articleRemark;
    private Timestamp articleCdate;
    private Timestamp articleMdate;
    private Timestamp articleRdate;
    private Integer userId;
    private Integer categoryId;

    @Id
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
    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    @Basic
    @Column(name = "article_looks")
    public Integer getArticleLooks() {
        return articleLooks;
    }

    public void setArticleLooks(Integer articleLooks) {
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
    public Integer getArticleTop() {
        return articleTop;
    }

    public void setArticleTop(Integer articleTop) {
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
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbArticleEntity that = (TbArticleEntity) o;

        if (articleId != that.articleId) return false;
        if (articleAuthor != null ? !articleAuthor.equals(that.articleAuthor) : that.articleAuthor != null)
            return false;
        if (articleLikes != null ? !articleLikes.equals(that.articleLikes) : that.articleLikes != null) return false;
        if (articleLooks != null ? !articleLooks.equals(that.articleLooks) : that.articleLooks != null) return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;
        if (articleMeta != null ? !articleMeta.equals(that.articleMeta) : that.articleMeta != null) return false;
        if (articleContent != null ? !articleContent.equals(that.articleContent) : that.articleContent != null)
            return false;
        if (articleStaticUrl != null ? !articleStaticUrl.equals(that.articleStaticUrl) : that.articleStaticUrl != null)
            return false;
        if (articleType != null ? !articleType.equals(that.articleType) : that.articleType != null) return false;
        if (articleTop != null ? !articleTop.equals(that.articleTop) : that.articleTop != null) return false;
        if (articleRemark != null ? !articleRemark.equals(that.articleRemark) : that.articleRemark != null)
            return false;
        if (articleCdate != null ? !articleCdate.equals(that.articleCdate) : that.articleCdate != null) return false;
        if (articleMdate != null ? !articleMdate.equals(that.articleMdate) : that.articleMdate != null) return false;
        if (articleRdate != null ? !articleRdate.equals(that.articleRdate) : that.articleRdate != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (articleAuthor != null ? articleAuthor.hashCode() : 0);
        result = 31 * result + (articleLikes != null ? articleLikes.hashCode() : 0);
        result = 31 * result + (articleLooks != null ? articleLooks.hashCode() : 0);
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + (articleMeta != null ? articleMeta.hashCode() : 0);
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (articleStaticUrl != null ? articleStaticUrl.hashCode() : 0);
        result = 31 * result + (articleType != null ? articleType.hashCode() : 0);
        result = 31 * result + (articleTop != null ? articleTop.hashCode() : 0);
        result = 31 * result + (articleRemark != null ? articleRemark.hashCode() : 0);
        result = 31 * result + (articleCdate != null ? articleCdate.hashCode() : 0);
        result = 31 * result + (articleMdate != null ? articleMdate.hashCode() : 0);
        result = 31 * result + (articleRdate != null ? articleRdate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }
}
