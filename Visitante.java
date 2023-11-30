/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author jimen
 */
public class Visitante extends Persona
{
    String Ncarnet;
    public Visitante(String nombre, int edad,String Ncarnet) 
    {
        super(nombre, edad);
        this.Ncarnet=Ncarnet;
    }

    @Override
    public void Comer() {
        System.out.println(nombre+" esta comiendo"); 
    }

    @Override
    public void Dormir() 
    {
        System.out.println(nombre+" esta durmiendo");
    }
    public void Comprar()
    {
         System.out.println(nombre+" esta comprando");
    }
}
