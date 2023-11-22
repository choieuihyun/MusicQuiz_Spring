package com.quiz.MusicQuiz.musicQuiz.controller;

import com.quiz.MusicQuiz.musicQuiz.data.entity.SongsChild;
import com.quiz.MusicQuiz.musicQuiz.mapper.MusicQuizSongsChildMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongsChildController {

    private MusicQuizSongsChildMapper mapper;

    public SongsChildController(MusicQuizSongsChildMapper mapper) {
        this.mapper = mapper;
    }

    // 경로 변수 버전 --> 이건 안드로이드에서 내가 인터셉터로 알아서 해야함.
//    @GetMapping(value = "/songsChild/{id}", produces = "application/json; charset=utf-8") // 이거 안해주면 한글 깨져요
//    public List<SongsChild> getSongsChildList(@PathVariable("id") Integer id) {
//        return mapper.getSongsChildByTitle(id);
//    }

    // 쿼리 파라미터 버전
    @GetMapping(value = "/songsChild/", produces = "application/json; charset=utf-8")
    public SongsChild getSongsChild(@RequestParam("id") Integer id) {
        return mapper.getSongsChildById(id);
    }

}
