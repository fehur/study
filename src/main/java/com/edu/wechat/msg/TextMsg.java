package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/2.
 */
public class TextMsg extends WeChatMsg {

    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TextMsg{");
        sb.append("content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
