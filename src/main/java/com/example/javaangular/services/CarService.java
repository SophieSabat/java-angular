package com.example.javaangular.services;

import com.example.javaangular.models.Car;

import java.util.List;

public interface CarService {

    void save(Car car);

    List<Car> findAll();

    Car getOne(int id);

    void deleteOneCar(int id);
}
