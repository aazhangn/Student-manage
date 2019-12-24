package com.bruip.studentmanage.bean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Student implements Serializable {

    @ApiModelProperty(value = "学生姓名",required = true)
    private String id;

    private String name;
    private int age;
    private String sex;
    private String cla;

    public String getId() {
        return id;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cla='" + cla + '\'' +
                '}';
    }
}
