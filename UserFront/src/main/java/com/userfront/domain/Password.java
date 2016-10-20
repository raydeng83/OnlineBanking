package com.userfront.domain;

import javax.persistence.*;

/**
 * Created by z00382545 on 10/19/16.
 */

@Entity
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long passwordId;
    private String password;

    @OneToOne
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
