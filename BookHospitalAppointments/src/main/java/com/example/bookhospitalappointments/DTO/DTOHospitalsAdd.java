package com.example.bookhospitalappointments.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTOHospitalsAdd {




        @NotEmpty(message = "hospitals_id must be not null")
        private Integer hospitals_id;
        @NotEmpty(message = "name must be not empty")
        private String name;
        @NotEmpty(message = "city must be not empty")
        private String city;
        @NotEmpty(message = "location must not empty")
        private String location;

    }

