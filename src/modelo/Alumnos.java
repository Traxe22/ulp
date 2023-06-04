/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class Alumnos {
    private int id_alumnos =-1;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha_de_nacimiento;
    private boolean estado;

    //Constructor
    public Alumnos(int id_alumnos,int dni, String nombre, String apellido, LocalDate fecha_de_nacimiento, boolean estado) {
        this.id_alumnos=id_alumnos;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.estado = estado;
    }

    public Alumnos() {
    }

    public Alumnos(int dni, String nombre, String apellido, LocalDate fecha_de_nacimiento, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.estado = estado;
    }
    
    //Getter and Setter
    public int getId_alumnos() {
        return id_alumnos;
    }
    

    public void setId_alumnos(int id_alumnos) {
        this.id_alumnos = id_alumnos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Metodos extras
    @Override
    public String toString() {
        return  dni + ", " + nombre + " " + apellido ;
    }
    
    
}
