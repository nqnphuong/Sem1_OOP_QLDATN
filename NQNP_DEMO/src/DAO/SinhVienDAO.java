package DAO;

import Entity.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SinhVienDAO {

    public static List<SinhVien> findAll() {
        List<SinhVien> SinhVienList = new ArrayList<>();
        java.sql.Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "select * from SinhVien";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SinhVien sv = new SinhVien(
                        resultSet.getString("MaSV"),
                        resultSet.getString("Hodem"),
                        resultSet.getString("TenSV"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("Khoa"),
                        resultSet.getString("Nganh"),
                        resultSet.getString("MaGV"),
                        resultSet.getInt("MaDA"),
                        resultSet.getFloat("Diem"));
                SinhVienList.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return SinhVienList;
    }

    public static void Xoa(String MaSV) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "delete from SinhVien where MaSV=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaSV);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void Them(SinhVien sv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "insert into SinhVien(MaSV, Hodem, TenSV, GioiTinh, NgaySinh, Email, SDT, Khoa, Nganh, MaGV, MaDA, Diem) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, sv.getMaSV());
            statement.setString(2, sv.getHoDem());
            statement.setString(3, sv.getTenSV());
            statement.setString(4, sv.getGioiTinh());
            statement.setString(5, sv.getNgaySinh());
            statement.setString(6, sv.getEmail());
            statement.setString(7, sv.getSDT());
            statement.setString(8, sv.getKhoa());
            statement.setString(9, sv.getNganh());
            statement.setString(10, sv.getMaGV());
            statement.setInt(11, sv.getMaDA());
            statement.setFloat(12, sv.getDiem());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void ChinhSua(SinhVien sv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "update SinhVien set  Hodem=?, TenSV=?, GioiTinh=?, NgaySinh=?, Email=?, SDT=?, Khoa=?, Nganh=?, MaGV=?, MaDA=?, Diem=? where MaSV=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, sv.getHoDem());
            statement.setString(2, sv.getTenSV());
            statement.setString(3, sv.getGioiTinh());
            statement.setString(4, sv.getNgaySinh());
            statement.setString(5, sv.getEmail());
            statement.setString(6, sv.getSDT());
            statement.setString(7, sv.getKhoa());
            statement.setString(8, sv.getNganh());
            statement.setString(9, sv.getMaGV());
            statement.setInt(10, sv.getMaDA());
            statement.setFloat(11, sv.getDiem());
            statement.setString(12, sv.getMaSV());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<SinhVien> findByFullname(String TenSV) {
        List<SinhVien> SinhVienList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "select * from SinhVien where TenSV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + TenSV + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                SinhVien sv = new SinhVien(
                        resultSet.getString("MaSV"),
                        resultSet.getString("Hodem"),
                        resultSet.getString("TenSV"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getString("EMail"),
                        resultSet.getString("SDT"),
                        resultSet.getString("Khoa"),
                        resultSet.getString("Nganh"),
                        resultSet.getString("MaGV"),
                        resultSet.getInt("MaDA"),
                        resultSet.getFloat("Diem"));
                SinhVienList.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return SinhVienList;
    }
}
