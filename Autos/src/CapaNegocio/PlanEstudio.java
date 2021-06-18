
package CapaNegocio;

import java.util.ArrayList;

public class PlanEstudio {
    //Atributos
    private int horas;
    private int nroCursos; 
    
    //Multiplicidad
    public EscuelaProfesional estaenEscuelaProfesional;
    public ArrayList<CatalogoAsignaturas> contieneCatalogoAsignaturas = new ArrayList();

    
    
    public PlanEstudio() {
        
        this.horas = 0;
        this.nroCursos = 0;
    }
    
    public PlanEstudio(int horas, int nroCursos) {
        this.horas = horas;
        this.nroCursos = nroCursos;
    }

    
//
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
//
    public int getNroCursos() {
        return nroCursos;
    }

    public void setNroCursos(int nroCursos) {
        this.nroCursos = nroCursos;
    }
}
