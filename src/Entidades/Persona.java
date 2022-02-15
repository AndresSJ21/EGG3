
package Entidades;
import java.util.Date;
/**
 * @author Andrés Panella
 */
public class Persona {

//atributos
    private String nombre;
    private Date fNacimiento;
    

//constructores
    public Persona(){
        
    }
     
    public Persona (String nombre, Date fNacimiento){
        this.nombre=nombre;
        this.fNacimiento=fNacimiento;
    }
    
//getters and setters
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    
//toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fNacimiento=" + fNacimiento + '}';
    }


    
}
