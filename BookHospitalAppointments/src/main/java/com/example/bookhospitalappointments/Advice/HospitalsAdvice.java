package com.example.bookhospitalappointments.Advice;

import com.example.bookhospitalappointments.ApiException.ApiException;
import com.example.bookhospitalappointments.ApiResponseHospitals.ApiReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HospitalsAdvice {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiReponse> handlerApiException(ApiException e){

        ApiReponse error= new ApiReponse(e.getMessage(), HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
    }

}
