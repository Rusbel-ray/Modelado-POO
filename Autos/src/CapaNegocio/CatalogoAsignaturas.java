
package CapaNegocio;

import java.util.ArrayList;

public class CatalogoAsignaturas {
 
    public CatalogoAsignaturas() {
        
        this.codCatalogo = "";
        this.cursosOfertados = "";
        this.horarios = "";
        this.vacantes = 0;
    }
    
    public CatalogoAsignaturas(String codCatalogo, String cursosOfertados, String horarios, int vacantes) {
        this.codCatalogo = codCatalogo;
        this.cursosOfertados = cursosOfertados;
        this.horarios = horarios;
        this.vacantes = vacantes;
    }
    
    //Atributos
    private String codCatalogo;
    private String cursosOfertados;
    private String horarios;
    private int vacantes;
    
    //Multiplicidad
    public ArrayList<Asignaturas> contieneAsignaturas = new ArrayList();
    public PlanEstudio estaenPlanEstudio;

    //    
    public String getCodCatalogo() {
        return codCatalogo;
    }

    public void setCodCatalogo(String codCatalogo) {
        this.codCatalogo = codCatalogo;
    }
//
    public String getCursosOfertados() {
        return cursosOfertados;
    }

    public void setCursosOfertados(String cursosOfertados) {
        this.cursosOfertados = cursosOfertados;
    }
//
    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
//
    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }
}
