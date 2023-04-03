
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

public class Equipo {
        private String nombre;
        private String descripcion;

    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Equipo() {
        this.nombre = null;
        this.descripcion = null;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    
    
    
    // ----------------------------------------------   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
// ----------------------------------------------   
}
