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
public class CarStock {

    @Id
    @GeneratedValue
    private Integer id;

    private double price;

    private int releaseYear;

    private String engineSize;

    private String fuelType;

    private String transmission;

    private String colour;

    private int mileage;

    private String description;

    @ManyToOne()
    @JoinColumn(name="CAR_ID", referencedColumnName="id", nullable = true)
    private Car carId;
}
