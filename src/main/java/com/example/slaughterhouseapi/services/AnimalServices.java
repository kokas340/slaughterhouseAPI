package com.example.slaughterhouseapi.services;

import com.example.slaughterhouseapi.model.Animal;
import com.example.slaughterhouseapi.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AnimalServices implements AnimalServicesInterface{

    private final AnimalRepository animalRepository;

    public AnimalServices(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Animal> findAnimalById(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}
