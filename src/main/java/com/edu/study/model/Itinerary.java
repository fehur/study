package com.edu.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.edu.study.model.Constants.Table;
import static com.edu.study.model.Constants.Field.Itinerary.*;

/**
 * Created by liyihan on 2017/3/6.
 */
@Entity(name = Table.ITINERARY)
@Deprecated
public class Itinerary {

    @Id
    @GeneratedValue
    @Column(name = ITINERARY_ID)
    private long id;
    @Column(name = ITINERARY_TYPE)
    private String type;
    @Column(name = ITINERARY_NAME)
    private String name;
    @Column(name = ITINERARY_DAY)
    private String day;
    @Column(name = ITINERARY_CONTENT)
    private String content;
    @Column(name = ITINERARY_CTIME)
    private String ctime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Itinerary{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", day=").append(day);
        sb.append(", content=").append(content);
        sb.append(", ctime=").append(ctime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Itinerary)) return false;

        Itinerary itinerary = (Itinerary) o;

        if (id != itinerary.id) return false;
        if (type != null ? !type.equals(itinerary.type) : itinerary.type != null) return false;
        if (name != null ? !name.equals(itinerary.name) : itinerary.name != null) return false;
        if (day != null ? !day.equals(itinerary.day) : itinerary.day != null) return false;
        if (content != null ? !content.equals(itinerary.content) : itinerary.content != null) return false;
        return ctime != null ? ctime.equals(itinerary.ctime) : itinerary.ctime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        return result;
    }
}
