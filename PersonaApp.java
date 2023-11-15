
package persona;

/**
 *
 * @author jimen
 */
public class PersonaApp {


    public static void main(String[] args) 
    {
        System.out.println("Hola mundo");
        Persona persona1=new Persona("Juan",18);
        persona1.correr();
        persona1.saltar(10);
    }
    
}
