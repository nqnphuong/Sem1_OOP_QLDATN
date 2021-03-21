package Interface;

import Entity.SinhVien;
import DAO.SinhVienDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QTV_Sinhvien extends javax.swing.JFrame {
    DefaultTableModel dtb;
    List<SinhVien> SinhVienList = new ArrayList<>();
    public QTV_Sinhvien() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUẢN LÝ ĐỒ ÁN TỐT NGHIỆP - THÔNG TIN SINH VIÊN");
        dtb = (DefaultTableModel) jTable1.getModel();
        showSinhVien();
    }
    public void showSinhVien() {
        SinhVienList = SinhVienDAO.HienThi();
        dtb.setRowCount(0);
        SinhVienList.forEach((SinhVien) -> {
            dtb.addRow(new Object[]{
                SinhVien.getMaSV(),
                SinhVien.getHoDem(),
                SinhVien.getTenSV(),
                SinhVien.getGioiTinh(),
                SinhVien.getNgaySinh(),
                SinhVien.getEmail(),
                SinhVien.getSDT(),
                SinhVien.getKhoa(),
                SinhVien.getNganh(),
                SinhVien.getMaGV(),
                SinhVien.getMaDA(),
                SinhVien.getDiem()});
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bQuayLai = new javax.swing.JButton();
        bTimKiem = new javax.swing.JButton();
        bChinhSua = new javax.swing.JButton();
        bThem = new javax.swing.JButton();
        bXoa = new javax.swing.JButton();
        bThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(246, 172, 15));
        jLabel3.setFont(new java.awt.Font("#9Slide07 IcielBC Cubano Normal", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 48, 5));
        jLabel3.setText("____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN SINH VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ đệm", "Tên", "Giới tính", "Ngày sinh", "Email", "SDT", "Khoa", "Ngành", "Mã GV", "Mã ĐA", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(140);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(140);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(140);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(5).setMinWidth(120);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(6).setMinWidth(80);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(9).setMinWidth(50);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(9).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(10).setMinWidth(50);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(10).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(11).setMinWidth(50);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(11).setMaxWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 910, 330));

        bQuayLai.setBackground(new java.awt.Color(246, 172, 15));
        bQuayLai.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bQuayLai.setForeground(new java.awt.Color(80, 48, 5));
        bQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh-page-option.png"))); // NOI18N
        bQuayLai.setText("Quay lại");
        bQuayLai.setBorder(null);
        bQuayLai.setPreferredSize(new java.awt.Dimension(50, 25));
        bQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuayLaiActionPerformed(evt);
            }
        });
        jPanel1.add(bQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 30));

        bTimKiem.setBackground(new java.awt.Color(246, 172, 15));
        bTimKiem.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bTimKiem.setForeground(new java.awt.Color(80, 48, 5));
        bTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/magnifying-glass.png"))); // NOI18N
        bTimKiem.setText("Tìm kiếm");
        bTimKiem.setBorder(null);
        bTimKiem.setPreferredSize(new java.awt.Dimension(50, 25));
        bTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(bTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 110, 30));

        bChinhSua.setBackground(new java.awt.Color(246, 172, 15));
        bChinhSua.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bChinhSua.setForeground(new java.awt.Color(80, 48, 5));
        bChinhSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pencil.png"))); // NOI18N
        bChinhSua.setText("Chỉnh sửa");
        bChinhSua.setBorder(null);
        bChinhSua.setPreferredSize(new java.awt.Dimension(50, 25));
        bChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChinhSuaActionPerformed(evt);
            }
        });
        jPanel1.add(bChinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 110, 30));

        bThem.setBackground(new java.awt.Color(246, 172, 15));
        bThem.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bThem.setForeground(new java.awt.Color(80, 48, 5));
        bThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/up-chevron-button.png"))); // NOI18N
        bThem.setText("Thêm");
        bThem.setBorder(null);
        bThem.setPreferredSize(new java.awt.Dimension(50, 25));
        bThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThemActionPerformed(evt);
            }
        });
        jPanel1.add(bThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 110, 30));

        bXoa.setBackground(new java.awt.Color(246, 172, 15));
        bXoa.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bXoa.setForeground(new java.awt.Color(80, 48, 5));
        bXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        bXoa.setText("Xoá");
        bXoa.setBorder(null);
        bXoa.setPreferredSize(new java.awt.Dimension(50, 25));
        bXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXoaActionPerformed(evt);
            }
        });
        jPanel1.add(bXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 110, 30));

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
        jPanel1.add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nen.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimKiemActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhập tên sinh viên tìm kiếm");
        if (input != null && input.length() > 0) {
            SinhVienList = SinhVienDAO.Tim(input);
            dtb.setRowCount(0);
            SinhVienList.forEach((SinhVien) -> {
                dtb.addRow(new Object[]{
                    SinhVien.getMaSV(),
                    SinhVien.getHoDem(),
                    SinhVien.getTenSV(),
                    SinhVien.getGioiTinh(),
                    SinhVien.getNgaySinh(),
                    SinhVien.getEmail(),
                    SinhVien.getSDT(),
                    SinhVien.getKhoa(),
                    SinhVien.getNganh(),
                    SinhVien.getMaGV(),
                    SinhVien.getMaDA(),
                    SinhVien.getDiem()});
            });
        }
    }//GEN-LAST:event_bTimKiemActionPerformed

    private void bChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChinhSuaActionPerformed

        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            String MaSV = String.valueOf(jTable1.getValueAt(row, 0));
            String Hodem = String.valueOf(jTable1.getValueAt(row, 1));
            String TenSV = String.valueOf(jTable1.getValueAt(row, 2));
            String GioiTinh = String.valueOf(jTable1.getValueAt(row, 3));
            String NgaySinh = String.valueOf(jTable1.getValueAt(row, 4));
            String Email = String.valueOf(jTable1.getValueAt(row, 5));
            String SDT = String.valueOf(jTable1.getValueAt(row, 6));
            String Khoa = String.valueOf(jTable1.getValueAt(row, 7));
            String Nganh = String.valueOf(jTable1.getValueAt(row, 8));
            String MaGV = String.valueOf(jTable1.getValueAt(row, 9));
            String MaDA = String.valueOf(jTable1.getValueAt(row, 10));
            float Diem = (float) jTable1.getValueAt(row, 11);

            new QTV_SVCapnhat(this, "CHỈNH SỬA", MaSV, Hodem, TenSV, GioiTinh, NgaySinh, Email, SDT, Khoa, Nganh, MaGV, MaDA, Diem);

        }
    }//GEN-LAST:event_bChinhSuaActionPerformed

    private void bThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThemActionPerformed
        new QTV_SVCapnhat(this, "THÊM", null, null, null, "Nam", null, null, null, "Khoa học máy tính", "Công nghệ thông tin", null, null, 0);

    }//GEN-LAST:event_bThemActionPerformed
    public void CapNhat() {
        showSinhVien();
    }
    private void bXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXoaActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex >= 0) {
            SinhVien sv = SinhVienList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sinh viên này không ? ");
            if (option == 0) {
                SinhVienDAO.Xoa(sv.getMaSV());
                showSinhVien();
            }
        }
    }//GEN-LAST:event_bXoaActionPerformed

    private void bThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();

    }//GEN-LAST:event_bThoatActionPerformed

    private void bQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuayLaiActionPerformed
        showSinhVien();
    }//GEN-LAST:event_bQuayLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChinhSua;
    private javax.swing.JButton bQuayLai;
    private javax.swing.JButton bThem;
    private javax.swing.JButton bThoat;
    private javax.swing.JButton bTimKiem;
    private javax.swing.JButton bXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
