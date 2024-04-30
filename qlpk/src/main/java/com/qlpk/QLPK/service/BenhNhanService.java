package com.qlpk.QLPK.service;
import com.qlpk.QLPK.entity.BenhNhan;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BenhNhanService {
    public String createBenhNhan(BenhNhan benhNhan);
    public String updateBenhNhan(BenhNhan benhNhan);
    public String deleteBenhNhan(Long id);
    public BenhNhan getBenhNhan(Long id);
    public List<BenhNhan> getAllnBenhNhan();
}
