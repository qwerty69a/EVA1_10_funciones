/**
 * Practica del examen diagnostico.
 * @author Alberto O, Salazar 18550300
 */
import java.util.*;
public class priNcipal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//captura desde teclado
        int mes;
        boolean salir=false;
        do
        {
            System.out.print("escoge un mes con su numero ");
            System.out.println("siendo este del 1 al 12 enero el 1 y diciembre el 12");
            mes=leer.nextInt();//lo que el usuario teclee, lo comvertimos a numero entero
            switch(mes)//verificamos el numero
            {
                case 1: System.out.println("Seleccionaste Enero");
                        if(mes==1)
                        {
                            salir=true;
                        }
                break;
                case 2: System.out.println("Seleccionaste Febrero");
                           if(mes==2)
                        {
                            salir=true;
                        }
                break;
                case 3: System.out.println("Seleccionaste Marzo");
                        if(mes==3)
                        {
                            salir=true;
                        }
                break;
                case 4: System.out.println("Seleccionaste Abril");
                        if(mes==4)
                        {
                            salir=true;
                        }
                break;
                case 5: System.out.println("Seleccionaste Mayo");
                        if(mes==5)
                        {
                            salir=true;
                        }
                break;
                case 6: System.out.println("Seleccionaste Junio");
                        if(mes==6)
                        {
                            salir=true;
                        }
                break;
                case 7: System.out.println("Seleccionaste Julio");
                        if(mes==7)
                        {
                            salir=true;
                        }
                break;
                case 8: System.out.println("Seleccionaste Agosto");
                        if(mes==8)
                        {
                            salir=true;
                        }
                break;
                case 9: System.out.println("Seleccionaste Septiembre");
                        if(mes==9)
                        {
                            salir=true;
                        }
                break;
                case 10: System.out.println("Seleccionaste Octubre");
                        if(mes==10)
                        {
                            salir=true;
                        }
                break;
                case 11: System.out.println("Seleccionaste Noviembre");
                        if(mes==11)
                        {
                            salir=true;
                        }
                break;
                case 12: System.out.println("Seleccionaste Diciembre");
                        if(mes==12)
                        {
                            salir=true;
                        }
                break;
                default: System.out.println("¡Ese mes no existe!");//siempre al final y sin break
            }
        }while(salir==false);
}}
