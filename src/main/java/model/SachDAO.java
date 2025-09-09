/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author ADMIN
 */
public class SachDAO {

    public static List<Sach> getAll() {
        List<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM Sach";

        try (Connection conn = DBConnection.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Sach s = new Sach(
                        rs.getInt("MaSach"),
                        rs.getString("TenSach"),
                        rs.getString("TacGia"),
                        rs.getString("TheLoai"),
                        rs.getInt("NamXB"),
                        rs.getInt("SoLuong"),
                        rs.getString("TrangThai")
                );
                list.add(s);
            }

        } catch (SQLException e) {
            System.err.println("Lỗi khi lấy danh sách Sách:");
            e.printStackTrace();
        }

        return list;
    }

    public static List<String> getAllTheLoai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Thêm sách mới
    public boolean insertSach(Sach s) {
        String sql = "INSERT INTO Sach(TenSach, TacGia, NamXuatBan, TheLoai, SoLuong, TrangThai) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, s.getTenSach());
            ps.setString(2, s.getTacGia());
            ps.setString(3, s.getTheLoai());
            ps.setInt(4, s.getNamXB());
            ps.setInt(5, s.getSoLuong());
            ps.setString(6, s.getTrangThai());

            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        s.setMaSach(generatedKeys.getInt(1)); // Gán mã được sinh tự động
                    }
                }
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Lỗi khi thêm sách:");
            e.printStackTrace();
        }

        return false;
    }

    // Cập nhật thông tin sách
    public boolean updateSach(Sach s) {
        String sql = "UPDATE Sach SET TenSach = ?, TacGia = ?, NamXuatBan = ?, TheLoai = ?, SoLuong = ?, TrangThai = ? WHERE MaSach = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, s.getTenSach());
            ps.setString(2, s.getTacGia());
            ps.setInt(3, s.getNamXB());
            ps.setString(4, s.getTheLoai());
            ps.setInt(5, s.getSoLuong());
            ps.setString(6, s.getTrangThai());
            ps.setInt(7, s.getMaSach());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Lỗi khi cập nhật sách:");
            e.printStackTrace();
            return false;
        }
    }

    // Xóa sách theo mã
    public boolean deleteSach(int MaSach) {
        String sql = "DELETE FROM Sach WHERE MaSach = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, MaSach);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Lỗi khi xóa sách:");
            e.printStackTrace();
            return false;
        }
    }

    // Tìm sách theo tên
    public List<Sach> searchSach(String keyword) {
        List<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM Sach WHERE TenSach LIKE ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Sach s = new Sach(
                            rs.getInt("MaSach"),
                            rs.getString("TenSach"),
                            rs.getString("TacGia"),
                            rs.getString("TheLoai"),
                            rs.getInt("NamXB"),
                            rs.getInt("SoLuong"),
                            rs.getString("TrangThai")
                    );
                    list.add(s);
                }
            }

        } catch (SQLException e) {
            System.err.println("Lỗi khi tìm kiếm sách:");
            e.printStackTrace();
        }

        return list;
    }
}
