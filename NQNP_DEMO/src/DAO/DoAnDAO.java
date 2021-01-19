
package DAO;

import Entity.DoAn;
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

public class DoAnDAO {
    public static List<DoAn> findAll() {
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
                        resultSet.getInt("MaDA"),
                        resultSet.getString("TenDA"),
                        resultSet.getInt("SoLuong"));
                DoAnList.add(da);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return DoAnList;
    }

    public static void Xoa(int MaDA) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "delete from DoAn where MaDA=?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, MaDA);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void Them(DoAn da) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");

            //query
            String sql = "insert into DoAn(MaDA, TenDA) values(?, ?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, da.getMaDA());
            statement.setString(2, da.getTenDA());
            

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
        public static void ChinhSua(DoAn da) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            
            //query
            String sql = "update DoAn set  TenDA=? where MaDA=?";
            statement = connection.prepareCall(sql);
                       
            statement.setString(1, da.getTenDA());
            statement.setInt(2, da.getMaDA());
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
        public static List<DoAn> findByFullname(String TenDA) {
        List<DoAn> DoAnList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
            
            //query
            String sql = "select * from DoAn where TenDA like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+ TenDA +"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                DoAn da = new DoAn(
                        resultSet.getInt("MaDA"),
                        resultSet.getString("TenDA"));                                
                DoAnList.add(da);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoAnDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return DoAnList;
    }


}
