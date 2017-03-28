package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.edu.study.model.Constants.*;

/**
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.USER)
public class User {

    @Id
    @GeneratedValue
    @Column(name = Field.USER_ID)
    private long id;
    @Column(name = Field.USER_NAME)
    private String name;
    @Column(name = Field.USER_EMAIL)
    private String email;
    @Column(name = Field.USER_PWD)
    private String password;
    @Column(name = Field.USER_GENDER)
    private Gender gender;
    @Column(name = Field.USER_PROVINCE)
    private String province;
    @Column(name = Field.USER_CITY)
    private String city;
    @Column(name = Field.USER_BIRTHDAY)
    private long birthday;
    @Column(name = Field.USER_IMAGE)
    private String image;
    @Column(name = Field.USER_NICKNAME)
    private String nickname;
    @Column(name = Field.USER_OPENID)
    private String openid;
    @Column(name = Field.USER_CTIME)
    private long ctime;
    @Column(name = Field.USER_LAN)
    private long lan;
    @Column(name = Field.USER_LON)
    private long lon;

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
        sb.append(", lan=").append(lan);
        sb.append(", lon=").append(lon);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (birthday != user.birthday) return false;
        if (ctime != user.ctime) return false;
        if (lan != user.lan) return false;
        if (lon != user.lon) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (gender != user.gender) return false;
        if (province != null ? !province.equals(user.province) : user.province != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        if (image != null ? !image.equals(user.image) : user.image != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        return openid != null ? openid.equals(user.openid) : user.openid == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (int) (birthday ^ (birthday >>> 32));
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (int) (ctime ^ (ctime >>> 32));
        result = 31 * result + (int) (lan ^ (lan >>> 32));
        result = 31 * result + (int) (lon ^ (lon >>> 32));
        return result;
    }
}
