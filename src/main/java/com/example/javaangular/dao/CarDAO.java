package com.example.javaangular.dao;

import com.example.javaangular.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Repository
public class CarDAO {

    private EntityManager entityManager;

    @Transactional
    public void save(Car car) {
        entityManager.persist(car);
    }

    public List<Car> findAll() {
        return entityManager.createQuery("select c from Car c", Car.class).getResultList();
    }

    public Car getOne(int id) {
        return entityManager.find(Car.class, id);
    }

    @Transactional
    public void deleteOne(int id) {
        Car findCar = entityManager.find(Car.class, id);
        entityManager.remove(findCar);
    }
}
