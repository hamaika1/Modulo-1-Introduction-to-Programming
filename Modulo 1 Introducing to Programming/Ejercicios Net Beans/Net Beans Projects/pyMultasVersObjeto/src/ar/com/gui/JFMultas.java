/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gui;

import ar.com.model.Caminera;

/**
 *
 * @author mateo
 */
public class JFMultas extends javax.swing.JFrame {

    private Caminera oCaminera;

    /**
     * Creates new form JFMultas
     */
    public JFMultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        oCaminera = new Caminera(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BttConsultarMultas = new javax.swing.JButton();
        BttRegistrarMulta = new javax.swing.JButton();
        BttSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTextAreaMostrarMultas = new javax.swing.JTextArea();
        JLTotal = new javax.swing.JLabel();
        JTextTotalRecaudao = new javax.swing.JTextField();
        JLMayorCodigo = new javax.swing.JLabel();
        JTextMayorCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Regristro de Multas - Caminera");

        BttConsultarMultas.setText("Consultar");
        BttConsultarMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttConsultarMultasActionPerformed(evt);
            }
        });

        BttRegistrarMulta.setText("Registrar");
        BttRegistrarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttRegistrarMultaActionPerformed(evt);
            }
        });

        BttSalir.setText("Salir");
        BttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttSalirActionPerformed(evt);
            }
        });

        JTextAreaMostrarMultas.setEditable(false);
        JTextAreaMostrarMultas.setColumns(20);
        JTextAreaMostrarMultas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JTextAreaMostrarMultas.setRows(5);
        jScrollPane2.setViewportView(JTextAreaMostrarMultas);

        JLTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLTotal.setText("Total Recaudado $:");

        JTextTotalRecaudao.setEditable(false);

        JLMayorCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLMayorCodigo.setText("Codigo de infraccion mas frecuente.");

        JTextMayorCodigo.setEditable(false);
        JTextMayorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMayorCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTextTotalRecaudao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BttRegistrarMulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BttConsultarMultas, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(BttSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLMayorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextMayorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BttConsultarMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BttRegistrarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLMayorCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextMayorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(JTextTotalRecaudao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttConsultarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttConsultarMultasActionPerformed
        JTextAreaMostrarMultas.setText(oCaminera.mostrarMultas());
        JTextTotalRecaudao.setText(String.valueOf(oCaminera.calcularTotal()));
       // JTextMayorCodigo.setText(oCaminera.mostrarMayorCodigo());
    }//GEN-LAST:event_BttConsultarMultasActionPerformed

    private void BttRegistrarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttRegistrarMultaActionPerformed
        JDNuevaMulta nuevaMulta = new JDNuevaMulta(this, true, oCaminera);
        nuevaMulta.setVisible(true);
    }//GEN-LAST:event_BttRegistrarMultaActionPerformed

    private void BttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BttSalirActionPerformed

    private void JTextMayorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMayorCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMayorCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(JFMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttConsultarMultas;
    private javax.swing.JButton BttRegistrarMulta;
    private javax.swing.JButton BttSalir;
    private javax.swing.JLabel JLMayorCodigo;
    private javax.swing.JLabel JLTotal;
    private javax.swing.JTextArea JTextAreaMostrarMultas;
    private javax.swing.JTextField JTextMayorCodigo;
    private javax.swing.JTextField JTextTotalRecaudao;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
