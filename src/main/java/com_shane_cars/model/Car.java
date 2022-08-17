package com_shane_cars.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
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

    private int releaseYear;

    private String gen;

    private int topSpeed;

    private double zeroToSixty;

    private int horsePower;

    private double mpg;

    public Car(Integer id, String make, String model, String engineSize, String bodyType, String fuelType,
               Integer numberOfDoors, String transmission, int releaseYear, String gen, int topSpeed,
               double zeroToSixty, int horsePower, double mpg) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.engineSize = engineSize;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.transmission = transmission;
        this.releaseYear = releaseYear;
        this.gen = gen;
        this.topSpeed = topSpeed;
        this.zeroToSixty = zeroToSixty;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }

}
