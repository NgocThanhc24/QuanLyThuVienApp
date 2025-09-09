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
public class Sach {

    private int MaSach;
    private String TenSach;
    private String TacGia;
    private String TheLoai;
    private int NamXuatBan;
    private int SoLuong;
    private String TrangThai;

    public Sach(int masach, String tensach, String tacgia, String theloai, int namxuatban, int soluong, String trangthai) {
        this.MaSach = masach;
        this.TenSach = tensach;
        this.TacGia = tacgia;
        this.TheLoai = theloai;
        this.NamXuatBan = namxuatban;
        this.SoLuong = soluong;
        this.TrangThai = trangthai;
    }

    public Sach(String tensach, String tacgia, String theloai, int namxuatban, int soluong, String trangthai) {
        this.TenSach = tensach;
        this.TacGia = tacgia;
        this.TheLoai = theloai;
        this.NamXuatBan = namxuatban;
        this.SoLuong = soluong;
        this.TrangThai = trangthai;
    }

    // Getters & Setters
    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int masach) {
        this.MaSach = masach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tensach) {
        this.TenSach = tensach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacgia) {
        this.TacGia = tacgia;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theloai) {
        this.TheLoai = theloai;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXB(int namxuatban) {
        this.NamXuatBan = namxuatban;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soluong) {
        this.SoLuong = soluong;
    }
    
    public String getTrangThai(){
        return TrangThai;
    }
    
    public void setTrangThai (String trangthai){
        this.TrangThai = trangthai;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + MaSach + ", tensach=" + TenSach + ", tacgia=" + TacGia + ", theloai=" + TheLoai + ", namxuatban=" + NamXuatBan + ", soluong=" + SoLuong + ",trangthai=" +TrangThai+'}';
    }
}
