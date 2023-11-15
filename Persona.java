
package persona;

/**
 *
 * @author jimen
 */
public class Persona 
{
    String nombre;
    int edad;

    public Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void correr()
    {
        System.out.println(this.nombre+" esta corriendo");
    }
    public void saltar(int saltar)
    {
        System.out.println(this.nombre+" esta slatando a "+saltar+"cm del suelo");
    }
}
