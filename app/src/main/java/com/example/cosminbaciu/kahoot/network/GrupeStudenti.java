package com.example.cosminbaciu.kahoot.network;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GrupeStudenti implements Serializable {
    private List<Student> listaStudenti = new ArrayList<>();
    private Integer procentPromovati;
    private int an;
    private String specializare;
    private Integer numeGrupa;

    public GrupeStudenti() {
    }

    public GrupeStudenti(List<Student> listaStudenti, Integer procentPromovati, int an, String specializare, Integer numeGrupa) {
        this.listaStudenti = listaStudenti;
        this.procentPromovati = procentPromovati;
        this.an = an;
        this.specializare = specializare;
        this.numeGrupa = numeGrupa;
    }

    public List<Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public Integer getProcentPromovati() {
        return procentPromovati;
    }

    public void setProcentPromovati(Integer procentPromovati) {
        this.procentPromovati = procentPromovati;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public Integer getNumeGrupa() {
        return numeGrupa;
    }

    public void setNumeGrupa(Integer numeGrupa) {
        this.numeGrupa = numeGrupa;
    }

    @Override
    public String toString() {
        return "GrupeStudenti{" +
                "listaStudenti=" + listaStudenti +
                ", procentPromovati=" + procentPromovati +
                ", an=" + an +
                ", specializare='" + specializare + '\'' +
                ", numeGrupa=" + numeGrupa +
                '}';
    }
}
