package Presentacion;

import Negocios.*;
import Negocios.clsPregunta;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class frmModificarPregunta extends javax.swing.JFrame {

    public frmModificarPregunta() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarPregunta.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtPregunta.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarPregunta);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtPregunta.requestFocus();
    }
    int id;
    public frmModificarPregunta(clsPregunta objPregunta) {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmModificarPregunta.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtPregunta.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnModificarPregunta);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtPregunta.requestFocus();
        
        id=objPregunta.getId();
        txtPregunta.setText(objPregunta.getDescripcion());
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtPregunta = new jtextfieldround.JTextFieldRound();
        jLabel1 = new javax.swing.JLabel();
        btnModificarPregunta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPregunta.setText("Pregunta");
        txtPregunta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPreguntaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPreguntaFocusLost(evt);
            }
        });
        jPanel3.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 370, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Pregunta*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        btnModificarPregunta.setBackground(new java.awt.Color(3, 55, 86));
        btnModificarPregunta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarPregunta.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPregunta.setText("Modificar Pregunta");
        btnModificarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPreguntaActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 240, 40));

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
        jLabel2.setText("Modificar Pregunta");
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

    private void txtPreguntaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPreguntaFocusGained
        txtPregunta.setForeground(Color.black);
        if (txtPregunta.getText().equals("Pregunta")) {
            txtPregunta.setText("");
        }
    }//GEN-LAST:event_txtPreguntaFocusGained

    private void txtPreguntaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPreguntaFocusLost
        if (txtPregunta.getText().replaceAll(" ", "").length() == 0) {
            txtPregunta.setText("Pregunta");
            txtPregunta.setForeground(Color.gray);
        };
    }//GEN-LAST:event_txtPreguntaFocusLost

    private void btnModificarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPreguntaActionPerformed
        clsPregunta objPregunta = new clsPregunta();
        try {
            if (validarCampos()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar los datos de la Pregunta", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                    objPregunta.setId(id);
                    objPregunta.setDescripcion(txtPregunta.getText());
                    if (objPregunta.ModificarPregunta(objPregunta)){
                        JOptionPane.showMessageDialog(this, "Pregunta Modificada con exito");
                        
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puedo modificar la Pregunta, intentelo de nuevo");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Tiene que completar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un errro:\n" + e.toString());
        }
    }//GEN-LAST:event_btnModificarPreguntaActionPerformed

    public boolean validarCampos(){
        return !txtPregunta.getText().isEmpty() && !txtPregunta.getText().equals("Pregunta");
    }
    
    public void Limpiar(){
        txtPregunta.requestFocus();
        txtPregunta.setText("");
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
            java.util.logging.Logger.getLogger(frmModificarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModificarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModificarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModificarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmModificarPregunta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificarPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private jtextfieldround.JTextFieldRound txtPregunta;
    // End of variables declaration//GEN-END:variables
}
