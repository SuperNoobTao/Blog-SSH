package cn.edu.zucc.action.manage;

import cn.edu.zucc.model.Page;
import cn.edu.zucc.model.TbGuestEntity;
import cn.edu.zucc.service.Guest.GuestService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.sql.SQLException;

/**
 * Created by shentao on 2016/6/13.
 */
public class GuestManage extends ActionSupport {

    private TbGuestEntity tbGuestEntity;
    private GuestService guestService;
    private String method;
    private String pagenum;

    public TbGuestEntity getTbGuestEntity() {
        return tbGuestEntity;
    }
    public void setTbGuestEntity(TbGuestEntity tbGuestEntity) {
        this.tbGuestEntity = tbGuestEntity;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getPagenum() {
        return pagenum;
    }
    public void setPagenum(String pagenum) {
        this.pagenum = pagenum;
    }
    public GuestService getGuestService() {
        return guestService;
    }

    public void setGuestService(GuestService guestService) {
        this.guestService = guestService;
    }

    //分页查询客户
    public String query() throws SQLException {
        //分页查询所有客户
        String url = ServletActionContext.getRequest().getContextPath() + "/guest.action";
        Page<TbGuestEntity> page = guestService.queryPageGuests(pagenum, url);
        ServletActionContext.getRequest().setAttribute("page", page);
        return "query";
    }


    //默认情况下，查询客户列表
    @Override
    public String execute() throws Exception {
        return query();
    }

}
