package com_shane_cars.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    private String make;

    private String model;

    private String gen;

    private String releaseYearRange;

    private String bodyType;

    private int numberOfDoors;

    private String countryOfOrigin;

    private int topSpeed;

    private double zeroToSixty;

    private int horsePower;

    private double mpg;


}
