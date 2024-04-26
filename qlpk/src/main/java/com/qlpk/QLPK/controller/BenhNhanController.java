package com.qlpk.QLPK.controller;
import com.qlpk.QLPK.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/benhnhan")
public class BenhNhanController {
    @Autowired
    private BenhNhanService benhNhanService;
}
