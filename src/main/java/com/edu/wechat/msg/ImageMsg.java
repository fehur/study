package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/2.
 */
public class ImageMsg {

    String picUrl;
    String mediaId;

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
        final StringBuffer sb = new StringBuffer("ImageMsg{");
        sb.append("picUrl=").append(picUrl);
        sb.append(", mediaId=").append(mediaId);
        sb.append('}');
        return sb.toString();
    }
}
