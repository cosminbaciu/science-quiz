package com.example.cosminbaciu.kahoot.network;

import java.io.Serializable;

public class Student implements Serializable {
    private String nume;
    private Double notaTest;
    private String feedback;

    public Student() {
    }

    public Student(String nume, Double notaTest, String feedback) {
        this.nume = nume;
        this.notaTest = notaTest;
        this.feedback = feedback;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Double getNotaTest() {
        return notaTest;
    }

    public void setNotaTest(Double notaTest) {
        this.notaTest = notaTest;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", notaTest=" + notaTest +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
