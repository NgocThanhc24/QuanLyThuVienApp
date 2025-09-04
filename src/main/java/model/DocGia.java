/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

public class DocGia {

    private int maDocGia;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String GioiTinh;
    private Date NgayDangKy;

    public DocGia(int maDocGia, String hoTen, Date ngaySinh, String diaChi, String GioiTinh, Date NgayDangKy) {
        this.maDocGia = maDocGia;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.GioiTinh = GioiTinh;
        this.NgayDangKy = NgayDangKy;
    }

    public DocGia(String hoTen, Date ngaySinh, String diaChi, String GioiTinh, Date NgayDangKy) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.GioiTinh = GioiTinh;
        this.NgayDangKy = NgayDangKy;
    }

    // Getters & Setters
    public int getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    @Override
    public String toString() {
        return "DocGia{" + "maDocGia=" + maDocGia + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", GioiTinh=" + GioiTinh + ", NgayDangKy=" + NgayDangKy + '}';
    }
    
}
