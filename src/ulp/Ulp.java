/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ulp;

import Controlador.*;
import java.time.LocalDate;
import modelo.Alumnos;
import modelo.Materia;

/**
 *
 * @author Hugo
 */
public class Ulp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Alumnos alumno1=new Alumnos(46234531, "Thomas", "Quiroga", LocalDate.of(2004,04,10), true);
//        AlumnosData alumno1_Data =new AlumnosData();
//        alumno1_Data.guardarAlumno(alumno1);
        
//        Materia materia1 = new Materia("Ciencias Naturales", 2, true);
          MateriaData materia1_Data = new MateriaData();
          //System.out.println("-> "+materia1_Data.buscarMateria(2));
          System.out.println("-> "+materia1_Data.listarMaterias());
          materia1_Data.listarMaterias();
//        materia1_Data.guardarMateria(materia1);
          //materia1_Data.eliminarMateria(6);

         // AlumnosData alumnoss_data = new AlumnosData();
          //System.out.println("-> "+alumnoss_data.buscarAlumno(6));
          //System.out.println("->"+ alumnoss_data.buscarAlumnoPorDni(23456789));
          //System.out.println("-> "+ alumnoss_data.listarAlumnos());
          //alumnoss_data.eliminarAlumno(7);
          //alumnoss_data.modificarAlumno(alumno1);
          
    }
    
}
