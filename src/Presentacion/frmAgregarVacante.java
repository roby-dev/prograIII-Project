package Presentacion;

import Negocios.*;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.border.Border;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class frmAgregarVacante extends javax.swing.JFrame {

    clsCategoria objCategoria = new clsCategoria();
    ArrayList<clsCategoria> categorias = objCategoria.ListarCategorias();
    clsLugar objLugar = new clsLugar();
    ArrayList<clsLugar> lugares = objLugar.ListarLugares();

    public frmAgregarVacante() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCerrar.setBorder(new frmAgregarVacante.RoundedBorder(99));
        btnCerrar.setOpaque(false);
        btnCerrar.setBackground(new Color(0, 0, 0, 0));
        btnCerrar.setForeground(Color.WHITE);
        txtDescripcion.setForeground(Color.gray);
        txtRequerimientos.setForeground(Color.gray);
        txtTitulo.setForeground(Color.gray);
        this.getRootPane().setDefaultButton(btnAgregarVacante);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        txtTitulo.requestFocus();
        for (int i = 0; i < categorias.size(); i++) {
            cbCategoria.addItem(categorias.get(i).getNombre());
        }
        for (int i = 0; i < lugares.size(); i++) {
            cbLugar.addItem(lugares.get(i).getNombre());
        }
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        jDateComponentFactory2 = new org.jdatepicker.JDateComponentFactory();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarVacante = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRequerimientos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnElegirImagen = new javax.swing.JButton();
        cbLugar = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtTitulo = new jtextfieldround.JTextFieldRound();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Título*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        btnAgregarVacante.setBackground(new java.awt.Color(3, 55, 86));
        btnAgregarVacante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarVacante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVacante.setText("Agregar Vacante");
        btnAgregarVacante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVacanteActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarVacante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 780, 240, 40));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setForeground(new java.awt.Color(60, 63, 65));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 40, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nueva Vacante");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Descripcion*");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Requerimientos*");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha límite*");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Categoría");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Lugar");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        txtRequerimientos.setColumns(20);
        txtRequerimientos.setRows(5);
        txtRequerimientos.setText("Requerimientos");
        txtRequerimientos.setBorder(null);
        txtRequerimientos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRequerimientosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRequerimientosFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtRequerimientos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 370, 100));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Descripcion");
        txtDescripcion.setBorder(null);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 370, 100));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Elegir Imagen");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        btnElegirImagen.setText("Elegir Imagen");
        btnElegirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirImagenActionPerformed(evt);
            }
        });
        jPanel3.add(btnElegirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 150, 30));

        jPanel3.add(cbLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 280, 40));

        jPanel3.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 280, 40));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 280, 40));

        txtTitulo.setText("Titulo");
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTituloFocusLost(evt);
            }
        });
        jPanel3.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 370, 40));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "En Proceso", "Concluido" }));
        jPanel3.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 280, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String rutaDestino = "D:\\xampp\\htdocs\\ProyectoWeb\\admin\\dist\\img\\jobs\\";

    private void btnAgregarVacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVacanteActionPerformed
        clsTrabajo objTrabajo = new clsTrabajo();
        try {
            if (validarCampos()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro que desea agregar la Vacante", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                    objTrabajo.setNombre(txtTitulo.getText());
                    objTrabajo.setDescripcion(txtDescripcion.getText());
                    objTrabajo.setRequerimientos(txtRequerimientos.getText());
                    objTrabajo.setFechaLimite(jDateChooser1.getDate());
                    objTrabajo.setIdCategoria(categorias.get(cbCategoria.getSelectedIndex()).getId());
                    objTrabajo.setIdLugar(lugares.get(cbLugar.getSelectedIndex()).getId());
                    objTrabajo.setEstado((cbEstado.getSelectedIndex() == 0) ? null : (cbEstado.getSelectedIndex() == 1) ? 0 : 1);
                    objTrabajo.setImagen(nombreImagen);
                    //----------------

                    if (objTrabajo.AgregarTrabajo(objTrabajo)) {
                        //PARA COPIAR LA IMAGEN A LA RUTA
                        fuente = Paths.get(url);
                        destino = Paths.get(rutaDestino + nombreImagen);
                        Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
                        //----------------

                        if (JOptionPane.showConfirmDialog(this, "Vacante Agregada con exito\n¿Desea agregar otra Vacante?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                            Limpiar();
                        } else {
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo agregar la Vacante, intentelo de nuevo");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tiene que completar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un errro:\n" + e.toString());
        }
    }//GEN-LAST:event_btnAgregarVacanteActionPerformed

    public boolean validarCampos() {
        return !txtTitulo.getText().isEmpty() && !txtTitulo.getText().equals("Titulo")
                && !txtRequerimientos.getText().isEmpty() && !txtRequerimientos.getText().equals("Requerimientos")
                && !txtDescripcion.getText().isEmpty() && !txtDescripcion.getText().equals("Descripcion") && !url.isEmpty()
                && cbLugar.getSelectedIndex() != -1 && cbCategoria.getSelectedIndex() != -1 && jDateChooser1.getDate() != null;
    }

    public void Limpiar() {
        txtTitulo.requestFocus();
        txtTitulo.setText("");
        txtRequerimientos.setText("");
        txtDescripcion.setText("");
        jDateChooser1.setCalendar(null);
        lblImagen.setIcon(null);
        nombreImagen = "";
        fuente = null;
        destino = null;
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    String nombreImagen = "";
    Path fuente;
    Path destino;
    String url;

    private void btnElegirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirImagenActionPerformed
        JLabel img = new JLabel();
        img.setPreferredSize(new Dimension(200, 200));
        img.setHorizontalAlignment(JLabel.CENTER);
        img.setVerticalAlignment(JLabel.CENTER);
        JFileChooser v = new JFileChooser();
        v.setAccessory(img);
        v.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                try {
                    if (evt.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {
                        img.setText("");
                        url = v.getSelectedFile().getPath();
                        ImageIcon imagen = new ImageIcon(url);
                        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
                        img.setIcon(icono);
                    }
                } catch (Exception e) {
                    img.setText("Solo se permiten imagenes");
                    img.setIcon(new ImageIcon());
                }
            }
        });

        v.setCurrentDirectory(new File(System.getProperty("user.home")));
        int abrir = v.showOpenDialog(this);
        v.setDialogTitle("Seleccione una Imagen");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            try {
                url = v.getSelectedFile().getAbsolutePath();
                ImageIcon imagen = new ImageIcon(url);
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
                lblImagen.setIcon(icono);
                nombreImagen = v.getSelectedFile().getName();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error" + e.toString());
                nombreImagen = "";
                fuente = null;
                destino = null;
            }
        } else {
            nombreImagen = "";
            fuente = null;
            destino = null;
        }
    }//GEN-LAST:event_btnElegirImagenActionPerformed

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        // TODO add your handling code here:
        txtDescripcion.setForeground(Color.black);
        if (txtDescripcion.getText().equals("Descripcion")) {
            txtDescripcion.setText("");
        }
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
        // TODO add your handling code here:
        if (txtDescripcion.getText().replaceAll(" ", "").length() == 0) {
            txtDescripcion.setText("Descripcion");
            txtDescripcion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDescripcionFocusLost

    private void txtRequerimientosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequerimientosFocusGained
        // TODO add your handling code here:
        txtRequerimientos.setForeground(Color.black);
        if (txtRequerimientos.getText().equals("Requerimientos")) {
            txtRequerimientos.setText("");
        }
    }//GEN-LAST:event_txtRequerimientosFocusGained

    private void txtRequerimientosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequerimientosFocusLost
        // TODO add your handling code here:
        if (txtRequerimientos.getText().replaceAll(" ", "").length() == 0) {
            txtRequerimientos.setText("Requerimientos");
            txtRequerimientos.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtRequerimientosFocusLost

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        // TODO add your handling code here:
        txtTitulo.setForeground(Color.black);
        if (txtTitulo.getText().equals("Titulo")) {
            txtTitulo.setText("");
        }
    }//GEN-LAST:event_txtTituloFocusGained

    private void txtTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusLost
        // TODO add your handling code here:
        if (txtTitulo.getText().replaceAll(" ", "").length() == 0) {
            txtTitulo.setText("Titulo");
            txtTitulo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTituloFocusLost

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
            java.util.logging.Logger.getLogger(frmAgregarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmAgregarVacante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVacante;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnElegirImagen;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbLugar;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtRequerimientos;
    private jtextfieldround.JTextFieldRound txtTitulo;
    // End of variables declaration//GEN-END:variables
}
