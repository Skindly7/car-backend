package com_shane_cars.resource;

import com_shane_cars.model.Car;
import com_shane_cars.service.CarService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HomeResource {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getHomePageData(){

        JSONArray carData = new JSONArray(carService.getAllCars());
        return carData.toString();
    }

    @GetMapping("/cars/{carID}")
    public Optional<Car> getcarDetailsData(@PathVariable int carID){
        Optional<Car> carData = carService.getCarDetails(carID);
        return carData;
    }
}
