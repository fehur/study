package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.edu.study.model.Constants.*;

/**
 * 用户表
 *
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.USER)
public class User {

    @Id
    @GeneratedValue
    @Column(name = Field.USER_ID)
    private long id; //编号
    @Column(name = Field.USER_NAME)
    private String name; //姓名
    @Column(name = Field.USER_EMAIL)
    private String email; //email
    @Column(name = Field.USER_PWD)
    private String password; //密码
    @Column(name = Field.USER_GENDER)
    private Gender gender; //性别
    @Column(name = Field.USER_PROVINCE)
    private String province; //省
    @Column(name = Field.USER_CITY)
    private String city; //市
    @Column(name = Field.USER_BIRTHDAY)
    private long birthday; //生日
    @Column(name = Field.USER_IMAGE)
    private String image; //头像
    @Column(name = Field.USER_NICKNAME)
    private String nickname; //昵称
    @Column(name = Field.USER_OPENID)
    private String openid; //openid
    @Column(name = Field.USER_CTIME)
    private long ctime; //注册时间
    @Column(name = Field.USER_LMTIME)
    private long lmtime;
    @Column(name = Field.USER_LAN)
    private long lan; //经度
    @Column(name = Field.USER_LON)
    private long lon; //纬度

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

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
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

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public long getLmtime() {
        return lmtime;
    }

    public void setLmtime(long lmtime) {
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
        sb.append('}');
        return sb.toString();
    }
}
