/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Materia;

/**
 *
 * @author Hugo
 */
public class vistaMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form vistaMaterias
     */
    public vistaMaterias() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jB_Guardar_materia = new javax.swing.JButton();
        jB_Borrar_Materia = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jB_Buscar_Materia_id = new javax.swing.JButton();
        jT_id_materia = new javax.swing.JTextField();
        jT_Nombre_materia = new javax.swing.JTextField();
        jT_Año_materia = new javax.swing.JTextField();
        jRB_Activo = new javax.swing.JRadioButton();
        jB_Limpiar = new javax.swing.JButton();
        jB_Actualizar_materia = new javax.swing.JButton();

        jLabel1.setText("Materia");

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jB_Guardar_materia.setText("Guardar");
        jB_Guardar_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Guardar_materiaActionPerformed(evt);
            }
        });

        jB_Borrar_Materia.setText("Borrar");
        jB_Borrar_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Borrar_MateriaActionPerformed(evt);
            }
        });

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jB_Buscar_Materia_id.setText("Buscar");
        jB_Buscar_Materia_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Buscar_Materia_idActionPerformed(evt);
            }
        });

        jRB_Activo.setText("Activo");

        jB_Limpiar.setText("Limpiar");
        jB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LimpiarActionPerformed(evt);
            }
        });

        jB_Actualizar_materia.setText("Actualizar");
        jB_Actualizar_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Actualizar_materiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jB_Guardar_materia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jB_Limpiar)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Borrar_Materia)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jT_id_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jB_Buscar_Materia_id)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jT_Nombre_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jT_Año_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jRB_Activo)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Actualizar_materia)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jB_Buscar_Materia_id)
                    .addComponent(jT_id_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Nombre_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_Año_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRB_Activo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jB_Actualizar_materia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Guardar_materia)
                    .addComponent(jB_Borrar_Materia)
                    .addComponent(jB_Salir)
                    .addComponent(jB_Limpiar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jB_Guardar_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Guardar_materiaActionPerformed
        // TODO add your handling code here:
        try{
            String nom = jT_Nombre_materia.getText();
            int año = Integer.parseInt(jT_Año_materia.getText());
            boolean estado=true;
            if(jRB_Activo.isSelected()){
                estado=true;
            }else{
                estado=false;
            }
            Materia mat = new Materia(nom, año, estado);
            Principal.matData.guardarMateria(mat);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al guardar Materia.");
        }
    }//GEN-LAST:event_jB_Guardar_materiaActionPerformed

    private void jB_Buscar_Materia_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Buscar_Materia_idActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(jT_id_materia.getText());
            Materia materiaEncontrada = Principal.matData.buscarMateria(id);
            if(materiaEncontrada!=null){
                String nomb = materiaEncontrada.getNombre();
                int año = materiaEncontrada.getAño();
                boolean estado = materiaEncontrada.isEstado();
                jT_Nombre_materia.setText(nomb);
                jT_Año_materia.setText(String.valueOf(año));
                if(estado){
                    jRB_Activo.setSelected(true);
                }else{
                    jRB_Activo.setSelected(false);
                }
            }
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(this, "Error al buscar.");
        }
    }//GEN-LAST:event_jB_Buscar_Materia_idActionPerformed

    private void jB_Borrar_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Borrar_MateriaActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(jT_id_materia.getText());
            
            Principal.matData.eliminarMateria(id);
            boolean estado = Principal.mat.isEstado();
                jRB_Activo.setSelected(false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al borrar.");
        }
    }//GEN-LAST:event_jB_Borrar_MateriaActionPerformed

    private void jB_Actualizar_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Actualizar_materiaActionPerformed
        // TODO add your handling code here:
        try{
            String nom = jT_Nombre_materia.getText();
            int año = Integer.parseInt(jT_Año_materia.getText());
            boolean estado=true;
            int id = Integer.parseInt(jT_id_materia.getText());
            
        
            if(jRB_Activo.isSelected()){
                estado=true;
            }else{
                estado=false;
            }
            Materia mat = new Materia(id,nom, año, estado);
            
            Principal.matData.modificarMateria(mat);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al guardar Materia.");
        }
    }//GEN-LAST:event_jB_Actualizar_materiaActionPerformed

    private void jB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LimpiarActionPerformed
        // TODO add your handling code here:
        jT_Año_materia.setText("");
        jT_Nombre_materia.setText("");
        jT_id_materia.setText("");
        jRB_Activo.setSelected(false);
    }//GEN-LAST:event_jB_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Actualizar_materia;
    private javax.swing.JButton jB_Borrar_Materia;
    private javax.swing.JButton jB_Buscar_Materia_id;
    private javax.swing.JButton jB_Guardar_materia;
    private javax.swing.JButton jB_Limpiar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRB_Activo;
    private javax.swing.JTextField jT_Año_materia;
    private javax.swing.JTextField jT_Nombre_materia;
    private javax.swing.JTextField jT_id_materia;
    // End of variables declaration//GEN-END:variables
}
