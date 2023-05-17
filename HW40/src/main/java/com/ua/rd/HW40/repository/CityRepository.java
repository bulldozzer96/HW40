package com.ua.rd.HW40.repository;

import com.ua.rd.HW40.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository

public interface CityRepository extends JpaRepository<City, Long> {

//    Optional<City> findCityByName(String name);


}
