package Interface;

import Entity.GiangVien;
import DAO.GiangVienDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class QTV_GVCapnhat extends javax.swing.JFrame {

    QTV_Giangvien a;

    public QTV_GVCapnhat(QTV_Giangvien a, String title, String MaGV, String HoDem, String TenGV,
            String Email, String SDT) {
        super(title);
        initComponents();
        setVisible(true);
        setResizable(false);
        this.a = a;
        tfMaGV.setText(MaGV);
        tfHoDem.setText(HoDem);
        tfTen.setText(TenGV);
        tfEmail.setText(Email);
        tfSDT.setText(SDT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfTen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfHoDem = new javax.swing.JTextField();
        tfMaGV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bThoat = new javax.swing.JButton();
        bThietLapLai = new javax.swing.JButton();
        bDongY = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTen.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfTen.setForeground(new java.awt.Color(80, 48, 5));
        tfTen.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(tfTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 30));

        jLabel12.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(80, 48, 5));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tên");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 30));

        jLabel9.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(80, 48, 5));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, 30));

        jLabel5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 48, 5));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Họ đệm");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 30));

        tfHoDem.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfHoDem.setForeground(new java.awt.Color(80, 48, 5));
        tfHoDem.setPreferredSize(new java.awt.Dimension(200, 20));
        tfHoDem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoDemActionPerformed(evt);
            }
        });
        jPanel1.add(tfHoDem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, 30));

        tfMaGV.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaGV.setForeground(new java.awt.Color(80, 48, 5));
        tfMaGV.setPreferredSize(new java.awt.Dimension(200, 20));
        tfMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaGVActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, 30));

        jLabel8.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 48, 5));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Số điện thoại");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 190, 30));

        jLabel4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 48, 5));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã giảng viên");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, 30));

        tfSDT.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfSDT.setForeground(new java.awt.Color(80, 48, 5));
        tfSDT.setPreferredSize(new java.awt.Dimension(200, 20));
        tfSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSDTActionPerformed(evt);
            }
        });
        jPanel1.add(tfSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 220, 30));

        tfEmail.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(80, 48, 5));
        tfEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 220, 30));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN GIẢNG VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(246, 172, 15));
        jLabel3.setFont(new java.awt.Font("#9Slide07 IcielBC Cubano Normal", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 48, 5));
        jLabel3.setText("____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(138, 102, 53));
        jLabel13.setText("(GVxxx)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        bThoat.setBackground(new java.awt.Color(80, 48, 5));
        bThoat.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bThoat.setForeground(new java.awt.Color(246, 172, 15));
        bThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        bThoat.setText("Thoát");
        bThoat.setBorder(null);
        bThoat.setPreferredSize(new java.awt.Dimension(50, 25));
        bThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThoatActionPerformed(evt);
            }
        });
        jPanel1.add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 30));

        bThietLapLai.setBackground(new java.awt.Color(246, 172, 15));
        bThietLapLai.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bThietLapLai.setForeground(new java.awt.Color(80, 48, 5));
        bThietLapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh-page-option.png"))); // NOI18N
        bThietLapLai.setText("Thiết lập lại");
        bThietLapLai.setBorder(null);
        bThietLapLai.setPreferredSize(new java.awt.Dimension(50, 25));
        bThietLapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThietLapLaiActionPerformed(evt);
            }
        });
        jPanel1.add(bThietLapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 30));

        bDongY.setBackground(new java.awt.Color(246, 172, 15));
        bDongY.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bDongY.setForeground(new java.awt.Color(80, 48, 5));
        bDongY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-mark.png"))); // NOI18N
        bDongY.setText("Đồng ý");
        bDongY.setBorder(null);
        bDongY.setPreferredSize(new java.awt.Dimension(50, 25));
        bDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDongYActionPerformed(evt);
            }
        });
        jPanel1.add(bDongY, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDongYActionPerformed
        if (this.getTitle() == "THÊM") {
            GiangVien gv = new GiangVien(tfMaGV.getText(),tfHoDem.getText() ,tfTen.getText(),
                    tfEmail.getText(),tfSDT.getText());
            GiangVienDAO.Them(gv);
            a.CapNhat();
            this.dispose();
        } 
        if (this.getTitle() == "CHỈNH SỬA") {
            GiangVien gv = new GiangVien(tfMaGV.getText(),tfHoDem.getText() ,tfTen.getText(),
                    tfEmail.getText(),tfSDT.getText());
            GiangVienDAO.ChinhSua(gv);
            a.CapNhat();
            this.dispose();
        } 
    }//GEN-LAST:event_bDongYActionPerformed

    private void bThietLapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThietLapLaiActionPerformed
        tfHoDem.setText("");
        tfMaGV.setText("");
        tfTen.setText("");
        tfEmail.setText("");
        tfSDT.setText("");
       
    }//GEN-LAST:event_bThietLapLaiActionPerformed

    private void bThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_bThoatActionPerformed

    private void tfSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSDTActionPerformed

    private void tfMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaGVActionPerformed

    private void tfHoDemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoDemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoDemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDongY;
    private javax.swing.JButton bThietLapLai;
    private javax.swing.JButton bThoat;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoDem;
    private javax.swing.JTextField tfMaGV;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables

}
