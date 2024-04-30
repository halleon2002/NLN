package com.qlpk.QLPK.doclogin.repository;

import com.qlpk.QLPK.doclogin.entity.PhieuKhamBenh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuKhamBenhRepository extends JpaRepository<PhieuKhamBenh, Long> {
}
