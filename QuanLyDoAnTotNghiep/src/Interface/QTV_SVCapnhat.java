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
        tfMaSV.setText(MaSV);
        tfHoDem.setText(HoDem);
        tfTen.setText(TenSV);
        tfMaGV.setText(MaGV);
        if(Khoa.equals("Khoa học máy tính")) {
            cbKhoa.setSelectedIndex(0);
        } else {
            cbKhoa.setSelectedIndex(1);
        }
        if(Nganh.equals("Công nghệ thông tin")) {
            cbNganh.setSelectedIndex(0);
        } else if(Nganh.equals("Kỹ thuật máy tính")) {
            cbNganh.setSelectedIndex(1);
        } else {
            cbNganh.setSelectedIndex(2);
        }
        tfEmail.setText(Email);
        tfSDT.setText(SDT);
        tfMaDA.setText(MaDA);
        tfDiem.setText(String.valueOf(Diem));
        if (GioiTinh.equals("Nữ")) {
            cbGioiTinh.setSelectedIndex(1);
        }
        tfNgaySinh.setText(NgaySinh);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbKhoa = new javax.swing.JComboBox<>();
        cbNganh = new javax.swing.JComboBox<>();
        cbGioiTinh = new javax.swing.JComboBox<>();
        tfHoDem = new javax.swing.JTextField();
        tfMaSV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfDiem = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfMaGV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfMaDA = new javax.swing.JTextField();
        bThoat = new javax.swing.JButton();
        bThietLapLai = new javax.swing.JButton();
        bDongY = new javax.swing.JButton();
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

        tfTen.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfTen.setForeground(new java.awt.Color(80, 48, 5));
        tfTen.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(tfTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 220, 30));

        jLabel12.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(80, 48, 5));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tên");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 190, 30));

        tfNgaySinh.setForeground(new java.awt.Color(80, 48, 5));
        tfNgaySinh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        tfNgaySinh.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jPanel1.add(tfNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 220, 30));

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

        cbKhoa.setBackground(new java.awt.Color(246, 172, 15));
        cbKhoa.setEditable(true);
        cbKhoa.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        cbKhoa.setForeground(new java.awt.Color(49, 34, 3));
        cbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học máy tính", "Kinh tế số & Thương mại điện tử" }));
        cbKhoa.setPreferredSize(new java.awt.Dimension(186, 30));
        cbKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhoaActionPerformed(evt);
            }
        });
        jPanel1.add(cbKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, -1));

        cbNganh.setBackground(new java.awt.Color(246, 172, 15));
        cbNganh.setEditable(true);
        cbNganh.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        cbNganh.setForeground(new java.awt.Color(49, 34, 3));
        cbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Kỹ thuật máy tính", "Quản trị kinh doanh" }));
        cbNganh.setPreferredSize(new java.awt.Dimension(186, 30));
        cbNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNganhActionPerformed(evt);
            }
        });
        jPanel1.add(cbNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 220, -1));

        cbGioiTinh.setBackground(new java.awt.Color(246, 172, 15));
        cbGioiTinh.setEditable(true);
        cbGioiTinh.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        cbGioiTinh.setForeground(new java.awt.Color(49, 34, 3));
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.setPreferredSize(new java.awt.Dimension(186, 30));
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });
        jPanel1.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, -1));

        tfHoDem.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfHoDem.setForeground(new java.awt.Color(80, 48, 5));
        tfHoDem.setPreferredSize(new java.awt.Dimension(200, 20));
        tfHoDem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoDemActionPerformed(evt);
            }
        });
        jPanel1.add(tfHoDem, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 220, 30));

        tfMaSV.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaSV.setForeground(new java.awt.Color(80, 48, 5));
        tfMaSV.setPreferredSize(new java.awt.Dimension(200, 20));
        tfMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaSVActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 220, 30));

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

        tfSDT.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfSDT.setForeground(new java.awt.Color(80, 48, 5));
        tfSDT.setPreferredSize(new java.awt.Dimension(200, 20));
        tfSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSDTActionPerformed(evt);
            }
        });
        jPanel1.add(tfSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 30));

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

        tfDiem.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfDiem.setForeground(new java.awt.Color(80, 48, 5));
        tfDiem.setPreferredSize(new java.awt.Dimension(200, 20));
        tfDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiemActionPerformed(evt);
            }
        });
        jPanel1.add(tfDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 220, 30));

        tfEmail.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(80, 48, 5));
        tfEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 220, 30));

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

        tfMaGV.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaGV.setForeground(new java.awt.Color(80, 48, 5));
        tfMaGV.setPreferredSize(new java.awt.Dimension(200, 20));
        tfMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaGVActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 220, 30));

        jLabel15.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(80, 48, 5));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Mã đồ án");
        jLabel15.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 190, 30));

        tfMaDA.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        tfMaDA.setForeground(new java.awt.Color(80, 48, 5));
        tfMaDA.setPreferredSize(new java.awt.Dimension(200, 20));
        tfMaDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaDAActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 220, 30));

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
        jPanel1.add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 120, 30));

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
        jPanel1.add(bThietLapLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, 30));

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
        jPanel1.add(bDongY, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 120, 30));

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

    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed

    private void tfSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSDTActionPerformed

    private void tfMaDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaDAActionPerformed

    private void bThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();

    }//GEN-LAST:event_bThoatActionPerformed

    private void bThietLapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThietLapLaiActionPerformed
        tfHoDem.setText("");
        tfMaSV.setText("");
        tfTen.setText("");
        tfMaGV.setText("");
        cbKhoa.setSelectedIndex(0);
        cbNganh.setSelectedIndex(0);
        tfEmail.setText("");
        tfSDT.setText("");
        tfMaDA.setText("");
        tfDiem.setText("");
        cbGioiTinh.setSelectedIndex(0);
        tfNgaySinh.setText("");
    }//GEN-LAST:event_bThietLapLaiActionPerformed

    private void tfMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaSVActionPerformed

    private void tfHoDemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoDemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoDemActionPerformed

    private void tfDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiemActionPerformed

    private void bDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDongYActionPerformed
        if (this.getTitle() == "THÊM") {
            SinhVien sv = new SinhVien(tfMaSV.getText(), tfHoDem.getText(),
                    tfTen.getText(), cbGioiTinh.getSelectedItem().toString(),
                    tfNgaySinh.getText(), tfEmail.getText(),
                    tfSDT.getText(), cbKhoa.getSelectedItem().toString(),
                    cbNganh.getSelectedItem().toString(), tfMaGV.getText(),
                    tfMaDA.getText(), Float.parseFloat(tfDiem.getText()));
            SinhVienDAO.Them(sv);
            a.CapNhat();
            this.dispose();
            
        }
        if (this.getTitle() == "CHỈNH SỬA") {
            SinhVien sv = new SinhVien(tfMaSV.getText(), tfHoDem.getText(),
                    tfTen.getText(), cbGioiTinh.getSelectedItem().toString(),
                    tfNgaySinh.getText(), tfEmail.getText(),
                    tfSDT.getText(), cbKhoa.getSelectedItem().toString(),
                    cbNganh.getSelectedItem().toString(), tfMaGV.getText(),
                    tfMaDA.getText(), Float.parseFloat(tfDiem.getText()));
            SinhVienDAO.ChinhSua(sv);
            a.CapNhat();
            this.dispose();

        }
    }//GEN-LAST:event_bDongYActionPerformed

    private void tfMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaGVActionPerformed

    private void cbNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNganhActionPerformed

    private void cbKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhoaActionPerformed

    }//GEN-LAST:event_cbKhoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDongY;
    private javax.swing.JButton bThietLapLai;
    private javax.swing.JButton bThoat;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JComboBox<String> cbNganh;
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
    private javax.swing.JTextField tfDiem;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoDem;
    private javax.swing.JTextField tfMaDA;
    private javax.swing.JTextField tfMaGV;
    private javax.swing.JTextField tfMaSV;
    private javax.swing.JFormattedTextField tfNgaySinh;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables

}
