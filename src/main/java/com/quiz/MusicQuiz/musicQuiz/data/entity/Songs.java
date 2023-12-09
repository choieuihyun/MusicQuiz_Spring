package com.quiz.MusicQuiz.musicQuiz.data.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Songs {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String artist;

    private String titleKr;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitleKr() {
        return titleKr;
    }

}
