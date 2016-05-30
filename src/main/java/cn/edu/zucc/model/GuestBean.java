package cn.edu.zucc.model;

import javax.persistence.*;

/**
 * Created by shentao on 2016/5/29.
 */
@Entity
@Table(name = "guest", schema = "blogs")
public class GuestBean {
    private int gid;
    private String gname;
    private String gemail;
    private Integer rss;

    @Id
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Basic
    @Column(name = "gemail")
    public String getGemail() {
        return gemail;
    }

    public void setGemail(String gemail) {
        this.gemail = gemail;
    }

    @Basic
    @Column(name = "rss")
    public Integer getRss() {
        return rss;
    }

    public void setRss(Integer rss) {
        this.rss = rss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestBean guestBean = (GuestBean) o;

        if (gid != guestBean.gid) return false;
        if (gname != null ? !gname.equals(guestBean.gname) : guestBean.gname != null) return false;
        if (gemail != null ? !gemail.equals(guestBean.gemail) : guestBean.gemail != null) return false;
        if (rss != null ? !rss.equals(guestBean.rss) : guestBean.rss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gemail != null ? gemail.hashCode() : 0);
        result = 31 * result + (rss != null ? rss.hashCode() : 0);
        return result;
    }
}
