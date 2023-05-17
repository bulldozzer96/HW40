package com.ua.rd.HW40.dto;
import com.ua.rd.HW40.domain.Country;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class CityDto {

    private String name;
    private String district;


}
