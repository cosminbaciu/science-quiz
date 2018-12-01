package com.example.cosminbaciu.kahoot.network;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test implements Serializable {
    private String numeTest;
    private Integer punctajMaxim;
    private List<GrupeStudenti> listaGrupe = new ArrayList<>();
    private Integer nrIntrebari;

    public Test() {
    }

    public Test(String numeTest, Integer punctajMaxim, List<GrupeStudenti> listaGrupe, Integer nrIntrebari) {
        this.numeTest = numeTest;
        this.punctajMaxim = punctajMaxim;
        this.listaGrupe = listaGrupe;
        this.nrIntrebari = nrIntrebari;
    }

    public String getNumeTest() {
        return numeTest;
    }

    public void setNumeTest(String numeTest) {
        this.numeTest = numeTest;
    }

    public Integer getPunctajMaxim() {
        return punctajMaxim;
    }

    public void setPunctajMaxim(Integer punctajMaxim) {
        this.punctajMaxim = punctajMaxim;
    }

    public List<GrupeStudenti> getListaGrupe() {
        return listaGrupe;
    }

    public void setListaGrupe(List<GrupeStudenti> listaGrupe) {
        this.listaGrupe = listaGrupe;
    }

    public Integer getNrIntrebari() {
        return nrIntrebari;
    }

    public void setNrIntrebari(Integer nrIntrebari) {
        this.nrIntrebari = nrIntrebari;
    }


    @Override
    public String toString() {
        return "Test{" +
                "numeTest='" + numeTest + '\'' +
                ", punctajMaxim=" + punctajMaxim +
                ", listaGrupe=" + listaGrupe +
                ", nrIntrebari=" + nrIntrebari +
                '}';
    }
}
