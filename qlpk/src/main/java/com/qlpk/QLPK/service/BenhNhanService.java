package com.qlpk.QLPK.service;
import com.qlpk.QLPK.model.BenhNhan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BenhNhanService {
    List<BenhNhan> getAllnBenhNhan();
    // Các phương thức xử lý logic nghiệp vụ liên quan đến BenhNhan
}
