package com.ilearn.bean;

import javax.persistence.*;

/**
 * Created by sl on 16-4-2.
 */
@Entity
@Table(name = "ilearn_res", schema = "", catalog = "db_ilearn")
public class ResourcesEntity {
    private int rid;
    private String classify1;
    private String title1;
    private String url1;
    private String imgurl1;

    @Id
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "classify1")
    public String getClassify() {
        return classify1;
    }

    public void setClassify(String classify) {
        this.classify1 = classify;
    }

    @Basic
    @Column(name = "title1")
    public String getTitle() {
        return title1;
    }

    public void setTitle(String title) {
        this.title1 = title;
    }

    @Basic
    @Column(name = "url1")
    public String getUrl() {
        return url1;
    }

    public void setUrl(String url) {
        this.url1 = url;
    }

    @Basic
    @Column(name = "imgurl1")
    public String getImgurl() {
        return imgurl1;
    }

    public void setImgurl(String imgurl) {
        this.imgurl1 = imgurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourcesEntity that = (ResourcesEntity) o;

        if (rid != that.rid) return false;
        if (classify1 != null ? !classify1.equals(that.classify1) : that.classify1 != null) return false;
        if (title1 != null ? !title1.equals(that.title1) : that.title1 != null) return false;
        if (url1 != null ? !url1.equals(that.url1) : that.url1 != null) return false;
        if (imgurl1 != null ? !imgurl1.equals(that.imgurl1) : that.imgurl1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (classify1 != null ? classify1.hashCode() : 0);
        result = 31 * result + (title1 != null ? title1.hashCode() : 0);
        result = 31 * result + (url1 != null ? url1.hashCode() : 0);
        result = 31 * result + (imgurl1 != null ? imgurl1.hashCode() : 0);
        return result;
    }
}
