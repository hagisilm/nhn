package com.nhnacademy.student.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Student implements Serializable {
    //아이디
    private  String id;
    //이름
    private  String name;
    //성별
    private Gender gender;
    //나이
    private  int age;
    //생성일
    private LocalDateTime createdAt;

// ... java beans 특징을 고려하여 작성합니다.
    public Student(){
        this.createdAt = LocalDateTime.now();
    }

    public Student(String id, String name, Gender gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


}