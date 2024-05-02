package com.qlpk.QLPK.doclogin.entity;

import jakarta.persistence.*;


@Entity
@Table(name="phieukhambenh")
public class PhieuKhamBenh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="mabenhnhan", nullable = false)
    private String maBN;
    @Column(name ="ngaykham", nullable = false)
    private String ngayKham;
    @Column(name ="tenbacsi", nullable = false)
    private String tenBacSi;
    @Column(name ="trieuchung", nullable = false)
    private String trieuChung;
    @Column(name ="ketqua", nullable = false)
    private String ketQua;
    @Column(name ="loaibenh", nullable = false)
    private String  loaiBenh;
    public PhieuKhamBenh() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(String ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public void setTenBacSi(String tenBacSi) {
        this.tenBacSi = tenBacSi;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public String getLoaiBenh() {
        return loaiBenh;
    }

    public void setLoaiBenh(String loaiBenh) {
        this.loaiBenh = loaiBenh;
    }
}
