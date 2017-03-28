package com.edu.wechat.util;

import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by liyihan on 2017/3/7.
 */
public class HttpUtil {

    protected static Logger LOG = Logger.getLogger(HttpUtil.class);

    public static String doGet(String url, Map<String, String> params) {

        String result = "";
        StringBuilder sb = new StringBuilder(url);

        if (!CollectionUtils.isEmpty(params)) {
            if (url.lastIndexOf("?") == -1)
                sb.append("?");
            else
                sb.append("&");
            params.entrySet().stream().forEach(key -> {
                sb.append(key).append("=").append(params.get(key));
                sb.append("&");
            });
            sb.deleteCharAt(sb.length() - 1);
        }

        if (LOG.isDebugEnabled())
            LOG.debug(sb.toString());

        try {
            URL realUrl = new URL(sb.toString());
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = in.readLine()) != null)
                result += new String(line.getBytes(), "utf-8");

            if (LOG.isDebugEnabled())
                LOG.debug(result);

            in.close();
            connection.disconnect();
        } catch (Exception e) {
            if (LOG.isErrorEnabled())
                LOG.error("发送get请求出错", e);
        }

        return result;
    }

    public static String doPostJson(String url, String json) {
        String result = "";

        try {
            URL realUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.connect();
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            out.writeBytes(json);
            out.flush();
            out.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                sb.append(new String(lines.getBytes(), "utf-8"));
            }
            reader.close();
            // 断开连接
            connection.disconnect();
            result = sb.toString();

            if (LOG.isDebugEnabled())
                LOG.debug(result);
        } catch (Exception e) {
            if (LOG.isErrorEnabled())
                LOG.error("发送post请求出错", e);
        }

        return result;
    }

}
