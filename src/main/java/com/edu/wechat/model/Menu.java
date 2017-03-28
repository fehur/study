package com.edu.wechat.model;

import com.edu.wechat.MenuType;

import java.util.List;

/**
 * Created by liyihan on 2017/3/7.
 */
public class Menu {

    private String name;
    private MenuType type;
    private String key;
    private String url;
    private List<Menu> sub_button;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Menu> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<Menu> sub_button) {
        this.sub_button = sub_button;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", key=").append(key);
        sb.append(", url=").append(url);
        sb.append(", sub_button=").append(sub_button);
        sb.append('}');
        return sb.toString();
    }
}
