package com.edu.wechat.util;

import com.edu.wechat.WeChatApi;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by liyihan on 2017/3/7.
 */
@Resource
public class AccessTokenUtil {

    private static String ACCESS_TOKEN_KEY = "access_token";
    private static ObjectMapper MAPPER = new ObjectMapper();
    private static Logger LOG = Logger.getLogger(AccessTokenUtil.class);

    @Value("wechat.appie")
    String appid;
    @Value("wechat.secret")
    String secret;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public String getAccessToken() {

        if (stringRedisTemplate.hasKey(ACCESS_TOKEN_KEY))
            initAccessToken();

        String accessToken = stringRedisTemplate.opsForValue().get(ACCESS_TOKEN_KEY);

        return accessToken;
    }

    private void initAccessToken() {
        String url = WeChatApi.getGetAccessToken(appid, secret);
        String result = HttpUtil.doGet(url, null);
        try {
            if (!StringUtils.isEmpty(result)) {
                Map<String, Object> map = MAPPER.readValue(result, new TypeReference<Map<String, Object>>() {});
                if (map.containsKey("errorcode")) {
                    if (LOG.isWarnEnabled())
                        LOG.warn(result);
                } else {
                    stringRedisTemplate.opsForValue().set(ACCESS_TOKEN_KEY,
                            String.valueOf(map.get(ACCESS_TOKEN_KEY)), 7200, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e) {
            if (LOG.isErrorEnabled())
                LOG.error("获取accessToken出错", e);
        }
    }

}
