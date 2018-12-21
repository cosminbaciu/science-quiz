package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;

public class TesteProf implements Serializable {

    private Long Id ;
    private Long TestId ;
    private Long UserId ;
    private Double Promovability ;
    private String Grupa ;

    public TesteProf() {
    }

    public TesteProf(Long id, Long testId, Long userId, Double promovability, String grupa) {
        Id = id;
        TestId = testId;
        UserId = userId;
        Promovability = promovability;
        Grupa = grupa;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getTestId() {
        return TestId;
    }

    public void setTestId(Long testId) {
        TestId = testId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Double getPromovability() {
        return Promovability;
    }

    public void setPromovability(Double promovability) {
        Promovability = promovability;
    }

    public String getGrupa() {
        return Grupa;
    }

    public void setGrupa(String grupa) {
        Grupa = grupa;
    }
}
