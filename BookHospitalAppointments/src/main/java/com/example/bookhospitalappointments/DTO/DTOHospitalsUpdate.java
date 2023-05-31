package com.example.bookhospitalappointments.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTOHospitalsUpdate {


    @NotEmpty(message = "name must be not empty")
    private String name;
    @NotEmpty(message = "city must be not empty")
    private String city;
    @NotNull(message = "location must be not emptyl")
    private String location;
}
