package com.ua.rd.HW40.service;


import com.ua.rd.HW40.domain.City;
import com.ua.rd.HW40.domain.Country;
import com.ua.rd.HW40.dto.CountryDto;
import com.ua.rd.HW40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class CountryService {


    private final CountryRepository countryRepository;

    public void save(Country country) {
        countryRepository.save(country);
    }

    public List<CountryDto> findAll() {
        return countryRepository.findAll()
                .stream()
                .map(CountryService::buildCountryDto)
                .collect(Collectors.toList());
    }

    private static CountryDto buildCountryDto(Country country) {
        return CountryDto.builder()
                .id(country.getId())
                .name(country.getName())
                .city(country.getCity().stream().map(City::getName).collect(Collectors.toList()))
                .build();

    }

}
