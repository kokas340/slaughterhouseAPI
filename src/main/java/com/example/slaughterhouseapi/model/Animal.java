package com.example.slaughterhouseapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Animal {
    @Id
    private Long registrationNumber;
    private Date date;
    private float weight;
    private String origin;

    public Animal(Long r,Date d,float w,String o){
        this.date=d;
        this.origin=o;
        this.weight=w;
        this.weight=w;
    }

}
