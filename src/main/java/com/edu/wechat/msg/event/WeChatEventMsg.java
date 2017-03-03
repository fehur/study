package com.edu.wechat.msg.event;

import com.edu.wechat.EventType;
import com.edu.wechat.MsgType;

/**
 * Created by liyihan on 2017/3/3.
 */
public class WeChatEventMsg {

    private String toUserName;
    private String fromUserName;
    private long createTime;
    private MsgType type;
    private EventType event;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public MsgType getType() {
        return type;
    }

    public void setType(MsgType type) {
        this.type = type;
    }

    public EventType getEvent() {
        return event;
    }

    public void setEvent(EventType event) {
        this.event = event;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeChatEventMsg{");
        sb.append("toUserName=").append(toUserName);
        sb.append(", fromUserName=").append(fromUserName);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", event=").append(event);
        sb.append('}');
        return sb.toString();
    }
}
