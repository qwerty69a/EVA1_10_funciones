import java.util.*;
public class principal
{
    public static void main(String[] args)
    {
        //llamar a la función
        imprimeSaludo(capturaNombre());
    }
    public static String capturaNombre()
    {
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("cual es tu nombre ");
        nombre=leer.nextLine();
        return nombre;
    }
    public static void imprimeSaludo(String nombre)
    {
        System.out.println("Hola "+nombre);
    }
}