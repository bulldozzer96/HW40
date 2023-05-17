package com.ua.rd.HW40.service;


import com.ua.rd.HW40.domain.City;

import com.ua.rd.HW40.dto.CityDto;
import com.ua.rd.HW40.repository.CountryRepository;
import com.ua.rd.HW40.repository.CityRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service

@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public List<CityDto> findAll() {
        return cityRepository.findAll().stream()
                .map(CityService::buildCityDto)
                        .collect(Collectors.toList());
    }

    public void save(City city) {
        cityRepository.save(city);
    }


    private static CityDto buildCityDto(City city) {

        return CityDto.builder()
                .name(city.getName())
                .district(city.getDistrict())
                .build();
    }




}
