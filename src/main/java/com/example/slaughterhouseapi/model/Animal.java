package com.example.slaughterhouseapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private float weight;
    private String origin;

    public Animal() {

    }
    public Animal(LocalDate date, float weight, String origin){
        this.date = date;
        this.weight = weight;
        this.origin = origin;
    }

    public long getId(){
        return id;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return origin;
    }


    public void setId(long id) {
        this.id = id;
    }


}
