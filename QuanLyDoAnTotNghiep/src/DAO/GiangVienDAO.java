
package DAO;
import Entity.GiangVien;
import Entity.SinhVien;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class GiangVienDAO {
    public static List<GiangVien> HienThi() {
        List<GiangVien> GiangVienList = new ArrayList<>();
        java.sql.Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "select gv.*, COUNT(sv.MaSV) as 'Soluong'\n" +
                        "from GiangVien gv\n" +
                        "left join SinhVien sv\n" +
                        "on gv.MaGV=sv.MaGV\n" +
                        "group by gv.MaGV, gv.Hodem, gv.TenGV, gv.Email, gv.SDT";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
               GiangVien gv = new GiangVien(
                        resultSet.getString("MaGV"),
                        resultSet.getString("Hodem"),
                        resultSet.getString("TenGV"),                       
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getInt("SoLuong"));
                        
                GiangVienList.add(gv);
            }
            connection.close();
        } catch (Exception ex) {
            System.out.println("Lấy dữ liệu bảng thất bại!");
            System.out.println(ex.getMessage());
        } 
        return GiangVienList;
    }
    public static void Xoa(String MaGV) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "delete from GiangVien where MaGV=?";
            statement = connection.prepareCall(sql);
            statement.setString(1,MaGV);
            statement.execute();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }

    public static void Them(GiangVien gv) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "insert into GiangVien(MaGV, Hodem, TenGV, Email, SDT) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, gv.getMaGV());
            statement.setString(2, gv.getHoDem());
            statement.setString(3, gv.getTenGV());
            statement.setString(4, gv.getEmail());
            statement.setString(5, gv.getSDT());
            statement.execute();
            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Thêm thông tin thất bại !"); 
            System.out.println(ex.getMessage());
        } 
    }
        public static void ChinhSua(GiangVien gv) {
        Connection connection = null;
        PreparedStatement statement = null;        
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "update GiangVien set Hodem=?, TenGV=?, Email=?, SDT=? where MaGV=?";
            statement = connection.prepareCall(sql);                       
            statement.setString(1, gv.getHoDem());
            statement.setString(2, gv.getTenGV());           
            statement.setString(3, gv.getEmail());
            statement.setString(4, gv.getSDT());
            statement.setString(5, gv.getMaGV());            
            statement.execute();
            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Chỉnh sửa thông tin thất bại !");
            System.out.println(ex.getMessage());
        } 
    }
    public static List<GiangVien> Tim(String TenGV) {
        List<GiangVien> GiangVienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;       
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "select * from GiangVien where TenGV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+TenGV+"%");           
            ResultSet resultSet = statement.executeQuery();           
            while (resultSet.next()) {                
                GiangVien gv = new GiangVien(
                        resultSet.getString("MaGV"),
                        resultSet.getString("Hodem"),
                        resultSet.getString("TenGV"),                       
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"));                             
                GiangVienList.add(gv);
            }
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        return GiangVienList;
    }
    public static List<SinhVien> ChiTiet(String MaGV) {
        List<SinhVien> SinhVienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "select * from SinhVien where MaGV=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, MaGV);
            ResultSet resultSet = statement.executeQuery();
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
                        resultSet.getString("MaDA"),
                        resultSet.getFloat("Diem"));
                SinhVienList.add(sv);
            }
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return SinhVienList;
    }
}
