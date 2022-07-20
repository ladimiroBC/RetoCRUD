/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.EditarProductoControlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ladimiro
 */
public class EditarProductoJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarProductoJInternalFrame
     */
    public EditarProductoJInternalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductos = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtValorBase = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Editar Producto");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Producto", "Nombre", "Temperatura", "Valor Base", "Costo"
            }
        ));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        panelProductos.setViewportView(tbProductos);

        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtTemperatura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temperatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtValorBase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValorBase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Base", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        btnActualizar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtCosto.setEditable(false);
        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(txtValorBase, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addComponent(txtCosto))
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProductos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int id;
    private double temp, valBase, res;
    
    private void Costo(){
        temp = Double.parseDouble(txtTemperatura.getText());
        valBase = Double.parseDouble(txtValorBase.getText());
        
        if(temp >= 0 && temp <=20){
            res = Math.round((1.20*valBase)*100d)/100;
            txtCosto.setText(String.valueOf(res));
        }else{
            res = Math.round((1.20*valBase)*100d)/100;
            txtCosto.setText(String.valueOf(res));
        }
    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Costo();
        String [] datos = {
            txtIdProducto.getText(),
            txtNombre.getText(),
            txtTemperatura.getText(),
            txtValorBase.getText(),
            txtCosto.getText()
            
        };
        EditarProductoControlador control = new EditarProductoControlador();
        try {
            control.actualizarProducto(this.id, datos);
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(EditarProductoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EditarProductoControlador control =new EditarProductoControlador();
        try {
            control.eliminarProducto(this.id);
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(EditarProductoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        // TODO add your handling code here:
        int fila = tbProductos.getSelectedRow();
        this.id = Integer.parseInt(String.valueOf(tbProductos.getModel().getValueAt(fila, 0)));
        txtIdProducto.setText(String.valueOf(tbProductos.getModel().getValueAt(fila, 1)));
        txtNombre.setText(String.valueOf(tbProductos.getModel().getValueAt(fila, 2)));
        txtTemperatura.setText(String.valueOf(tbProductos.getModel().getValueAt(fila, 3)));
        txtValorBase.setText(String.valueOf(tbProductos.getModel().getValueAt(fila, 4)));
        txtCosto.setText(String.valueOf(tbProductos.getModel().getValueAt(fila, 5)));
        txtId.setText(String.valueOf(this.id));
    }//GEN-LAST:event_tbProductosMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void cargarTabla(){
        EditarProductoControlador control = new EditarProductoControlador();
        try {
            tbProductos.setModel(control.cargarProducto());
        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane panelProductos;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
