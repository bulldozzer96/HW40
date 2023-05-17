package com.ua.rd.HW40.rest;

import com.ua.rd.HW40.domain.City;
import com.ua.rd.HW40.dto.CityDto;
import com.ua.rd.HW40.service.CityService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor


public class CityController {
    private final CityService cityService;

    @GetMapping("/cities")
    public ResponseEntity<List<CityDto>> findAll() {
        return ResponseEntity.ok(cityService.findAll());
    }

    @PostMapping("/cities")
    public ResponseEntity<Void> save(@RequestBody City city) {
        cityService.save(city);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



    @DeleteMapping("/cities/{id}")
    public void deleteById(@PathVariable Long id) {

    }


}
