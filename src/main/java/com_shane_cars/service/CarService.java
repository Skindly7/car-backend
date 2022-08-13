package com_shane_cars.service;

import com_shane_cars.model.Car;
import com_shane_cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    public Optional<Car> getCarDetails(int carID) {
        Optional<Car> car = carRepository.findById(carID);
        return car;
    }
}
