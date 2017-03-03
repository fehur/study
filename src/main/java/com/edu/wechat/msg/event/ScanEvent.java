package com.edu.wechat.msg.event;

/**
 * Created by liyihan on 2017/3/3.
 */
public class ScanEvent extends WeChatEventMsg {

    private String eventKey;
    private String ticket;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ScanEvent{");
        sb.append("eventKey=").append(eventKey);
        sb.append(", ticket=").append(ticket);
        sb.append('}');
        return sb.toString();
    }
}
