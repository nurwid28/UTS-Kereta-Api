/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_keretaapi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Widya
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        stasiunTujuan = new javax.swing.JTextField();
        stasiunAwal = new javax.swing.JTextField();
        rdEkonomi = new javax.swing.JRadioButton();
        rdEksekutif = new javax.swing.JRadioButton();
        duduk = new javax.swing.JComboBox<>();
        wktBerangkat = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bPrint = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        bRefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1040, 10);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(0, 0, 1040, 10);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 50)); // NOI18N
        jLabel13.setText("PT K.A INDONESIA ");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(40, 20, 530, 50);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setText("Daerah Operational Malang");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(40, 80, 420, 40);

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10);
        jPanel10.setBounds(0, 130, 1040, 10);

        jPanel12.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel4.setText("No.ID");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(580, 20, 60, 29);

        jLabel5.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Berangkat");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(400, 150, 140, 29);

        jLabel6.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel6.setText("Station Awal");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(60, 70, 140, 29);

        jLabel7.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel7.setText("Nama ");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(200, 20, 70, 29);

        jLabel8.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel8.setText("Statiun Tujuan");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(60, 150, 140, 29);

        jLabel9.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel9.setText("Jenis Kereta");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(400, 70, 140, 29);

        jLabel10.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel10.setText("Waktu Berangkat");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(750, 70, 140, 29);

        jLabel11.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel11.setText("Tempat Duduk");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(750, 150, 140, 29);

        jLabel12.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 14)); // NOI18N
        jLabel12.setText("Harga");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(380, 250, 90, 29);

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel6.add(ID);
        ID.setBounds(660, 20, 240, 40);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel6.add(Nama);
        Nama.setBounds(270, 20, 230, 40);

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel6.add(harga);
        harga.setBounds(460, 250, 230, 40);

        stasiunTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stasiunTujuanActionPerformed(evt);
            }
        });
        jPanel6.add(stasiunTujuan);
        stasiunTujuan.setBounds(60, 180, 230, 40);

        stasiunAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stasiunAwalActionPerformed(evt);
            }
        });
        jPanel6.add(stasiunAwal);
        stasiunAwal.setBounds(60, 100, 230, 40);

        buttonGroup1.add(rdEkonomi);
        rdEkonomi.setText("Ekonomi - AC");
        rdEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEkonomiActionPerformed(evt);
            }
        });
        jPanel6.add(rdEkonomi);
        rdEkonomi.setBounds(390, 100, 107, 25);

        buttonGroup1.add(rdEksekutif);
        rdEksekutif.setText("Eksekutif ");
        rdEksekutif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEksekutifActionPerformed(evt);
            }
        });
        jPanel6.add(rdEksekutif);
        rdEksekutif.setBounds(510, 100, 83, 25);

        duduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERBONG", "1", "2", "3", "4", "5" }));
        jPanel6.add(duduk);
        duduk.setBounds(750, 180, 230, 30);

        wktBerangkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jam Berangkat", "07.10", "10.30", "14.45", "18.30" }));
        wktBerangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wktBerangkatActionPerformed(evt);
            }
        });
        jPanel6.add(wktBerangkat);
        wktBerangkat.setBounds(750, 100, 230, 40);
        jPanel6.add(tanggal);
        tanggal.setBounds(400, 180, 200, 40);

        jPanel12.add(jPanel6);
        jPanel6.setBounds(0, 0, 1020, 300);

        jPanel8.add(jPanel12);
        jPanel12.setBounds(10, 140, 1020, 300);

        jPanel13.setBackground(new java.awt.Color(0, 51, 51));
        jPanel13.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pemesanan TIket");
        jPanel13.add(jLabel24);
        jLabel24.setBounds(40, 10, 170, 30);

        jPanel8.add(jPanel13);
        jPanel13.setBounds(570, 10, 230, 50);

        jPanel14.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel14);
        jPanel14.setBounds(0, 510, 1040, 10);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel4);
        jPanel4.setBounds(0, 440, 1040, 10);

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel7);
        jPanel7.setBounds(0, 510, 1040, 10);

        bPrint.setText("Print");
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });
        jPanel8.add(bPrint);
        bPrint.setBounds(820, 460, 100, 40);

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel8.add(bSave);
        bSave.setBounds(100, 460, 100, 40);

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        jPanel8.add(bClear);
        bClear.setBounds(460, 460, 100, 40);

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(bDelete);
        bDelete.setBounds(640, 460, 100, 40);

        jPanel15.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel15);
        jPanel15.setBounds(0, 0, 10, 830);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nama", "stasiun_awal", "stasiun_tujuan", "tgl_berangkat", "jns_kereta", "wkt_berangkat", "tmp_duduk", "harga"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(20, 530, 1010, 230);

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        jPanel8.add(bRefresh);
        bRefresh.setBounds(270, 460, 100, 40);

        jButton1.setText("exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);
        jButton1.setBounds(900, 780, 110, 30);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 0, 1040, 840);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 830);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1040, 0, 10, 840);

        jPanel11.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 830, 1040, 10);

        setSize(new java.awt.Dimension(1069, 888));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = dateFormat.format(tanggal.getDate());
        //String waktu = wktBerangkat.getSelectedItem().toString();
        //String seat = duduk.getSelectedItem().toString();
        String Jns = "";
        if(rdEkonomi.isSelected()) {
                Jns="Ekonomi-AC";
            } else {
                Jns = "Eksekutif";
            }
        
        if(ID.getText().equals(
          "") || Nama.getText().equals("") || stasiunAwal.getText().equals("") || 
                stasiunTujuan.getText().equals("") || harga.getText().equals("")  ){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else {
            
            String SQL = "INSERT INTO `t_pemesanan`(`id`, `nama`, `awal`, `tujuan`, `tanggal`, `jenis`, `waktu`, `duduk`, `harga`) "
                    + "VALUES('"+ID.getText()+"','"+Nama.getText()+"','"+stasiunAwal.getText()+"','"+stasiunTujuan.getText()+"','"+tgl+"','"+Jns+"','"+wktBerangkat.getSelectedItem()+"','"+duduk.getSelectedItem()+"','"+harga.getText()+"')";
        
        int status = KoneksiDB.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
   
        }
        
        
    }//GEN-LAST:event_bSaveActionPerformed

    private void wktBerangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wktBerangkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wktBerangkatActionPerformed

    private void rdEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEkonomiActionPerformed
        if(rdEkonomi.isSelected()) {
            harga.setText("15.000");
        } else {
            harga.setText("85.000");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdEkonomiActionPerformed

    private void stasiunAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stasiunAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stasiunAwalActionPerformed

    private void stasiunTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stasiunTujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stasiunTujuanActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void rdEksekutifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEksekutifActionPerformed
             if(rdEksekutif.isSelected()) {
                 harga.setText("85.000");
             } else {
                 harga.setText("15.000");
             }  // TODO add your handling code here:
    }//GEN-LAST:event_rdEksekutifActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        Nama.setText("");
        ID.setText("");
        stasiunAwal.setText("");
        stasiunTujuan.setText("");
        harga.setText("");
        buttonGroup1.clearSelection();
        wktBerangkat.setSelectedIndex(0);
        duduk.setSelectedIndex(0);
        harga.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_bClearActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        selectData();        // TODO add your handling code here:
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int baris = tblData.getSelectedRow();
        if(baris != 1){
            String id = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_pemesanan WHERE id = '"+id+"'";
            int status = KoneksiDB.execute(SQL);
            
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Pemesanan Tiket Kereta Api");
        MessageFormat footer = new MessageFormat("Page (0, number,integer)");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_bPrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> duduk;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdEkonomi;
    private javax.swing.JRadioButton rdEksekutif;
    private javax.swing.JTextField stasiunAwal;
    private javax.swing.JTextField stasiunTujuan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tblData;
    private javax.swing.JComboBox<String> wktBerangkat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"id","nama","awal","tujuan","tanggal","jenis","waktu","duduk","harga"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_pemesanan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()) {
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String awal = rs.getString(3);
                String tujuan = rs.getString(4);
                String tanggal = rs.getString(5);
                
                String jenis = "";
                if("Ekonomi-AC".equals(rs.getString(6))) {
                jenis="Ekonomi-AC";
                } else {
                jenis = "Eksekutif";
                }
                String waktu = "";
                if(rs.getString(7).equals("07.10")){
                    waktu = "07.10";
                }else if(rs.getString(7).equals("10.30")){
                    waktu = "10.30";
                }else if(rs.getString(7).equals("14.45")){
                    waktu = "14.45";
                }else if(rs.getString(7).equals("18.30")){
                    waktu = "18.30";
                }
                String duduk = "";
                if(rs.getString(8).equals("1")){
                    duduk = "1";
                }else if(rs.getString(8).equals("2")){
                    duduk = "2";
                }else if(rs.getString(8).equals("3")){
                    duduk = "3";
                }else if(rs.getString(8).equals("4")){
                    duduk = "4";
                }else if(rs.getString(8).equals("5")){
                    duduk = "5";
                }
                String harga = rs.getString(9);
                String data[] = {id,nama,awal,tujuan,tanggal,jenis,waktu,duduk,harga};
                dtm.addRow(data);
            }
        }catch (SQLException ex) {
                        Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                    }
            tblData.setModel(dtm);
    }
}
