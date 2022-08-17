package com_shane_cars.repository;


import com_shane_cars.model.CarStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarketRepository extends JpaRepository<CarStock, Integer> {

    List<CarStock> findAllByCarId(Optional<CarStock> carId);
}
