
package CapaNegocio;

public class Asignaturas {
    
    public Asignaturas(){
        this.nombreAsignatura = "";
        this.codAsignatura = "";
        this.nroCreditos = 0;
    }
    
    public Asignaturas(String nombreAsignatura, String codAsignatura, int nroCreditos){
        this.nombreAsignatura = nombreAsignatura;
        this.codAsignatura = codAsignatura;
        this.nroCreditos = nroCreditos;
    }
    
    //Atributos
    private String nombreAsignatura;
    private String codAsignatura;
    private int nroCreditos;
    
    //Multiplicidad
    public Matricula correspondeMatricula;
    public CatalogoAsignaturas estaenCatalogoAsignaturas;

    //
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
//
    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }
//
    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }
}
