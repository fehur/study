package com.edu.study.controller;

import com.edu.study.model.User;
import com.edu.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liyih on 2017/4/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/edit")
    public String edit(String openid, Model model) {

        User user = userService.findUserByOpenid(openid);

        model.addAttribute("user", user);

        return "user/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        userService.saveUser(user);
        return "redirect:/user/index";
    }



}
