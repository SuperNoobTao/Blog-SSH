package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/29.
 */
@Entity
@Table(name = "comment", schema = "blogs")
public class CommentBean {
    private int comid;
    private String comcontent;
    private Timestamp comtime;
    private Timestamp removetime;
    private String remark;

    @Id
    @Column(name = "comid")
    public int getComid() {
        return comid;
    }

    public void setComid(int comid) {
        this.comid = comid;
    }

    @Basic
    @Column(name = "comcontent")
    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    @Basic
    @Column(name = "comtime")
    public Timestamp getComtime() {
        return comtime;
    }

    public void setComtime(Timestamp comtime) {
        this.comtime = comtime;
    }

    @Basic
    @Column(name = "removetime")
    public Timestamp getRemovetime() {
        return removetime;
    }

    public void setRemovetime(Timestamp removetime) {
        this.removetime = removetime;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentBean that = (CommentBean) o;

        if (comid != that.comid) return false;
        if (comcontent != null ? !comcontent.equals(that.comcontent) : that.comcontent != null) return false;
        if (comtime != null ? !comtime.equals(that.comtime) : that.comtime != null) return false;
        if (removetime != null ? !removetime.equals(that.removetime) : that.removetime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comid;
        result = 31 * result + (comcontent != null ? comcontent.hashCode() : 0);
        result = 31 * result + (comtime != null ? comtime.hashCode() : 0);
        result = 31 * result + (removetime != null ? removetime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
