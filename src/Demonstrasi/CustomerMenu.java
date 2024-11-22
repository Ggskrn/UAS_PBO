package Demonstrasi;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CustomerMenu extends javax.swing.JFrame {
    /**
     * Creates new form UserMenu
     */
    public CustomerMenu() {
        initComponents();
        loadCustomerData();
        loadSellerData();
        loadDriverData();
    }
    private void loadCustomerData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID Customer", "Nama"}, 0);
        try {
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT id, nameFull FROM customer";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nameFull");
                model.addRow(new Object[]{id, nama});
            }

            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data customer: " + e.getMessage());
        }
    }

    private void loadSellerData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID Seller", "Nama"}, 0);
        try {
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT id, nameFull FROM seller";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nameFull");
                model.addRow(new Object[]{id, nama});
            }

            jTable2.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data seller: " + e.getMessage());
        }
    }

    private void loadDriverData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID Driver", "Nama"}, 0);
        try {
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT id, nameFull FROM driver";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nameFull");
                model.addRow(new Object[]{id, nama});
            }

            jTable3.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data driver: " + e.getMessage());
        }
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jumlahKaos = new javax.swing.JLabel();
        jumlahKemeja = new javax.swing.JLabel();
        jumlahCelana = new javax.swing.JLabel();
        buatpesananBT = new javax.swing.JButton();
        liatpesananBT = new javax.swing.JButton();
        ketjumlahKaos = new javax.swing.JTextField();
        ketjumlahKemeja = new javax.swing.JTextField();
        ketjumlahCelana = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Alamat1 = new javax.swing.JLabel();
        pilihdriverTF = new javax.swing.JTextField();
        Alamat2 = new javax.swing.JLabel();
        pilihsellerTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Alamat3 = new javax.swing.JLabel();
        pilihcustomerTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jumlahKaos.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahKaos.setText("Number of t-shirts (3000)");

        jumlahKemeja.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahKemeja.setText("Number of Shirts (4000)");

        jumlahCelana.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jumlahCelana.setText("Number of Pants (5000)");

        buatpesananBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buatpesananBT.setText("Buat Pesanan");
        buatpesananBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatpesananBTActionPerformed(evt);
            }
        });

        liatpesananBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        liatpesananBT.setText("Lihat Status Pesanan");
        liatpesananBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liatpesananBTActionPerformed(evt);
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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
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
        jScrollPane1.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setText("GO DRY");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setText("CUSTOMER MENU");

        exitBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });

        jTable3.setBackground(new java.awt.Color(153, 153, 0));
        jTable3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable3.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
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
        jScrollPane2.setViewportView(jTable3);

        Alamat1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Alamat1.setText("Pilih ID Driver");

        pilihdriverTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihdriverTFActionPerformed(evt);
            }
        });

        Alamat2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Alamat2.setText("Pilih  ID Seller");

        pilihsellerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihsellerTFActionPerformed(evt);
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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Customer", "Nama"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        Alamat3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Alamat3.setText("Pilih ID Customer");

        pilihcustomerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihcustomerTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(419, 419, 419))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(buatpesananBT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(liatpesananBT)
                                        .addGap(12, 12, 12)
                                        .addComponent(exitBT, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Alamat2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pilihsellerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jumlahCelana, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ketjumlahCelana, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jumlahKaos)
                                                    .addComponent(jumlahKemeja, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ketjumlahKaos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ketjumlahKemeja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Alamat3)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(pilihcustomerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Alamat1)
                                            .addGap(18, 18, 18)
                                            .addComponent(pilihdriverTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(6, 6, 6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihcustomerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alamat3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahKaos)
                            .addComponent(ketjumlahKaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahKemeja)
                            .addComponent(ketjumlahKemeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ketjumlahCelana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahCelana))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat2)
                    .addComponent(pilihsellerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alamat1)
                    .addComponent(pilihdriverTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBT)
                    .addComponent(liatpesananBT)
                    .addComponent(buatpesananBT))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buatpesananBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatpesananBTActionPerformed
        // TODO add your handling code here:    
        try {
            // Ambil data dari text field
            int jumlahKaos = Integer.parseInt(ketjumlahKaos.getText());
            int jumlahKemeja = Integer.parseInt(ketjumlahKemeja.getText());
            int jumlahCelana = Integer.parseInt(ketjumlahCelana.getText());
    
            String idCustomer = pilihcustomerTF.getText();
            String idSeller = pilihsellerTF.getText();
            String idDriver = pilihdriverTF.getText();

            // Validasi input
            if (jumlahKaos <= 0 || jumlahKemeja <= 0 || jumlahCelana <= 0 || idSeller.isEmpty() || idDriver.isEmpty() || idCustomer.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pastikan semua data telah diisi dengan benar.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Menghitung total biaya
            int totalCost = (jumlahKaos * 3000) + (jumlahKemeja * 4000) + (jumlahCelana * 5000);
    
            // Proses pembuatan pesanan
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO pesanan (idSeller, idDriver, idCustomer, totalTshirt, totalShirt, totalPants, totalCost, statusPesanan) "
                 + "VALUES ('" + idSeller + "', '" + idDriver + "', '" + idCustomer + "', " 
                 + jumlahKaos + ", " + jumlahKemeja + ", " + jumlahCelana + ", " + totalCost + ", 'Pending')";

            int result = stmt.executeUpdate(query);
    
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Pesanan berhasil dibuat!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat pesanan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }

            // Reset input form
            ketjumlahKaos.setText("");  
            ketjumlahKemeja.setText("");
            ketjumlahCelana.setText("");
            pilihsellerTF.setText("");
            pilihdriverTF.setText("");
            pilihcustomerTF.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harap masukkan angka yang valid untuk jumlah pakaian.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat pesanan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buatpesananBTActionPerformed

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

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:       
        new Closing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitBTActionPerformed

    private void pilihdriverTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihdriverTFActionPerformed
        // TODO add your handling code here:
        pilihdriverTF.setText("");
    }//GEN-LAST:event_pilihdriverTFActionPerformed

    private void pilihsellerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihsellerTFActionPerformed
        // TODO add your handling code here:
        pilihsellerTF.setText("");
    }//GEN-LAST:event_pilihsellerTFActionPerformed

    private void liatpesananBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liatpesananBTActionPerformed
        // TODO add your handling code here:
        Pesanan pesananForm = new Pesanan();
        pesananForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_liatpesananBTActionPerformed

    private void pilihcustomerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihcustomerTFActionPerformed
        // TODO add your handling code here:
        pilihcustomerTF.setText("");
    }//GEN-LAST:event_pilihcustomerTFActionPerformed
    
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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat1;
    private javax.swing.JLabel Alamat2;
    private javax.swing.JLabel Alamat3;
    private javax.swing.JButton buatpesananBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jumlahCelana;
    private javax.swing.JLabel jumlahKaos;
    private javax.swing.JLabel jumlahKemeja;
    private javax.swing.JTextField ketjumlahCelana;
    private javax.swing.JTextField ketjumlahKaos;
    private javax.swing.JTextField ketjumlahKemeja;
    private javax.swing.JButton liatpesananBT;
    private javax.swing.JTextField pilihcustomerTF;
    private javax.swing.JTextField pilihdriverTF;
    private javax.swing.JTextField pilihsellerTF;
    // End of variables declaration//GEN-END:variables
}
