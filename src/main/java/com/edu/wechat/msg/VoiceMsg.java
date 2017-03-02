package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/2.
 */
public class VoiceMsg extends WeChatMsg {

    String mediaId;
    String format;
    String recognition;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VoiceMsg{");
        sb.append("mediaId=").append(mediaId);
        sb.append(", format=").append(format);
        sb.append(", recognition=").append(recognition);
        sb.append('}');
        return sb.toString();
    }
}
