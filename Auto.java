
package autovelocidadapp;

/**
 *
 * @author jimen
 */
public class Auto 
{
    String modelo;
    String placa;
    int año;

    public Auto(String modelo, String placa, int año) 
    {
        this.modelo = modelo;
        this.placa = placa;
        this.año = año;
    }
    public void Velocidad(int velocidad)
    {
        int vel=velocidad;
        if(velocidad>50)
        {
            System.out.println(this.modelo+" "+this.placa+" "+this.año+" multa por exceso de velocidad");
        }
        else
        {
            System.out.println("Dentro del limite de velocidad");
        }
    }
}
