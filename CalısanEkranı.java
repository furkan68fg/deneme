
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Furkan Güleç
 */
public class CalısanEkranı extends javax.swing.JDialog {

    DefaultTableModel model;
    Calısanİslemleri islemler = new Calısanİslemleri();

    /**
     * Creates new form CalısanEkranı
     */
    public CalısanEkranı(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) calısan_tablosu.getModel();
        calısanGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calısan_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alanı = new javax.swing.JTextField();
        soyad_alanı = new javax.swing.JTextField();
        dept_alanı = new javax.swing.JTextField();
        maas_alanı = new javax.swing.JTextField();
        mesaj_yazısı = new javax.swing.JLabel();
        calısan_ekle_butonu = new javax.swing.JButton();
        güncelle = new javax.swing.JButton();
        sil_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        calısan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "soyad", "departman", "maas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calısan_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calısan_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calısan_tablosu);
        if (calısan_tablosu.getColumnModel().getColumnCount() > 0) {
            calısan_tablosu.getColumnModel().getColumn(0).setResizable(false);
            calısan_tablosu.getColumnModel().getColumn(1).setResizable(false);
            calısan_tablosu.getColumnModel().getColumn(2).setResizable(false);
            calısan_tablosu.getColumnModel().getColumn(3).setResizable(false);
            calısan_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        arama_cubugu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Departman");

        jLabel3.setText("Maas:");

        jLabel4.setText("Soyad:");

        ad_alanı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_alanıActionPerformed(evt);
            }
        });

        soyad_alanı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyad_alanıActionPerformed(evt);
            }
        });

        dept_alanı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_alanıActionPerformed(evt);
            }
        });

        mesaj_yazısı.setForeground(new java.awt.Color(255, 51, 0));

        calısan_ekle_butonu.setText("Yeni Çalışan Ekle");
        calısan_ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calısan_ekle_butonuActionPerformed(evt);
            }
        });

        güncelle.setText("Çalışan Güncelle");
        güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleActionPerformed(evt);
            }
        });

        sil_butonu.setText("Çalısşan Sil");
        sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addGap(696, 696, 696))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mesaj_yazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 370, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(soyad_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(maas_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addComponent(dept_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ad_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calısan_ekle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(güncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(sil_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calısan_ekle_butonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyad_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(güncelle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dept_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maas_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(sil_butonu)))
                .addGap(101, 101, 101)
                .addComponent(mesaj_yazısı)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> TR = new TableRowSorter<DefaultTableModel>(model);
        calısan_tablosu.setRowSorter(TR);
        TR.setRowFilter(RowFilter.regexFilter(ara));

    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void dept_alanıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_alanıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_alanıActionPerformed

    private void ad_alanıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_alanıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_alanıActionPerformed

    private void soyad_alanıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyad_alanıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyad_alanıActionPerformed

    private void calısan_ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calısan_ekle_butonuActionPerformed
        mesaj_yazısı.setText("");

        String ad = ad_alanı.getText();
        String soyad = soyad_alanı.getText();
        String departman = dept_alanı.getText();
        String maas = maas_alanı.getText();

        islemler.calısanEkle(ad, soyad, departman, maas);
        calısanGoruntule();
        mesaj_yazısı.setText("Yeni Calısan Basarıyla Eklendi");
    }//GEN-LAST:event_calısan_ekle_butonuActionPerformed

    private void calısan_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calısan_tablosuMouseClicked
        int selectedrow = calısan_tablosu.getSelectedRow();
        ad_alanı.setText(model.getValueAt(selectedrow, 1).toString());
        soyad_alanı.setText(model.getValueAt(selectedrow, 2).toString());
        dept_alanı.setText(model.getValueAt(selectedrow, 3).toString());
        maas_alanı.setText(model.getValueAt(selectedrow, 4).toString());
    }//GEN-LAST:event_calısan_tablosuMouseClicked

    private void güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncelleActionPerformed
        String ad = ad_alanı.getText();
        String soyad = soyad_alanı.getText();

        String departman = dept_alanı.getText();

        String maas = maas_alanı.getText();
        int selectedrow = calısan_tablosu.getSelectedRow();
        
        if (selectedrow==-1) {
            if (model.getRowCount()==0) {
                mesaj_yazısı.setText("Çalısanlar Tablosu Suanda Bos..");
            }
            else{
                
                mesaj_yazısı.setText("Lutfen Güncellenecek Bir Calısan Secin..");
            }
        }
        else{
            
            int id=(int)model.getValueAt(selectedrow, 0);
            islemler.calısanlarıGuncelle(id,ad,soyad,departman,maas);
            calısanGoruntule();
            mesaj_yazısı.setText("Calısan Basarıyla Güncellendi.");
            
        }


    }//GEN-LAST:event_güncelleActionPerformed

    private void sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonuActionPerformed
       maas_alanı.setText("");
        int selectedrow = calısan_tablosu.getSelectedRow();
        
        if (selectedrow==-1) {
            if (model.getRowCount()==0) {
                mesaj_yazısı.setText("Çalısanlar Tablosu Suanda Bos..");
            }
            else{
                
                mesaj_yazısı.setText("Lutfen Silinecek Bir Calısan Secin..");
            }
        }
        else{
             int id=(int)model.getValueAt(selectedrow, 0);
           islemler.calısanSil(id);
             calısanGoruntule();
             mesaj_yazısı.setText("Calısan Basarıyla Silindi...");
            
        }
    }//GEN-LAST:event_sil_butonuActionPerformed

    /**
     * @param args the command line arguments
     */
    public void calısanGoruntule() {

        model.setRowCount(0);

        ArrayList<Calısan> calısanlar = new ArrayList<Calısan>();

        calısanlar = islemler.calısanlarıGetir();

        if (calısanlar != null) {
            for (Calısan calısan : calısanlar) {
                Object[] eklenecek = {calısan.getId(), calısan.getAd(), calısan.getSoyad(), calısan.getDepartman(), calısan.getMaas()};
                model.addRow(eklenecek);

            }
        }

    }

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
            java.util.logging.Logger.getLogger(CalısanEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalısanEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalısanEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalısanEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalısanEkranı dialog = new CalısanEkranı(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alanı;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calısan_ekle_butonu;
    private javax.swing.JTable calısan_tablosu;
    private javax.swing.JTextField dept_alanı;
    private javax.swing.JButton güncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maas_alanı;
    private javax.swing.JLabel mesaj_yazısı;
    private javax.swing.JButton sil_butonu;
    private javax.swing.JTextField soyad_alanı;
    // End of variables declaration//GEN-END:variables
}
