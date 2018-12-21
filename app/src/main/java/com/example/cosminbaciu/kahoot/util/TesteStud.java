package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;

public class TesteStud implements Serializable {

    private Long Id ;
    private Long TestId ;
    private Long UserId;
    private Double Points ;
    private Boolean IsPromoted ;

    public TesteStud(Long id, Long testId, Long userId, Double points, Boolean isPromoted) {
        Id = id;
        TestId = testId;
        UserId = userId;
        Points = points;
        IsPromoted = isPromoted;
    }

    public TesteStud() {
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

    public Double getPoints() {
        return Points;
    }

    public void setPoints(Double points) {
        Points = points;
    }

    public Boolean getPromoted() {
        return IsPromoted;
    }

    public void setPromoted(Boolean promoted) {
        IsPromoted = promoted;
    }
}
