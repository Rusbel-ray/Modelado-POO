
package CapaNegocio;

import java.util.ArrayList;

public class Facultad {
    //Atributos
    private String codFacultad;
    private String nombreFacultad; 
    private String sede;
    private String decano;
    
    //Multiplicidad
    public ArrayList<EscuelaProfesional> tieneEscuelasProfesionales = new ArrayList();

    public Facultad() {
        
        this.codFacultad = "";
        this.nombreFacultad = "";
        this.sede = "";
        this.decano = "";
        
    }
    
    
    public Facultad(String codFacultad, String nombreFacultad, String sede, String decano) {
        this.codFacultad = codFacultad;
        this.nombreFacultad = nombreFacultad;
        this.sede = sede;
        this.decano = decano;
    }

    
//
    public String getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(String codFacultad) {
        this.codFacultad = codFacultad;
    }
//
    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }
//
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
//
    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }
}
