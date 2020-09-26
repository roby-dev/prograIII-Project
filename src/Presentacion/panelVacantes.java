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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class panelVacantes extends javax.swing.JPanel {
    clsTrabajo objTrabajo = new clsTrabajo();
    ArrayList<clsTrabajo> trabajos = objTrabajo.ListarTrabajos();
    final Class[] tiposColumnas = new Class[]{
            java.lang.String.class,
            Date.class,
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class,
            Date.class,
            JButton.class,
            JButton.class
        };
    String[] columnas = new String[]{
            "Titulo",
            "Fecha Limite",
            "Categoría",
            "Lugar",
            "Estado",
            "Creación",
            "",
            ""};
    
    public panelVacantes() {
        initComponents();
        listar();
        tbVacantes.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });

        tbVacantes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbVacantes.rowAtPoint(e.getPoint());
                int columna = tbVacantes.columnAtPoint(e.getPoint());
                //PARA MODIFICAR
                if (tbVacantes.getModel().getColumnClass(columna).equals(JButton.class) && tbVacantes.columnAtPoint(e.getPoint())==6) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar la Vacante seleccionada?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objTrabajo.setId(trabajos.get(fila).getId());
                        objTrabajo.setNombre(trabajos.get(fila).getNombre());
                        objTrabajo.setDescripcion(trabajos.get(fila).getDescripcion());
                        objTrabajo.setRequerimientos(trabajos.get(fila).getRequerimientos());
                        objTrabajo.setFechaLimite(trabajos.get(fila).getFechaLimite());
                        objTrabajo.setEstado(trabajos.get(fila).getEstado());
                        objTrabajo.setLugar(trabajos.get(fila).getLugar());
                        objTrabajo.setCategoria(trabajos.get(fila).getCategoria());
                        objTrabajo.setImagen(trabajos.get(fila).getImagen());
                        frmModificarVacante frmUsuario = new frmModificarVacante(objTrabajo);
                        frmUsuario.setVisible(true);
                    }
                }
                //PARA ELIMINAR
                if (tbVacantes.getModel().getColumnClass(columna).equals(JButton.class) && tbVacantes.columnAtPoint(e.getPoint())==7) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la Vancante Seleccionada?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objTrabajo.setId(trabajos.get(fila).getId());
                        if (objTrabajo.EliminarTrabajo(objTrabajo)) {
                            JOptionPane.showMessageDialog(null, "Vacante eliminada exitosamente");
                            listar();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar la Vacante");
                        }
                    }
                }
            }
        }); 
    }

    public void listar(){
        tbVacantes.removeAll();
        trabajos.clear();
        trabajos = objTrabajo.ListarTrabajos();
        Object[][] trabajo = new Object[trabajos.size()][8];
        int j = 0;
        for (int i = 0; i < trabajos.size(); i++) {
            trabajo[j][0] = trabajos.get(i).getNombre();
            trabajo[j][1] = trabajos.get(i).getFechaLimite();
            trabajo[j][2] = trabajos.get(i).getCategoria();
            trabajo[j][3] = trabajos.get(i).getLugar();
            trabajo[j][4] = (trabajos.get(i).getEstado()==null)?"Activo":((int)trabajos.get(i).getEstado()==0)?" En Proceso":"Concluido";
            trabajo[j][5] = trabajos.get(i).getFechaCreacion();
            trabajo[j][6] = frmMain.btnEditar;
            trabajo[j][7] = frmMain.btnEliminar;
            j++;
        }
        tbVacantes.setModel(new javax.swing.table.DefaultTableModel(
                trabajo,
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
        tbVacantes.setRowHeight(45);
        tbVacantes.getColumnModel().getColumn(0).setMaxWidth(550);
        tbVacantes.getColumnModel().getColumn(1).setMaxWidth(120);
        tbVacantes.getColumnModel().getColumn(2).setMaxWidth(150);
        tbVacantes.getColumnModel().getColumn(3).setMaxWidth(100);
        tbVacantes.getColumnModel().getColumn(4).setMaxWidth(150);
        tbVacantes.getColumnModel().getColumn(5).setMaxWidth(100);
        tbVacantes.getColumnModel().getColumn(6).setMaxWidth(50);
        tbVacantes.getColumnModel().getColumn(7).setMaxWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVacantes = new javax.swing.JTable();
        btnNuevaVacante = new javax.swing.JButton();

        panel.setBackground(new java.awt.Color(236, 240, 245));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("Vacantes de Trabajo");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 1310, 10));

        tbVacantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbVacantes);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 1250, 510));

        btnNuevaVacante.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaVacante.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevaVacante.setText("Nueva Vacante");
        btnNuevaVacante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVacanteActionPerformed(evt);
            }
        });
        panel.add(btnNuevaVacante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 50));

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

    private void btnNuevaVacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVacanteActionPerformed
          frmAgregarVacante frmAgregarvacante = new frmAgregarVacante();
          frmAgregarvacante.setVisible(true);
    }//GEN-LAST:event_btnNuevaVacanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaVacante;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbVacantes;
    // End of variables declaration//GEN-END:variables
}
