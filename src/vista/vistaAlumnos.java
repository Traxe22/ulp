/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Alumnos;

/**
 *
 * @author Hugo
 */
public class vistaAlumnos extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form vistaAlumnos
     */
    public vistaAlumnos() {
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

        jMenu1 = new javax.swing.JMenu();
        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jB_AgregarAlumnos = new javax.swing.JButton();
        jB_Limpiar = new javax.swing.JButton();
        jB_Borrar = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jBuscar_Alumnos_id = new javax.swing.JButton();
        jT_Alumnos_id = new javax.swing.JTextField();
        jT_Alumnos_dni = new javax.swing.JTextField();
        jT_Alumnos_Nombre = new javax.swing.JTextField();
        jT_Alumnos_Apellidos = new javax.swing.JTextField();
        jR_Alumnos_activo = new javax.swing.JRadioButton();
        jR_Alumnos_Baja = new javax.swing.JRadioButton();
        jC_Fecha_de_Nacimiento = new com.toedter.calendar.JCalendar();
        jT_mostrar_calendario = new javax.swing.JTextField();
        jB_Actualizar_alumno = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabel1.setText("Formulario Alumnos ");

        jLabel2.setText("ID");

        jLabel3.setText("DNI");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Fecha de Nac.");

        jLabel7.setText("Estado");

        jB_AgregarAlumnos.setText("Agregar");
        jB_AgregarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AgregarAlumnosActionPerformed(evt);
            }
        });

        jB_Limpiar.setText("Limpiar");
        jB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LimpiarActionPerformed(evt);
            }
        });

        jB_Borrar.setText("Borrar");
        jB_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BorrarActionPerformed(evt);
            }
        });

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jBuscar_Alumnos_id.setText("Buscar");
        jBuscar_Alumnos_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscar_Alumnos_idActionPerformed(evt);
            }
        });

        jT_Alumnos_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Alumnos_idActionPerformed(evt);
            }
        });

        jR_Alumnos_activo.setText("Activo");

        jR_Alumnos_Baja.setText("Baja");

        jC_Fecha_de_Nacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jC_Fecha_de_NacimientoPropertyChange(evt);
            }
        });

        jB_Actualizar_alumno.setText("Actualizar");
        jB_Actualizar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Actualizar_alumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jR_Alumnos_activo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jR_Alumnos_Baja))
                            .addComponent(jT_Alumnos_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Alumnos_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB_AgregarAlumnos)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_Limpiar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jC_Fecha_de_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jT_Alumnos_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jT_Alumnos_id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBuscar_Alumnos_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jB_Borrar)
                                            .addGap(18, 18, 18)
                                            .addComponent(jB_Salir))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jT_mostrar_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jB_Actualizar_alumno)))))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBuscar_Alumnos_id)
                    .addComponent(jT_Alumnos_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Alumnos_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_Alumnos_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_Alumnos_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jC_Fecha_de_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_mostrar_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jR_Alumnos_activo)
                    .addComponent(jR_Alumnos_Baja))
                .addGap(23, 23, 23)
                .addComponent(jB_Actualizar_alumno)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_AgregarAlumnos)
                    .addComponent(jB_Limpiar)
                    .addComponent(jB_Borrar)
                    .addComponent(jB_Salir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscar_Alumnos_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscar_Alumnos_idActionPerformed
        // TODO add your handling code here:
        try {
        int id = Integer.parseInt(jT_Alumnos_id.getText());
        Alumnos alumnoEncontrado = Principal.alum_data.buscarAlumno(id);
        
        if (alumnoEncontrado != null) {
            String nombreAlumno = alumnoEncontrado.getNombre();
            String apellidoAlumno = alumnoEncontrado.getApellido();
            int dniAlumno = alumnoEncontrado.getDni();
            LocalDate fechaNacimientoAlumno = alumnoEncontrado.getFecha_de_nacimiento();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaNacimientoFormateada = fechaNacimientoAlumno.format(formatter);
            jT_Alumnos_Nombre.setText(nombreAlumno);
            jT_Alumnos_Apellidos.setText(apellidoAlumno);
            jT_Alumnos_dni.setText(String.valueOf(dniAlumno));
            jT_mostrar_calendario.setText(fechaNacimientoFormateada);
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado.");
        }
    } catch(Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al buscar.");
    }
        
    }//GEN-LAST:event_jBuscar_Alumnos_idActionPerformed

    private void jB_AgregarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AgregarAlumnosActionPerformed
        // TODO add your handling code here:
        try{
            botones.add(jR_Alumnos_activo);
            botones.add(jR_Alumnos_Baja);
            int dni = Integer.parseInt(jT_Alumnos_dni.getText());
            String nom = jT_Alumnos_Nombre.getText();
            String ape = jT_Alumnos_Apellidos.getText();
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            ff.format(jC_Fecha_de_Nacimiento.getCalendar().getTime());
            boolean estado = true;
            if(jR_Alumnos_activo.isSelected()){
                 estado = true;
            }
            if(jR_Alumnos_Baja.isSelected()){
                estado = false;
            }
            LocalDate fechaNacimiento = jC_Fecha_de_Nacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumnos alum = new Alumnos(dni, nom, ape, fechaNacimiento, estado);
            Principal.alum_data.guardarAlumno(alum);
                    
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al Guardar.");
        }
    }//GEN-LAST:event_jB_AgregarAlumnosActionPerformed

    private void jC_Fecha_de_NacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jC_Fecha_de_NacimientoPropertyChange
         if(evt.getOldValue()!= null){
             SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
             jT_mostrar_calendario.setText(ff.format(jC_Fecha_de_Nacimiento.getCalendar().getTime()));
             
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_Fecha_de_NacimientoPropertyChange

    private void jB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LimpiarActionPerformed
        // TODO add your handling code here:
        jT_Alumnos_id.setText("");
        jT_Alumnos_Nombre.setText("");
        jT_Alumnos_Apellidos.setText("");
        jT_Alumnos_dni.setText("");
        jT_mostrar_calendario.setText("");
        
    }//GEN-LAST:event_jB_LimpiarActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jT_Alumnos_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Alumnos_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Alumnos_idActionPerformed

    private void jB_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jT_Alumnos_id.getText());
        Principal.alum_data.eliminarAlumno(id);
        
            jR_Alumnos_activo.setSelected(false);
            jR_Alumnos_Baja.setSelected(true);
        
    }//GEN-LAST:event_jB_BorrarActionPerformed

    private void jB_Actualizar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Actualizar_alumnoActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jT_Alumnos_id.getText());
        int dni = Integer.parseInt(jT_Alumnos_dni.getText());
            String nom = jT_Alumnos_Nombre.getText();
            String ape = jT_Alumnos_Apellidos.getText();
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            ff.format(jC_Fecha_de_Nacimiento.getCalendar().getTime());
            boolean estado = true;
            if(jR_Alumnos_activo.isSelected()){
                 estado = true;
            }
            if(jR_Alumnos_Baja.isSelected()){
                estado = false;
            }
            LocalDate fechaNacimiento = jC_Fecha_de_Nacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumnos alum = new Alumnos(id,dni, nom, ape, fechaNacimiento, estado);
            Principal.alum_data.modificarAlumno(alum);
    }//GEN-LAST:event_jB_Actualizar_alumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton jB_Actualizar_alumno;
    private javax.swing.JButton jB_AgregarAlumnos;
    private javax.swing.JButton jB_Borrar;
    private javax.swing.JButton jB_Limpiar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JButton jBuscar_Alumnos_id;
    private com.toedter.calendar.JCalendar jC_Fecha_de_Nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JRadioButton jR_Alumnos_Baja;
    private javax.swing.JRadioButton jR_Alumnos_activo;
    private javax.swing.JTextField jT_Alumnos_Apellidos;
    private javax.swing.JTextField jT_Alumnos_Nombre;
    private javax.swing.JTextField jT_Alumnos_dni;
    private javax.swing.JTextField jT_Alumnos_id;
    private javax.swing.JTextField jT_mostrar_calendario;
    // End of variables declaration//GEN-END:variables
}
