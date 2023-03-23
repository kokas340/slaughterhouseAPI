package com.example.slaughterhouseapi.controllers;

import com.example.slaughterhouseapi.dtos.CreateAnimalDTO;
import com.example.slaughterhouseapi.model.Animal;
import com.example.slaughterhouseapi.services.AnimalServices;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("animals")
public class AnimalController {

    private final AnimalServices animalService;


    public AnimalController(AnimalServices animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable("id") Long id){
        return animalService.findAnimalById(id);
    }

    @PostMapping("")
    public Animal createAnimal(@RequestBody CreateAnimalDTO animal){
        Animal a = new Animal();
        a.setDate(animal.getDate());
        a.setWeight(animal.getWeight());
        a.setOrigin(animal.getOrigin());
        return animalService.saveAnimal(a);
    }
}
