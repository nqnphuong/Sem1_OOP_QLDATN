package Interface;

import Entity.SinhVien;
import DAO.SinhVienDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class QTV_SVCapnhat extends javax.swing.JFrame {

    QTV_Sinhvien a;

    public QTV_SVCapnhat(QTV_Sinhvien a, String title, String MaSV, String HoDem, String TenSV,
            String GioiTinh, String NgaySinh, String Email, String SDT, String Khoa, String Nganh,
            String MaGV, String MaDA, float Diem) {
        super(title);
        initComponents();
        setVisible(true);
        setResizable(false);
        this.a = a;
        jTextField2.setText(MaSV);
        jTextField1.setText(HoDem);
        jTextField3.setText(TenSV);
        jTextField4.setText(MaGV);
        if(Khoa.equals("Khoa học máy tính")) {
            jComboBox3.setSelectedIndex(0);
        } else {
            jComboBox3.setSelectedIndex(1);
        }
        if(Nganh.equals("Công nghệ thông tin")) {
            jComboBox2.setSelectedIndex(0);
        } else if(Nganh.equals("Kỹ thuật máy tính")) {
            jComboBox2.setSelectedIndex(1);
        } else {
            jComboBox2.setSelectedIndex(2);
        }
        jTextField7.setText(Email);
        jTextField8.setText(SDT);
        jTextField10.setText(MaDA);
        jTextField11.setText(String.valueOf(Diem));
        if (GioiTinh.equals("Nữ")) {
            jComboBox1.setSelectedIndex(1);
        }
        jFormattedTextField1.setText(NgaySinh);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(138, 102, 53));
        jLabel13.setText("(mm/dd/yyyy)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, 30));

        jTextField3.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(80, 48, 5));
        jTextField3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 220, 30));

        jLabel12.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(80, 48, 5));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tên");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 190, 30));

        jFormattedTextField1.setForeground(new java.awt.Color(80, 48, 5));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        jFormattedTextField1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 220, 30));

        jLabel7.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 48, 5));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Ngày sinh ");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 210, 30));

        jLabel9.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(80, 48, 5));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 190, 30));

        jLabel5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 48, 5));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Họ đệm");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 190, 30));

        jLabel11.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(80, 48, 5));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Khoa");
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 30));

        jComboBox3.setBackground(new java.awt.Color(246, 172, 15));
        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(49, 34, 3));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học máy tính", "Kinh tế số & Thương mại điện tử" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(186, 30));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, -1));

        jComboBox2.setBackground(new java.awt.Color(246, 172, 15));
        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(49, 34, 3));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Kỹ thuật máy tính", "Quản trị kinh doanh" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(186, 30));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 220, -1));

        jComboBox1.setBackground(new java.awt.Color(246, 172, 15));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(49, 34, 3));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(186, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, -1));

        jTextField1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(80, 48, 5));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 220, 30));

        jTextField2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(80, 48, 5));
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 220, 30));

        jLabel8.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 48, 5));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Số điện thoại");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, 30));

        jLabel4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 48, 5));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã sinh viên");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, 30));

        jLabel10.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(80, 48, 5));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Ngành");
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 190, 30));

        jTextField8.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(80, 48, 5));
        jTextField8.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 30));

        jLabel6.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 48, 5));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Giới tính");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, 30));

        jLabel16.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(80, 48, 5));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Điểm");
        jLabel16.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 190, 30));

        jTextField11.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(80, 48, 5));
        jTextField11.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 220, 30));

        jTextField7.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(80, 48, 5));
        jTextField7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 220, 30));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN SINH VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(246, 172, 15));
        jLabel3.setFont(new java.awt.Font("#9Slide07 IcielBC Cubano Normal", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 48, 5));
        jLabel3.setText("____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(80, 48, 5));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Mã giảng viên");
        jLabel14.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 190, 30));

        jTextField4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(80, 48, 5));
        jTextField4.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 220, 30));

        jLabel15.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(80, 48, 5));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Mã đồ án");
        jLabel15.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 190, 30));

        jTextField10.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(80, 48, 5));
        jTextField10.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 220, 30));

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
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 120, 30));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, 30));

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nen.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox3.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jComboBox1.setSelectedIndex(0);
        jFormattedTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (this.getTitle() == "THÊM") {
            SinhVien sv = new SinhVien(jTextField2.getText(), jTextField1.getText(),
                    jTextField3.getText(), jComboBox1.getSelectedItem().toString(),
                    jFormattedTextField1.getText(), jTextField7.getText(),
                    jTextField8.getText(), jComboBox3.getSelectedItem().toString(),
                    jComboBox2.getSelectedItem().toString(), jTextField4.getText(),
                    jTextField10.getText(), Float.parseFloat(jTextField11.getText()));
            SinhVienDAO.Them(sv);
            a.ThemSV(jTextField2.getText(), jTextField1.getText(),
                    jTextField3.getText(), jComboBox1.getSelectedItem().toString(),
                    jFormattedTextField1.getText(), jTextField7.getText(),
                    jTextField8.getText(), jComboBox3.getSelectedItem().toString(),
                    jComboBox3.getSelectedItem().toString(), jTextField4.getText(),
                    jTextField10.getText(), Float.parseFloat(jTextField11.getText()));
            this.dispose();
        }
        if (this.getTitle() == "CHỈNH SỬA") {

            SinhVien sv = new SinhVien(jTextField2.getText(), jTextField1.getText(),
                    jTextField3.getText(), jComboBox1.getSelectedItem().toString(),
                    jFormattedTextField1.getText(), jTextField7.getText(),
                    jTextField8.getText(), jComboBox3.getSelectedItem().toString(),
                    jComboBox2.getSelectedItem().toString(), jTextField4.getText(),
                    jTextField10.getText(), Float.parseFloat(jTextField11.getText()));
            SinhVienDAO.ChinhSua(sv);
            a.ThemSV(jTextField2.getText(), jTextField1.getText(),
                    jTextField3.getText(), jComboBox1.getSelectedItem().toString(),
                    jFormattedTextField1.getText(), jTextField7.getText(),
                    jTextField8.getText(), jComboBox3.getSelectedItem().toString(),
                    jComboBox3.getSelectedItem().toString(), jTextField4.getText(),
                    jTextField10.getText(), Float.parseFloat(jTextField11.getText()));
            this.dispose();

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
