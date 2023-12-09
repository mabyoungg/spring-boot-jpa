package com.example.likelionspringbootjpa.domain.article.articleTag.repository;

import com.example.likelionspringbootjpa.domain.article.articleTag.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleTagRepository extends JpaRepository<ArticleTag, Long> {
    List<ArticleTag> findByArticle_authorId(long authorId);
}