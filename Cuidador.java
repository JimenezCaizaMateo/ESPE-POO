/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author jimen
 */
public class Cuidador extends Persona
{
    String Nid;
    
    public Cuidador(String nombre, int edad, String Nid) 
    {
        super(nombre, edad);
        this.Nid=Nid;
    }
    

    @Override
    public void Comer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Dormir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void Alimentar()
    {
        
    }
}
