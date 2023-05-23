
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
    
    private AlumnosData alumData;
    private MateriaData matData;

    public InscripcionData(Conexion conexion) {
        this.con = conexion.getConnection(); 
        this.alumData=new AlumnosData();
        this.matData=new MateriaData();
    }
    
    
    public boolean guardarInscripcion(Inscripcion inscripcion ){
      boolean insc= false;
      
      try {
          String sql ="INSERT INTO inscripcion (alumnos, materia, nota) VALUES (?,?,?)";
          PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setInt(1, inscripcion.getAlumno().getId_alumnos());
          ps.setInt(2, inscripcion.getMateria().getId_materia());
          ps.setDouble(3, inscripcion.getNota());
          ps.executeUpdate();
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              inscripcion.setId_mesa(rs.getInt("id_mesa"));
              JOptionPane.showMessageDialog(null, "Inscripcion guardada.");
              insc=true;
          }else{
              JOptionPane.showMessageDialog(null, "No se pudo guardar Inscripcion.");
          }
          ps.close();
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Error, el alumno ya esta inscripto a la materia.."+ex.getMessage());
      }
      return insc;
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
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener las inscripciones"+ex.getMessage());
        }
        return inscripciones;
    }
    
}
