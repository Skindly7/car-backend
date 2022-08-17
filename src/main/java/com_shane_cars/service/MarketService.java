package com_shane_cars.service;

import com_shane_cars.model.Car;
import com_shane_cars.model.CarStock;
import com_shane_cars.repository.CarRepository;
import com_shane_cars.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketService {

    @Autowired
    private MarketRepository marketRepository;

    @Autowired
    private CarRepository carRepository;


    public List<CarStock> getMarketDetailsOfCarByID(int carID) {

        Optional<Car> car = carRepository.findById(carID);

        List<CarStock> cars = marketRepository.findAllByCarId(car);
        return cars;
    }
}