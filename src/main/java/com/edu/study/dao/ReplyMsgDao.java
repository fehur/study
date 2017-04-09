package com.edu.study.dao;

import com.edu.study.model.ReplyMsg;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by liyihan on 2017/4/9.
 */
public interface ReplyMsgDao extends PagingAndSortingRepository<ReplyMsg, Long> {
}
