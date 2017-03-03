package com.edu.wechat.msg.event;

/**
 * Created by liyihan on 2017/3/3.
 */
public class LocationEvent extends WeChatEventMsg{

    private double latitude;
    private double longitude;
    private double precision;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationEvent{");
        sb.append("latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", precision=").append(precision);
        sb.append('}');
        return sb.toString();
    }
}
