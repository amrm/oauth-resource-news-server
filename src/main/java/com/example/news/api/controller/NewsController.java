package com.example.news.api.controller;

import com.example.news.api.dto.News;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api")
public class NewsController {

    @GetMapping("/news")
    public ResponseEntity<?> getNews(){
        List<News> news=new ArrayList<>();
        News n=new News(1L,"title 1"," this is topic 1");
        news.add(n);
        n=new News(2L,"title 2"," this is topic 2");
        news.add(n);

       return new ResponseEntity<List>(news, OK);
    }

}
