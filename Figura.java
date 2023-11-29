/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author jimen
 */
public class Figura 
{
    public Figura()
    {
        
    }
    public int AreaCuadrado(int lado)
    {
        int area=lado*lado;
        return area;
    }
    public int AreaTriangulo(int base,int altura)
    {
        int area=(base*altura)/2;
        return area;
    }
    public double AreaCirculo(double radio)
    {
        double area=2*Math.PI*Math.pow(radio,2);
        return area;
    }
            
}
