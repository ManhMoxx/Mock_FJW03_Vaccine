package com.spring.entities;

import javax.persistence.*;

@Entity
public class News {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NewsId")
    private String newsId;
    @Basic
    @Column(name = "Content")
    private String content;
    @Basic
    @Column(name = "Preview")
    private String preview;
    @Basic
    @Column(name = "Title")
    private String title;
    @Basic
    @Column(name = "NewsTypeId")
    private String newsTypeId;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (newsId != null ? !newsId.equals(news.newsId) : news.newsId != null) return false;
        if (content != null ? !content.equals(news.content) : news.content != null) return false;
        if (preview != null ? !preview.equals(news.preview) : news.preview != null) return false;
        if (title != null ? !title.equals(news.title) : news.title != null) return false;
        if (newsTypeId != null ? !newsTypeId.equals(news.newsTypeId) : news.newsTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsId != null ? newsId.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (preview != null ? preview.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (newsTypeId != null ? newsTypeId.hashCode() : 0);
        return result;
    }
}
