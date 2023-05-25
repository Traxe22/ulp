/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ulp;

import Controlador.*;
import java.time.LocalDate;
import modelo.Alumnos;
import modelo.Inscripcion;
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
        InscripcionData instancia = new InscripcionData();
        Alumnos alumno = new Alumnos(12345678, "John", "Doe", LocalDate.of(2000, 1, 1), true);
        AlumnosData alum_data = new AlumnosData();
        alum_data.guardarAlumno(alumno);
        
        
        Materia materia = new Materia("Matemáticas", 2023, true);
        MateriaData mat_data = new MateriaData();
        mat_data.guardarMateria(materia);

        // Crear un objeto de tipo Inscripcion
        Inscripcion inscripcion = new Inscripcion(8, alumno,materia); 
        instancia.guardarInscripcion(inscripcion);
        
    }
    
}
