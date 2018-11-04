package org.csu.ecmusic.model.Account;

import java.util.Date;

public class UserProfile {
    /**
     * 用户详细信息：
     * 用户名
     * 邮箱
     * 昵称
     * 主修乐器
     * 年龄
     * 个人描述
     * */
    private String username;
    private String email;
    private String nickname;
    private String[] majorInstruments;
    private Date age;
    private String description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getMajorInstruments() {
        return majorInstruments;
    }

    public void setMajorInstruments(String[] majorInstruments) {
        this.majorInstruments = majorInstruments;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
