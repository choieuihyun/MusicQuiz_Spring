package com.quiz.MusicQuiz.musicQuiz.mapper;

import com.quiz.MusicQuiz.musicQuiz.data.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MusicQuizUserMapper {

//    @Select("SELECT * from User WHERE id=#{id}") //파라미터와 id를 연결할 때는 $가 아니라 #로 표시해야 함.
//    User getUser(@Param("id") Integer id);

    @Select("SELECT * from User WHERE name=#{name}") //파라미터와 id를 연결할 때는 $가 아니라 #로 표시해야 함.
    User getUser(@Param("name") String name);

    @Select("SELECT * from User")
    List<User> getUserList();

    @Select("SELECT name from User WHERE team=#{team}")
    List<String> getUserListByTeam(@Param("team") String team);

    @Select("SELECT name from User WHERE name=#{name} AND team=#{team}")
    User getUserName(@Param("name") String name, @Param("team") String team);

    @Insert("INSERT INTO User VALUES(#{id}, #{name}, #{count}, #{team})")
    void insertUser(@Param("id") Integer id, @Param("name") String name, @Param("count") int count, @Param("team") String team);

    @Insert("INSERT INTO UserTeam VALUES(#{id}, #{team_name}, #{teamNumber})")
    void insertUserTeam(@Param("id") Integer id, @Param("team_name") String teamName, @Param("teamNumber") Integer teamNumber);

    @Update("UPDATE User SET count=count + 1 WHERE name=#{name} AND team=#{team}")
    void updateUser(@Param("name") String name, @Param("team") String team);

}
