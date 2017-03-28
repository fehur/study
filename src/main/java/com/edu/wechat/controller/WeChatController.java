package com.edu.wechat.controller;

import com.edu.wechat.service.CoreService;
import com.edu.wechat.util.SHA1;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by liyihan on 2017/3/3.
 */
@RestController("wechat")
@RequestMapping("/wechat")
public class WeChatController {

    @Value("wechat.token")
    private String token;

    private static XmlMapper MAPPER = new XmlMapper();

    @Autowired
    private CoreService coreService;


    @RequestMapping(method = RequestMethod.GET)
    public String get(String signature, String timestamp, String nonce, String echostr) {
        try {
            String temp = SHA1.getSHA1(token, timestamp, nonce, "");
            if (temp.equals(signature))
                return echostr;
            else
                return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @RequestMapping(method = RequestMethod.POST, produces = "'application/xml;charset=UTF-8")
    public String post(@RequestBody String xml) throws Exception{
        Map<String, Object> requestMap = MAPPER.readValue(xml, new TypeReference<Map<String, Object>>(){});
        if (!requestMap.containsKey("MsgType"))
            return "fail";

        return coreService.processMsg(requestMap, xml);
    }
}
