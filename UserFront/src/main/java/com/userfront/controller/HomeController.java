package com.userfront.controller;

import com.userfront.dao.RoleDao;
import com.userfront.domain.User;
import com.userfront.domain.security.Role;
import com.userfront.domain.security.UserRole;
import com.userfront.service.AccountService;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by z00382545 on 10/19/16.
 */

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleDao roleDao;



    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();

        model.addAttribute("user", user);

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user,  Model model) {

        if(checkUserNameExists(user.getUsername()) || checkEmailExists(user.getEmail()) ) {

            if (checkUserNameExists(user.getUsername())) model.addAttribute("userNameExists", true);
            if (checkEmailExists(user.getEmail())) model.addAttribute("emailExists", true);

            return "signup";
        } else {

            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, roleDao.findByName("USER")));
            userService.createUser(user, userRoles);

            return "redirect:/";
        }
    }

    @RequestMapping("/userFront")
    public String userFront() {
        return "userFront";
    }

    private boolean checkUserNameExists(String username) {
        if (null != userService.findByUsername(username)) {
            return true;
        }

        return false;
    }

    private boolean checkEmailExists(String email) {
        if (null != userService.findByEmail(email)) {
            return true;
        }

        return false;
    }

}
