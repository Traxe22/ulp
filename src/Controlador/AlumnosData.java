package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Alumnos;

public class AlumnosData {

    private  Connection con = null;
    

  public AlumnosData() {
            con = Conexion.getConnection(); 
    }

    public void guardarAlumno(Alumnos alumno) {

        String sql = "INSERT INTO alumnos (dni, apellido, nombre, fecha_de_nacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_de_nacimiento()));//localDate a Date
            ps.setBoolean(5, alumno.isEstado()); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setId_alumnos(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }

    }
    public Alumnos buscarAlumno(int id) {
        Alumnos alumnos = null;
        String sql = "SELECT  dni, apellido, nombre, fecha_de_nacimiento FROM alumnos WHERE id_alumnos = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumnos=new Alumnos();
                alumnos.setId_alumnos(id);
                alumnos.setDni(rs.getInt("dni"));
                alumnos.setApellido(rs.getString("apellido"));
                alumnos.setNombre(rs.getString("nombre"));
                alumnos.setFecha_de_nacimiento(rs.getDate("fecha_de_nacimiento").toLocalDate());
                alumnos.setEstado(true);
            } else {
                //JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }

        return alumnos;
    }
    
    public Alumnos buscarAlumnoPorDni(int dni) {
        Alumnos alumno = null;
        String sql = "SELECT id_alumnos, dni, apellido, nombre, fecha_de_nacimiento FROM alumnos WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno=new Alumnos();
                alumno.setId_alumnos(rs.getInt("id_alumnos"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_de_nacimiento(rs.getDate("fecha_de_nacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }

       
        return alumno;
    }
    
    public List<Alumnos> listarAlumnos() {

        List<Alumnos> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumnos WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumnos alumno = new Alumnos();

                alumno.setId_alumnos(rs.getInt("id_alumnos"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_de_nacimiento(rs.getDate("fecha_de_nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return alumnos;
    }

    public void modificarAlumno(Alumnos alumnos) {

        String sql = "UPDATE alumnos SET dni = ? , apellido = ?, nombre = ?, fecha_de_nacimiento = ? WHERE  id_alumnos = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumnos.getDni());
            ps.setString(2, alumnos.getApellido());
            ps.setString(3, alumnos.getNombre());
            ps.setDate(4, Date.valueOf(alumnos.getFecha_de_nacimiento()));
            ps.setInt(5, alumnos.getId_alumnos());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {

        try {
            String sql = "UPDATE alumnos SET estado = 0 WHERE id_alumnos = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
          
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            }
              ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }

    
}
