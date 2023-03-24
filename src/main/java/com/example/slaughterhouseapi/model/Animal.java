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
    private Long registration_number;
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

    public long getRegistrationNumber(){
        return registration_number;
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


    public void setRegistrationNumber(long registrationNumber) {
        this.registration_number = registrationNumber;
    }

    public String toString() {
        return "Animal{" +
                "registrationNumber=" + registration_number +
                ", date=" + date +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
