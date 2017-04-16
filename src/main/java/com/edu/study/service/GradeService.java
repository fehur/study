package com.edu.study.service;

import com.edu.study.dao.GradeDao;
import com.edu.study.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by liyihan on 2017/4/9.
 */
@Service
@Transactional
public class GradeService {

    @Autowired
    private GradeDao gradeDao;

    public int saveGrade(Grade grade) {
        Grade g = gradeDao.save(grade);
        return g.getId();
    }

    public void delGrade(int id) {
        gradeDao.delete(id);
    }

    public Iterable<Grade> gradeList() {
        return gradeDao.findAll();
    }

}
