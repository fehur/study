package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.edu.study.model.Constants.*;

/**
 * 学习目标实体类
 *
 * Created by liyihan on 2017/3/28.
 */
@Entity(name = Table.ITINERARY)
public class StudyTarget {

    @Id
    @GeneratedValue
    @Column(name = Field.TARGET_ID)
    private long id; //编号
    @Column(name = Field.TARGET_DAY)
    private String day; //日期
    @Column(name = Field.TARGET_TEXT)
    private String text; //文字
    @Column(name = Field.TARGET_PIC)
    private String pic; //图片
    @Column(name = Field.TARGET_AUDIO)
    private String audio; //语音
    @Column(name = Field.TARGET_CTIME)
    private long ctime; //创建时间
    @Column(name = Field.TARGET_LMTIME)
    private long lmtime; //最后修改时间

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

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public long getLmtime() {
        return lmtime;
    }

    public void setLmtime(long lmtime) {
        this.lmtime = lmtime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudyTarget{");
        sb.append("id=").append(id);
        sb.append(", day=").append(day);
        sb.append(", text=").append(text);
        sb.append(", pic=").append(pic);
        sb.append(", audio=").append(audio);
        sb.append(", ctime=").append(ctime);
        sb.append(", lmtime=").append(lmtime);
        sb.append('}');
        return sb.toString();
    }
}
