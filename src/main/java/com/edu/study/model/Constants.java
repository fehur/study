package com.edu.study.model;

/**
 * Created by liyihan on 2017/3/6.
 */
public interface Constants {

    String SUCCESS = "success";

    interface Table {
        String REPLAY_MSG = "t_replay_msg";
        String USER = "t_user";
        String ITINERARY = "t_itinerary";
        String STUDY_TARGET = "t_study_target";
    }

    interface Field {

        /* 自动回复表 */
        String REPLAY_MSG_ID = "id";
        String REPLAY_MSG_TYPE = "type";
        String REPLAY_MSG_NAME = "name";
        String REPLAY_MSG_KEYWORD = "keyword";
        String REPLAY_MSG_CONTENT = "content";
        String REPLAY_MSG_USE_COUNT = "user_count";
        String REPLAY_MSG_CTIME = "ctime";
        String REPLAY_MSG_LMTIME = "lmtime";

        /* 用户表 */
        String USER_ID = "id";
        String USER_NAME = "name";
        String USER_EMAIL = "email";
        String USER_PWD = "password";
        String USER_GENDER = "gender";
        String USER_PROVINCE = "province";
        String USER_CITY = "city";
        String USER_BIRTHDAY = "birthday";
        String USER_IMAGE = "image";
        String USER_NICKNAME = "nickname";
        String USER_OPENID = "openid";
        String USER_CTIME = "ctime";
        String USER_LMTIME = "lmtime";
        String USER_LAN = "lan";
        String USER_LON = "lon";

        /* 行程表 */
        String ITINERARY_ID = "id";
        String ITINERARY_TYPE = "type";
        String ITINERARY_NAME = "name";
        String ITINERARY_DAY = "day";
        String ITINERARY_CONTENT = "content";
        String ITINERARY_CTIME = "ctime";

        String TARGET_ID = "id";
        String TARGET_DAY = "day";
        String TARGET_TEXT = "text";
        String TARGET_PIC = "pic";
        String TARGET_AUDIO = "audio";
        String TARGET_CTIME = "ctime";
        String TARGET_LMTIME = "lmtime";
    }

}
