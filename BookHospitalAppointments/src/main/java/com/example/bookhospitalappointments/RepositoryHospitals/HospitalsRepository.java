package com.example.bookhospitalappointments.RepositoryHospitals;

import com.example.bookhospitalappointments.Model.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository


    public interface HospitalsRepository extends JpaRepository<Hospitals, String> {
    }

