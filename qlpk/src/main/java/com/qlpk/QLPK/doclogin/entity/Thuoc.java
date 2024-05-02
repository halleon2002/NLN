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
    @Column(name = "soluong", nullable = false)
    private int soLuong;

    public Thuoc() {
    }


    public Thuoc(long id, String tenThuoc, int soLuong) {
        this.id = id;
        this.tenThuoc = tenThuoc;
        this.soLuong = soLuong;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
