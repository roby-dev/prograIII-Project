package Presentacion;

import Negocios.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class panelUsuario extends javax.swing.JPanel {

    clsUsuario objUsuario = new clsUsuario();
    ArrayList<clsUsuario> usuarios = objUsuario.ListarUsuarios();
    final Class[] tiposColumnas = new Class[]{
            java.lang.String.class,            
            java.lang.String.class,           
            java.lang.String.class,           
            java.lang.String.class,           
            java.lang.Boolean.class,            
            JButton.class,
            JButton.class
        };
    String[] columnas = new String[]{
            "Nombre Completo",
            "Usuario",
            "Email",
            "Tipo",
            "Estado",         
            "",
            ""};
    public panelUsuario() {
        initComponents();
        listar();
        tbUsuarios.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });

        tbUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbUsuarios.rowAtPoint(e.getPoint());
                int columna = tbUsuarios.columnAtPoint(e.getPoint());
                //PARA MODIFICAR
                if (tbUsuarios.getModel().getColumnClass(columna).equals(JButton.class) && tbUsuarios.columnAtPoint(e.getPoint())==5) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar el Usuario seleccionado?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objUsuario.setId(usuarios.get(fila).getId());
                        objUsuario.setNombre(usuarios.get(fila).getNombre());
                        objUsuario.setApellido(usuarios.get(fila).getApellido());
                        objUsuario.setUsername(usuarios.get(fila).getUsername());
                        objUsuario.setEmail(usuarios.get(fila).getEmail());
                        objUsuario.setTipo(usuarios.get(fila).getTipo());
                        objUsuario.setEstado(usuarios.get(fila).getEstado());
                        objUsuario.setClave(usuarios.get(fila).getClave());
                        frmModificarUsuario frmUsuario = new frmModificarUsuario(objUsuario);
                        frmUsuario.setVisible(true);
                    }
                }
                //PARA ELIMINAR
                if (tbUsuarios.getModel().getColumnClass(columna).equals(JButton.class) && tbUsuarios.columnAtPoint(e.getPoint())==6) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el Usuario seleccionado?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objUsuario.setId(usuarios.get(fila).getId());
                        if (objUsuario.EliminarUsuario(objUsuario)) {
                            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
                            listar();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar el Usuario");
                        }
                    }
                }
            }
        });
    }

    public void listar(){
        tbUsuarios.removeAll();
        usuarios = objUsuario.ListarUsuarios();
        Object[][] usuario = new Object[usuarios.size()][7];
        int j = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            usuario[j][0] = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido();
            usuario[j][1] = usuarios.get(i).getUsername();            
            usuario[j][2] = usuarios.get(i).getEmail();            
            usuario[j][3] = (usuarios.get(i).getTipo()==1)?"Administrador":"Usuario";            
            usuario[j][4] = (usuarios.get(i).getEstado()==1);            
            usuario[j][5] = frmMain.btnEditar;
            usuario[j][6] = frmMain.btnEliminar;
            j++;
        }

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                usuario,
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
        tbUsuarios.setRowHeight(45);       
        tbUsuarios.getColumnModel().getColumn(4).setMaxWidth(50);
        tbUsuarios.getColumnModel().getColumn(5).setMaxWidth(50);
        tbUsuarios.getColumnModel().getColumn(6).setMaxWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        btnNuevoUsuario = new javax.swing.JButton();

        panel.setBackground(new java.awt.Color(236, 240, 245));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("Listado de Usuarios");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1300, -1));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbUsuarios);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 790, 510));

        btnNuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        panel.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 50));

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

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        frmAgregarUsuario frmUsu = new frmAgregarUsuario();
        frmUsu.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbUsuarios;
    // End of variables declaration//GEN-END:variables
}
