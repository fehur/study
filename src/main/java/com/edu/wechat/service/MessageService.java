package com.edu.wechat.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.edu.study.model.Constants.SUCCESS;

/**
 * Created by liyihan on 2017/3/6.
 */
@Service
public class MessageService {

    @Autowired
    AccessTokenUtil accessTokenUtil;

    private static ObjectMapper mapper = new ObjectMapper();

    /**
     * 解析文字消息,并查找该文字是否是关键字消息,如果是则取关键字对应的消息进行回复,否则记录消息
     *
     * @param xml
     * @return
     */
    public String parseTextMsg(String xml) {
        //TODO
        //判断是不是关键字,如果是关键字就进行关键字回复,否则记录消息并且回复success
        return SUCCESS;
    }

    /**
     * 解析图片消息,取出图片地址,并保存到自己服务器上,然后记录消息
     *
     * @param xml
     * @return
     */
    public String parseImageMsg(String xml) {
        //TODO
        //记录图片
        return SUCCESS;
    }

    /**
     * 解析语音消息,取出语音地址,并保存到自己服务器上,然后记录消息
     *
     * @param xml
     * @return
     */
    public String parseVoiceMsg(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析小视频消息,取出小视频地址,并保存到自己服务器上,然后记录消息
     *
     * @param xml
     * @return
     */
    public String parseShortVideoMsg(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析视频消息,取出视频地址,并保存到自己服务器上,然后记录消息
     *
     * @param xml
     * @return
     */
    public String parseVideoMsg(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析地理位置消息,并记录消息
     *
     * @param xml
     * @return
     */
    public String parseLocationMsg(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析链接消息,并记录消息
     *
     * @param xml
     * @return
     */
    public String parseLinkMsg(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析关注事件,记录关注人信息,并返回欢迎语(如果有的话),如果此人曾经关注过,则修改状态为已关注
     *
     * @param xml
     * @return
     */
    public String parseSubscribeEvent(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析取消关注事件,更新关注人状态为取消关注.
     *
     * @param xml
     * @return
     */
    public String parseUnsubscribeEvent(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析点击菜单跳转链接事件
     *
     * @param xml
     * @return
     */
    public String parseViewEvent(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析扫描二维码事件
     *
     * @param xml
     * @return
     */
    public String parseScanEvent(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析点击菜单事件,并返回对应的图文结果
     *
     * @param xml
     * @return
     */
    public String parseClickEvent(String xml) {
        //TODO
        return SUCCESS;
    }

    /**
     * 解析地理位置上报事件,更新用户地理位置信息,并记录消息
     *
     * @param xml
     * @return
     */
    public String parseLocationEvent(String xml) {
        //TODO
        return SUCCESS;
    }

}
