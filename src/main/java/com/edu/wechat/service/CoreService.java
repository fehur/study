package com.edu.wechat.service;

import com.edu.wechat.EventType;
import com.edu.wechat.MsgType;
import com.edu.wechat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.edu.study.model.Constants.SUCCESS;

/**
 * Created by liyihan on 2017/3/10.
 */
@Service
public class CoreService {


    @Autowired
    MessageService messageService;


    /**
     * 处理来自微信服务器的消息(一般都是用户发送的消息或者点击菜单的消息)<br/>
     * 判断消息类型,如果是普通消息,则判断消息类型进行处理(筛选关键字消息进行回复)<br/>
     * 如果是事件消息,交由处理事件的方法进行后续处理
     * 消息类型:<br/>
     * <ol>
     * <li>文字消息</li>
     * <li>图片消息</li>
     * <li>语音消息</li>
     * <li>小视频消息</li>
     * <li>视频消息</li>
     * <li>地理位置消息</li>
     * <li>视频消链接消息息</li>
     * </ol>
     * @param xml 接收到的xml消息
     * @return 处理后的结果,如果是关键字,则返回对应的回复消息,如果是事件,则返回对应的事件消息,否则记录下消息返回默认回复消息
     */
    public String processMsg(Map<String, Object> map, String xml) {
        String msgType = String.valueOf(map.get("MsgType"));
        MsgType type = MsgType.valueOf(msgType.toUpperCase());
        String result = SUCCESS;
        switch (type) {
            case EVENT: //处理事件
                result = event(map, xml);
                break;
            case TEXT: //处理文字消息
                result = messageService.parseTextMsg(xml);
                break;
            case IMAGE: //处理图片消息
                result = messageService.parseImageMsg(xml);
                break;
            case VOICE: //处理语音消息
                result = messageService.parseVoiceMsg(xml);
                break;
            case SHORTVIDEO: //处理小视频消息
                result = messageService.parseShortVideoMsg(xml);
                break;
            case VIDEO: //处理视频消息
                result = messageService.parseVideoMsg(xml);
                break;
            case LOCATION: //处理地理位置消息
                result = messageService.parseLocationMsg(xml);
                break;
            case LINK: //处理链接消息
                result = messageService.parseLinkMsg(xml);
                break;
        }
        return result;
    }


    /**
     * 处理来自微信服务器的事件消息,判断事件类型,并进行相关的事件操作
     * <ol>
     *     <li>关注</li>
     *     <li>取消关注</li>
     *     <li>扫描带二维码参数</li>
     *     <li>上报地理位置</li>
     *     <li>自定义菜单事件</li>
     * </ol>
     *
     * @param xml 接收到的xml消息
     * @return 事件处理结果
     */
    private String event(Map<String, Object> map, String xml) {
        String eventType = String.valueOf(map.get("Event"));
        EventType type = EventType.valueOf(eventType.toUpperCase());
        String result = SUCCESS;
        switch (type) {
            case SUBSCRIBE:
                result = messageService.parseSubscribeEvent(xml);
                break;
            case UNSUBSCRIBE:
                result = messageService.parseUnsubscribeEvent(xml);
                break;
            case VIEW:
                result = messageService.parseViewEvent(xml);
                break;
            case SCAN:
                result = messageService.parseScanEvent(xml);
                break;
            case CLICK:
                result = messageService.parseClickEvent(xml);
                break;
            case LOCATION:
                result = messageService.parseLocationEvent(xml);
                break;
        }
        return result;
    }

}
