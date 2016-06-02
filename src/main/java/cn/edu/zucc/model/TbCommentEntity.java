package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_comment", schema = "blogs", catalog = "")
public class TbCommentEntity {
    private int commetId;
    private String commetContent;
    private Integer guestId;
    private Integer articleId;
    private Timestamp commetCdate;
    private Timestamp commetMdate;
    private Timestamp commetRdate;
    private String commetRemark;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commet_id")
    public int getCommetId() {
        return commetId;
    }

    public void setCommetId(int commetId) {
        this.commetId = commetId;
    }

    @Basic
    @Column(name = "commet_content")
    public String getCommetContent() {
        return commetContent;
    }

    public void setCommetContent(String commetContent) {
        this.commetContent = commetContent;
    }

    @Basic
    @Column(name = "guest_id")
    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    @Basic
    @Column(name = "article_id")
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "commet_cdate")
    public Timestamp getCommetCdate() {
        return commetCdate;
    }

    public void setCommetCdate(Timestamp commetCdate) {
        this.commetCdate = commetCdate;
    }

    @Basic
    @Column(name = "commet_mdate")
    public Timestamp getCommetMdate() {
        return commetMdate;
    }

    public void setCommetMdate(Timestamp commetMdate) {
        this.commetMdate = commetMdate;
    }

    @Basic
    @Column(name = "commet_rdate")
    public Timestamp getCommetRdate() {
        return commetRdate;
    }

    public void setCommetRdate(Timestamp commetRdate) {
        this.commetRdate = commetRdate;
    }

    @Basic
    @Column(name = "commet_remark")
    public String getCommetRemark() {
        return commetRemark;
    }

    public void setCommetRemark(String commetRemark) {
        this.commetRemark = commetRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCommentEntity that = (TbCommentEntity) o;

        if (commetId != that.commetId) return false;
        if (commetContent != null ? !commetContent.equals(that.commetContent) : that.commetContent != null)
            return false;
        if (guestId != null ? !guestId.equals(that.guestId) : that.guestId != null) return false;
        if (articleId != null ? !articleId.equals(that.articleId) : that.articleId != null) return false;
        if (commetCdate != null ? !commetCdate.equals(that.commetCdate) : that.commetCdate != null) return false;
        if (commetMdate != null ? !commetMdate.equals(that.commetMdate) : that.commetMdate != null) return false;
        if (commetRdate != null ? !commetRdate.equals(that.commetRdate) : that.commetRdate != null) return false;
        if (commetRemark != null ? !commetRemark.equals(that.commetRemark) : that.commetRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commetId;
        result = 31 * result + (commetContent != null ? commetContent.hashCode() : 0);
        result = 31 * result + (guestId != null ? guestId.hashCode() : 0);
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (commetCdate != null ? commetCdate.hashCode() : 0);
        result = 31 * result + (commetMdate != null ? commetMdate.hashCode() : 0);
        result = 31 * result + (commetRdate != null ? commetRdate.hashCode() : 0);
        result = 31 * result + (commetRemark != null ? commetRemark.hashCode() : 0);
        return result;
    }
}
