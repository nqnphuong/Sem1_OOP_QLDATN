package Interface;

import Entity.DoAn;
import DAO.DoAnDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class QTV_DACapnhat extends javax.swing.JFrame {

    QTV_DoAn a;

    public QTV_DACapnhat(QTV_DoAn a, String title, int MaDA, String TenDA) {
        super(title);
        initComponents();
        setVisible(true);
        setResizable(false);
        this.a = a;
        jTextField1.setText(String.valueOf(MaDA));
        jTextField2.setText(TenDA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(80, 48, 5));
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 440, 30));

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

        jTextField1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(80, 48, 5));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 440, 30));

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

        jButton7.setBackground(new java.awt.Color(80, 48, 5));
        jButton7.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(246, 172, 15));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        jButton7.setText("Thoát");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, 30));

        jButton4.setBackground(new java.awt.Color(246, 172, 15));
        jButton4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(80, 48, 5));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh-page-option.png"))); // NOI18N
        jButton4.setText("Thiết lập lại");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 30));

        jButton5.setBackground(new java.awt.Color(246, 172, 15));
        jButton5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(80, 48, 5));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-mark.png"))); // NOI18N
        jButton5.setText("Đồng ý");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, 30));

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (this.getTitle() == "THÊM") {
            DoAn da = new DoAn(Integer.parseInt(jTextField1.getText()),jTextField2.getText());
            DoAnDAO.Them(da);
            a.ThemDA(Integer.parseInt(jTextField1.getText()),jTextField2.getText());
            this.dispose();
        }
        if (this.getTitle() == "CHỈNH SỬA") {
            DoAn da = new DoAn(Integer.parseInt(jTextField1.getText()),jTextField2.getText());
            DoAnDAO.ChinhSua(da);
            a.ThemDA(Integer.parseInt(jTextField1.getText()),jTextField2.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
