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
public class Participante{
        private String nombre;
        private Pronostico[] pronosticos;

    public Participante(String nombre, Pronostico[] pronosticos) {
        this.nombre = nombre;
        this.pronosticos = null;
    }
        
    public Participante(){
        this.nombre = "";        
        this.pronosticos = null;
    } 

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", pronosticos=" + pronosticos + '}';
    }

    
    
    // ----------------------------------------------
      
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }
      
    // ---------------------------------------------
 
            
}



        