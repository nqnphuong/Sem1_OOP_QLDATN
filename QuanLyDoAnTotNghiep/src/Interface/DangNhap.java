package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class DangNhap extends javax.swing.JFrame {
    public DangNhap() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUẢN LÝ ĐỒ ÁN TỐT NGHIỆP");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfMatKhau = new javax.swing.JPasswordField();
        bThoat = new javax.swing.JButton();
        bDangNhap = new javax.swing.JButton();
        tfMaDangNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfMatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tfMatKhau.setForeground(new java.awt.Color(80, 48, 5));
        tfMatKhau.setPreferredSize(new java.awt.Dimension(142, 30));
        tfMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatKhauActionPerformed(evt);
            }
        });
        getContentPane().add(tfMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 270, -1));

        bThoat.setBackground(new java.awt.Color(80, 48, 5));
        bThoat.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bThoat.setForeground(new java.awt.Color(246, 172, 15));
        bThoat.setText("THOÁT");
        bThoat.setBorder(null);
        bThoat.setPreferredSize(new java.awt.Dimension(50, 25));
        bThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThoatActionPerformed(evt);
            }
        });
        getContentPane().add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 30));

        bDangNhap.setBackground(new java.awt.Color(246, 172, 15));
        bDangNhap.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 18)); // NOI18N
        bDangNhap.setForeground(new java.awt.Color(80, 48, 5));
        bDangNhap.setText("ĐĂNG NHẬP");
        bDangNhap.setBorder(null);
        bDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(bDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 130, 30));

        tfMaDangNhap.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaDangNhap.setForeground(new java.awt.Color(49, 34, 3));
        tfMaDangNhap.setPreferredSize(new java.awt.Dimension(7, 30));
        tfMaDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(tfMaDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, -1));

        jLabel5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 34, 3));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mời bạn nhập thông tin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 270, -1));

        jLabel3.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 34, 3));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mật khẩu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 270, -1));

        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 34, 3));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mã đăng nhập");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 270, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfMaDangNhapActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tfMaDangNhapActionPerformed

    }//GEN-LAST:event_tfMaDangNhapActionPerformed

    private void bDangNhapActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bDangNhapActionPerformed

        if (tfMaDangNhap.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã đăng nhập!\n", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (tfMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!\n", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270");
                String sql = ("SELECT * FROM dbo.DangNhap "
                        + "WHERE MaDN=? AND MatKhau=?");
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, tfMaDangNhap.getText());
                statement.setString(2, tfMatKhau.getText());
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                        this.dispose();
                        new QTV_Giaodienchinh();
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn nhập sai mã đăng nhập hoặc mật khẩu!\n"
                             + "Vui lòng nhập lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_bDangNhapActionPerformed
   
    private void tfMatKhauActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tfMatKhauActionPerformed

    }//GEN-LAST:event_tfMatKhauActionPerformed

    private void bThoatActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();

    }//GEN-LAST:event_bThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDangNhap;
    private javax.swing.JButton bThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfMaDangNhap;
    private javax.swing.JPasswordField tfMatKhau;
    // End of variables declaration//GEN-END:variables
}
