package com.example.slaughterhouseapi.controllers;

import com.example.slaughterhouseapi.dtos.CreateAnimalDTO;
import com.example.slaughterhouseapi.model.Animal;
import com.example.slaughterhouseapi.services.AnimalServices;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("animals")
public class AnimalController {

    private final AnimalServices animalService;


    public AnimalController(AnimalServices animalService) {
        this.animalService = animalService;
    }

    //Ex:
    //http://localhost:8090/animals/1
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable("id") Long id){
        return animalService.findAnimalById(id);
    }
    //Ex:
    //http://localhost:8090/animals/date/2016-08-17
    @GetMapping("/date/{date}")
    public List<Animal> getAnimalByDate(@PathVariable("date") LocalDate date){
        return animalService.findAnimalByDate(date);
    }
    //Ex:
    //http://localhost:8090/animals/origin/farm
    @GetMapping("/origin/{origin}")
    public List<Animal> getAnimalByDate(@PathVariable("origin") String origin){
        return animalService.findAnimalByOrigin(origin);
    }
    //Ex:
    /*
        {
            "date":"2016-08-17",
            "weight":455.3,
            "origin":"farmr"
        }
     */
    @PostMapping("/")
    public Animal createAnimal(@RequestBody CreateAnimalDTO animal){

        Animal a = new Animal();
        a.setDate(animal.getDate());
        a.setWeight(animal.getWeight());
        a.setOrigin(animal.getOrigin());
        return animalService.saveAnimal(a);
    }
}
