
package Interface;

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
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        jButton4.setBackground(new java.awt.Color(249, 229, 166));
        jButton4.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(80, 48, 5));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i2.png"))); // NOI18N
        jButton4.setText("Giảng viên");
        jButton4.setBorder(null);
        jButton4.setMaximumSize(new java.awt.Dimension(65, 20));
        jButton4.setMinimumSize(new java.awt.Dimension(65, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 90));

        jButton3.setBackground(new java.awt.Color(249, 229, 166));
        jButton3.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(80, 48, 5));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i3.png"))); // NOI18N
        jButton3.setText("Đồ án");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setMaximumSize(new java.awt.Dimension(65, 20));
        jButton3.setMinimumSize(new java.awt.Dimension(65, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 150, 90));

        jButton1.setBackground(new java.awt.Color(249, 229, 166));
        jButton1.setFont(new java.awt.Font("#9Slide03 Varela Round", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(80, 48, 5));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i1.png"))); // NOI18N
        jButton1.setText("  Sinh viên");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(65, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(65, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QTV_Giaodienchinh.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        new DangNhap();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       new QTV_Sinhvien();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new QTV_DoAn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new QTV_Giangvien();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QTV_Giaodienchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QTV_Giaodienchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QTV_Giaodienchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QTV_Giaodienchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QTV_Giaodienchinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
