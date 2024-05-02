package com.qlpk.QLPK.doclogin.controller;

import com.qlpk.QLPK.doclogin.entity.PhieuKhamBenh;
import com.qlpk.QLPK.doclogin.repository.PhieuKhamBenhRepository;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class PhieuKhamBenhController {

    PhieuKhamBenhRepository phieuKhamBenhRepository;

    public PhieuKhamBenhController(PhieuKhamBenhRepository phieuKhamBenhRepository) {
        this.phieuKhamBenhRepository = phieuKhamBenhRepository;
    }

    @PostMapping("/phieukhambenh")
    public PhieuKhamBenh createPhieuKhamBenh(@RequestBody PhieuKhamBenh phieuKhamBenh){

        return phieuKhamBenhRepository.save(phieuKhamBenh);
    }

    @GetMapping("/phieukhambenh")
    public List<PhieuKhamBenh> getAllPhieuKhamBenh(){

        return phieuKhamBenhRepository.findAll();
    }

    @DeleteMapping("/phieukhambenh/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePhieukhambenh(@PathVariable long id) throws AttributeNotFoundException {
       PhieuKhamBenh phieuKhamBenh = phieuKhamBenhRepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("Không tìm thấy phiếu khám bệnh"));
       phieuKhamBenhRepository.delete(phieuKhamBenh);

       Map<String, Boolean> response = new HashMap<String, Boolean>();
       response.put("Đã xóa", Boolean.TRUE);

       return ResponseEntity.ok(response);
    }
}
