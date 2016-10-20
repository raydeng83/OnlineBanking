package com.userfront.domain;

/**
 * Created by z00382545 on 10/19/16.
 */
public class Password {
    private Long passwordId;
    private String password;
    private User user;

    public Long getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Long passwordId) {
        this.passwordId = passwordId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
