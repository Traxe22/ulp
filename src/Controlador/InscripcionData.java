
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Alumnos;
import modelo.Inscripcion;
import modelo.Materia;

public class InscripcionData {
    private  Connection con = null;
    private AlumnosData alumData= new AlumnosData();
    private MateriaData matData=new MateriaData();

    public InscripcionData() {
        this.con = Conexion.getConnection();
    }
    
    public void guardarInscripcion(Inscripcion inscripcion) {
    try {
        String sql = "INSERT INTO inscripcion (alumnos, materia, nota) VALUES (?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, inscripcion.getAlumno().getId_alumnos());
        ps.setInt(2, inscripcion.getMateria().getId_materia());
        ps.setDouble(3, inscripcion.getNota());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            inscripcion.setId_mesa(rs.getInt("id_mesa"));
            JOptionPane.showMessageDialog(null, "Inscripcion guardada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar Inscripcion.");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error, el alumno ya está inscripto a la materia.. " + ex.getMessage());
    }
}
    
    public List<Inscripcion> obtenerTodasInscripcion(){
       ArrayList<Inscripcion> inscripciones = new ArrayList();
        try{
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet resultSet = ps.executeQuery();
            Inscripcion inscripcion;
            while(resultSet.next()){
                inscripcion= new Inscripcion();
                inscripcion.setId_mesa(resultSet.getInt("id_mesa"));
                
                Alumnos a = alumData.buscarAlumno(resultSet.getInt("alumnos"));
                inscripcion.setAlumno(a);
                
                Materia m = matData.buscarMateria(resultSet.getInt("materia"));
                inscripcion.setMateria(m);
                
                inscripcion.setNota(resultSet.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener las inscripciones"+ex.getMessage());
        }
        return inscripciones;
    }
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
    ArrayList<Inscripcion> inscripciones = new ArrayList<>();
    String sql = "SELECT inscripcion.id_mesa, inscripcion.alumnos, inscripcion.materia, inscripcion.nota FROM materia "
               + "JOIN inscripcion ON materia.id_materia = inscripcion.materia WHERE alumnos = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Inscripcion insc = new Inscripcion();
            insc.setId_mesa(rs.getInt("id_mesa"));
            insc.setAlumno(alumData.buscarAlumno(rs.getInt("alumnos")));
            insc.setMateria(matData.buscarMateria(rs.getInt("materia")));
            insc.setNota(rs.getDouble("nota"));
            inscripciones.add(insc);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener lista de Inscripciones: " + ex.getMessage());
    }
    return inscripciones;
}
    
    public List<Materia> obtenerMateriasCursadas(int id){
    ArrayList<Materia> materias = new ArrayList<>();
    String sql = "SELECT materia.id_materia, materia.nombre, materia.año FROM materia "
                 + "JOIN inscripcion ON materia.id_materia = inscripcion.materia "
                 + "WHERE materia.estado = true AND inscripcion.alumnos = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Materia mate = new Materia();
            mate.setId_materia(rs.getInt("id_materia"));
            mate.setNombre(rs.getString("nombre"));
            mate.setAño(rs.getInt("año"));
            mate.setEstado(true);
            materias.add(mate);
        }
        ps.close();
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al obtener materias "+ex.getMessage());
    }
    return materias;
    }
    public List<Materia> obtenerMateriasNOCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        try{
            String sql = "SELECT * FROM materia WHERE estado =1 AND id_materia NOT IN "
                    +"(SELECT materia FROM inscripcion WHERE alumnos =?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId_materia(resultSet.getInt("id_materia"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAño(resultSet.getInt("año"));
                materias.add(materia);
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripciones."+ex.getMessage());
        }
        return materias;
    }
    public void borrarInscripcionMateriaAlumno(int id_alum, int id_mate){
        String sql = "DELETE FROM inscripcion WHERE alumnos= ? AND materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_alum);
            ps.setInt(2, id_mate);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Inscripcion borrada con éxito");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al borrar inscripción "+ex.getMessage());
        }
    }
    public void actualizarNota(int id_alum, int id_mate, double nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE alumnos = ? AND materia = ?;";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, id_alum);
            ps.setInt(3, id_mate);
            
            
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Nota actualizada con éxito");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar nota");
        }
    }
    
    public ArrayList<Alumnos> obtenerAlumnosXMateria(int id_materia){
    ArrayList<Alumnos> alumnos = new ArrayList<>();
    String sql = "SELECT alumnos.id_alumnos, alumnos.nombre, inscripcion.nota " +
                 "FROM alumnos " +
                 "JOIN inscripcion ON alumnos.id_alumnos = inscripcion.alumnos " +
                 "JOIN materia ON materia.id_materia = inscripcion.materia " +
                 "WHERE inscripcion.materia = ?";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id_materia);
        ResultSet res = ps.executeQuery();
        while (res.next()) {
            int alumnoId = res.getInt("id_alumnos");
            String nombre = res.getString("nombre");
            double nota = res.getDouble("nota");

            Alumnos alumno = new Alumnos();
            alumno.setId_alumnos(alumnoId);
            alumno.setNombre(nombre);

            Inscripcion inscripcion = new Inscripcion();
            inscripcion.setNota(nota);
            
            
            inscripcion.setAlumno(alumno);

            alumnos.add(alumno);

            // Imprimir los datos del alumno
            //System.out.println("Alumno ID: " + alumnoId + ", Nombre: " + nombre + ", Nota: " + nota);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener los alumnos: " + ex.getMessage());
    }
    return alumnos;

    }
    
    public double obtenerNotaInscripcionn(int id_alumno, int id_materia) {
    String sql = "SELECT nota FROM inscripcion WHERE alumnos = ? AND materia = ?";
    PreparedStatement ps = null;
    double nota = 0.0;
    
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id_alumno);
        ps.setInt(2, id_materia);
        ResultSet res = ps.executeQuery();
        
        if (res.next()) {
            nota = res.getDouble("nota");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener la nota de inscripción: " + ex.getMessage());
    }
    
    return nota;
}
    
//    public ArrayList<Alumnos> obtenerAlumnosXMateria(int id_materia){
//    ArrayList<Alumnos> alumnos = new ArrayList<>();
//    String sql = "SELECT alumnos.id_alumnos, alumnos.nombre, inscripcion.nota " +
//                 "FROM alumnos " +
//                 "JOIN inscripcion ON alumnos.id_alumnos = inscripcion.alumnos " +
//                 "JOIN materia ON materia.id_materia = inscripcion.materia " +
//                 "WHERE inscripcion.materia = ?";
//    PreparedStatement ps = null;
//    try {
//        ps = con.prepareStatement(sql);
//        ps.setInt(1, id_materia);
//        ResultSet res = ps.executeQuery();
//        while (res.next()) {
//            int alumnoId = res.getInt("id_alumnos");
//            String nombre = res.getString("nombre");
//            double nota = res.getDouble("nota");
//
//            Alumnos alumno = new Alumnos();
//            alumno.setId_alumnos(alumnoId);
//            alumno.setNombre(nombre);
//
//            Inscripcion inscripcion = new Inscripcion();
//            inscripcion.setNota(nota);
//
//            // Establecer relación entre alumno e inscripción
//            inscripcion.setAlumno(alumno);
//
//            alumnos.add(alumno);
//        }
//        ps.close();
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al obtener los alumnos: " + ex.getMessage());
//    }
//    return alumnos;
//
//    }
}
