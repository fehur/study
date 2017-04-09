package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static com.edu.study.model.Constants.Table;
import static com.edu.study.model.Constants.Field.User.*;

/**
 * 用户表
 *
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.USER)
public class User {

    @Id
    @GeneratedValue
    @Column(name = USER_ID)
    private long id; //编号
    @Column(name = USER_NAME)
    private String name; //姓名
    @Column(name = USER_EMAIL)
    private String email; //email
    @Column(name = USER_PWD)
    private String password; //密码
    @Column(name = USER_GENDER)
    private Gender gender; //性别
    @Column(name = USER_PROVINCE)
    private String province; //省
    @Column(name = USER_CITY)
    private String city; //市
    @Column(name = USER_BIRTHDAY)
    private Date birthday; //生日
    @Column(name = USER_IMAGE)
    private String image; //头像
    @Column(name = USER_NICKNAME)
    private String nickname; //昵称
    @Column(name = USER_OPENID)
    private String openid; //openid
    @Column(name = USER_CTIME)
    private Date ctime; //注册时间
    @Column(name = USER_LMTIME)
    private Date lmtime;
    @Column(name = USER_LAN)
    private long lan; //经度
    @Column(name = USER_LON)
    private long lon; //纬度
    @Column(name = USER_FANS)
    private int fans; //是否是粉丝(0-不是,1-是)
    @Column(name = USER_LOGIN_TIME)
    private Date lastLoginTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getLmtime() {
        return lmtime;
    }

    public void setLmtime(Date lmtime) {
        this.lmtime = lmtime;
    }

    public long getLan() {
        return lan;
    }

    public void setLan(long lan) {
        this.lan = lan;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", gender=").append(gender);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", birthday=").append(birthday);
        sb.append(", image=").append(image);
        sb.append(", nickname=").append(nickname);
        sb.append(", openid=").append(openid);
        sb.append(", ctime=").append(ctime);
        sb.append(", lmtime=").append(lmtime);
        sb.append(", lan=").append(lan);
        sb.append(", lon=").append(lon);
        sb.append(", fans=").append(fans);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append('}');
        return sb.toString();
    }
}
