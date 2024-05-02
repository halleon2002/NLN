package com.qlpk.QLPK.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "benhnhan")
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="maBN", nullable = false)
    private String maBN;
    @Column(name="hoten", nullable = false)
    private String tenBenhNhan;
    @Column(name="gioitinh", nullable = false)
    private String gioiTinh;
    @Column(name="tuoi", nullable = false)
    private String tuoi;
    @Column(name = "donthuoc")
    private String donThuoc;
    @Column(name = "lieuluong")
    private String lieuLuong;
    @Column(name = "chiphi")
    private String chiPhi;
    @Column(name = "khancap")
    private String khanCap;
    @Column(name="diachi", nullable = false)
    private String diaChi;
    @Column(name="sdt", nullable = false)
    private String soDT;


    public BenhNhan() {
    }

    public BenhNhan(Long id, String maBN, String tenBenhNhan, String gioiTinh, String tuoi, String donThuoc, String lieuLuong, String chiPhi, String khanCap, String diaChi, String soDT) {
        super();
        this.maBN = maBN;
        this.tenBenhNhan = tenBenhNhan;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.donThuoc = donThuoc;
        this.lieuLuong = lieuLuong;
        this.chiPhi = chiPhi;
        this.khanCap = khanCap;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDonThuoc() {
        return donThuoc;
    }

    public void setDonThuoc(String donThuoc) {
        this.donThuoc = donThuoc;
    }

    public String getLieuLuong() {
        return lieuLuong;
    }

    public void setLieuLuong(String lieuLuong) {
        this.lieuLuong = lieuLuong;
    }

    public String getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(String chiPhi) {
        this.chiPhi = chiPhi;
    }

    public String getKhanCap() {
        return khanCap;
    }

    public void setKhanCap(String khanCap) {
        this.khanCap = khanCap;
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
