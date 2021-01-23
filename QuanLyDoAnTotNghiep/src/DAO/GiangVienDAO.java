
package DAO;
import Entity.GiangVien;
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

public class GiangVienDAO {
    public static List<GiangVien> findAll() {
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
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
        } catch (SQLException ex) {
            Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void ChinhSua(GiangVien gv) {
        Connection connection = null;
        PreparedStatement statement = null;        
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            String sql = "update GiangVien set  Hodem=?, TenGV=?, Email=?, SDT=?, MaGV=?";
            statement = connection.prepareCall(sql);                       
            statement.setString(1, gv.getHoDem());
            statement.setString(2, gv.getTenGV());           
            statement.setString(3, gv.getEmail());
            statement.setString(4, gv.getSDT());
            statement.setString(5, gv.getMaGV());            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
        } catch (SQLException ex) {
            Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return GiangVienList;
    }
}
