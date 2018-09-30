//dentro de funciones y metodos estaticos solo se pueden uysar cosas estaticas
import java.util.*;
public class principal
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        double base, altura;
        System.out.println("ingresa la base del trinagulo");
        base=leer.nextDouble();
        System.out.println("ingresa la altura");
        altura=leer.nextDouble();
        double area=calculaArea(base, altura);//llamada a funcion o procedimiento
        System.out.println("el area es: "+area);//llamando a la funcion desde el println
    }
    //definiendo una función area
    //modificasdor de acceso || tipo de retorno || nombre (varables de entrada)
    public static double calculaArea(double base, double altura)
    {
        //implementacion de la función
        double area;
        area=(base*altura)/2;
        return area;
    }
}