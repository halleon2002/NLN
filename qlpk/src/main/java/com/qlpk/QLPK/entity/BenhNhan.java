package com.qlpk.QLPK.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "benhnhan")
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="hoten", nullable = false)
    private String tenBenhNhan;
    @Column(name="gioitinh", nullable = false)
    private String gioiTinh;
    @Column(name="ngaysinh", nullable = false)
    private String ngaySinh;
    @Column(name="diachi", nullable = false)
    private String diaChi;
    @Column(name="sdt", nullable = false)
    private String soDT;

    public BenhNhan(){

    }

    public BenhNhan(Long id, String tenBenhNhan, String gioiTinh, String ngaySinh, String diaChi, String soDT) {
        this.id = id;
        this.tenBenhNhan = tenBenhNhan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    @Override
    public String toString() {
        return "BenhNhan{" +
                "id=" + id +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                ", soDT='" + soDT + '\'' +
                '}';
    }
}
