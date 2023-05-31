package com.example.bookhospitalappointments.ServiesHospitals;

import com.example.bookhospitalappointments.ApiException.ApiException;
import com.example.bookhospitalappointments.ApiResponseHospitals.ApiReponse;
import com.example.bookhospitalappointments.DTO.DTOHospitalsAdd;
import com.example.bookhospitalappointments.Model.Hospitals;
import com.example.bookhospitalappointments.RepositoryHospitals.HospitalsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
@AllArgsConstructor
@Service
public class HospitalsServies {

    private final HospitalsRepository hospitalsRepository;


    public List<Hospitals> getAll() {
        return hospitalsRepository.findAll();
    }

    public void add(Hospitals hospital, Errors errors) {
        if (errors.hasErrors())
            throw new ApiException(errors.getFieldError().getDefaultMessage());

        hospitalsRepository.save(hospital);


    }


    public void update(String id, Hospitals hospital, Errors errors){
        if(errors.hasErrors())
            throw new ApiException(errors.getFieldError().getDefaultMessage());

        Hospitals findHospital = hospitalsRepository.findById(id).
                orElseThrow(() -> new ApiException("id not find "));


        findHospital.setName(hospital.getName());
        findHospital.setCity(hospital.getCity());
        findHospital.setLocation(hospital.getLocation());
        hospitalsRepository.save(findHospital);
    }





    public void delete(String id){
        Hospitals hospitals = hospitalsRepository.findById(id).
                orElseThrow(() -> new ApiException("id not found"));
        hospitalsRepository.delete(hospitals);
    }
}


