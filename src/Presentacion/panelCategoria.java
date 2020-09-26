package Presentacion;

import Negocios.*;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class panelCategoria extends javax.swing.JPanel {

    clsCategoria objCategoria = new clsCategoria();
    ArrayList<clsCategoria> categortias = objCategoria.ListarCategorias();
    final Class[] tiposColumnasCategorias = new Class[]{
            java.lang.String.class,           
            JButton.class,
            JButton.class
        };
    String[] columnasCategorias = new String[]{
            "Nombre",
            "",
            ""};
    public panelCategoria() {
     initComponents();
        listar();
        tbCategorias.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                
                return (Component) objeto;
            }
        });

        tbCategorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tbCategorias.rowAtPoint(e.getPoint());
                int columna = tbCategorias.columnAtPoint(e.getPoint());
                //PARA MODIFICAR
                if (tbCategorias.getModel().getColumnClass(columna).equals(JButton.class) && tbCategorias.columnAtPoint(e.getPoint())==1) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea modificar la Categoria seleccionada?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objCategoria.setId(categortias.get(fila).getId());
                        objCategoria.setNombre(categortias.get(fila).getNombre());
                        frmModificarCategoria frmCategoria = new frmModificarCategoria(objCategoria);
                        frmCategoria.setVisible(true);
                    }
                }
                //PARA ELIMINAR
                if (tbCategorias.getModel().getColumnClass(columna).equals(JButton.class) && tbCategorias.columnAtPoint(e.getPoint())==2) {
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la Categoria seleccionada?","Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0) {
                        objCategoria.setId(categortias.get(fila).getId());
                        if (objCategoria.EliminarCategoria(objCategoria)) {
                            JOptionPane.showMessageDialog(null, "Categoria eliminada exitosamente");
                            listar();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar la Categoria");
                        }
                    }
                }
            }
        });
    }
    
    public void listar(){
        tbCategorias.removeAll();
        categortias = objCategoria.ListarCategorias();
        Object[][] categoria = new Object[categortias.size()][3];
        int j = 0;
        for (int i = 0; i < categortias.size(); i++) {
            categoria[j][0] = categortias.get(i).getNombre();            
            categoria[j][1] = frmMain.btnEditar;
            categoria[j][2] = frmMain.btnEliminar;
            j++;
        }
        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
                categoria,
                columnasCategorias) {
            Class[] tipos = tiposColumnasCategorias;

            @Override
            public Class getColumnClass(int columnIndex) {
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tbCategorias.setRowHeight(45);       
        tbCategorias.getColumnModel().getColumn(1).setMaxWidth(50);
        tbCategorias.getColumnModel().getColumn(2).setMaxWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCategorias = new javax.swing.JTable();
        btnNuevaCategoría = new javax.swing.JButton();

        panel.setBackground(new java.awt.Color(236, 240, 245));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("Categorías");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1320, -1));

        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbCategorias);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 650, 510));

        btnNuevaCategoría.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaCategoría.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevaCategoría.setText("Nueva Categoría");
        btnNuevaCategoría.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoríaActionPerformed(evt);
            }
        });
        panel.add(btnNuevaCategoría, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaCategoríaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoríaActionPerformed
      frmAgregarCategoria frmAgregarCategoria = new frmAgregarCategoria();
      frmAgregarCategoria.setVisible(true);
    }//GEN-LAST:event_btnNuevaCategoríaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaCategoría;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbCategorias;
    // End of variables declaration//GEN-END:variables
}