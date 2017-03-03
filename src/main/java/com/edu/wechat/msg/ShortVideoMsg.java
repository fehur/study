package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/3.
 */
public class ShortVideoMsg extends WeChatMsg {

    private String mediaId;
    private String thumbMediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShortVideoMsg{");
        sb.append("mediaId=").append(mediaId);
        sb.append(", thumbMediaId=").append(thumbMediaId);
        sb.append('}');
        return sb.toString();
    }
}
