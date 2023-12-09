package com.quiz.MusicQuiz.musicQuiz.controller;

import com.quiz.MusicQuiz.musicQuiz.data.entity.Songs;
import com.quiz.MusicQuiz.musicQuiz.mapper.MusicQuizSongsMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsController {

    private MusicQuizSongsMapper mapper;

    public SongsController(MusicQuizSongsMapper mapper) {
        this.mapper = mapper;
    }

    // 쿼리 파라미터 버전
    @GetMapping(value = "/songs/", produces = "application/json; charset=utf-8")
    public Songs getSongs(@RequestParam("id") Integer id) {
        return mapper.getSongsById(id);
    }

}
