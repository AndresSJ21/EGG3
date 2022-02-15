
package Servicios;
import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;
/**
 * @author Andrés Panella
 */
public class PersonaServicios {

    public Persona crearPersona(){
        Persona persona1=new Persona();
        int dia, mes, anio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona");
        persona1.setNombre(leer.nextLine());
        System.out.println("Ingrese fecha de nacimiento\nDía:\nMes:\nAño:");
        dia=leer.nextInt();
        mes=leer.nextInt();
        anio=leer.nextInt();
        Date fechaNac = new Date(anio-1900,mes-1,dia);
        persona1.setfNacimiento(fechaNac);
        return persona1;
    }
    
    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
    
    public int calcularEdad(Persona persona1){
        Date fechaActual = new Date();
        int edad;
        edad=Math.abs(persona1.getfNacimiento().getYear()-fechaActual.getYear());
        if (fechaActual.getMonth()<persona1.getfNacimiento().getMonth()){
            
            if(fechaActual.getDate()<persona1.getfNacimiento().getDate()){
                return edad-1;
            }else{
                return edad;
            }
        }else{
            return edad;
        }
    }
    
    
            //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
    public Boolean menorQue (Persona persona1,Persona persona2){
        Boolean esMenor1;
        if (persona1.getfNacimiento().before(persona2.getfNacimiento())){
        return esMenor1=false;
        }else{    
           return esMenor1=true; 
        }
    }
    
    public void mostrarPersona(Persona persona1){
        System.out.println(persona1);
    }
}
