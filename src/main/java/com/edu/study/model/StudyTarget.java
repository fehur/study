package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static com.edu.study.model.Constants.Table;
import static com.edu.study.model.Constants.Field.StudyTarget.*;

/**
 * 学习目标实体类
 *
 * Created by liyihan on 2017/3/28.
 */
@Entity(name = Table.STUDY_TARGET)
public class StudyTarget {

    @Id
    @GeneratedValue
    @Column(name = TARGET_ID)
    private long id; //编号
    @Column(name = TARGET_DAY)
    private String day; //日期
    @Column(name = TARGET_TYPE)
    private String type;
    @Column(name = TARGET_TEXT)
    private String text; //文字
    @Column(name = TARGET_PIC)
    private String pic; //图片
    @Column(name = TARGET_AUDIO)
    private String audio; //语音
    @Column(name = TARGET_CTIME)
    private Date ctime; //创建时间
    @Column(name = TARGET_LMTIME)
    private Date lmtime; //最后修改时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
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
        final StringBuilder sb = new StringBuilder("StudyTarget{");
        sb.append("id=").append(id);
        sb.append(", day=").append(day);
        sb.append(", type=").append(type);
        sb.append(", text=").append(text);
        sb.append(", pic=").append(pic);
        sb.append(", audio=").append(audio);
        sb.append(", ctime=").append(ctime);
        sb.append(", lmtime=").append(lmtime);
        sb.append('}');
        return sb.toString();
    }
}
