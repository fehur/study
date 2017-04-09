package com.edu.study.dao;

import com.edu.StudyApplication;
import com.edu.study.model.Gender;
import com.edu.study.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;

import java.util.Calendar;
import java.util.Date;


/**
 * Created by liyihan on 2017/4/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StudyApplication.class)
public class GradeDaoTest {

    @Autowired
    private UserDao userDao;


    public void save() throws Exception{
        User user = new User();
        user.setBirthday(createDate(1984,7,24,0,0,0));
        user.setCity("北京");
        user.setCtime(new Date());
        user.setEmail("liyihan4@163.com");
        user.setFans(0);
        user.setGender(Gender.MALE);
        user.setName("李一涵");
        user.setNickname("大米饭");
        user.setPassword(DigestUtils.md5DigestAsHex("liyihan1984".getBytes("UTF-8")));

        user = userDao.save(user);

        Assert.notNull(user);
    }

    @Test
    public void cout() {
        org.junit.Assert.assertEquals(1, userDao.count());
    }



    public Date createDate(int y, int M, int d, int h, int m, int s) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, M, d, h, m, s);
        return calendar.getTime();
    }
}