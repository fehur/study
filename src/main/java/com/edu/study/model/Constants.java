package com.edu.study.model;

/**
 * Created by liyihan on 2017/3/6.
 */
public interface Constants {

    String SUCCESS = "success";
    String FAIL = "";

    interface Table {
        String REPLAY_MSG = "t_replay_msg";
        String USER = "t_user";
        @Deprecated
        String ITINERARY = "t_itinerary";
        String STUDY_TARGET = "t_study_target";
        String USER_TASK = "t_user_task";
        String GRADE = "t_grade";
    }

    interface Field {

        interface ReplyMsg {
            /* 自动回复表 */
            String REPLAY_MSG_ID = "id";
            String REPLAY_MSG_TYPE = "type";
            String REPLAY_MSG_NAME = "name";
            String REPLAY_MSG_KEYWORD = "keyword";
            String REPLAY_MSG_CONTENT = "content";
            String REPLAY_MSG_USE_COUNT = "user_count";
            String REPLAY_MSG_CTIME = "ctime";
            String REPLAY_MSG_LMTIME = "lmtime";
        }

        interface User {
            /* 用户表 */
            String USER_ID = "id";
            String USER_NAME = "name";
            String USER_EMAIL = "email";
            String USER_PWD = "password";
            String USER_GENDER = "gender";
            String USER_GRADE = "grade";
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
            String USER_FANS = "fans";
            String USER_LOGIN_TIME = "ltime";
        }

        @Deprecated
        interface Itinerary {
            /* 行程表 */
            String ITINERARY_ID = "id";
            String ITINERARY_TYPE = "type";
            String ITINERARY_NAME = "name";
            String ITINERARY_DAY = "day";
            String ITINERARY_CONTENT = "content";
            String ITINERARY_CTIME = "ctime";
        }

        interface StudyTarget {
            String TARGET_ID = "id";
            String TARGET_DAY = "day";
            String TARGET_TEXT = "text";
            String TARGET_PIC = "pic";
            String TARGET_AUDIO = "audio";
            String TARGET_CTIME = "ctime";
            String TARGET_TYPE = "type";
            String TARGET_LMTIME = "lmtime";
        }

        interface UserTask {
            String USERTASK_ID = "id";
            String USERTASK_UID = "uid";
            String USERTASK_TID = "tid";
            String USERTASK_RESULT = "result";
            String USERTASK_EVALUATE = "evaluate";
            String USERTASK_CTIME = "ctime";
            String USERTASK_LMTIME = "lmtime";
        }

        interface Grade {
            String GRADE_ID = "id";
            String GRADE_NO = "no";
            String GRADE_NAME = "name";
            String GRADE_COUNT = "count";
            String GRADE_CTIME = "ctime";
            String GRADE_LMTIME = "lmtime";
        }
    }

}
