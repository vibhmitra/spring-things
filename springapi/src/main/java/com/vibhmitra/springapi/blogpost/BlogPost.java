package com.vibhmitra.springapi.blogpost;

import java.time.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class BlogPost {

    @Id
    @SequenceGenerator(name = "blogPost_sequence", sequenceName = "blogPost_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blogPost_sequence")
    private Long id;
    private String title;
    private String author;
    private LocalDate pubDate;
    private Integer postNum;

    public BlogPost() {
    }

    public BlogPost(
            Long id,
            String title,
            String author,
            LocalDate pubDate,
            int postNum) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.postNum = postNum;
    }

    public BlogPost(
            String title,
            String author,
            LocalDate pubDate,
            int postNum) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.postNum = postNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    @Override
    public String toString() {
        return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", pubDate=" + pubDate + ", postNum="
                + postNum + "]";
    }
}
