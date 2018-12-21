package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;

public class Intrebari implements Serializable {

   private Long Id ;
   private Long IdTest;
   private String IntrebareText;
   private Double Points;

    public Intrebari() {
    }

    public Intrebari(Long id, Long idTest, String intrebareText, Double points) {
        Id = id;
        IdTest = idTest;
        IntrebareText = intrebareText;
        Points = points;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getIdTest() {
        return IdTest;
    }

    public void setIdTest(Long idTest) {
        IdTest = idTest;
    }

    public String getIntrebareText() {
        return IntrebareText;
    }

    public void setIntrebareText(String intrebareText) {
        IntrebareText = intrebareText;
    }

    public Double getPoints() {
        return Points;
    }

    public void setPoints(Double points) {
        Points = points;
    }
}
