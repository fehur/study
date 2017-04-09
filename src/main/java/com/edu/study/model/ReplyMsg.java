package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static com.edu.study.model.Constants.Table;
import static com.edu.study.model.Constants.Field.ReplyMsg.*;

/**
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.REPLAY_MSG)
public class ReplyMsg {

    @Id
    @GeneratedValue
    @Column(name = REPLAY_MSG_ID)
    private long id;
    @Column(name = REPLAY_MSG_TYPE)
    private ReplayType type;
    @Column(name = REPLAY_MSG_NAME)
    private String name;
    @Column(name = REPLAY_MSG_KEYWORD)
    private String keyword;
    @Column(name = REPLAY_MSG_CONTENT)
    private String content;
    @Column(name = REPLAY_MSG_USE_COUNT)
    private long useCount;
    @Column(name = REPLAY_MSG_CTIME)
    private Date ctime;
    @Column(name = REPLAY_MSG_LMTIME)
    private Date lmtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ReplayType getType() {
        return type;
    }

    public void setType(ReplayType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUseCount() {
        return useCount;
    }

    public void setUseCount(long useCount) {
        this.useCount = useCount;
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
        final StringBuilder sb = new StringBuilder("ReplayMsg{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", keyword=").append(keyword);
        sb.append(", content=").append(content);
        sb.append(", useCount=").append(useCount);
        sb.append(", ctime=").append(ctime);
        sb.append(", lmtime=").append(lmtime);
        sb.append('}');
        return sb.toString();
    }
}
