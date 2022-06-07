package com.neusoft.po;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:User
 * @Date:2022/6/7 10:33
 * @功能描述:
 * @Version:1.0
 */
public class User {
    private int uid;
    private String username;
    private String password;
    public User(){

    }
    public User(int uid, String username, String password){
        super();
        this.uid = uid;
        this.username = username;
        this.password = password;
    }
    public int getUid(){
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

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
