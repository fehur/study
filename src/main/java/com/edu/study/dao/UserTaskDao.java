package com.edu.study.dao;

import com.edu.study.model.UserTask;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by liyihan on 2017/4/9.
 */
public interface UserTaskDao extends PagingAndSortingRepository<UserTask, Long>{
}
