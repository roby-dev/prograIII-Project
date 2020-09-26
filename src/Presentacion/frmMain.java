package Presentacion;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class frmMain extends javax.swing.JFrame implements ActionListener {

    public static JButton btnEditar = new JButton("");
    public static JButton btnEliminar = new JButton("");

    public frmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        lblUser.setText(frmLogin.Usuario.get(0).getName());
        btnInicio.addActionListener(this);
        btnCategorias.addActionListener(this);
        btnSolicitudes.addActionListener(this);
        btnSolicitudes.addActionListener(this);
        btnVacantes.addActionListener(this);
        btnLugares.addActionListener(this);
        btnUsuarios.addActionListener(this);
        btnPreguntas.addActionListener(this);
        panelInicio pInicio = new panelInicio();
        panel.add(pInicio);
        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.setBackground(new Color(231, 76, 60, 100));
        btnCerrarSesion.setForeground(Color.WHITE);
        btnCerrarSesion.setFocusCycleRoot(false);
        btnInicio.setBorder(null);
        btnInicio.setOpaque(false);
        btnInicio.setBackground(new Color(0, 0, 0, 0));
        btnInicio.setForeground(new Color(0, 0, 0, 0));
        btnSolicitudes.setBorder(null);
        btnSolicitudes.setOpaque(false);
        btnSolicitudes.setBackground(new Color(0, 0, 0, 0));
        btnSolicitudes.setForeground(new Color(0, 0, 0, 0));
        btnVacantes.setBorder(null);
        btnVacantes.setOpaque(false);
        btnVacantes.setBackground(new Color(0, 0, 0, 0));
        btnVacantes.setForeground(new Color(0, 0, 0, 0));
        btnLugares.setBorder(null);
        btnLugares.setOpaque(false);
        btnLugares.setBackground(new Color(0, 0, 0, 0));
        btnLugares.setForeground(new Color(0, 0, 0, 0));
        btnCategorias.setBorder(null);
        btnCategorias.setOpaque(false);
        btnCategorias.setBackground(new Color(0, 0, 0, 0));
        btnCategorias.setForeground(new Color(0, 0, 0, 0));
        btnUsuarios.setBorder(null);
        btnUsuarios.setOpaque(false);
        btnUsuarios.setBackground(new Color(0, 0, 0, 0));
        btnUsuarios.setForeground(new Color(0, 0, 0, 0));
        btnPreguntas.setBorder(null);
        btnPreguntas.setOpaque(false);
        btnPreguntas.setBackground(new Color(0, 0, 0, 0));
        btnPreguntas.setForeground(new Color(0, 0, 0, 0));

        ImageIcon iconoEdit = new ImageIcon("src/Imagenes/edit.png");
        ImageIcon iconoDelete = new ImageIcon("src/Imagenes/delete.png");

        btnEditar.setIcon(iconoEdit);
        btnEditar.setIconTextGap(0);
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setOpaque(false);
        btnEditar.setBackground(new Color(60, 141, 188, 100));
        btnEditar.setForeground(new Color(0, 0, 0, 0));

        btnEliminar.setIcon(iconoDelete);
        btnEliminar.setIconTextGap(0);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setBorder(null);
        btnEliminar.setForeground(null);
        btnEliminar.setOpaque(false);
        btnEliminar.setBackground(new Color(231, 76, 60, 100));
        btnEliminar.setForeground(new Color(0, 0, 0, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        btnVacantes = new javax.swing.JButton();
        btnLugares = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnPreguntas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setBackground(new java.awt.Color(60, 141, 188));

        lblUser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("jLabel1");

        btnCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECRUTADOR");

        javax.swing.GroupLayout lblUsuarioLayout = new javax.swing.GroupLayout(lblUsuario);
        lblUsuario.setLayout(lblUsuarioLayout);
        lblUsuarioLayout.setHorizontalGroup(
            lblUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUsuarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1091, Short.MAX_VALUE)
                .addComponent(lblUser)
                .addGap(31, 31, 31)
                .addComponent(btnCerrarSesion)
                .addGap(22, 22, 22))
        );
        lblUsuarioLayout.setVerticalGroup(
            lblUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUsuarioLayout.createSequentialGroup()
                        .addGroup(lblUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(jLabel1))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblUsuarioLayout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 70));

        jPanel2.setBackground(new java.awt.Color(249, 250, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(249, 250, 252));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(51, 51, 51));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setFocusPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 80));

        btnSolicitudes.setBackground(new java.awt.Color(249, 250, 252));
        btnSolicitudes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSolicitudes.setForeground(new java.awt.Color(51, 51, 51));
        btnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/solicitudes.png"))); // NOI18N
        btnSolicitudes.setBorder(null);
        btnSolicitudes.setBorderPainted(false);
        btnSolicitudes.setFocusPainted(false);
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });
        jPanel2.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 170, 90));

        btnVacantes.setBackground(new java.awt.Color(249, 250, 252));
        btnVacantes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVacantes.setForeground(new java.awt.Color(51, 51, 51));
        btnVacantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacante.png"))); // NOI18N
        btnVacantes.setBorder(null);
        btnVacantes.setBorderPainted(false);
        btnVacantes.setFocusPainted(false);
        btnVacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacantesActionPerformed(evt);
            }
        });
        jPanel2.add(btnVacantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 214, 170, 80));

        btnLugares.setBackground(new java.awt.Color(249, 250, 252));
        btnLugares.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLugares.setForeground(new java.awt.Color(51, 51, 51));
        btnLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lugar.png"))); // NOI18N
        btnLugares.setBorder(null);
        btnLugares.setBorderPainted(false);
        btnLugares.setFocusPainted(false);
        btnLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugaresActionPerformed(evt);
            }
        });
        jPanel2.add(btnLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 312, 170, 80));

        btnCategorias.setBackground(new java.awt.Color(249, 250, 252));
        btnCategorias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCategorias.setForeground(new java.awt.Color(51, 51, 51));
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/categoria.png"))); // NOI18N
        btnCategorias.setBorder(null);
        btnCategorias.setBorderPainted(false);
        btnCategorias.setFocusPainted(false);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 90));

        btnUsuarios.setBackground(new java.awt.Color(249, 250, 252));
        btnUsuarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 80));

        btnPreguntas.setBackground(new java.awt.Color(249, 250, 252));
        btnPreguntas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPreguntas.setForeground(new java.awt.Color(51, 51, 51));
        btnPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pregunta_1.png"))); // NOI18N
        btnPreguntas.setBorder(null);
        btnPreguntas.setBorderPainted(false);
        btnPreguntas.setFocusPainted(false);
        btnPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntasActionPerformed(evt);
            }
        });
        jPanel2.add(btnPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 170, 80));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 170, 11));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, 170, 11));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, 170, 11));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 170, 11));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 170, 11));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 170, 11));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 810));

        jPanel3.setBackground(new java.awt.Color(210, 214, 222));

        jLabel2.setForeground(java.awt.Color.darkGray);
        jLabel2.setText("Copyright  © 2020 - Programación III");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(1111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 810, 1340, 70));

        panel.setBackground(new java.awt.Color(236, 240, 245));
        panel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 1340, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed

    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVacantesActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLugaresActionPerformed

    private void btnPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreguntasActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLugares;
    private javax.swing.JButton btnPreguntas;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVacantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel lblUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

        Object evt = e.getSource();
        if (evt.equals(btnInicio)) {
            panel.removeAll();
            panelInicio pInicio = new panelInicio();
            pInicio.setVisible(true);
            panel.add(pInicio);
            panel.validate();
        }
        if (evt.equals(btnCategorias)) {
            panel.removeAll();
            panelCategoria pCategoria = new panelCategoria();
            pCategoria.setVisible(true);
            panel.add(pCategoria);
            panel.validate();
        }
        if (evt.equals(btnSolicitudes)) {
            panel.removeAll();
            panelSolicitudes pSolicitudes = new panelSolicitudes();
            pSolicitudes.setVisible(true);
            panel.add(pSolicitudes);
            panel.validate();
        }

        if (evt.equals(btnVacantes)) {
            panel.removeAll();
            panelVacantes pVacantes = new panelVacantes();
            pVacantes.setVisible(true);
            panel.add(pVacantes);
            panel.validate();
        }
        if (evt.equals(btnLugares)) {
            panel.removeAll();
            panelLugar pLugar = new panelLugar();
            pLugar.setVisible(true);
            panel.add(pLugar);
            panel.validate();
        }
        if (evt.equals(btnUsuarios)) {
            if (frmLogin.Usuario.get(0).getKind().equals("0")) {
                panel.removeAll();
                panelInicio pInicio = new panelInicio();
                pInicio.setVisible(true);
                panel.add(pInicio);
                panel.validate();
            } else {
                panel.removeAll();
                panelUsuario pUsuario = new panelUsuario();
                pUsuario.setVisible(true);
                panel.add(pUsuario);
                panel.validate();
            }

        }
        if (evt.equals(btnPreguntas)) {
            panel.removeAll();
            panelPregunta pPregunta = new panelPregunta();
            pPregunta.setVisible(true);
            panel.add(pPregunta);
            panel.validate();
        }
    }
}
