package com.edu.study.dao;

import com.edu.study.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by liyihan on 2017/4/9.
 */
public interface UserDao extends PagingAndSortingRepository<User, Long> {

    User findUserByOpenid(String openid);

}
