
package taller1;

/**
 *
 * @author jimen
 */
public abstract class Zoo 
{
    String nombre;
    int edad;
    private String Nregistro;

    public Zoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNregistro() {
        return Nregistro;
    }

    public void setNregistro(String Nregistro) {
        this.Nregistro = Nregistro;
    }
    public abstract void Comer();

    public abstract void Dormir();
}
