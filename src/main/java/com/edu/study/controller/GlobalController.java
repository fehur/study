package com.edu.study.controller;

import com.edu.study.model.Gender;
import com.edu.study.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyih on 2017/4/16.
 */
@RestController
@RequestMapping("/base")
public class GlobalController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/grade")
    public Object grades() {
        return gradeService.gradeList();
    }

    @RequestMapping
    public Object gender() {
        List<Gender> list = new ArrayList<>();
        for (Gender gender : Gender.values()) {
            list.add(gender);
        }
        return list;
    }

}
