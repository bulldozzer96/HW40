package com.ua.rd.HW40.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryDto {
    private Long id;
    private String name;
    private List<String> city;
}
