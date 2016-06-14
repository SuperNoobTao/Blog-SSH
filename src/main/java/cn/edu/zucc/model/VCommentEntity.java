package cn.edu.zucc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/6/12.
 */
@Entity
@Table(name = "v_comment", schema = "blogs", catalog = "")
public class VCommentEntity  implements Serializable {
    private int commetId;
    private String commetContent;
    private int articleId;
    private String guestName;
    private int guestId;
    private Timestamp commetCdate;
    private Timestamp commetMdate;
    private Timestamp commetRdate;
    private String commetRemark;
    private String guestEmail;
    private int guestRss;



    @Id
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
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "guest_name")
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }


    @Basic
    @Column(name = "guest_id")
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VCommentEntity that = (VCommentEntity) o;

        if (commetId != that.commetId) return false;
        if (articleId != that.articleId) return false;
        if (guestId != that.guestId) return false;
        if (guestRss != that.guestRss) return false;
        if (commetContent != null ? !commetContent.equals(that.commetContent) : that.commetContent != null)
            return false;
        if (guestName != null ? !guestName.equals(that.guestName) : that.guestName != null) return false;
        if (commetCdate != null ? !commetCdate.equals(that.commetCdate) : that.commetCdate != null) return false;
        if (commetMdate != null ? !commetMdate.equals(that.commetMdate) : that.commetMdate != null) return false;
        if (commetRdate != null ? !commetRdate.equals(that.commetRdate) : that.commetRdate != null) return false;
        if (commetRemark != null ? !commetRemark.equals(that.commetRemark) : that.commetRemark != null) return false;
        return guestEmail != null ? guestEmail.equals(that.guestEmail) : that.guestEmail == null;

    }

    @Override
    public int hashCode() {
        int result = commetId;
        result = 31 * result + (commetContent != null ? commetContent.hashCode() : 0);
        result = 31 * result + articleId;
        result = 31 * result + (guestName != null ? guestName.hashCode() : 0);
        result = 31 * result + guestId;
        result = 31 * result + (commetCdate != null ? commetCdate.hashCode() : 0);
        result = 31 * result + (commetMdate != null ? commetMdate.hashCode() : 0);
        result = 31 * result + (commetRdate != null ? commetRdate.hashCode() : 0);
        result = 31 * result + (commetRemark != null ? commetRemark.hashCode() : 0);
        result = 31 * result + (guestEmail != null ? guestEmail.hashCode() : 0);
        result = 31 * result + guestRss;
        return result;
    }

    @Basic
    @Column(name = "commet_remark")

    public String getCommetRemark() {
        return commetRemark;
    }

    public void setCommetRemark(String commetRemark) {
        this.commetRemark = commetRemark;
    }

    @Basic
    @Column(name = "guest_email")
    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    @Basic
    @Column(name = "guest_rss")
    public int getGuestRss() {
        return guestRss;
    }

    public void setGuestRss(int guestRss) {
        this.guestRss = guestRss;
    }
}
