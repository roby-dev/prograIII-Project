package Presentacion;

import Negocios.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class panelSolicitudes extends javax.swing.JPanel {

    clsCorreo correo = new clsCorreo();
    clsControlador controladorCorreo = new clsControlador();
    ArrayList<clsTrabajo> trabajos;
    JButton btnCv = new JButton();
    JButton btnAceptar = new JButton();
    JButton btnContratar = new JButton();
    JButton btnContratarInv = new JButton();
    JButton btnNoApto = new JButton();
    JButton btnNoAptoInv = new JButton();
    JButton btnRechazar = new JButton();
    JButton btnAceptarInv = new JButton();
    JButton btnRechazarInv = new JButton();
    JButton btnPreguntas = new JButton();

    clsSolicitudes objPostulante = new clsSolicitudes();

    String[] columnas = new String[]{
        "Nombre Completo",
        "DNI",
        "Vacante",
        "Categoria",
        "Lugar",
        "Status",
        "Creación",
        "",
        "",
        "",
        "",
        ""};

    final Class[] tiposColumnas = new Class[]{
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        Date.class,
        JButton.class,
        JButton.class,
        JButton.class,
        JButton.class,
        JButton.class,
        JButton.class
    };

    ArrayList<clsSolicitudes> postulantes;

    public panelSolicitudes() {
        initComponents();
        //-----------------PARA EL CORREO------------
        correo.setUsuarioCorreo("pruebaprogra2@gmail.com");
        correo.setContracena("Sistemas.123");
        //--------------------------------------------
        
        ImageIcon iconoAceptar = new ImageIcon("src/Imagenes/accept.png");
        ImageIcon iconoRechazar = new ImageIcon("src/Imagenes/rechazar.png");
        ImageIcon iconoContratar = new ImageIcon("src/Imagenes/contratar.png");
        ImageIcon iconoNoApto = new ImageIcon("src/Imagenes/denie.png");
        ImageIcon iconoCv = new ImageIcon("src/Imagenes/cv.png");
        ImageIcon iconoPregunta = new ImageIcon("src/Imagenes/pregunta.png");

        btnCv.setIcon(iconoCv);
        btnCv.setIconTextGap(0);
        btnCv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCv.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnCv.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCv.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCv.setOpaque(false);
        btnCv.setBackground(new Color(255, 255, 255, 100));

        btnAceptar.setIcon(iconoAceptar);
        btnAceptar.setIconTextGap(0);
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setOpaque(false);
        btnAceptar.setBackground(new Color(40, 179, 81, 100));
        btnAceptar.setForeground(new Color(0, 0, 0, 0));

        btnContratar.setIcon(iconoContratar);
        btnContratar.setIconTextGap(0);
        btnContratar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContratar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnContratar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnContratar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContratar.setOpaque(false);
        btnContratar.setBackground(new Color(40, 179, 81, 100));
        btnContratar.setForeground(new Color(0, 0, 0, 0));

        btnContratarInv.setIcon(iconoContratar);
        btnContratarInv.setIconTextGap(0);
        btnContratarInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnContratarInv.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnContratarInv.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnContratarInv.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContratarInv.setOpaque(false);
        btnContratarInv.setBackground(new Color(40, 179, 81, 100));
        btnContratarInv.setForeground(new Color(0, 0, 0, 0));
        btnContratarInv.setEnabled(false);

        btnNoApto.setIcon(iconoNoApto);
        btnNoApto.setIconTextGap(0);
        btnNoApto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNoApto.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnNoApto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNoApto.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNoApto.setOpaque(false);
        btnNoApto.setBackground(new Color(231, 76, 60, 100));
        btnNoApto.setForeground(new Color(0, 0, 0, 0));

        btnNoAptoInv.setIcon(iconoNoApto);
        btnNoAptoInv.setIconTextGap(0);
        btnNoAptoInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNoAptoInv.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnNoAptoInv.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNoAptoInv.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNoAptoInv.setOpaque(false);
        btnNoAptoInv.setBackground(new Color(231, 76, 60, 100));
        btnNoAptoInv.setForeground(new Color(0, 0, 0, 0));
        btnNoAptoInv.setEnabled(false);

        btnRechazar.setIcon(iconoRechazar);
        btnRechazar.setIconTextGap(0);
        btnRechazar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRechazar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnRechazar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRechazar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRechazar.setBorder(null);
        btnRechazar.setForeground(null);
        btnRechazar.setOpaque(false);
        btnRechazar.setBackground(new Color(231, 76, 60, 100));
        btnRechazar.setForeground(new Color(0, 0, 0, 0));

        btnPreguntas.setIcon(iconoPregunta);
        btnPreguntas.setIconTextGap(0);
        btnPreguntas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPreguntas.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnPreguntas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPreguntas.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPreguntas.setBorder(null);
        btnPreguntas.setForeground(null);
        btnPreguntas.setOpaque(false);
        btnPreguntas.setBackground(new Color(255, 255, 255, 100));

        btnAceptarInv.setIcon(iconoAceptar);
        btnAceptarInv.setIconTextGap(0);
        btnAceptarInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptarInv.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptarInv.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAceptarInv.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarInv.setOpaque(false);
        btnAceptarInv.setBackground(new Color(40, 179, 81, 100));
        btnAceptarInv.setForeground(new Color(0, 0, 0, 0));
        btnAceptarInv.setEnabled(false);

        btnRechazarInv.setIcon(iconoRechazar);
        btnRechazarInv.setIconTextGap(0);
        btnRechazarInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRechazarInv.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnRechazarInv.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRechazarInv.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRechazarInv.setBorder(null);
        btnRechazarInv.setForeground(null);
        btnRechazarInv.setOpaque(false);
        btnRechazarInv.setBackground(new Color(231, 76, 60, 100));
        btnRechazarInv.setForeground(new Color(0, 0, 0, 0));
        btnRechazarInv.setEnabled(false);

        postulantes=objPostulante.ListarPostulantes();
        
        listar(postulantes);

        tbSolicitudes.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });

        tbSolicitudes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbSolicitudes.rowAtPoint(e.getPoint());
                int columna = tbSolicitudes.columnAtPoint(e.getPoint());

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 9) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < tbSolicitudes.getModel().getColumnCount(); i++) {
                        if (!tbSolicitudes.getModel().getColumnClass(i).equals(JButton.class)) {
                            sb.append("\n").append(tbSolicitudes.getModel().getColumnName(i)).append(": ").append(tbSolicitudes.getModel().getValueAt(fila, i));
                        }
                    }

                    try {
                        Process programa = Runtime.getRuntime().exec("cmd /c D:\\xampp\\htdocs\\ProyectoWeb\\admin\\uploads\\" + postulantes.get(fila).getArchivo());
                    } catch (IOException ex) {
                        Logger.getLogger(panelVacantes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 7 && tbSolicitudes.getModel().getValueAt(fila, 5) == "Pendiente") {
                    if (JOptionPane.showConfirmDialog(null, "Aceptar para la fase de entrevistas?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        objPostulante.setId(postulantes.get(fila).getId());
                        if (objPostulante.ModificarPostulante(objPostulante, 3)) {
                            JOptionPane.showMessageDialog(null, "Postulante aceptado exitosamente");
                            enviarCorreo("Fase de Entrevista", "Felicidades" + postulantes.get(fila).getNombre() + " " + postulantes.get(fila).getApellido()+ ", usted ha sido elegido para pasar a la siguiente fase ques es la de entrevista, correspondiente a la postulacion del trabajo: " + postulantes.get(fila).getTrabajo() + ", nos pondremos en contacto con usted para coordinar la fecha de la entrevista que sera a travez de videollamda. Muchos exitos.\n Atte. Los Pollitos", postulantes.get(fila).getEmail());
                            postulantes=objPostulante.ListarPostulantes();
                            listar(postulantes);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo aceptar al postulante");
                        }
                    }
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 8 && tbSolicitudes.getModel().getValueAt(fila, 5) == "Pendiente") {
                    if (JOptionPane.showConfirmDialog(null, "No apto para la fase de entrevistas?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        objPostulante.setId(postulantes.get(fila).getId());
                        if (objPostulante.ModificarPostulante(objPostulante, 5)) {
                            JOptionPane.showMessageDialog(null, "Postulante eliminado exitosamente");
                            postulantes=objPostulante.ListarPostulantes();
                            enviarCorreo("Fase de Entrevista", "Lo lamentamos" + postulantes.get(fila).getNombre() + " " + postulantes.get(fila).getApellido()+ ", usted no ha logrado clasificar a la fase de entrivista, correspondiente a la postulacion del trabajo: " + postulantes.get(fila).getTrabajo() + ", Espewramos contar con usted para futuras postulaciones. Muchos exitos.\n Atte. Los Pollitos", postulantes.get(fila).getEmail());
                            listar(postulantes);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar al postulante");
                        }
                    }
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 7 && tbSolicitudes.getModel().getValueAt(fila, 5) == "Aceptado") {
                    if (JOptionPane.showConfirmDialog(null, "Contratar postulante?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        objPostulante.setId(postulantes.get(fila).getId());
                        if (objPostulante.ModificarPostulante(objPostulante, 4)) {
                            JOptionPane.showMessageDialog(null, "Postulante contratado exitosamente");
                            enviarCorreo("Fase de Contrato", "Felicidades" + postulantes.get(fila).getNombre() + " " + postulantes.get(fila).getApellido()+ ", usted ha sido elegido para ocupar el puesto al cual a postulado, correspondiente a: " + postulantes.get(fila).getTrabajo() + ", nos pondremos en contacto con usted para las coordinaciones corresp[ondientes. Muchos exitos.\n Atte. Los Pollitos", postulantes.get(fila).getEmail());
                            postulantes=objPostulante.ListarPostulantes();
                            listar(postulantes);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo contratar al postulante");
                        }
                    }
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 8 && tbSolicitudes.getModel().getValueAt(fila, 5) == "Aceptado") {
                    if (JOptionPane.showConfirmDialog(null, "Rechazar del contrato al postulante?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        objPostulante.setId(postulantes.get(fila).getId());
                        if (objPostulante.ModificarPostulante(objPostulante, 2)) {
                            JOptionPane.showMessageDialog(null, "Postulante rechazado exitosamente");
                            enviarCorreo("Fase de Contrato", "Lo lamentamos" + postulantes.get(fila).getNombre() + " " + postulantes.get(fila).getApellido()+ ", usted no ha logrado pasar la fase entrevista, correspondiente a la postulacion del trabajo: " + postulantes.get(fila).getTrabajo() + ", por lo tanto usted no podra ser contratado. Espewramos contar con usted para futuras postulaciones. Muchos exitos.\n Atte. Los Pollitos", postulantes.get(fila).getEmail());
                            postulantes=objPostulante.ListarPostulantes();
                            listar(postulantes);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo rechazar al postulante");
                        }
                    }
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && columna == 11) {
                    frmPreguntas frmPre = new frmPreguntas(postulantes.get(fila).getId(), postulantes.get(fila).getNombre() + " " + postulantes.get(fila).getApellido());
                    frmPre.setVisible(true);
                }

                if (tbSolicitudes.getModel().getColumnClass(columna).equals(JButton.class) && tbSolicitudes.columnAtPoint(e.getPoint()) == 10) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea reiniciar el estado del postulante seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                        objPostulante.setId(postulantes.get(fila).getId());
                        if (objPostulante.ModificarPostulante(objPostulante, 1)) {
                            JOptionPane.showMessageDialog(null, "Postulante reiniciado exitosamente");
                            postulantes=objPostulante.ListarPostulantes();
                            listar(postulantes);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo reiniciar la Pregunta");
                        }
                    }
                }
            }
        });

        clsTrabajo objTrabajo = new clsTrabajo();
        trabajos = objTrabajo.ListarTrabajos();
        for (int i = 0; i < trabajos.size(); i++) {
            cbTrabajos.addItem(trabajos.get(i).getNombre());
        }
    }
    
    public boolean enviarCorreo(String asunto, String mensaje, String destinatario){
        correo.setAdjunto(asunto);
        correo.setMensaje(mensaje);
        correo.setDestino(destinatario);
        return controladorCorreo.EnviarCorreo(correo);
    }
    
    public void listar(ArrayList<clsSolicitudes> postulantes) {
        tbSolicitudes.removeAll();
        
        Object[][] postulante = new Object[postulantes.size()][12];
        int j = 0;
        for (int i = 0; i < postulantes.size(); i++) {
            postulante[j][0] = postulantes.get(i).getNombre() + " " + postulantes.get(i).getApellido();
            postulante[j][1] = postulantes.get(i).getDni();
            postulante[j][2] = postulantes.get(i).getTrabajo();
            postulante[j][3] = postulantes.get(i).getCategoria();
            postulante[j][4] = postulantes.get(i).getLugar();
            if (postulantes.get(i).getEstado() == null) {
                postulante[j][5] = "Pendiente";
                postulante[j][7] = btnAceptar;
                postulante[j][8] = btnNoApto;

            } else if (postulantes.get(i).getEstado().toString().equals("1")) {
                postulante[j][5] = "Aceptado";
                postulante[j][7] = btnContratar;
                postulante[j][8] = btnRechazar;

            } else if (postulantes.get(i).getEstado().toString().equals("2")) {
                postulante[j][5] = "Contratado";
                postulante[j][7] = btnContratarInv;
                postulante[j][8] = btnRechazarInv;
            } else if (postulantes.get(i).getEstado().toString().equals("0")) {
                postulante[j][5] = "Rechazado";
                postulante[j][7] = btnContratarInv;
                postulante[j][8] = btnRechazarInv;
            } else if (postulantes.get(i).getEstado().toString().equals("3")) {
                postulante[j][5] = "No Apto";
                postulante[j][7] = btnAceptarInv;
                postulante[j][8] = btnNoAptoInv;
            }
            postulante[j][6] = postulantes.get(i).getFechaCreacion();
            postulante[j][9] = btnCv;
            postulante[j][10] = frmMain.btnEditar;
            postulante[j][11] = btnPreguntas;
            j++;
        }

        tbSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
                postulante,
                columnas) {
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        tbSolicitudes.setRowHeight(45);
        tbSolicitudes.getColumnModel().getColumn(0).setMinWidth(200);
        tbSolicitudes.getColumnModel().getColumn(1).setMinWidth(100);
        tbSolicitudes.getColumnModel().getColumn(2).setMinWidth(100);
        tbSolicitudes.getColumnModel().getColumn(3).setMinWidth(150);
        tbSolicitudes.getColumnModel().getColumn(4).setMaxWidth(80);
        tbSolicitudes.getColumnModel().getColumn(5).setMaxWidth(100);
        tbSolicitudes.getColumnModel().getColumn(6).setMaxWidth(100);
        tbSolicitudes.getColumnModel().getColumn(7).setMaxWidth(50);
        tbSolicitudes.getColumnModel().getColumn(8).setMaxWidth(50);
        tbSolicitudes.getColumnModel().getColumn(9).setMaxWidth(50);
        tbSolicitudes.getColumnModel().getColumn(10).setMaxWidth(50);
        tbSolicitudes.getColumnModel().getColumn(11).setMaxWidth(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSolicitudes = new javax.swing.JTable();
        cbTrabajos = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(236, 240, 245));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("Solicitudes de Trabajo");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1290, -1));

        tbSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbSolicitudes);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 1240, 510));

        cbTrabajos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su trabajo" }));
        cbTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrabajosActionPerformed(evt);
            }
        });
        panel.add(cbTrabajos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 450, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 550, -1));

        jLabel1.setText("Buscar:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrabajosActionPerformed
        if (cbTrabajos.getSelectedIndex() == 0) {
            postulantes=objPostulante.ListarPostulantes();
            listar(postulantes);
        } else {
            tbSolicitudes.removeAll();
            postulantes.clear();
            postulantes = objPostulante.ListarPostulante(trabajos.get(cbTrabajos.getSelectedIndex() - 1).getId());
            System.out.println(trabajos.get(cbTrabajos.getSelectedIndex() - 1).getId());
            if (postulantes.size() != 0) {

                listar(postulantes);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentran postulantes para esta categoría");
                postulantes=objPostulante.ListarPostulantes();
                listar(postulantes);
            }
        }


    }//GEN-LAST:event_cbTrabajosActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
      
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
         postulantes=objPostulante.buscarPalabra(txtBuscar.getText());
       listar(postulantes);
        
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTrabajos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbSolicitudes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
