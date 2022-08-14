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


}
