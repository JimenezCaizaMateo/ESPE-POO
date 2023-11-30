
package taller1;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Taller1 
{

    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Datos de persona");
        System.out.println("2: Datos de animal");
        int op2=sc.nextInt();
        sc.nextLine();
        switch (op2)
        {
            case 1:
            Scanner sc1=new Scanner(System.in);
            int edad=0;
            boolean a=false;
            System.out.println("Ingrese el nombre:");
            String nombre=sc1.nextLine();
            System.out.println("Ingrese numero de cedula:");
            String Ncedula=sc1.nextLine();
            while (!a)
            {
                try
                {
                    System.out.println("Ingrese edad:");
                    edad=sc1.nextInt();
                    sc1.nextLine();
                    a=true;
                }
                catch (InputMismatchException ex)
                {
                    System.out.println("Ingrese un numero entero en la edad");
                    sc1.nextLine();
                }   
            }
            System.out.println("1: Visitante");
            System.out.println("2: Cuidador");
            int op=sc1.nextInt();
            sc1.nextLine();
            switch (op)
            {
                case 1:
                
                    System.out.println("Ingrese el Numero de carnet");
                    String Ncarnet=sc1.nextLine(); 
                    Visitante visitante1=new Visitante(nombre,edad,Ncarnet);
                    visitante1.setCedula(Ncedula);
                    System.out.println(visitante1.nombre+" "+visitante1.Ncarnet+" "+visitante1.getCedula()+" "+visitante1.edad);
                    break;
                    case 2:
                    System.out.println("Ingrese el Numero de id");
                    String Nid=sc1.nextLine(); 
                    Cuidador cuidador1=new Cuidador(nombre,edad,Nid);
                    cuidador1.setCedula(Ncedula);
                    System.out.println(cuidador1.nombre+" "+cuidador1.Nid+" "+cuidador1.getCedula()+" "+cuidador1.edad);
                    break;
                default:
            }
            break;
            case 2:
                Scanner sc3=new Scanner(System.in);
                int edad2=0;
                boolean b=false;
                System.out.println("Ingrese el nombre:");
                String nombre2=sc3.nextLine();
                System.out.println("Ingrese numero de registro:");
                String Nregistro=sc3.nextLine();
                while (!b)
                {
                    try
                    {
                        System.out.println("Ingrese edad:");
                        edad2=sc3.nextInt();
                        sc3.nextLine();
                        b=true;
                    }
                    catch (InputMismatchException ex)
                    {
                        System.out.println("Ingrese un numero entero en la edad");
                        sc3.nextLine();
                    }   
                }
                System.out.println("1: Leon");
                System.out.println("2: Pinguino");
                int op3=sc3.nextInt();
                sc3.nextLine();
                switch (op3)
                {
                    case 1:
                    System.out.println("Ingrese el nombre de la vacuna");
                    String vacuna=sc3.nextLine(); 
                    Leon leon1=new Leon(nombre2,edad2,vacuna);
                    leon1.setNregistro(Nregistro);
                    System.out.println(leon1.nombre+" "+leon1.vacuna+" "+leon1.getNregistro()+" "+leon1.edad);
                    break;
                    case 2: 
                    Pinguino pinguino1=new Pinguino(nombre2,edad2);
                    pinguino1.setNregistro(Nregistro);
                    System.out.println(pinguino1.nombre+" "+pinguino1.getNregistro()+" "+pinguino1.edad);
                    break;
                default:
            }
            break;
          default:
        }
    } 
}
