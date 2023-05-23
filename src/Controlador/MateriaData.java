
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
import modelo.Materia;

public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConnection();
    }
    
    public void guardarMateria(Materia materia){
       String sql ="INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)" ;
       try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, materia.getNombre());
           ps.setInt(2, materia.getAño());
           ps.setBoolean(3, materia.isEstado());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next()){
               materia.setId_materia(rs.getInt("IdMateria"));
               JOptionPane.showMessageDialog(null," Materia añadida con exito.");
           }
           ps.close();
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Materia"+ex.getMessage());
       }
    }
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT  nombre, año, estado  FROM materia WHERE id_materia=? AND estado =1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia= new Materia();
                materia.setId_materia(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);  
            }else{
                JOptionPane.showMessageDialog(null,"No existe materia.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
        }
        return materia;
    }
    public List<Materia> listarMaterias(){
       List<Materia> materias=new ArrayList<>();
       try{
           String sql = "SELECT * FROM materia WHERE estado =1";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               Materia materia = new Materia();
               materia.setId_materia(rs.getInt("id_materia"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAño(rs.getInt("año"));
               materia.setEstado(rs.getBoolean("estado"));
               materias.add(materia);
           }
           ps.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia. "+ex.getMessage());
       }
       return materias;
    }
    
    public void modificarMateria(Materia materia){
        String sql ="UPDATE materia SET nombre=?,año=? WHERE id_materia=?";
        PreparedStatement ps=null;
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "La Materia no existe");

            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
        }
    }
    public void eliminarMateria(int id){
        try{
            String sql = "UPDATE materia SET estado=0 WHERE id_materia=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó la Materia.");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
    }
     
}

