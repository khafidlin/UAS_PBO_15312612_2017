/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerTeman;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @author U S E R
 */
public class ViewTeman1 extends javax.swing.JPanel {
    ControllerTeman ct = new ControllerTeman();
    ModelTeman mt = new ModelTeman();
    Koneksi koneksi = new Koneksi(); 

    /**
     * Creates new form ViewKawan
     */
    public ViewTeman1() {
        initComponents();
    }
    private void tampilTeman(){
        koneksi.koneksiDatabase();
        
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("ID");
        tabel.addColumn("Nama Teman");
        tabel.addColumn("Nomor Handphone");
        tabel.addColumn("Email");
        
        jTable1.setModel(tabel);
                try {
            String sql = "select * from tbl_teman";
            ResultSet res = koneksi.state.executeQuery(sql);
             while (res.next()){
                 tabel.addRow(new Object[]{
                 res.getString("id"),
                res.getString("nama"),    
                res.getString("nope"),    
                res.getString("email")
                             });
                 jTable1.setModel(tabel);
             }   
        
        } catch (SQLException e) {
            System.err.println("SQLException:" + e.getMessage());
        }
    }
    private void tombolBaru(){
        jTextFieldNama.setEditable(true);
        jTextFieldHp.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jButtonUbah.setEnabled(false);
        jButtonHapus.setEnabled(false);
        jTextFieldNama.requestFocus();
        bersih();
        
    }
    private void tombolBatal(){
        jTextFieldNama.setEditable(false);
        jTextFieldHp.setEditable(false);
        jTextFieldEmail.setEditable(false);
        jButtonSimpan.setEnabled(false);
        jButtonBaru.setText("Baru");
        bersih();
    }
    private void bersih(){
        jTextFieldId.setText("");
        jTextFieldNama.setText("");
        jTextFieldHp.setText("");
        jTextFieldEmail.setText("");
    }
    private void tabelKlik(){
        jButtonHapus.setEnabled(true);
        jButtonUbah.setEnabled(true);
    }
    private void tabelUnklik(){
        jButtonHapus.setEnabled(false);
        jButtonUbah.setEnabled(false);
        bersih();
    }
            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonBaru = new javax.swing.JButton();
        jButtonBersih = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonTutup = new javax.swing.JButton();
        jTextFieldHp = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("id :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("No. Telp :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email :");

        jTextFieldId.setEditable(false);

        jTextFieldNama.setEditable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButtonBaru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBaru.setText("Baru");
        jButtonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaruActionPerformed(evt);
            }
        });

        jButtonBersih.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBersih.setText("Bersih");
        jButtonBersih.setEnabled(false);
        jButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBersihActionPerformed(evt);
            }
        });

        jButtonUbah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonUbah.setText("Ubah");
        jButtonUbah.setEnabled(false);
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jButtonHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.setEnabled(false);
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonTutup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTutup.setText("Tutup");
        jButtonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUbah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonBersih, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(jButtonTutup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBaru)
                    .addComponent(jButtonBersih))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUbah)
                    .addComponent(jButtonHapus))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonTutup))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTextFieldHp.setEditable(false);

        jTextFieldEmail.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNama)
                                .addComponent(jTextFieldHp, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldHp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaruActionPerformed
        // TODO add your handling code here:
        String logic = jButtonBaru.getText();
        if (logic.equals("Baru")) {
            jButtonSimpan.setEnabled(true);
            jButtonBaru.setText("Batal");
            tombolBaru();
        } else {
            jButtonSimpan.setEnabled(false);
            jButtonBaru.setText("Baru");
            tombolBatal();
        }
    }//GEN-LAST:event_jButtonBaruActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        // TODO add your handling code here:
        try {
                int id = Integer.parseInt(jTextFieldId.getText());
                String nama = jTextFieldNama.getText();
                String nope = jTextFieldHp.getText();
                String email = jTextFieldEmail.getText();

                mt.setId(id);
                mt.setNama(nama);
                mt.setNope(nope);
                mt.setEmail(email);

                ct.ubahDataTeman(mt);
                tampilTeman();
                tabelUnklik();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Error jButtonUbahActionPerformed : "+e);
            }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
         String nama = jTextFieldNama.getText();
        String nope = jTextFieldHp.getText();
        String email = jTextFieldEmail.getText();
        if(nama.equals("") || nope.equals("") || email.equals("")){
            JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
        }else{
            
       
            try {
                mt.setNama(nama);
                mt.setNope(nope);
                mt.setEmail(email);

                ct.simpanTeman(mt);

                tampilTeman();
                tombolBatal();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
            }
        
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBersihActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_jButtonBersihActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        try {
                int id = Integer.parseInt(jTextFieldId.getText());

                mt.setId(id);
                ct.hapusDataTeman(mt);

                tampilTeman();
                tabelUnklik();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error jButtonHapusActionPerformed : " + e);
            }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonTutupActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            int baris = jTable1.getSelectedRow();
            jTextFieldId.setText(jTable1.getValueAt(baris, 0).toString());
            jTextFieldNama.setText(jTable1.getValueAt(baris, 1).toString());
            jTextFieldHp.setText(jTable1.getValueAt(baris, 2).toString());
            jTextFieldEmail.setText(jTable1.getValueAt(baris, 3).toString());
            jTextFieldNama.setEditable(true);
            jTextFieldHp.setEditable(true);
            jTextFieldEmail.setEditable(true);
            tabelKlik();
        } catch (Exception e) {
            System.err.println("Error table : " + e);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaru;
    private javax.swing.JButton jButtonBersih;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTutup;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHp;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}