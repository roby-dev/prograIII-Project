package Presentacion;

import Negocios.*;
import Negocios.clsUsuario;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class frmAgregarUsuario extends javax.swing.JFrame {

    public frmAgregarUsuario() {
        initComponents();this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmAgregarUsuario.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtApellido.setForeground(Color.gray);
        txtClave1.setForeground(Color.gray);
        txtEmail.setForeground(Color.gray);
        txtClave2.setForeground(Color.gray);
        txtNombre.setForeground(Color.gray);
        txtUsuario.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnAgregarUsuario);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtNombre.requestFocus();
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
        txtNombre = new jtextfieldround.JTextFieldRound();
        txtApellido = new jtextfieldround.JTextFieldRound();
        txtUsuario = new jtextfieldround.JTextFieldRound();
        txtEmail = new jtextfieldround.JTextFieldRound();
        txtClave1 = new jtextfieldround.JPasswordFieldRound();
        txtClave2 = new jtextfieldround.JPasswordFieldRound();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarUsuario = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setText("Nombre");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 370, 40));

        txtApellido.setText("Apellido");
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 370, 40));

        txtUsuario.setText("Usuario");
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 370, 40));

        txtEmail.setText("Email");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 370, 40));

        txtClave1.setText("--------------------");
        txtClave1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClave1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClave1FocusLost(evt);
            }
        });
        jPanel3.add(txtClave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 370, 40));

        txtClave2.setText("--------------------");
        txtClave2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClave2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClave2FocusLost(evt);
            }
        });
        jPanel3.add(txtClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 370, 40));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        jPanel3.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 370, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usuario*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, -1));

        btnAgregarUsuario.setBackground(new java.awt.Color(3, 55, 86));
        btnAgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 240, 40));

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
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nuevo Usuario");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Clave*");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nombres*");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Tipo*");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Repita Clave*");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Email*");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Apellido*");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setForeground(Color.black);
        if (txtUsuario.getText().equals("Usuario")) {
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().replaceAll(" ", "").length() == 0) {
            txtUsuario.setText("Usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        clsUsuario objUsuario = new clsUsuario();
        try {
            if (validarCampos()) {
                if (comprobarClaves()) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea agregar el Usuario", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objUsuario.setNombre(txtNombre.getText());
                        objUsuario.setApellido(txtApellido.getText());
                        objUsuario.setUsername(txtUsuario.getText());
                        objUsuario.setEmail(txtEmail.getText());
                        objUsuario.setClave(txtClave1.getText());
                        objUsuario.setTipo(cmbTipo.getSelectedIndex());
                        if (objUsuario.AgregarUsuario(objUsuario)){
                            if(JOptionPane.showConfirmDialog(this, "Usuario Agregado con exito\n¿Desea agregar otro Usuario?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                                Limpiar();
                            }
                            else{
                                this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo agregar el Usuario, intentelo de nuevo");
                        }
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Las Claves no coinciden");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Tiene que completar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un errro:\n" + e.toString());
        }
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    public boolean validarCampos(){
        return !txtNombre.getText().isEmpty() && !txtNombre.getText().equals("Nombre") &&
               !txtApellido.getText().isEmpty() && !txtApellido.getText().equals("Apellido") &&
               !txtUsuario.getText().isEmpty() && !txtUsuario.getText().equals("Usuario") &&
               !txtEmail.getText().isEmpty() && !txtEmail.getText().equals("Email") &&
               !txtClave1.getText().isEmpty() && !txtClave1.getText().equals("--------------------") &&
               !txtClave2.getText().isEmpty() && !txtClave2.getText().equals("--------------------");
    }
    
    public boolean comprobarClaves(){
        return txtClave1.getText().equals(txtClave2.getText());
    }
    
    public void Limpiar(){
        txtNombre.requestFocus();
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtEmail.setText("");
        txtClave1.setText("");
        txtClave2.setText("");
        cmbTipo.setSelectedIndex(0);
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setForeground(Color.black);
        if (txtEmail.getText().equals("Email")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().replaceAll(" ", "").length() == 0) {
            txtEmail.setText("Email");
            txtEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        txtApellido.setForeground(Color.black);
        if (txtApellido.getText().equals("Apellido")) {
            txtApellido.setText("");
        }
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (txtApellido.getText().replaceAll(" ", "").length() == 0) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().replaceAll(" ", "").length() == 0) {
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        txtNombre.setForeground(Color.black);
        if (txtNombre.getText().equals("Nombre")) {
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtClave1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClave1FocusGained
        txtClave1.setForeground(Color.black);
        if (txtClave1.getText().equals("--------------------")) {
            txtClave1.setText("");
        }
    }//GEN-LAST:event_txtClave1FocusGained

    private void txtClave1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClave1FocusLost
        // TODO add your handling code here:
        if (txtClave1.getText().replaceAll(" ", "").length() == 0) {
            txtClave1.setText("--------------------");
            txtClave1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtClave1FocusLost

    private void txtClave2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClave2FocusGained
        // TODO add your handling code here:
        txtClave2.setForeground(Color.black);
        if (txtClave2.getText().equals("--------------------")) {
            txtClave2.setText("");
        }
    }//GEN-LAST:event_txtClave2FocusGained

    private void txtClave2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClave2FocusLost
        // TODO add your handling code here:
        if (txtClave2.getText().replaceAll(" ", "").length() == 0) {
            txtClave2.setText("--------------------");
            txtClave2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtClave2FocusLost

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
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmAgregarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private jtextfieldround.JTextFieldRound txtApellido;
    private jtextfieldround.JPasswordFieldRound txtClave1;
    private jtextfieldround.JPasswordFieldRound txtClave2;
    private jtextfieldround.JTextFieldRound txtEmail;
    private jtextfieldround.JTextFieldRound txtNombre;
    private jtextfieldround.JTextFieldRound txtUsuario;
    // End of variables declaration//GEN-END:variables
}
