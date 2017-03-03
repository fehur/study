package com.edu.controller;

import com.edu.wechat.util.SHA1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyihan on 2017/3/3.
 */
@RestController("wechat")
@RequestMapping(value = "/wechat",method = {RequestMethod.POST, RequestMethod.GET})
public class WeChatController {

    @Value("wechat.token")
    private String token;

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

}
