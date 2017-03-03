package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/2.
 */
public class TextMsg extends WeChatMsg {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TextMsg{");
        sb.append("content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
