
package Interface;

import Entity.GiangVien;
import DAO.GiangVienDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QTV_Giangvien extends javax.swing.JFrame {

    DefaultTableModel dtb;
    List<GiangVien> GiangVienList = new ArrayList<>();

    public QTV_Giangvien() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUẢN LÝ ĐỒ ÁN TỐT NGHIỆP - THÔNG TIN GIẢNG VIÊN");
        dtb = (DefaultTableModel) jTable1.getModel();
        showGiangVien();
    }

    public void showGiangVien() {
        GiangVienList = GiangVienDAO.HienThi();
        dtb.setRowCount(0);
        GiangVienList.forEach((GiangVien) -> {
            dtb.addRow(new Object[]{
                GiangVien.getMaGV(),
                GiangVien.getHoDem(),
                GiangVien.getTenGV(),
                GiangVien.getEmail(),
                GiangVien.getSDT(),
                GiangVien.getSoLuong()});

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bQuayLai = new javax.swing.JButton();
        bTimKiem = new javax.swing.JButton();
        bChinhSua = new javax.swing.JButton();
        bThem = new javax.swing.JButton();
        bXoa = new javax.swing.JButton();
        bChiTiet = new javax.swing.JButton();
        bThoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 229, 166));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 172, 15), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã GV", "Họ đệm", "Tên GV", "Email", "SĐT", "Số lượng sinh viên hướng dẫn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(170);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(2).setMinWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMinWidth(130);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(4).setMinWidth(130);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(130);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 780, 380));

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
        jPanel1.add(bQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 110, 30));

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
        jPanel1.add(bTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 110, 30));

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
        jPanel1.add(bChinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 110, 30));

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
        jPanel1.add(bThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 110, 30));

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
        jPanel1.add(bXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 110, 30));

        bChiTiet.setBackground(new java.awt.Color(246, 172, 15));
        bChiTiet.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bChiTiet.setForeground(new java.awt.Color(80, 48, 5));
        bChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/share-option.png"))); // NOI18N
        bChiTiet.setText("Chi tiết");
        bChiTiet.setBorder(null);
        bChiTiet.setPreferredSize(new java.awt.Dimension(50, 25));
        bChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChiTietActionPerformed(evt);
            }
        });
        jPanel1.add(bChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 110, 30));

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
        jPanel1.add(bThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 110, 30));

        jLabel3.setBackground(new java.awt.Color(246, 172, 15));
        jLabel3.setFont(new java.awt.Font("#9Slide07 IcielBC Cubano Normal", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 48, 5));
        jLabel3.setText("____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN GIẢNG VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nen.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuayLaiActionPerformed
        showGiangVien();
    }//GEN-LAST:event_bQuayLaiActionPerformed

    private void bTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimKiemActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhập tên giảng viên tìm kiếm   ");
        if (input != null && input.length() > 0) {
            GiangVienList = GiangVienDAO.Tim(input);
            dtb.setRowCount(0);
            GiangVienList.forEach((GiangVien) -> {
                dtb.addRow(new Object[]{
                    GiangVien.getMaGV(),
                    GiangVien.getHoDem(),
                    GiangVien.getTenGV(),
                    GiangVien.getEmail(),
                    GiangVien.getSDT(),
                    GiangVien.getSoLuong()});
            });
        }
    }//GEN-LAST:event_bTimKiemActionPerformed

    private void bChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChinhSuaActionPerformed
        int row =jTable1.getSelectedRow();
        if(row >=0) {
            String MaGV= String.valueOf(jTable1.getValueAt(row, 0));
            String Hodem = String.valueOf(jTable1.getValueAt(row, 1));
            String TenSV = String.valueOf(jTable1.getValueAt(row, 2));
            String Email = String.valueOf(jTable1.getValueAt(row, 3));
            String SDT = String.valueOf(jTable1.getValueAt(row, 4));
            new QTV_GVCapnhat(this, "CHỈNH SỬA", MaGV, Hodem, TenSV, Email, SDT);
        }
    }//GEN-LAST:event_bChinhSuaActionPerformed

    private void bThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThemActionPerformed
        new QTV_GVCapnhat(this, "THÊM", null, null, null, null, null);
    }//GEN-LAST:event_bThemActionPerformed

    private void bXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXoaActionPerformed
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            GiangVien gv = GiangVienList.get(row);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá giảng viên này không ? ");
            if (option == 0) {
                GiangVienDAO.Xoa(gv.getMaGV());
                showGiangVien();
            }
        }
    }//GEN-LAST:event_bXoaActionPerformed

    private void bChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChiTietActionPerformed
        int row = jTable1.getSelectedRow();
        if (row>=0) {
            String MaGV = String.valueOf(jTable1.getValueAt(row, 0));
            new QTV_GVChiTiet(MaGV);

        }

    }//GEN-LAST:event_bChiTietActionPerformed

    private void bThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_bThoatActionPerformed
       public void CapNhat() {
        showGiangVien();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChiTiet;
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
