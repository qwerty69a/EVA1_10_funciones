/**
 *
 * todo metodo de la clase es la interfaz con la que se comunica lo de afuera con lo de la clase
 * siempre los atributos son privados y debemos usar los metodos como intermediarios
 * @author Alberto O, Salazar
 * ejemplos de atributos y su usoi y los modificadores de acceso
 */
import java.util.*;
import sparrow.Banco;
import sparrow.Mejor_Banco;
public class Main
{
    public static void main(String[] args)
    {
        Banco persona1=new Banco();
        persona1.nombre="Alberto O, Salazar";
        persona1.Saldo=999999999999.0;
        System.out.println("INFORMACIÖN DE LA CUENTA.");
        System.out.println("Titular: "+persona1.nombre);
        System.out.println("Saldo: "+persona1.Saldo);
        //me volaraon la lana ahora me voy a mejor banco
        Mejor_Banco mejor_persona1=new Mejor_Banco();
        mejor_persona1.setNombre("Alberto O, Salazar");
        mejor_persona1.setSaldo(-540.2);
        System.out.println("INFORMCAION DE LA MEJOR CUENTA");
        System.out.println("Titular: "+mejor_persona1.getNombre());
        System.out.println("Saldo: "+mejor_persona1.getSaldo());
    }
}