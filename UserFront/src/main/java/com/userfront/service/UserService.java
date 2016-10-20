package com.userfront.service;

import com.userfront.domain.User;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface UserService {

    void save (User user);

    User findByUserName(String userName);

    User findByEmail(String email);
}
