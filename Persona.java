
package taller1;

/**
 *
 * @author jimen
 */
public abstract class Persona 
{
    String nombre;
    int edad;
    private String cedula;

    public Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() 
    {
        return cedula;
    }

    public void setCedula(String cedula) 
    {
        this.cedula = cedula;
    }
    public abstract void Comer();

    public abstract void Dormir();

}
