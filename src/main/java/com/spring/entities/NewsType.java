package com.spring.entities;

import javax.persistence.*;

@Entity
public class NewsType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NewsTypeId")
    private String newsTypeId;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "NewsTypeName")
    private String newsTypeName;

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNewsTypeName() {
        return newsTypeName;
    }

    public void setNewsTypeName(String newsTypeName) {
        this.newsTypeName = newsTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsType newsType = (NewsType) o;

        if (newsTypeId != null ? !newsTypeId.equals(newsType.newsTypeId) : newsType.newsTypeId != null) return false;
        if (description != null ? !description.equals(newsType.description) : newsType.description != null)
            return false;
        if (newsTypeName != null ? !newsTypeName.equals(newsType.newsTypeName) : newsType.newsTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsTypeId != null ? newsTypeId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (newsTypeName != null ? newsTypeName.hashCode() : 0);
        return result;
    }
}
