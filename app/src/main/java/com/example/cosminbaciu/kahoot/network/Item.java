package com.example.cosminbaciu.kahoot.network;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
    private List<Test> listaTeste;

    public Item(List<Test> listaTeste) {
        this.listaTeste = listaTeste;
    }

    public Item() {
    }

    public List<Test> getListaTeste() {
        return listaTeste;
    }

    public void setListaTeste(List<Test> listaTeste) {
        this.listaTeste = listaTeste;
    }
}
