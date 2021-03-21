
package Interface;

import DAO.SinhVienDAO;
import javax.swing.JOptionPane;

public class QTV_Giaodienchinh extends javax.swing.JFrame {

    public QTV_Giaodienchinh() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("QUẢN LÝ ĐỒ ÁN TỐT NGHIỆP");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        bGiangVien = new javax.swing.JButton();
        bDoAn = new javax.swing.JButton();
        bSinhVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(80, 48, 5));
        jButton7.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(246, 172, 15));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i4.png"))); // NOI18N
        jButton7.setText("Thoát");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, 90));

        bGiangVien.setBackground(new java.awt.Color(249, 229, 166));
        bGiangVien.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bGiangVien.setForeground(new java.awt.Color(80, 48, 5));
        bGiangVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i2.png"))); // NOI18N
        bGiangVien.setText("Giảng viên");
        bGiangVien.setBorder(null);
        bGiangVien.setMaximumSize(new java.awt.Dimension(65, 20));
        bGiangVien.setMinimumSize(new java.awt.Dimension(65, 20));
        bGiangVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGiangVienActionPerformed(evt);
            }
        });
        getContentPane().add(bGiangVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 90));

        bDoAn.setBackground(new java.awt.Color(249, 229, 166));
        bDoAn.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bDoAn.setForeground(new java.awt.Color(80, 48, 5));
        bDoAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i3.png"))); // NOI18N
        bDoAn.setText("Đồ án");
        bDoAn.setBorder(null);
        bDoAn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bDoAn.setMaximumSize(new java.awt.Dimension(65, 20));
        bDoAn.setMinimumSize(new java.awt.Dimension(65, 20));
        bDoAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoAnActionPerformed(evt);
            }
        });
        getContentPane().add(bDoAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, 90));

        bSinhVien.setBackground(new java.awt.Color(249, 229, 166));
        bSinhVien.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        bSinhVien.setForeground(new java.awt.Color(80, 48, 5));
        bSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i1.png"))); // NOI18N
        bSinhVien.setText("  Sinh viên");
        bSinhVien.setBorder(null);
        bSinhVien.setMaximumSize(new java.awt.Dimension(65, 20));
        bSinhVien.setMinimumSize(new java.awt.Dimension(65, 20));
        bSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSinhVienActionPerformed(evt);
            }
        });
        getContentPane().add(bSinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QTV_Giaodienchinh.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không ? ");
            if (option == 0) {
                this.dispose();
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void bSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSinhVienActionPerformed

       new QTV_Sinhvien();
    }//GEN-LAST:event_bSinhVienActionPerformed

    private void bDoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoAnActionPerformed

        new QTV_DoAn();
    }//GEN-LAST:event_bDoAnActionPerformed

    private void bGiangVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGiangVienActionPerformed

        new QTV_Giangvien();
    }//GEN-LAST:event_bGiangVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDoAn;
    private javax.swing.JButton bGiangVien;
    private javax.swing.JButton bSinhVien;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
