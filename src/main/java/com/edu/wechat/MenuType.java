package com.edu.wechat;

/**
 * Created by liyihan on 2017/3/10.
 */
public enum MenuType {

    CLICK(0, "弹出事件", "click"),
    VIEW(1, "跳转链接", "view"),
    SCANCODE_PUSH(2, "扫码推事件", "scancode_push"),
    SCANCODE_WAITMSG(3, "弹出消息的扫码推事件", "scancode_waitmsg"),
    PIC_SYSPHOTO(4, "弹出系统拍照", "pic_sysphoto"),
    PIC_PHOTO_OR_ALBUM(5,"弹出拍照或者相册","pic_photo_or_album"),
    PIC_WEIXIN(6, "出微信相册", "pic_weixin"),
    LOCATION_SELECT(7, "弹出地理位置选择器", "location_select");

    private int id;
    private String note;
    private String code;

    MenuType(int id, String note, String code) {
        this.id = id;
        this.note = note;
        this.code = code;
    }

    public int id() {
        return this.id;
    }

    public String note() {
        return this.note;
    }

    public String code() {
        return this.code;
    }
}
