package com.edu.study.controller.admin;

import com.edu.study.model.Grade;
import com.edu.study.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by liyih on 2017/4/16.
 */
@Controller
@RequestMapping("/admin/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/index")
    public String index(Model model) {
        Iterable<Grade> list = gradeService.gradeList();
        model.addAttribute("list", list);
        return "/admin/grade/index";
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public int save(String no, String name) {
        Date date = new Date();
        Grade grade = new Grade();
        grade.setName(name);
        grade.setNo(no);
        grade.setCtime(date);
        grade.setCount(0);
        grade.setLmtime(date);
        return gradeService.saveGrade(grade);
    }

    @ResponseBody
    @RequestMapping("/del/{id}")
    public String delete(@PathVariable int id) {
        gradeService.delGrade(id);
        return "ok";
    }

}
