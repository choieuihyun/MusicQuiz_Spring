package com.quiz.MusicQuiz.musicQuiz.mapper;

import com.quiz.MusicQuiz.musicQuiz.data.entity.SongsChild;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MusicQuizSongsChildMapper {

    @Select("SELECT * FROM SongsChild WHERE ChildID=#{id}")
    SongsChild getSongsChildById(@Param("id") Integer id);


}
