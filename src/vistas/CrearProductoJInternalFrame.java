/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CrearProductoControlador;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ladimiro
 */
public class CrearProductoJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearProductoJInternalFrame
     */
    public CrearProductoJInternalFrame() {
        initComponents();
        
    }

    private double temp, valBase, res;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtValorBase = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        btnMostrarProducto = new javax.swing.JButton();
        panelProductos = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        txtCosto = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Crear Producto");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("CREACION DE PRODUCTOS");

        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtTemperatura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temperatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        txtValorBase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValorBase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Base", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        btnCrearProducto.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnMostrarProducto.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnMostrarProducto.setText("Mostrar Producto");
        btnMostrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductoActionPerformed(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Temperatura", "Valor Base", "Costo"
            }
        ));
        panelProductos.setViewportView(tbProductos);

        txtCosto.setEditable(false);
        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearProducto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtNombre))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarProducto)
                            .addComponent(txtValorBase, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtCosto))
                        .addGap(183, 183, 183))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProductos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearProducto)
                    .addComponent(btnMostrarProducto))
                .addGap(65, 65, 65)
                .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Costo(){
        temp = Double.parseDouble(txtTemperatura.getText());
        valBase = Double.parseDouble(txtValorBase.getText());
        
        if(temp >= 0 && temp <=20){
            res = Math.round((1.20*valBase)*100d)/100;
             
           // txtCosto.setText(String.format("%.2f", res));
           txtCosto.setText(String.valueOf(res));
        }else{
            res = Math.round((1.20*valBase)*100d)/100;
           // txtCosto.setText(String.format("%.2f", res));
           txtCosto.setText(String.valueOf(res));
        }
    }
    
    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        // TODO add your handling code here:
        Costo();
        CrearProductoControlador control = new CrearProductoControlador();
        String [] datos = {
            txtIdProducto.getText(),
            txtNombre.getText(),
            txtTemperatura.getText(),
            txtValorBase.getText(),
            txtCosto.getText()
            
        };
        try {
            control.crearProducto(datos);
            listarProductos();
        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnMostrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductoActionPerformed
        // TODO add your handling code here:
        listarProductos();
    }//GEN-LAST:event_btnMostrarProductoActionPerformed

    private void listarProductos(){
        CrearProductoControlador control = new CrearProductoControlador();
        try {
            tbProductos.setModel(control.cargarProducto());
        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnMostrarProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane panelProductos;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
