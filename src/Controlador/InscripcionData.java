
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
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT materia.nombre FROM materia JOIN inscripcion ON materia.id_materia=inscripcion.materia WHERE alumnos =?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setId_mesa(id);
                insc.setAlumno(alumData.buscarAlumno(rs.getInt("id_alumno")));
                
                insc.setMateria(matData.buscarMateria(rs.getInt("id_materia")));
                
                insc.setNota(rs.getDouble("nota"));
                
                inscripciones.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener lista de Inscripciones"+ex.getMessage());
        }
        return inscripciones;
    }
    
    public ArrayList <Materia> obtenerMateriasCursadas(int id){
        ArrayList <Materia> materias = new ArrayList();
        String sql = "SELECT materia.nombre \n" +
"FROM materia  JOIN inscripcion ON materia.id_materia = inscripcion.materia WHERE materia.estado = true AND inscripcion.alumnos = ?;";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            ps.setInt(1, id);
            if(res.next()){
                Materia mat = new Materia();
                mat.setId_materia(res.getInt("id_materia"));
                mat.setNombre(res.getString("nombre"));
                mat.setAnio(res.getInt("año"));
                mat.setEstado(true);
                materias.add(mat);
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
    
}
