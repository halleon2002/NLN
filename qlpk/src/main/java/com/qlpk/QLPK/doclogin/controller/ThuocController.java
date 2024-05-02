package com.qlpk.QLPK.doclogin.controller;

import com.qlpk.QLPK.doclogin.entity.Thuoc;
import com.qlpk.QLPK.doclogin.repository.ThuocRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class ThuocController {

    ThuocRepository thuocRepository;

    public ThuocController(ThuocRepository thuocRepository) {
        super();
        this.thuocRepository = thuocRepository;

    }

    @PostMapping("/thuoc")
    public Thuoc createThuoc(@RequestBody Thuoc thuoc){

        return thuocRepository.save(thuoc);
    }
    @GetMapping("/thuoc/{id}")
    public ResponseEntity<Thuoc> getBenhNhanById(@PathVariable Long id) throws AttributeNotFoundException {

        Thuoc thuoc = thuocRepository.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));

        return ResponseEntity.ok(thuoc);
    }
    @GetMapping("/thuoc")
    public List<Thuoc> getAllThuoc(){

        return thuocRepository.findAll();
    }

    @PutMapping("/medicines/{id}")
    public ResponseEntity<Thuoc> updateThuoc(@PathVariable Long id, @RequestBody Thuoc medicineDetails) throws AttributeNotFoundException{

        Thuoc medicine = thuocRepository.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));

        medicine.setTenThuoc(medicineDetails.getTenThuoc());
        medicine.setSoLuong(medicineDetails.getSoLuong());
        medicine.setId(medicineDetails.getId());

        Thuoc updatedThuoc = thuocRepository.save(medicine);
        return ResponseEntity.ok(updatedThuoc);
    }

    @DeleteMapping("/medicines/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteThuoc(@PathVariable Long id) throws AttributeNotFoundException{

        Thuoc medicine = thuocRepository.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));

        thuocRepository.delete(medicine);
        Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
