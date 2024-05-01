package com.qlpk.QLPK.controller;
import com.qlpk.QLPK.entity.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BenhNhanController {

    @Autowired
    private BenhNhanRepository benhNhanRepository;

    public BenhNhanController(BenhNhanRepository benhNhanRepository){
        super();
        this.benhNhanRepository = benhNhanRepository;
    }

    @PostMapping("/them")
    public BenhNhan createBenhNhan(@RequestBody BenhNhan benhNhan){
        return benhNhanRepository.save(benhNhan);
    }

    @GetMapping("them")
    public List<BenhNhan>getAllBenhNhan(){

        return benhNhanRepository.findAll();
    }



}
