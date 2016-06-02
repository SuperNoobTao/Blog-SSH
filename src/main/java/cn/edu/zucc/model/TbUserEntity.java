package cn.edu.zucc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by shentao on 2016/5/31.
 */
@Entity
@Table(name = "tb_user", schema = "blogs", catalog = "")
public class TbUserEntity {
    private int userId;
    private String userAcount;
    private String userPwd;
    private String userName;
    private String userSex;
    private String userPhone;
    private String userEmail;
    private Timestamp userCdate;
    private Timestamp userMdate;
    private Timestamp userRdate;
    private String userState;
    private String userType;
    private String userRemark;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_acount")
    public String getUserAcount() {
        return userAcount;
    }

    public void setUserAcount(String userAcount) {
        this.userAcount = userAcount;
    }

    @Basic
    @Column(name = "user_pwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_sex")
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_cdate")
    public Timestamp getUserCdate() {
        return userCdate;
    }

    public void setUserCdate(Timestamp userCdate) {
        this.userCdate = userCdate;
    }

    @Basic
    @Column(name = "user_mdate")
    public Timestamp getUserMdate() {
        return userMdate;
    }

    public void setUserMdate(Timestamp userMdate) {
        this.userMdate = userMdate;
    }

    @Basic
    @Column(name = "user_rdate")
    public Timestamp getUserRdate() {
        return userRdate;
    }

    public void setUserRdate(Timestamp userRdate) {
        this.userRdate = userRdate;
    }

    @Basic
    @Column(name = "user_state")
    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "user_remark")
    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserEntity that = (TbUserEntity) o;

        if (userId != that.userId) return false;
        if (userAcount != null ? !userAcount.equals(that.userAcount) : that.userAcount != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userSex != null ? !userSex.equals(that.userSex) : that.userSex != null) return false;
        if (userPhone != null ? !userPhone.equals(that.userPhone) : that.userPhone != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userCdate != null ? !userCdate.equals(that.userCdate) : that.userCdate != null) return false;
        if (userMdate != null ? !userMdate.equals(that.userMdate) : that.userMdate != null) return false;
        if (userRdate != null ? !userRdate.equals(that.userRdate) : that.userRdate != null) return false;
        if (userState != null ? !userState.equals(that.userState) : that.userState != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (userRemark != null ? !userRemark.equals(that.userRemark) : that.userRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userAcount != null ? userAcount.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userCdate != null ? userCdate.hashCode() : 0);
        result = 31 * result + (userMdate != null ? userMdate.hashCode() : 0);
        result = 31 * result + (userRdate != null ? userRdate.hashCode() : 0);
        result = 31 * result + (userState != null ? userState.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (userRemark != null ? userRemark.hashCode() : 0);
        return result;
    }
}
