
package testcliente.banco;

/**
 *
 * @author Yaki's
 */

public class Cliente {

    private String nombre;
    private String apellido;
    private int edad;
    
        @Override
    public String toString() {
        return "Titular: " + this.apellido + this.nombre + "Edad: " + this.edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
