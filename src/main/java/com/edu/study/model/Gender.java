package com.edu.study.model;

/**
 * Created by liyihan on 2017/3/6.
 */
public enum Gender {

    MALE(0, "男"),
    FEMALE(1, "女"),
    UNKNOW(2, "保密");

    private int id;
    private String note;

    Gender(int id, String note) {
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
