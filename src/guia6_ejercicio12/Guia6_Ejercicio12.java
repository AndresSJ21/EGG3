//Implemente la clase Persona. Una persona tiene un nombre y una fecha de
//nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
//siguientes métodos:
//Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.

//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.

package guia6_ejercicio12;
import Entidades.Persona;
import Servicios.PersonaServicios;
/* @author Andrés Panella
 */
public class Guia6_Ejercicio12 {

    public static void main(String[] args) {
    PersonaServicios ps = new PersonaServicios();
    Persona person = ps.crearPersona();
    ps.mostrarPersona(person);
    System.out.println(ps.calcularEdad(person));
    System.out.println("Ingrese datos de una segunda persona");
    Persona person2 = ps.crearPersona();
    Boolean esMenor = ps.menorQue(person, person2);
    System.out.println("Es "+esMenor+" que la primer persona es menor que la segunda");
    }

}
