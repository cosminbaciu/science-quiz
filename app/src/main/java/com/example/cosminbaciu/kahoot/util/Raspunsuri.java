package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;

public class Raspunsuri implements Serializable {

    private Long Id;
    private Long IdQuestion;
    private String RaspunsText = "TEXT";
    private Boolean IsCorrect;

    public Raspunsuri() {
    }

    public Raspunsuri(Long id, Long idQuestion, String raspunsText, Boolean isCorrect) {
        Id = id;
        IdQuestion = idQuestion;
        RaspunsText = raspunsText;
        IsCorrect = isCorrect;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getIdQuestion() {
        return IdQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        IdQuestion = idQuestion;
    }

    public String getRaspunsText() {
        return RaspunsText;
    }

    public void setRaspunsText(String raspunsText) {
        RaspunsText = raspunsText;
    }

    public Boolean getCorrect() {
        return IsCorrect;
    }

    public void setCorrect(Boolean correct) {
        IsCorrect = correct;
    }
}
