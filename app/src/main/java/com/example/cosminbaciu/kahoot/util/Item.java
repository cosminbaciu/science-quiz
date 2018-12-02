package com.example.cosminbaciu.kahoot.util;

import java.time.LocalDate;
import java.util.Date;

public class Item {

    String nameTest;

    Date dateTest;


    public Item(String nametest, Date date) {
        nameTest = nametest;
        dateTest = date;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }
}
