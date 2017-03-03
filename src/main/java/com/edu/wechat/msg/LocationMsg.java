package com.edu.wechat.msg;

/**
 * Created by liyihan on 2017/3/3.
 */
public class LocationMsg extends WeChatMsg {

    private double location_x;
    private double location_y;
    private int scale;
    private String label;

    public double getLocation_x() {
        return location_x;
    }

    public void setLocation_x(double location_x) {
        this.location_x = location_x;
    }

    public double getLocation_y() {
        return location_y;
    }

    public void setLocation_y(double location_y) {
        this.location_y = location_y;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationMsg{");
        sb.append("location_x=").append(location_x);
        sb.append(", location_y=").append(location_y);
        sb.append(", scale=").append(scale);
        sb.append(", label=").append(label);
        sb.append('}');
        return sb.toString();
    }
}
