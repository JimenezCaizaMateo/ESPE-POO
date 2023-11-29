
package calculadora;

/**
 *
 * @author jimen
 */
import java.util.Scanner;
public class Calculadora 
{ 
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Figura figura1=new Figura();
        //Figura figura2=new Figura();
        //Figura figura3=new Figura();
        System.out.println("Ingrese la opcion de area");
        System.out.println("1:area de cuadrado");
        System.out.println("2:area de triangulo");
        System.out.println("3:area de circulo");
        int op=scanner.nextInt();
        switch (op)
        {
            case 1:
                System.out.println("Ingrese un lado del cuadrado");
                int lado=scanner2.nextInt();
                System.out.println("EL area del cuadrado es = "+figura1.AreaCuadrado(lado));
            break;
            case 2:
                System.out.println("Ingrese base y altura");
                int base=scanner2.nextInt();
                int altura=scanner2.nextInt();               
                System.out.println("EL area del triangulo es = "+figura1.AreaTriangulo(base, altura));
            break;
            case 3:
                System.out.println("Ingrese el radio");
                int radio=scanner2.nextInt();
                System.out.println("EL area del circulo es = "+figura1.AreaCirculo(radio));
            break;
            default:
        }               
    }
    
}
