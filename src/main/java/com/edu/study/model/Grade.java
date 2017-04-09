package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static com.edu.study.model.Constants.Field.Grade.*;
import static com.edu.study.model.Constants.Table;

/**
 * Created by liyihan on 2017/4/9.
 */
@Entity(name = Table.GRADE)
public class Grade {

    @Id
    @GeneratedValue
    @Column(name = GRADE_ID)
    private int id;
    @Column(name = GRADE_NO)
    private String no;
    @Column(name = GRADE_NAME)
    private String name;
    @Column(name = GRADE_COUNT)
    private int count;
    @Column(name = GRADE_CTIME)
    private Date ctime;
    @Column(name = GRADE_LMTIME)
    private Date lmtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getLmtime() {
        return lmtime;
    }

    public void setLmtime(Date lmtime) {
        this.lmtime = lmtime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Grade{");
        sb.append("id=").append(id);
        sb.append(", no=").append(no);
        sb.append(", name=").append(name);
        sb.append(", count=").append(count);
        sb.append(", ctime=").append(ctime);
        sb.append(", lmtime=").append(lmtime);
        sb.append('}');
        return sb.toString();
    }
}
