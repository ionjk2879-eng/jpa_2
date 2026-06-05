package com.example.jpa_exam.repository;


import com.example.jpa_exam.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    // 메서드 이름으로 쿼리 자동 생성
    List<Post> findByAuthor(String author);

    List<Post> findByTitleContaining(String keyword);

    // JPQL 직접 작성
    @Query("SELECT p FROM Post p WHERE p.title LIKE %:keyword% OR p.content LIKE %:keyword%")
    List<Post> searchByKeyword(@Param("keyword") String keyword);
}