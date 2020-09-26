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

public class frmModificarCategoria extends javax.swing.JFrame {

    public frmModificarCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarCategoria.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtCategoria.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarCategoria);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtCategoria.requestFocus();
    }
    int id;

    public frmModificarCategoria(clsCategoria objCategoria) {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarCategoria.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtCategoria.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarCategoria);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtCategoria.requestFocus();

        id = objCategoria.getId();
        txtCategoria.setText(objCategoria.getNombre());
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
        txtCategoria = new jtextfieldround.JTextFieldRound();
        jLabel1 = new javax.swing.JLabel();
        btnModificarCategoria = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCategoria.setText("Nombre");
        txtCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusLost(evt);
            }
        });
        jPanel3.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 370, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        btnModificarCategoria.setBackground(new java.awt.Color(3, 55, 86));
        btnModificarCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCategoria.setText("Modificar Categoria");
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 240, 40));

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
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Modificar Categoria");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusGained
        txtCategoria.setForeground(Color.black);
        if (txtCategoria.getText().equals("Nombre")) {
            txtCategoria.setText("");
        }
    }//GEN-LAST:event_txtCategoriaFocusGained

    private void txtCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusLost
        if (txtCategoria.getText().replaceAll(" ", "").length() == 0) {
            txtCategoria.setText("Nombre");
            txtCategoria.setForeground(Color.gray);
        };
    }//GEN-LAST:event_txtCategoriaFocusLost

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        clsCategoria objCategoria = new clsCategoria();
        try {
            if (validarCampos()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar los datos de la Categoria", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                    objCategoria.setId(id);
                    objCategoria.setNombre(txtCategoria.getText());
                    if (objCategoria.ModificarCategoria(objCategoria)) {
                        JOptionPane.showMessageDialog(this, "Categoria Modificada con exito");
                        panelCategoria p = new panelCategoria();
                        p.listar();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puedo modificar la Categoria, intentelo de nuevo");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tiene que completar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un errro:\n" + e.toString());
        }
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    public boolean validarCampos() {
        return !txtCategoria.getText().isEmpty() && !txtCategoria.getText().equals("Nombre");
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        panelCategoria p = new panelCategoria();
        p.listar();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        panelCategoria p = new panelCategoria();
        p.listar();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(frmModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmModificarCategoria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private jtextfieldround.JTextFieldRound txtCategoria;
    // End of variables declaration//GEN-END:variables
}
