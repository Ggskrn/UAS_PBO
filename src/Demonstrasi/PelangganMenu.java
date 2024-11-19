package Demonstrasi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PelangganMenu extends javax.swing.JFrame {

    /**
     * Creates new form UserMenu
     */
    public PelangganMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NPM = new javax.swing.JPanel();
        jumlahKaos = new javax.swing.JLabel();
        jumlahKemeja = new javax.swing.JLabel();
        jumlahCelana = new javax.swing.JLabel();
        simpanData = new javax.swing.JButton();
        hapusData = new javax.swing.JButton();
        ketjumlahKaos = new javax.swing.JTextField();
        ketjumlahKemeja = new javax.swing.JTextField();
        ketjumlahCelana = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hapusData3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Alamat1 = new javax.swing.JLabel();
        ketAlamat1 = new javax.swing.JTextField();
        Alamat2 = new javax.swing.JLabel();
        ketAlamat2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NPM.setBackground(new java.awt.Color(153, 255, 153));

        jumlahKaos.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahKaos.setText("Number of t-shirts (3000)");

        jumlahKemeja.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahKemeja.setText("Number of Shirts (4000)");

        jumlahCelana.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahCelana.setText("Number of Pants (5000)");

        simpanData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpanData.setText("Buat Pesanan");
        simpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDataActionPerformed(evt);
            }
        });

        hapusData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapusData.setText("Lihat Status Pesanan");
        hapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDataActionPerformed(evt);
            }
        });

        ketjumlahKaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketjumlahKaosActionPerformed(evt);
            }
        });

        ketjumlahKemeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketjumlahKemejaActionPerformed(evt);
            }
        });

        ketjumlahCelana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketjumlahCelanaActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 153, 0));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Seller", "Nama"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setText("GO DRY");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setText("CUSTOMER MENU");

        hapusData3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapusData3.setText("Exit");
        hapusData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusData3ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(153, 153, 0));
        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Driver", "Nama"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Alamat1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Alamat1.setText("Pilih Driver");

        ketAlamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketAlamat1ActionPerformed(evt);
            }
        });

        Alamat2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Alamat2.setText("Pilih Seller");

        ketAlamat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketAlamat2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NPMLayout = new javax.swing.GroupLayout(NPM);
        NPM.setLayout(NPMLayout);
        NPMLayout.setHorizontalGroup(
            NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPMLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NPMLayout.createSequentialGroup()
                        .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jumlahCelana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jumlahKemeja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jumlahKaos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ketjumlahKaos)
                            .addComponent(ketjumlahKemeja)
                            .addComponent(ketjumlahCelana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NPMLayout.createSequentialGroup()
                        .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPMLayout.createSequentialGroup()
                                .addComponent(simpanData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusData3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPMLayout.createSequentialGroup()
                                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NPMLayout.createSequentialGroup()
                                        .addComponent(Alamat2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(ketAlamat2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(NPMLayout.createSequentialGroup()
                                        .addComponent(Alamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ketAlamat1))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NPMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(237, 237, 237)
                .addComponent(jLabel2)
                .addGap(75, 75, 75))
        );
        NPMLayout.setVerticalGroup(
            NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPMLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahKaos)
                    .addComponent(ketjumlahKaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahKemeja)
                    .addComponent(ketjumlahKemeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ketjumlahCelana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahCelana))
                .addGap(18, 18, 18)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat2)
                    .addComponent(ketAlamat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alamat1)
                    .addComponent(ketAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusData3)
                    .addComponent(hapusData)
                    .addComponent(simpanData))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(NPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(NPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDataActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_simpanDataActionPerformed

    private void ketjumlahKaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketjumlahKaosActionPerformed
        // TODO add your handling code here:
        ketjumlahKaos.setText("");
    }//GEN-LAST:event_ketjumlahKaosActionPerformed

    private void ketjumlahKemejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketjumlahKemejaActionPerformed
        // TODO add your handling code here:
        ketjumlahKemeja.setText("");
    }//GEN-LAST:event_ketjumlahKemejaActionPerformed

    private void ketjumlahCelanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketjumlahCelanaActionPerformed
        // TODO add your handling code here:
        ketjumlahCelana.setText("");
    }//GEN-LAST:event_ketjumlahCelanaActionPerformed

    private void hapusData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusData3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusData3ActionPerformed

    private void ketAlamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketAlamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ketAlamat1ActionPerformed

    private void ketAlamat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketAlamat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ketAlamat2ActionPerformed

    private void hapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDataActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_hapusDataActionPerformed

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
            java.util.logging.Logger.getLogger(PelangganMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat1;
    private javax.swing.JLabel Alamat2;
    private javax.swing.JPanel NPM;
    private javax.swing.JButton hapusData;
    private javax.swing.JButton hapusData3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jumlahCelana;
    private javax.swing.JLabel jumlahKaos;
    private javax.swing.JLabel jumlahKemeja;
    private javax.swing.JTextField ketAlamat1;
    private javax.swing.JTextField ketAlamat2;
    private javax.swing.JTextField ketjumlahCelana;
    private javax.swing.JTextField ketjumlahKaos;
    private javax.swing.JTextField ketjumlahKemeja;
    private javax.swing.JButton simpanData;
    // End of variables declaration//GEN-END:variables
}
