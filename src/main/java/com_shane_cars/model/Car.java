package com_shane_cars.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    private String make;

    private String model;

    private String engineSize;

    private String bodyType;

    private String fuelType;

    private Integer numberOfDoors;

    private String transmission;

    private int year;

    private String gen;

    private int topSpeed;

    private double zeroToSixty;

    private int horsePower;

    private double mpg;


    protected Car(){
        // no args constructor
    }

    public Car(Integer id, String make, String model, String engineSize, String bodyType, String fuelType,
               Integer numberOfDoors, String transmission, int year, String gen, int topSpeed,
               double zeroToSixty, int horsePower, double mpg) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.transmission = transmission;
        this.year = year;
        this.gen = gen;
        this.topSpeed = topSpeed;
        this.zeroToSixty = zeroToSixty;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getZeroToSixty() {
        return zeroToSixty;
    }

    public void setZeroToSixty(double zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
}
