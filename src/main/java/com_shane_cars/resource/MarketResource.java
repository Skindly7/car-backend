package com_shane_cars.resource;

import com_shane_cars.service.MarketService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketResource {

    @Autowired
    private MarketService marketService;

    @GetMapping("/market/{carID}")
    public String getMarketCarData(@PathVariable int carID){
        JSONArray carsData = new JSONArray(marketService.getMarketDetailsOfCarByID(carID));
        return carsData.toString();
    }
}
