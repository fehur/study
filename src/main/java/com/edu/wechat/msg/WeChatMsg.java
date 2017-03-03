package com.edu.wechat.msg;

import com.edu.wechat.MsgType;

/**
 * Created by liyihan on 2017/3/2.
 */
public class WeChatMsg {

    private long msgId;
    private String toUserName;
    private String FromUserName;
    private long createTime;
    private MsgType msgType;

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeChatMsg{");
        sb.append("msgId=").append(msgId);
        sb.append(", toUserName=").append(toUserName);
        sb.append(", FromUserName=").append(FromUserName);
        sb.append(", createTime=").append(createTime);
        sb.append(", msgType=").append(msgType);
        sb.append('}');
        return sb.toString();
    }
}
