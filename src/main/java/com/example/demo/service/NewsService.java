package com.example.demo.service;

import com.example.demo.entity.News;

import java.util.List;

public interface NewsService {
    public List<News> getAllNews();

    public News createNews(News news);
}
