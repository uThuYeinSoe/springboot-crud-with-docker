package com.example.demo.dao;

import com.example.demo.entity.News;

import java.util.List;

public interface NewsDAO {
    public List<News> getAllNews();
    public News createNews(News news);
}
