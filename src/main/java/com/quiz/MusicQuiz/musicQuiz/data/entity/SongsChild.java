package com.quiz.MusicQuiz.musicQuiz.data.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class SongsChild {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String question1;

    private String question2;

    private String question3;

    private String question4;

    private String question5;

    public SongsChild(Integer id,
                      String title,
                      String question1,
                      String question2,
                      String question3,
                      String question4,
                      String question5) {
        super();

        this.id = id;
        this.title = title;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public String getQuestion5() {
        return question5;
    }



}
