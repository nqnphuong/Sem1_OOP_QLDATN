package DAO;

import Entity.DoAn;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class DoAnDAO {
    public static List<DoAn> HienThi() {
        List<DoAn> DoAnList = new ArrayList<>();
        java.sql.Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "select da.MaDA,da.TenDA, COUNT(sv.MaSV) as 'SoLuong'\n" +
                        "from DoAn da\n" +
                        "left join SinhVien sv\n" +
                        "on da.MaDA=sv.MaDA\n" +
                        "group by da.MaDA, da.TenDA";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                DoAn da = new DoAn(
                        resultSet.getString("MaDA"),
                        resultSet.getString("TenDA"),
                        resultSet.getInt("SoLuong"));
                DoAnList.add(da);
            }
            connection.close();
        } catch (Exception ex) {
            System.out.println("Lấy dữ liệu bảng thất bại!");
            System.out.println(ex.getMessage());
        } 
        return DoAnList;
    }
    
    public static void Xoa(String MaDA) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "delete from DoAn where MaDA=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, MaDA);
            statement.execute();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }

    public static void Them(DoAn da) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "insert into DoAn(MaDA, TenDA) values(?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, da.getMaDA());
            statement.setString(2, da.getTenDA());
            statement.execute();
            connection.close();
        } catch (Exception ex) {        
            JOptionPane.showMessageDialog(null, "Thêm thông tin thất bại !"); 
            System.out.println(ex.getMessage());
        } 
    }
    
    public static void ChinhSua(DoAn da) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "update DoAn set TenDA=? where MaDA=?";
            statement = connection.prepareCall(sql);                    
            statement.setString(1, da.getTenDA());
            statement.setString(2, da.getMaDA());              
            statement.execute();
            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Chỉnh sửa thông tin thất bại !");
            System.out.println(ex.getMessage());
        } 
    }
    
    public static List<DoAn> Tim(String TenDA) {
        List<DoAn> DoAnList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "select * from DoAn where TenDA like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+ TenDA +"%");           
            ResultSet resultSet = statement.executeQuery();          
            while (resultSet.next()) {                
                DoAn da = new DoAn(
                        resultSet.getString("MaDA"),
                        resultSet.getString("TenDA"));                                
                DoAnList.add(da);
            }
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        return DoAnList;
    }
}
