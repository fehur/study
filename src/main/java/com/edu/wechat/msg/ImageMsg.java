package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/2.
 */
public class ImageMsg extends WeChatMsg {

    private String picUrl;
    private String mediaId;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImageMsg{");
        sb.append("picUrl=").append(picUrl);
        sb.append(", mediaId=").append(mediaId);
        sb.append('}');
        return sb.toString();
    }
}
