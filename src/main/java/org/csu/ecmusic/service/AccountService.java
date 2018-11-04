package org.csu.ecmusic.service;

import org.csu.ecmusic.model.Account.Sigon;

public interface AccountService {
    /**********************实现用户登录注册************************/
    //查询用户登录信息
    Sigon getSigonByUsername(String username);

    //用户登录
    void setSigon(String username, String password);

    //用户更改密码
    void updateSigon(String username, String password);

    /*************************************************************/
}
