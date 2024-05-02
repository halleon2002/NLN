package com.qlpk.QLPK.controller;
import com.qlpk.QLPK.entity.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BenhNhanController {

    @Autowired
    private BenhNhanRepository benhNhanRepository;

    public BenhNhanController(BenhNhanRepository benhNhanRepository){
        super();
        this.benhNhanRepository = benhNhanRepository;
    }

    @PostMapping("/benhnhan")
    public BenhNhan createBenhNhan(@RequestBody BenhNhan benhNhan){
        return benhNhanRepository.save(benhNhan);
    }

    @GetMapping("/benhnhan")
    public List<BenhNhan>getAllBenhNhan(){

        return benhNhanRepository.findAll();
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<BenhNhan> updateBenhNhan(@PathVariable int id, @RequestBody BenhNhan benhnhanDetails) throws AttributeNotFoundException{

        BenhNhan benhnhan = benhNhanRepository.findById((long) id)
                .orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));

        benhnhan.setTuoi(benhnhanDetails.getTuoi());
        benhnhan.setTenBenhNhan(benhnhanDetails.getTenBenhNhan());
        benhnhan.setMaBN(benhnhanDetails.getMaBN());

        benhnhan.setLieuLuong(benhnhanDetails.getLieuLuong());
        benhnhan.setChiPhi(benhnhanDetails.getChiPhi());
        benhnhan.setDonThuoc(benhnhanDetails.getDonThuoc());
        benhnhan.setKhanCap(benhnhanDetails.getKhanCap());
        benhnhan.setId(benhnhanDetails.getId());

        BenhNhan updatedBenhNhan = benhNhanRepository.save(benhnhan);
        return ResponseEntity.ok(updatedBenhNhan);
    }

    @DeleteMapping("/benhnhan/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBenhNhan(@PathVariable long id) throws AttributeNotFoundException {
        BenhNhan benhNhan = benhNhanRepository.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("Không tìm thấy bệnh nhân"));
        benhNhanRepository.delete(benhNhan);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Đã xóa", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}
