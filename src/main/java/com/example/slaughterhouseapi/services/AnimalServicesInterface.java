package com.example.slaughterhouseapi.services;

import com.example.slaughterhouseapi.model.Animal;



import java.util.Optional;


public interface AnimalServicesInterface {
    Optional<Animal> findAnimalById(Long id);
    Animal saveAnimal(Animal animal);
}
