package org.csu.ecmusic.model.Account;

public class Sigon {
    /**
     * 用户登录表
     * 账户
     * 密码
     * 用户进行登录时进行用户登录时间登记
     * */
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
