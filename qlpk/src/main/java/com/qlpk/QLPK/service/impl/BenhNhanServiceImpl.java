package com.qlpk.QLPK.service.impl;

import com.qlpk.QLPK.model.BenhNhan;
import com.qlpk.QLPK.repository.BenhNhanRepository;
import com.qlpk.QLPK.service.BenhNhanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhNhanServiceImpl implements BenhNhanService {

    private BenhNhanRepository benhNhanRepository;

    public BenhNhanServiceImpl(BenhNhanRepository benhNhanRepository) {
        super();
        this.benhNhanRepository = benhNhanRepository;
    }

    @Override
    public List<BenhNhan> getAllnBenhNhan() {
        return benhNhanRepository.findAll();
    }
}
