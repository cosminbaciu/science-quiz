package com.example.cosminbaciu.kahoot.util;

import java.io.Serializable;

public class Teste implements Serializable {

    private Long Id ;
    private String Name ;
    private Integer NrIntrebari ;
    private Double PunctajMaxim ;
    private Double PromoteLevel ;
    private Long IdUser ;

    public Teste() {
    }

    public Teste(Long id, String name, Integer nrIntrebari, Double punctajMaxim, Double promoteLevel, Long idUser) {
        Id = id;
        Name = name;
        NrIntrebari = nrIntrebari;
        PunctajMaxim = punctajMaxim;
        PromoteLevel = promoteLevel;
        IdUser = idUser;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getNrIntrebari() {
        return NrIntrebari;
    }

    public void setNrIntrebari(Integer nrIntrebari) {
        NrIntrebari = nrIntrebari;
    }

    public Double getPunctajMaxim() {
        return PunctajMaxim;
    }

    public void setPunctajMaxim(Double punctajMaxim) {
        PunctajMaxim = punctajMaxim;
    }

    public Double getPromoteLevel() {
        return PromoteLevel;
    }

    public void setPromoteLevel(Double promoteLevel) {
        PromoteLevel = promoteLevel;
    }

    public Long getIdUser() {
        return IdUser;
    }

    public void setIdUser(Long idUser) {
        IdUser = idUser;
    }
}
