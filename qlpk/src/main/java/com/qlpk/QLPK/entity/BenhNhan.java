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
    private int ngaySinh;
    @Column(name="diachi", nullable = false)
    private String diaChi;
    @Column(name="sdt", nullable = false)
    private String soDT;

    public BenhNhan(){

    }

    public BenhNhan(String tenBenhNhan, String gioiTinh, int ngaySinh, String diaChi, String soDienThoai) {
        super();
        this.tenBenhNhan = tenBenhNhan;
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

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
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

    @Override
    public String toString() {
        return "BenhNhan{" +
                "id=" + id +
                ", ten='" + tenBenhNhan + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                ", soDT='" + soDT + '\'' +
                '}';
    }
}
