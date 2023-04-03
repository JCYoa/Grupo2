/*
                TP1
*/
package tp;

/*
             Grupo 2:  Viviana ROSSI
                                Lorena ANDRADA
                                Nancy GAYA
                                Gerardo BIANCHETTI
                                Juan Carlos YOANU
*/
public class Pronostico {
    private Equipo equipo;
    private Partido partido;
    private char resultado;

    public Pronostico(Equipo equipo, Partido partido, char resultado) {
        this.equipo = equipo;
        this.partido = partido;
        this.resultado = resultado;
    }
   
    public Pronostico() {
        this.equipo = null;
        this.partido = null;
        this.resultado = 0;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "equipo=" + equipo + ", partido=" + partido + ", resultado=" + resultado + '}';
    }

    
    // ----------------------------------------------       
     

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }
    
       
     // ----------------------------------------------  
    
}
