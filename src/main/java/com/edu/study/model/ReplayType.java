package com.edu.study.model;

/**
 * Created by liyihan on 2017/3/6.
 */
public enum ReplayType {

    AUTO_REPLAY(1, "自动回复"),
    SUBSCRIBED(2, "被关注回复"),
    KEYWORD(3, "关键字回复");

    private int id;
    private String note;

    ReplayType(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public int id() {
        return this.id;
    }

    public String note() {
        return this.note;
    }
}
