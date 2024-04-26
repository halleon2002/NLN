package com.qlpk.QLPK.controller;
import com.qlpk.QLPK.model.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import com.qlpk.QLPK.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BenhNhanController {
    @Autowired
    private BenhNhanService benhNhanService;
    private BenhNhanRepository benhNhanRepository;

    @GetMapping("/benhnhan")
    public List<BenhNhan> getAllnBenhNhan(){
        return benhNhanRepository.findAll();
    }

}
