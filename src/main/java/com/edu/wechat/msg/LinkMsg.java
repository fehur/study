package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/3.
 */
public class LinkMsg extends WeChatMsg {

    private String title;
    private String description;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkMsg{");
        sb.append("title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
