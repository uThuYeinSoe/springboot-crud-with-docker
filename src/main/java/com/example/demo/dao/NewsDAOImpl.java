package com.example.demo.dao;

import com.example.demo.entity.News;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsDAOImpl implements NewsDAO{
    private EntityManager entityManager;

    @Autowired
    public NewsDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<News> getAllNews() {
        TypedQuery<News> theQuery = entityManager.createQuery("FROM News",News.class);
        return theQuery.getResultList();
    }

    @Override
    public News createNews(News news) {
        News returnNews = entityManager.merge(news);
        return returnNews;
    }
}