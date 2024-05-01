package com.qlpk.QLPK.doclogin.controller;

import com.qlpk.QLPK.doclogin.entity.PhieuKhamBenh;
import com.qlpk.QLPK.doclogin.repository.PhieuKhamBenhRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class PhieuKhamBenhController {
    PhieuKhamBenhRepository phieuKhamBenhRepository;

    public PhieuKhamBenhController(PhieuKhamBenhRepository phieuKhamBenhRepository) {
        this.phieuKhamBenhRepository = phieuKhamBenhRepository;
    }

    @PostMapping("/them")
    public PhieuKhamBenh createPhieuKhamBenh(@RequestBody PhieuKhamBenh phieuKhamBenh){

        return phieuKhamBenhRepository.save(phieuKhamBenh);
    }

    @GetMapping("them")
    public List<PhieuKhamBenh> getAllPhieuKhamBenh(){

        return phieuKhamBenhRepository.findAll();
    }
}
