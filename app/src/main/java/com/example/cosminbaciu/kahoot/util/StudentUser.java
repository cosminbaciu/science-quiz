package com.example.cosminbaciu.kahoot.util;

import android.content.Intent;

import java.io.Serializable;

public class StudentUser implements Serializable {
    private Long StudId;
    private Long UserId;
    private Integer Grupa;
    private String Seria;


    public StudentUser(Long studId, Long userId, Integer grupa,String seria) {
        StudId = studId;
        UserId = userId;
        Grupa = grupa;
        Seria=seria;
       }

    public StudentUser() {
    }


    public Integer getGrupa() {
        return Grupa;
    }

    public void setGrupa(Integer grupa) {
        Grupa = grupa;
    }

    public Long getStudId() {
        return StudId;
    }

    public void setStudId(Long studId) {
        StudId = studId;
    }

    public String getSeria() {
        return Seria;
    }

    public void setSeria(String seria) {
        Seria = seria;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
