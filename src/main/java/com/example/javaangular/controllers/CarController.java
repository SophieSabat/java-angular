package com.example.javaangular.controllers;

import com.example.javaangular.models.Car;
import com.example.javaangular.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cars")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    private CarService carService;

    @PostMapping("/save")
    public void save(@RequestBody Car car) {
        carService.save(car);
    }

    @GetMapping("")
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteOneCar(id);
    }
}
