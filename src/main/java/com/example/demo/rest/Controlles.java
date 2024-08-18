package com.example.demo.rest;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class Controlles {

    private NewsService newsService;

    @Autowired
    public Controlles(NewsService newsService){
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public List<News> getAllNews(){
        List<News> allNews =newsService.getAllNews();
        System.out.println("Hello World");
        return allNews;
    }

    @PostMapping("/news")
    public News createNews(@RequestBody News news){
        System.out.println("Hello World");
        News returnNews = newsService.createNews(news);
        return returnNews;
    }

}
