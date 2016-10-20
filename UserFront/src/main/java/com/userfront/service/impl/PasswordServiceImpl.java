package com.userfront.service.impl;

import com.userfront.dao.PasswordDao;
import com.userfront.domain.Password;
import com.userfront.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by z00382545 on 10/20/16.
 */

@Service
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private PasswordDao passwordDao;

    public void save(Password password) {
        passwordDao.save(password);
    }
}
