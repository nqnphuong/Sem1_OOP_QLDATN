
package Interface;

import Entity.GiangVien;
import DAO.GiangVienDAO;
import Entity.SinhVien;
import DAO.SinhVienDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        GiangVienList = GiangVienDAO.findAll();

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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(246, 172, 15));
        jLabel2.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 48, 5));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN GIẢNG VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã GV", "Họ đệm", "Tên GV", "Email", "SĐT", "Số lượng sinh viên hướng dẫn"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 910, 330));

        jButton3.setBackground(new java.awt.Color(246, 172, 15));
        jButton3.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(80, 48, 5));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/magnifying-glass.png"))); // NOI18N
        jButton3.setText("Tìm kiếm");
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 30));

        jButton4.setBackground(new java.awt.Color(246, 172, 15));
        jButton4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(80, 48, 5));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        jButton4.setText("Xoá");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 120, 30));

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
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 120, 30));

        jButton6.setBackground(new java.awt.Color(246, 172, 15));
        jButton6.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(80, 48, 5));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pencil.png"))); // NOI18N
        jButton6.setText("Chỉnh sửa");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 120, 30));

        jButton5.setBackground(new java.awt.Color(246, 172, 15));
        jButton5.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(80, 48, 5));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/up-chevron-button.png"))); // NOI18N
        jButton5.setText("Thêm");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 120, 30));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhập tên giảng viên tìm kiếm   ");
        if (input != null && input.length() > 0) {
            GiangVienList = GiangVienDAO.findByFullname(input);

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
        } else {
            showGiangVien();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex >= 0) {
            GiangVien gv = GiangVienList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá giảng viên này không ? ");
            if (option == 0) {
                GiangVienDAO.Xoa(gv.getMaGV());
                showGiangVien();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int row =jTable1.getSelectedRow();
        if(row >=0) {
            String MaGV= String.valueOf(jTable1.getValueAt(row, 0));
            String Hodem = String.valueOf(jTable1.getValueAt(row, 1));
            String TenSV = String.valueOf(jTable1.getValueAt(row, 2));
            String Email = String.valueOf(jTable1.getValueAt(row, 3));
            String SDT = String.valueOf(jTable1.getValueAt(row, 4));
            new QTV_GVCapnhat(this, "CHỈNH SỬA", MaGV, Hodem, TenSV, Email, SDT);       
        }
    }//GEN-LAST:event_jButton6ActionPerformed
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new QTV_GVCapnhat(this, "THÊM", null, null, null, null, null);
    }//GEN-LAST:event_jButton5ActionPerformed
    public void ThemGV(String MaGV, String HoDem, String TenGV, String Email, String SDT) {
        showGiangVien();
    }

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QTV_Giangvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
