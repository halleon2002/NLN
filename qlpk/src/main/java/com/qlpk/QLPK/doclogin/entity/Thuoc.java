package com.qlpk.QLPK.doclogin.entity;

import jakarta.persistence.*;

@Entity
@Table(name="thuoc")
public class Thuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "tenthuoc", nullable = false)
    private String tenThuoc;
    @Column(name = "nhasanxuat", nullable = false)
    private String nhaSanXuat;

    public Thuoc() {
    }


    public Thuoc(long id, String tenThuoc, String nhaSanXuat) {
        this.id = id;
        this.tenThuoc = tenThuoc;
        this.nhaSanXuat = nhaSanXuat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
}
