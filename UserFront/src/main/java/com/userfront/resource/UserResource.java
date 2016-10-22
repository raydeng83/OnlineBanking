package com.userfront.resource;

import com.userfront.domain.User;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by z00382545 on 10/22/16.
 */

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<User> userList() {
        return userService.findUserList();
    }
}
