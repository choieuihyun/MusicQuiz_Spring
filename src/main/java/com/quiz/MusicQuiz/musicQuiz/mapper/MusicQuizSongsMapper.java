package com.quiz.MusicQuiz.musicQuiz.mapper;

import com.quiz.MusicQuiz.musicQuiz.data.entity.Songs;
import com.quiz.MusicQuiz.musicQuiz.data.entity.SongsChild;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MusicQuizSongsMapper {

    @Select("SELECT * FROM Songs WHERE SongID=#{id}")
    Songs getSongsById(@Param("id") Integer id);

}
