package com.qlpk.QLPK.doclogin.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="phieukhambenh")
public class PhieuKhamBenh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="ngaykham", nullable = false)
    private Date ngayKham;
    @Column(name ="tenbacsi", nullable = false)
    private String tenBacSi;
    @Column(name ="tenbenhnhan", nullable = false)
    private String tenBenhNhan;

    @Column(name ="trieuchung", nullable = false)
    private String trieuchung;
    @Column(name ="ketqua", nullable = false)
    private String ketQua;
    @Column(name ="loaibenh", nullable = false)
    private String  loaiBenh;
    public PhieuKhamBenh() {
    }


}
