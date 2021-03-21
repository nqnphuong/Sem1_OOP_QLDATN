package Interface;

import Entity.DoAn;
import DAO.DoAnDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class QTV_DACapnhat extends javax.swing.JFrame {

    QTV_DoAn a;

    public QTV_DACapnhat(QTV_DoAn a, String title, String MaDA, String TenDA) {
        super(title);
        initComponents();
        setVisible(true);
        setResizable(false);
        this.a = a;
        tfMaDA.setText(MaDA);
        tfTenDA.setText(TenDA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfTenDA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMaDA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bThoat = new javax.swing.JButton();
        bThietLapLai = new javax.swing.JButton();
        bDongY = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTenDA.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfTenDA.setForeground(new java.awt.Color(80, 48, 5));
        tfTenDA.setPreferredSize(new java.awt.Dimension(200, 20));
        tfTenDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenDAActionPerformed(evt);
            }
        });
        jPanel1.add(tfTenDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 440, 30));

        jLabel6.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 48, 5));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tên đồ án");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 30));

        jLabel5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 48, 5));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Mã đồ án");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 410, 30));

        tfMaDA.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaDA.setForeground(new java.awt.Color(80, 48, 5));
        tfMaDA.setPreferredSize(new java.awt.Dimension(200, 20));
        tfMaDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaDAActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 440, 30));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN ĐỒ ÁN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(246, 172, 15));
        jLabel3.setFont(new java.awt.Font("#9Slide07 IcielBC Cubano Normal", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 48, 5));
        jLabel3.setText("____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

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
        jPanel1.add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, 30));

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
        jPanel1.add(bThietLapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 30));

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
        jPanel1.add(bDongY, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, 30));

        jLabel13.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(138, 102, 53));
        jLabel13.setText("(DAxxx)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDongYActionPerformed
        if (this.getTitle() == "THÊM") {
            DoAn da = new DoAn(tfMaDA.getText(),tfTenDA.getText());
            DoAnDAO.Them(da);
            a.CapNhat();
            this.dispose();
        }
        if (this.getTitle() == "CHỈNH SỬA") {
            DoAn da = new DoAn(tfMaDA.getText(),tfTenDA.getText());
            DoAnDAO.ChinhSua(da);
            a.CapNhat();
            this.dispose();
        }
    }//GEN-LAST:event_bDongYActionPerformed

    private void bThietLapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThietLapLaiActionPerformed
        tfMaDA.setText("");
        tfTenDA.setText("");
          
    }//GEN-LAST:event_bThietLapLaiActionPerformed

    private void bThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_bThoatActionPerformed

    private void tfMaDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaDAActionPerformed

    private void tfTenDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenDAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDongY;
    private javax.swing.JButton bThietLapLai;
    private javax.swing.JButton bThoat;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfMaDA;
    private javax.swing.JTextField tfTenDA;
    // End of variables declaration//GEN-END:variables

}
