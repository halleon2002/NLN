package com.qlpk.QLPK.service.impl;

import com.qlpk.QLPK.entity.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import com.qlpk.QLPK.service.BenhNhanService;

import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {

    BenhNhanRepository benhNhanRepository;

    public BenhNhanServiceImpl(BenhNhanRepository benhNhanRepository) {
        this.benhNhanRepository = benhNhanRepository;
    }

    @Override
    public String createBenhNhan(BenhNhan benhNhan) {
        benhNhanRepository.save(benhNhan);
        return "";
    }

    @Override
    public String updateBenhNhan(BenhNhan benhNhan) {
        return "";
    }

    @Override
    public String deleteBenhNhan(Long id) {
        return "";
    }

    @Override
    public BenhNhan getBenhNhan(Long id) {
        return null;
    }

    @Override
    public List<BenhNhan> getAllnBenhNhan() {
        return List.of();
    }
}
