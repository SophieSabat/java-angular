package com.example.javaangular.services.implementation;

import com.example.javaangular.dao.CarDAO;
import com.example.javaangular.models.Car;
import com.example.javaangular.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CarServiceImplementation implements CarService {

    private CarDAO carDAO;

    @Override
    public void save(Car car) {
        if (car != null) {
            carDAO.save(car);
        }
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }

    @Override
    public Car getOne(int id) {
        return carDAO.findAll().get(id);
    }

    @Override
    public void deleteOneCar(int id) {
        carDAO.deleteOne(id);
    }
}
