
package CapaNegocio;

import java.util.ArrayList;
import java.util.Date;

public class Matricula {
    //Atributos
     private Date fechaIngreso;
     private String codMatricula;
     private int costoMatricula;
     private String semestre;
     
     //Multiplicidad
    public ArrayList<Alumno> correspondeAlumnos = new ArrayList();
    public ArrayList<Asignaturas> contieneAsignaturas = new ArrayList();
     
    public Matricula() {
        
        this.fechaIngreso = null;
        this.codMatricula = "";
        this.costoMatricula = 0;
        this.semestre = "";
    }
     
     
    public Matricula(Date fechaIngreso, String codMatricula, int costoMatricula, String semestre) {
        this.fechaIngreso = fechaIngreso;
        this.codMatricula = codMatricula;
        this.costoMatricula = costoMatricula;
        this.semestre = semestre;
    }

    
//
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
//
    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }
//
    public int getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(int costoMatricula) {
        this.costoMatricula = costoMatricula;
    }
//
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
