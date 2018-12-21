package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {

    private Long Id;
    private Integer TestId ;
    private Integer From;
    private Integer To;
    private Date LocalDate;

    public Feedback() {
    }

    public Feedback(Long id, Integer testId, Integer from, Integer to, Date localDate) {
        Id = id;
        TestId = testId;
        From = from;
        To = to;
        LocalDate = localDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getTestId() {
        return TestId;
    }

    public void setTestId(Integer testId) {
        TestId = testId;
    }

    public Integer getFrom() {
        return From;
    }

    public void setFrom(Integer from) {
        From = from;
    }

    public Integer getTo() {
        return To;
    }

    public void setTo(Integer to) {
        To = to;
    }

    public Date getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(Date localDate) {
        LocalDate = localDate;
    }
}
