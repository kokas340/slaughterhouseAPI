package com.example.slaughterhouseapi.services;

import com.example.slaughterhouseapi.model.Animal;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface AnimalServicesInterface {
    Optional<Animal> findAnimalById(Long id);
    Animal saveAnimal(Animal animal);

    List<Animal> findAnimalByDate(LocalDate date);

    List<Animal> findAnimalByOrigin(String origin);
}
