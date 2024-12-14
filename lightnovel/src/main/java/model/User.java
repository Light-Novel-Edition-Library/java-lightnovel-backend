package model;

import java.util.Date;

public class User {
    private int uid;
    private String username;
    private String password;
    private String email;
    private String nickname;
    private String bio;
    private Date registerTime;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", bio='" + bio + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }

    public User() {
    }

    public User(int uid, String username, String password, String email, String nickname, String bio, Date registerTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.bio = bio;
        this.registerTime = registerTime;
    }

    public int getUid() {
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
