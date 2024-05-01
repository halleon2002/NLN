package com.qlpk.QLPK.doclogin.controller;

import com.qlpk.QLPK.doclogin.entity.Thuoc;
import com.qlpk.QLPK.doclogin.repository.ThuocRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class ThuocController {

    ThuocRepository thuocRepository;

    public ThuocController(ThuocRepository thuocRepository) {
        super();
        this.thuocRepository = thuocRepository;

    }

    @PostMapping("them")
    public Thuoc createThuoc(@RequestBody Thuoc thuoc){

        return thuocRepository.save(thuoc);
    }

    @GetMapping("them")
    public List<Thuoc> getAllThuoc(){

        return thuocRepository.findAll();
    }

}
