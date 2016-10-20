package com.userfront.controller;

import com.userfront.domain.Password;
import com.userfront.domain.User;
import com.userfront.service.PasswordService;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by z00382545 on 10/19/16.
 */

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordService passwordService;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();
        Password password = new Password();

        model.addAttribute("user", user);
        model.addAttribute("password", password);

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user, @ModelAttribute("password") Password password, Model model) {

        if(checkUserNameExists(user.getUserName()) || checkEmailExists(user.getEmail()) ) {

            if (checkUserNameExists(user.getUserName())) model.addAttribute("userNameExists", true);
            if (checkEmailExists(user.getEmail())) model.addAttribute("emailExists", true);

            return "signup";
        } else {
            userService.save(user);
            passwordService.save(password);

            return "redirect:/";
        }
    }

    private boolean checkUserNameExists(String username) {
        if (null != userService.findByUserName(username)) {
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
