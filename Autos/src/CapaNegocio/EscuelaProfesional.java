
package CapaNegocio;

import java.util.ArrayList;

public class EscuelaProfesional {
    //Atributos
    private String codEscuela;
    private String nombreEscuela;
    private String director;
    private String sede;
    
    //Multiplicidad
    public Facultad perteneceFacultad;
    public ArrayList<Alumno> tieneAlumnos = new ArrayList();
    public ArrayList<PlanEstudio> tienePlanEstudio = new ArrayList();

    
    public EscuelaProfesional() {
        
        this.codEscuela = "";
        this.nombreEscuela = "";
        this.director = "";
        this.sede = "";
        
    }
    
    public EscuelaProfesional(String codEscuela, String nombreEscuela, String director, String sede) {
        this.codEscuela = codEscuela;
        this.nombreEscuela = nombreEscuela;
        this.director = director;
        this.sede = sede;
    }

    
//
    public String getCodEscuela() {
        return codEscuela;
    }

    public void setCodEscuela(String codEscuela) {
        this.codEscuela = codEscuela;
    }
//
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
//
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
//
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
