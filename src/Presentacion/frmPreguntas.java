package Presentacion;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import Negocios.*;
import java.util.ArrayList;

public class frmPreguntas extends javax.swing.JFrame {

    public frmPreguntas() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmPreguntas.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);       
        this.getRootPane().setDefaultButton(btnModificarCategoria);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);

    }

    public frmPreguntas(int id, String nombres) {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmPreguntas.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);        
        this.getRootPane().setDefaultButton(btnModificarCategoria);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        lblPostulante.setText(nombres);
        clsPregunta objPregunta = new clsPregunta();
        ArrayList<clsPregunta> preguntas = objPregunta.ListarPregunta(id);
        lblPregunta1.setText(preguntas.get(0).getDescripcion());
        txtPregunta1.setText(preguntas.get(0).getRespuesta());
        lblPregunta2.setText(preguntas.get(1).getDescripcion());
        txtPregunta2.setText(preguntas.get(1).getRespuesta());
        lblPregunta3.setText(preguntas.get(2).getDescripcion());
        txtPregunta3.setText(preguntas.get(2).getRespuesta());
        lblPregunta4.setText(preguntas.get(3).getDescripcion());
        txtPregunta4.setText(preguntas.get(3).getRespuesta());
        lblPregunta5.setText(preguntas.get(4).getDescripcion());
        txtPregunta5.setText(preguntas.get(4).getRespuesta());

    }

    class RoundedBorder implements Border {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtPregunta1 = new jtextfieldround.JTextFieldRound();
        lblPregunta1 = new javax.swing.JLabel();
        btnModificarCategoria = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblPostulante = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        txtPregunta2 = new jtextfieldround.JTextFieldRound();
        lblPregunta3 = new javax.swing.JLabel();
        txtPregunta3 = new jtextfieldround.JTextFieldRound();
        lblPregunta4 = new javax.swing.JLabel();
        txtPregunta4 = new jtextfieldround.JTextFieldRound();
        lblPregunta5 = new javax.swing.JLabel();
        txtPregunta5 = new jtextfieldround.JTextFieldRound();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPregunta1.setText("Nombre");
        txtPregunta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPregunta1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPregunta1FocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 720, 40));

        lblPregunta1.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPregunta1.setForeground(new java.awt.Color(51, 51, 51));
        lblPregunta1.setText("Nombre*");
        jPanel3.add(lblPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        btnModificarCategoria.setBackground(new java.awt.Color(3, 55, 86));
        btnModificarCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCategoria.setText("Okay");
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 150, 40));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setForeground(new java.awt.Color(60, 63, 65));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // NOI18N
        btnCerrar.setFocusCycleRoot(true);
        btnCerrar.setSelected(true);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 40));

        lblPostulante.setBackground(new java.awt.Color(0, 0, 0));
        lblPostulante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPostulante.setForeground(new java.awt.Color(51, 51, 51));
        lblPostulante.setText("postuilante");
        jPanel3.add(lblPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        lblPregunta2.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPregunta2.setForeground(new java.awt.Color(51, 51, 51));
        lblPregunta2.setText("Nombre*");
        jPanel3.add(lblPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        txtPregunta2.setText("Nombre");
        txtPregunta2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPregunta2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPregunta2FocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 720, 40));

        lblPregunta3.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPregunta3.setForeground(new java.awt.Color(51, 51, 51));
        lblPregunta3.setText("Nombre*");
        jPanel3.add(lblPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        txtPregunta3.setText("Nombre");
        txtPregunta3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPregunta3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPregunta3FocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 720, 40));

        lblPregunta4.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPregunta4.setForeground(new java.awt.Color(51, 51, 51));
        lblPregunta4.setText("Nombre*");
        jPanel3.add(lblPregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        txtPregunta4.setText("Nombre");
        txtPregunta4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPregunta4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPregunta4FocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 720, 40));

        lblPregunta5.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPregunta5.setForeground(new java.awt.Color(51, 51, 51));
        lblPregunta5.setText("Nombre*");
        jPanel3.add(lblPregunta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        txtPregunta5.setText("Nombre");
        txtPregunta5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPregunta5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPregunta5FocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 720, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preguntas:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPregunta1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta1FocusGained
        txtPregunta1.setForeground(Color.black);
        if (txtPregunta1.getText().equals("Nombre")) {
            txtPregunta1.setText("");
        }
    }//GEN-LAST:event_txtPregunta1FocusGained

    private void txtPregunta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta1FocusLost
        if (txtPregunta1.getText().replaceAll(" ", "").length() == 0) {
            txtPregunta1.setText("Nombre");
            txtPregunta1.setForeground(Color.gray);
        };
    }//GEN-LAST:event_txtPregunta1FocusLost

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void txtPregunta2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta2FocusGained

    private void txtPregunta2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta2FocusLost

    private void txtPregunta3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta3FocusGained

    private void txtPregunta3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta3FocusLost

    private void txtPregunta4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta4FocusGained

    private void txtPregunta4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta4FocusLost

    private void txtPregunta5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta5FocusGained

    private void txtPregunta5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPregunta5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta5FocusLost

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
            java.util.logging.Logger.getLogger(frmPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPostulante;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta3;
    private javax.swing.JLabel lblPregunta4;
    private javax.swing.JLabel lblPregunta5;
    private jtextfieldround.JTextFieldRound txtPregunta1;
    private jtextfieldround.JTextFieldRound txtPregunta2;
    private jtextfieldround.JTextFieldRound txtPregunta3;
    private jtextfieldround.JTextFieldRound txtPregunta4;
    private jtextfieldround.JTextFieldRound txtPregunta5;
    // End of variables declaration//GEN-END:variables
}
