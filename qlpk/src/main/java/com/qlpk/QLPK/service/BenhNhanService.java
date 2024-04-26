package com.qlpk.QLPK.service;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenhNhanService {
    @Autowired
    private BenhNhanRepository benhNhanRepository;

    // Các phương thức xử lý logic nghiệp vụ liên quan đến BenhNhan
}
