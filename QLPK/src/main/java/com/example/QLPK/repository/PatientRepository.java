package com.example.QLPK.repository;

import com.example.QLPK.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can add custom query methods here if needed
}