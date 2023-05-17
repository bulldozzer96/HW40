package com.ua.rd.HW40.rest;



import com.ua.rd.HW40.domain.Country;
import com.ua.rd.HW40.dto.CountryDto;
import com.ua.rd.HW40.service.CountryService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor

public class CountryController {
    private final CountryService countryService;

    @GetMapping("/countries")
    public List<CountryDto> findAll() {
        return countryService.findAll();
    }

    @PostMapping("/countries")
    public void save(@RequestBody Country country) {
        countryService.save(country);
    }

}
