package com.example.jpa_exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static Post create(String title,String content,String author) {
        Post post = new Post();
        post.title=title;
        post.content=content;
        post.author=author;
        return post;
    }
}
