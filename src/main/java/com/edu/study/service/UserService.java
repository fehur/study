package com.edu.study.service;

import com.edu.study.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by liyihan on 2017/4/9.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

}
