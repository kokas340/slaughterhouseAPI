package com.example.slaughterhouseapi.services;

import com.example.slaughterhouseapi.model.Animal;
import com.example.slaughterhouseapi.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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

    @Override
    public List<Animal> findAnimalByDate(LocalDate date) {
        return animalRepository.findByDate(date);
    }

    @Override
    public List<Animal> findAnimalByOrigin(String origin) {
        return animalRepository.findByOrigin(origin);
    }
}
