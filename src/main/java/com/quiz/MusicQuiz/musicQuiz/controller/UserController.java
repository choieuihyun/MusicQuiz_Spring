package com.quiz.MusicQuiz.musicQuiz.controller;

import com.quiz.MusicQuiz.musicQuiz.data.entity.User;
import com.quiz.MusicQuiz.musicQuiz.mapper.MusicQuizUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private MusicQuizUserMapper mapper;

    public UserController(MusicQuizUserMapper mapper) {
        this.mapper = mapper;
    }

    // @PathVariable가 실제 경로 만들어주는거임. 파라미터가 경로로 변함.
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) { return mapper.getUser(id); }

    @GetMapping("/user/all")
    public List<User> getUserList() { return mapper.getUserList(); }

    @GetMapping("/user/{name}/{team}")
    public User getUserName(@PathVariable("name") String name, @PathVariable("team") String team) {
        return mapper.getUserName(name, team);
    }

    @PostMapping("/user/") // id에 auto increment를 걸어놔도 추가는 해야지, 파라미터로 해줘야지 멍청아.
    public void postUserProfile(Integer id, String name, Integer count, String team) {
        mapper.insertUser(id, name, count, team);
    }

    @PostMapping("/userTeam/")
    public void postUserTeamProfile(Integer id, String team_name, Integer teamNumber) {
        mapper.insertUserTeam(id, team_name, teamNumber);
    }

}
