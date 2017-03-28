package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.edu.study.model.Constants.*;

/**
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.REPLAY_MSG)
public class ReplayMsg {

    @Id
    @GeneratedValue
    @Column(name = Field.REPLAY_MSG_ID)
    private long id;
    @Column(name = Field.REPLAY_MSG_TYPE)
    private ReplayType type;
    @Column(name = Field.REPLAY_MSG_NAME)
    private String name;
    @Column(name = Field.REPLAY_MSG_KEYWORD)
    private String keyword;
    @Column(name = Field.REPLAY_MSG_CONTENT)
    private String content;
    @Column(name = Field.REPLAY_MSG_USE_COUNT)
    private long useCount;
    @Column(name = Field.REPLAY_MSG_CTIME)
    private long ctime;
    @Column(name = Field.REPLAY_MSG_LMTIME)
    private long lmtime;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReplayMsg)) return false;

        ReplayMsg replayMsg = (ReplayMsg) o;

        if (id != replayMsg.id) return false;
        if (useCount != replayMsg.useCount) return false;
        if (ctime != replayMsg.ctime) return false;
        if (lmtime != replayMsg.lmtime) return false;
        if (type != replayMsg.type) return false;
        if (!name.equals(replayMsg.name)) return false;
        if (!keyword.equals(replayMsg.keyword)) return false;
        return content.equals(replayMsg.content);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + type.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + keyword.hashCode();
        result = 31 * result + content.hashCode();
        result = 31 * result + (int) (useCount ^ (useCount >>> 32));
        result = 31 * result + (int) (ctime ^ (ctime >>> 32));
        result = 31 * result + (int) (lmtime ^ (lmtime >>> 32));
        return result;
    }
}
