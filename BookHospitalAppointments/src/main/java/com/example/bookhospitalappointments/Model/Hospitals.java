package com.example.bookhospitalappointments.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



    @Getter
    @Setter
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    public class Hospitals {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @NotBlank
        private String name;

        @NotBlank
        private String City;

        @NotBlank
        private String location;

    }


