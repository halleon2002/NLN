package com.qlpk.QLPK.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BenhNhan")
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="HoTen", nullable = false)
    private String ten;
    @Column(name="GioiTinh", nullable = false)
    private String gioiTinh;
    @Column(name="NgaySinh", nullable = false)
    private int ngaySinh;
    @Column(name="DiaChi", nullable = false)
    private String diaChi;
    @Column(name="SDT", nullable = false)
    private String soDT;

    public BenhNhan(){

    }

    public BenhNhan(String ten, String gioiTinh, int ngaySinh, String diaChi, String soDienThoai) {
        super();
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDT = soDienThoai;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioitinh() {
        return gioiTinh;
    }

    public void setGioitinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}
