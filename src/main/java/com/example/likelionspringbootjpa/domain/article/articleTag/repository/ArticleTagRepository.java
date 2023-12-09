package com.example.likelionspringbootjpa.domain.article.articleTag.repository;

import com.example.likelionspringbootjpa.domain.article.articleTag.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleTagRepository extends JpaRepository<ArticleTag, Long> {
    List<ArticleTag> findByAuthorId(long authorId);

    List<ArticleTag> findByAuthor_username(String username);
}
