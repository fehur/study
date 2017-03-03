package com.edu.wechat;

import org.thymeleaf.util.StringUtils;

import javax.validation.constraints.NotNull;

/**
 * Created by liyihan on 2017/3/2.
 */
public class WeChatApi {

    protected WeChatApi() { throw new RuntimeException();}

    private static String API_URL = "https://api.weixin.qq.com";

    /** 获取access_token */
    private static String GET_ACCESS_TOKEN = API_URL + "/cgi-bin/token?grant_type=client_credential&appid=%1&secret=%2";

    /** 获取微信服务器IP地址 */
    private static String GET_IP_LIST = API_URL + "/cgi-bin/getcallbackip?access_token=%1";

    /** 创建标签 */
    private static String CREATE_TAG = API_URL + "/cgi-bin/tags/create?access_token=%1";

    /** 获取公众号已创建的标签 */
    private static String GET_TAGS = API_URL + "/cgi-bin/tags/get?access_token=%1";

    /** 编辑标签 */
    private static String UPDATE_TAG = API_URL + "/cgi-bin/tags/update?access_token=%1";

    /** 删除标签 */
    private static String DELETE_TAG = API_URL + "/cgi-bin/tags/delete?access_token=%1";

    /** 获取标签下粉丝列表 */
    private static String GET_TAG_USERS = API_URL + "/cgi-bin/user/tag/get?access_token=%1";

    /** 批量为用户打标签 */
    private static String TAG_USER = API_URL + "/cgi-bin/tags/members/batchtagging?access_token=%1";

    /** 批量为用户取消标签 */
    private static String UNTAG_USER = API_URL + "/cgi-bin/tags/members/batchuntagging?access_token=%1";

    /** 获取用户身上的标签列表 */
    private static String USER_TAG_LIST = API_URL + "/cgi-bin/tags/getidlist?access_token=%1";

    /** 设置用户备注名 */
    private static String UPDATE_USER_REMARK = API_URL + "/cgi-bin/user/info/updateremark?access_token=%1";

    /** 获取用户基本信息（包括UnionID机制） */
    private static String GET_USER = API_URL + "/cgi-bin/user/info?access_token=%1&openid=%2&lang=zh_CN";

    /** 批量获取用户基本信息 */
    private static String GET_USERS = API_URL + "/cgi-bin/user/info/batchget?access_token=%1";

    /** 获取用户列表 */
    private static String GET_USER_LIST = API_URL + "/cgi-bin/user/get?access_token=%1&next_openid=%2";

    /** 自定义菜单创建接口 */
    private static String CREATE_MENU = API_URL + "/cgi-bin/menu/create?access_token=%1";

    /** 自定义菜单查询接口 */
    private static String GET_MENU = API_URL + "/cgi-bin/menu/get?access_token=%1";

    /** 自定义菜单删除接口 */
    private static String DELETE_MENU = API_URL + "/cgi-bin/menu/delete?access_token=%1";

    /** 新增临时素材 */
    private static String UPDATE_TEMP_MEDIA = API_URL + "/cgi-bin/media/upload?access_token=%1&type=%2";

    /** 获取临时素材 */
    private static String GET_TEMP_MEDIA = API_URL + "/cgi-bin/media/get?access_token=%1&media_id=%2";

    /** 新增永久图文素材 */
    private static String ADD_NEWS = API_URL + "/cgi-bin/material/add_news?access_token=%1";

    /** 上传图文消息内的图片获取URL  */
    private static String ADD_IMG = API_URL + "/cgi-bin/media/uploadimg?access_token=%1";

    /** 新增其他类型永久素材 */
    private static String ADD_MEDIA = API_URL + "/cgi-bin/material/add_material?access_token=%1&type=%2";

    /** 获取永久素材 */
    private static String GET_MEDIA = API_URL + "/cgi-bin/material/get_material?access_token=%1";

    /** 删除永久素材 */
    private static String DELETE_MEDIA = API_URL + "/cgi-bin/material/del_material?access_token=%1";

    /** 修改永久图文素材 */
    private static String UPDATE_MEDIA = API_URL + "/cgi-bin/material/update_news?access_token=%1";

    /** 获取素材总数 */
    private static String COUNT_MEDIA = API_URL + "/cgi-bin/material/get_materialcount?access_token=%1";

    /** 获取素材列表 */
    private static String GET_MEDIA_LIST = API_URL + "/cgi-bin/material/batchget_material?access_token=%1";

    /**
     * 获取access_token
     *
     * @param appId 必填,非空
     * @param secret 必填,非空
     * @return
     */
    public static String getGetAccessToken(@NotNull String appId, @NotNull String secret) {
        if (StringUtils.isEmpty(appId) || StringUtils.isEmpty(secret))
            throw new NullPointerException();
        return String.format(GET_ACCESS_TOKEN, appId, secret);
    }

    /**
     * 获取微信服务器IP地址
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetIpList(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_IP_LIST, accessToken);
    }

    /**
     * 创建标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getCreateTag(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(CREATE_TAG, accessToken);
    }

    /**
     * 获取公众号已创建的标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetTags(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_TAGS, accessToken);
    }

    /**
     * 编辑标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getUpdateTag(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(UPDATE_TAG, accessToken);
    }

    /**
     * 删除标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getDeleteTag(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(DELETE_TAG, accessToken);
    }

    /**
     * 获取标签下粉丝列表
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetTagUsers(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_TAG_USERS, accessToken);
    }

    /**
     * 批量为用户打标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getTagUser(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(TAG_USER, accessToken);
    }

    /**
     * 批量为用户取消标签
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getUntagUser(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(UNTAG_USER, accessToken);
    }

    /**
     * 获取用户身上的标签列表
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getUserTagList(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(USER_TAG_LIST, accessToken);
    }

    /**
     * 设置用户备注名
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getUpdateUserRemark(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(UPDATE_USER_REMARK, accessToken);
    }

    /**
     * 获取用户基本信息（包括UnionID机制）
     *
     * @param accessToken 必填,非空
     * @param openId
     * @return
     */
    public static String getGetUser(String accessToken, String openId) {
        if (StringUtils.isEmpty(accessToken) || StringUtils.isEmpty(openId))
            throw new NullPointerException();
        return String.format(GET_USER, accessToken, openId);
    }

    /**
     * 批量获取用户基本信息
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetUsers(String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_USERS, accessToken);
    }

    /**
     * 获取用户列表
     *
     * @param accessToken 必填,非空
     * @param nextOpenId 必填,可以是空字符串
     * @return
     */
    public static String getGetUserList(@NotNull String accessToken, @NotNull String nextOpenId) {
        if (StringUtils.isEmpty(accessToken) || nextOpenId == null)
            throw new NullPointerException();
        return String.format(GET_USER_LIST, accessToken, nextOpenId);
    }

    /**
     * 自定义菜单创建接口
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getCreateMenu(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(CREATE_MENU, accessToken);
    }

    /**
     * 自定义菜单查询接口
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetMenu(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_MENU, accessToken);
    }

    /**
     * 自定义菜单删除接口
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getDeleteMenu(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(DELETE_MENU, accessToken);
    }

    /**
     * 新增临时素材
     *
     * @param accessToken 必填,非空
     * @param mediaType 必填,非空
     * @return
     */
    public static String getUpdateTempMedia(@NotNull String accessToken, @NotNull String mediaType) {
        if (StringUtils.isEmpty(accessToken) || StringUtils.isEmpty(mediaType))
            throw new NullPointerException();
        return String.format(UPDATE_TEMP_MEDIA, accessToken, mediaType);
    }

    /**
     * 获取临时素材
     *
     * @param accessToken 必填,非空
     * @param mediaId 必填,非空
     * @return
     */
    public static String getGetTempMedia(@NotNull String accessToken, @NotNull String mediaId) {
        if (StringUtils.isEmpty(accessToken) || StringUtils.isEmpty(mediaId))
            throw new NullPointerException();
        return String.format(GET_TEMP_MEDIA, accessToken, mediaId);
    }

    /**
     * 新增其他类型永久素材
     *
     * @param accessToken 必填,非空
     * @param mediaType 必填,非空
     * @return
     */
    public static String getAddMedia(@NotNull String accessToken, @NotNull String mediaType) {
        if (StringUtils.isEmpty(accessToken) || StringUtils.isEmpty(mediaType))
            throw new NullPointerException();
        return String.format(ADD_MEDIA, accessToken, mediaType);
    }

    /**
     * 新增永久图文素材
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getAddNews(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(ADD_NEWS, accessToken);
    }

    /**
     * 上传图文消息内的图片获取URL
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getAddImg(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(ADD_IMG, accessToken);
    }

    /**
     * 获取永久素材
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetMedia(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_MEDIA, accessToken);
    }

    /**
     * 删除永久素材
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getDeleteMedia(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(DELETE_MEDIA, accessToken);
    }

    /**
     * 修改永久图文素材
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getUpdateMedia(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(UPDATE_MEDIA, accessToken);
    }

    /**
     * 获取素材总数
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getCountMedia(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(COUNT_MEDIA, accessToken);
    }

    /**
     * 获取素材列表
     *
     * @param accessToken 必填,非空
     * @return
     */
    public static String getGetMediaList(@NotNull String accessToken) {
        if (StringUtils.isEmpty(accessToken))
            throw new NullPointerException();
        return String.format(GET_MEDIA_LIST, accessToken);
    }
}
