/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class PhieuMuon {

    private int MaPhieuMuon;
    private int MaDocGia;
    private String HoTen;
    private int MaSach;
    private String TenSach;
    private Date NgayMuon;
    private Date HanTra;
    private Date NgayTra;

    public PhieuMuon(int maphieumuon, int madocgia, String hoten, int masach, String tensach, Date ngaymuon, Date hantra, Date ngaytra) {
        this.MaPhieuMuon = maphieumuon;
        this.MaDocGia = madocgia;
        this.HoTen = hoten;
        this.MaSach = masach;
        this.TenSach = tensach;
        this.NgayMuon = ngaymuon;
        this.HanTra = hantra;
        this.NgayTra = ngaytra;
    }

    public PhieuMuon(int madocgia, String hoten, int masach, String tensach, Date ngaymuon, Date hantra, Date ngaytra) {
        this.MaDocGia = madocgia;
        this.HoTen = hoten;
        this.MaSach = masach;
        this.TenSach = tensach;
        this.NgayMuon = ngaymuon;
        this.HanTra = hantra;
        this.NgayTra = ngaytra;
    }

    public int getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(int maphieumuon) {
        this.MaPhieuMuon = maphieumuon;
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int madocgia) {
        this.MaDocGia = madocgia;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoten) {
        this.HoTen = hoten;
    }

    public int getMasach() {
        return MaSach;
    }

    public void setMasach(int masach) {
        this.MaSach = masach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tensach) {
        this.TenSach = tensach;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date ngaymuon) {
        this.NgayMuon = ngaymuon;
    }

    public Date getHanTra() {
        return HanTra;
    }

    public void setHanTra(Date hantra) {
        this.HanTra = hantra;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date ngaytra) {
        this.NgayTra = ngaytra;
    }

    @Override
    public String toString() {
        return "PhieuMuon{" + "maphieumuon=" + MaPhieuMuon + ", madocgia=" + MaDocGia + ", hoten=" + HoTen + ", masach=" + MaSach + ", tensach=" + TenSach + ", ngaymuon=" + NgayMuon + ",hantra=" + HanTra + ",ngaytra=" + NgayTra + '}';
    }

}
