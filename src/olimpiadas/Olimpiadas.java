
package olimpiadas;

import java.util.Date;


public class Olimpiadas {
    private int numeroDeParticipantes;
    private int numeroDeMedallas;
    private string nombreDeLasOlimpiadas;
    private Date fechaDeInicio;
    private int numeroDeCompetencias;
    private boolean hayCompetencia;
    
    public void eliminarParticipantes (){
        this.numeroDeParticipantes -=1;
    }
    
    public void entregaDeMedallas () {
        this.numeroDeMedallas -=4;
    }

    public int getNumeroDeParticipantes() {
        return numeroDeParticipantes;
    }

    public void setNumeroDeParticipantes(int numeroDeParticipantes) {
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public int getNumeroDeMedallas() {
        return numeroDeMedallas;
    }

    public void setNumeroDeMedallas(int numeroDeMedallas) {
        this.numeroDeMedallas = numeroDeMedallas;
    }

    public string getNombreDeLasOlimpiadas() {
        return nombreDeLasOlimpiadas;
    }

    public void setNombreDeLasOlimpiadas(string nombreDeLasOlimpiadas) {
        this.nombreDeLasOlimpiadas = nombreDeLasOlimpiadas;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getNumeroDeCompetencias() {
        return numeroDeCompetencias;
    }

    public void setNumeroDeCompetencias(int numeroDeCompetencias) {
        this.numeroDeCompetencias = numeroDeCompetencias;
    }

    public boolean isHayCompetencia() {
        return hayCompetencia;
    }

    public void setHayCompetencia(boolean hayCompetencia) {
        this.hayCompetencia = hayCompetencia;
    }

    
    
    
}
