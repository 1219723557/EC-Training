package org.csu.ecmusic.persistence;

import org.apache.ibatis.annotations.Param;
import org.csu.ecmusic.model.Account.Sigon;

/**
 * 完成用户登录信息操作
 */
public interface SigonMapper {

    //查询用户登录信息
    Sigon getSigonByUsername(@Param("username") String username);
    //用户登录
    void setSigon(@Param("username") String username, @Param("password") String password);
    //用户更改密码
    void updateSigon(@Param("username") String username, @Param("password") String password);

}
