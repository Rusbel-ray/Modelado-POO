
package CapaNegocio;

import java.util.Date;

public class Alumno {
    //Atributos
    private String nombres;
    private String apellidos;
    private String codAlumno;
    private Date fechaNacimiento;
    
    //Multiplicidad
    public EscuelaProfesional perteneceEscuelaProfesional;
    public Matricula realizaMatricula;

    
    public Alumno() {
        
        this.nombres = "";
        this.apellidos = "";
        this.codAlumno = "";
        this.fechaNacimiento = null;
    }
    
    
    public Alumno(String nombres, String apellidos, String codAlumno, Date fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codAlumno = codAlumno;
        this.fechaNacimiento = fechaNacimiento;
    }

    
//
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
//
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
//
    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }
//
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
