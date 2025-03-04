package com.nhnacademy.jdbc.student.repository.impl;

import com.nhnacademy.jdbc.student.domain.Student;
import com.nhnacademy.jdbc.student.repository.StudentRepository;
import com.nhnacademy.jdbc.util.DbUtils;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

@Slf4j
public class StatementStudentRepository implements StudentRepository {


    @Override
    public int save(Student student){
        //todo#1 insert student
        Connection connection = DbUtils.getConnection();
        String sql = null;
        try {
            Statement statement = connection.createStatement();
            sql = "Insert into jdbc_students(id,name,gender,age) values (";
            sql += student.getId();
            sql += student.getName();
            sql += student.getGender();
            sql += student.getAge();
            sql += ")";

            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public Optional<Student> findById(String id){
        //todo#2 student 조회

        return Optional.empty();
    }

    @Override
    public int update(Student student){
        //todo#3 student 수정, name <- 수정합니다.

        return 0;
    }

    @Override
    public int deleteById(String id){
       //todo#4 student 삭제

        return 0;
    }

}
