package Presentacion;

import Negocios.*;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class frmModificarLugar extends javax.swing.JFrame {

    public frmModificarLugar() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarLugar.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtLugar.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarLugar);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtLugar.requestFocus();
    }
    int id;
    public frmModificarLugar(clsLugar objLugar) {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarLugar.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtLugar.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarLugar);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtLugar.requestFocus();
        
        id=objLugar.getId();
        txtLugar.setText(objLugar.getNombre());
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
        txtLugar = new jtextfieldround.JTextFieldRound();
        jLabel1 = new javax.swing.JLabel();
        btnModificarLugar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLugar.setText("Nombre");
        txtLugar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLugarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugarFocusLost(evt);
            }
        });
        jPanel3.add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 370, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        btnModificarLugar.setBackground(new java.awt.Color(3, 55, 86));
        btnModificarLugar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarLugar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarLugar.setText("Modificar Lugar");
        btnModificarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLugarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 240, 40));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setForeground(new java.awt.Color(60, 63, 65));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Modificar Lugar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLugarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLugarFocusGained
        txtLugar.setForeground(Color.black);
        if (txtLugar.getText().equals("Nombre")) {
            txtLugar.setText("");
        }
    }//GEN-LAST:event_txtLugarFocusGained

    private void txtLugarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLugarFocusLost
        if (txtLugar.getText().replaceAll(" ", "").length() == 0) {
            txtLugar.setText("Nombre");
            txtLugar.setForeground(Color.gray);
        };
    }//GEN-LAST:event_txtLugarFocusLost

    private void btnModificarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLugarActionPerformed
        clsLugar objLugar = new clsLugar();
        try {
            if (validarCampos()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar los datos del Lugar", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                    objLugar.setId(id);
                    objLugar.setNombre(txtLugar.getText());
                    if (objLugar.ModificarLugar(objLugar)){
                        JOptionPane.showMessageDialog(this, "Lugar Modificado con exito");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puedo modificar el Lugar, intentelo de nuevo");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Tiene que completar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un errro:\n" + e.toString());
        }
    }//GEN-LAST:event_btnModificarLugarActionPerformed

    public boolean validarCampos(){
        return !txtLugar.getText().isEmpty() && !txtLugar.getText().equals("Nombre");
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmModificarLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModificarLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModificarLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModificarLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModificarLugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificarLugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private jtextfieldround.JTextFieldRound txtLugar;
    // End of variables declaration//GEN-END:variables
}
