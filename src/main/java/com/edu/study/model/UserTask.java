package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static com.edu.study.model.Constants.Table;
import static com.edu.study.model.Constants.Field.UserTask.*;

/**
 * 用户作业
 *
 * Created by liyihan on 2017/3/28.
 */
@Entity(name = Table.USER_TASK)
public class UserTask {

    @Id
    @GeneratedValue
    @Column(name = USERTASK_ID)
    private long id;//编号
    @Column(name = USERTASK_UID)
    private long uid;//用户编号
    @Column(name = USERTASK_TID)
    private long tid;//学习目标编号
    @Column(name = USERTASK_RESULT)
    private double result;//成绩
    @Column(name = USERTASK_EVALUATE)
    private String evaluate;//评价
    @Column(name = USERTASK_CTIME)
    private Date cdate;//评价时间
    @Column(name = USERTASK_LMTIME)
    private Date lmdate;//最后修改时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getLmdate() {
        return lmdate;
    }

    public void setLmdate(Date lmdate) {
        this.lmdate = lmdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserTask{");
        sb.append("id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", tid=").append(tid);
        sb.append(", result=").append(result);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", cdate=").append(cdate);
        sb.append(", lmdate=").append(lmdate);
        sb.append('}');
        return sb.toString();
    }
}
