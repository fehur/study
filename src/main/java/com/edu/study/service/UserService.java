package com.edu.study.service;

import com.edu.study.dao.GradeDao;
import com.edu.study.dao.UserDao;
import com.edu.study.model.Grade;
import com.edu.study.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by liyihan on 2017/4/9.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private GradeDao gradeDao;

    public long saveUser(User user) {
        Date date = new Date();
        user.setCtime(date);
        user.setLmtime(date);
        User u = userDao.save(user);
        int gradeId = u.getGrade();
        if (gradeId > 0) {
            Grade grade = gradeDao.findOne(gradeId);
            int count = grade.getCount();
            grade.setCount(count + 1);
            gradeDao.save(grade);
        }
        return u.getId();
    }

    public User findUserByOpenid(String openid) {
        User user = findUserByOpenid(openid);
        if (user == null) {
            user = new User();
            user.setOpenid(openid);
        }
        return user;
    }

}
