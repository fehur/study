package com.edu.study.controller;

import com.edu.wechat.service.MessageService;
import com.edu.wechat.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liyihan on 2017/3/10.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MessageService messageService;

    @ResponseBody
    @RequestMapping("/info")
    public List<Menu> info() {
        return null;
    }

}
