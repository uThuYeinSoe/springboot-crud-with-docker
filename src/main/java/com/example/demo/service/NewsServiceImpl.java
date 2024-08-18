package com.example.demo.service;

import com.example.demo.dao.NewsDAO;
import com.example.demo.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{
    private NewsDAO newsDAO;

    @Autowired
    public NewsServiceImpl(NewsDAO newsDAO){
        this.newsDAO = newsDAO;
    }

    @Override
    public List<News> getAllNews() {
        List<News> newsList = newsDAO.getAllNews();
        return newsList;
    }

    @Transactional
    @Override
    public News createNews(News news) {
        News newsObj = new News();
        newsObj.setId(0);
        newsObj.setAuthor(news.getAuthor());
        newsObj.setBlog(news.getBlog());
        newsObj.setTitle(news.getTitle());

        News returnNews =newsDAO.createNews(newsObj);
        return returnNews;
    }
}
