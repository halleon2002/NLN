package com.qlpk.QLPK.controller;
import com.qlpk.QLPK.model.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import com.qlpk.QLPK.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;

@RestController
@RequestMapping("/api/v1/")
public class BenhNhanController {
    @Autowired
    private BenhNhanService benhNhanService;

    public BenhNhanController(BenhNhanService benhNhanService) {
        super();
        this.benhNhanService = benhNhanService;
    }

    @GetMapping("/benhnhan")
    public String listnBenhNhan(Model model){
        model.addAttribute("benhnhan", benhNhanService.getAllnBenhNhan());
        return "benhnhan";
    }

}
