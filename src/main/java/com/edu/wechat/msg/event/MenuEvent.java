package com.edu.wechat.msg.event;

/**
 * Created by liyihan on 2017/3/3.
 */
public class MenuEvent extends WeChatEventMsg {

    private String eventKey;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuEvent{");
        sb.append("eventKey=").append(eventKey);
        sb.append('}');
        return sb.toString();
    }
}
