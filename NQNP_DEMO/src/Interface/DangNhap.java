package Interface;


import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Vector;
import javax.security.auth.spi.LoginModule;

public class DangNhap extends javax.swing.JFrame {
    public String Madn;
    public DangNhap() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUẢN LÝ ĐỒ ÁN TỐT NGHIỆP");

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(80, 48, 5));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(142, 30));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 270, -1));

        jButton7.setBackground(new java.awt.Color(80, 48, 5));
        jButton7.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(246, 172, 15));
        jButton7.setText("THOÁT");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 30));

        jButton2.setBackground(new java.awt.Color(246, 172, 15));
        jButton2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(80, 48, 5));
        jButton2.setText("ĐĂNG NHẬP");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 130, 30));

        jTextField1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(49, 34, 3));
        jTextField1.setPreferredSize(new java.awt.Dimension(7, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, -1));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã đăng nhập!\n", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (jPasswordField1.getPassword().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!\n", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDoAn;user=Funny;password=201848270";
                java.sql.Connection conn = DriverManager.getConnection(dbURL);
                Statement sm = conn.createStatement();
                String sql = ("SELECT * FROM dbo.DangNhap "
                        + "WHERE MaDN=? AND MatKhau=? ");
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, jTextField1.getText());
                Madn = jTextField1.getText(); // lấy giá trị MaDN mà t nhập vào
                ps.setString(2, jPasswordField1.getText());
                
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                        this.dispose();
                        new QTV_Giaodienchinh();
                    
                    

                } else {
                    JOptionPane.showMessageDialog(this, "Bạn nhập sai mã đăng nhập hoặc mật khẩu!\n"
                            + "Chọn sai quyền truy cập!\n" + "Vui lòng nhập lại!", "Thông báo",
                            JOptionPane.ERROR_MESSAGE);
                    Madn = null;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dn = new DangNhap();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
