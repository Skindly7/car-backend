package com_shane_cars.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CarStock {

    @Id
    @GeneratedValue
    private Integer id;

    private double price;

    private String colour;

    private int mileage;

    private String description;

    @ManyToOne()
    @JoinColumn(name="CAR_ID", referencedColumnName="id", nullable = true)
    private Car carId;


    public CarStock(Integer id, double price, String colour, int mileage, String description, Car carId) {
        this.id = id;
        this.price = price;
        this.colour = colour;
        this.mileage = mileage;
        this.description = description;
        this.carId = carId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car getCarId() {
        return carId;
    }

    public void setCarId(Car carId) {
        this.carId = carId;
    }
}
