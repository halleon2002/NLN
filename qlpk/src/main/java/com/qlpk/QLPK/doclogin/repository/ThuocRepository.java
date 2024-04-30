package com.qlpk.QLPK.doclogin.repository;

import com.qlpk.QLPK.doclogin.entity.Thuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuocRepository extends JpaRepository<Thuoc, Long> {
}
