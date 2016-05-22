package cn.edu.zucc.service.User;

import cn.edu.zucc.model.UsertableBean;


/**
 * Created by shentao on 2016/5/21.
 */

public interface UserService {

    public UsertableBean login(String userid, String pwd);


}
