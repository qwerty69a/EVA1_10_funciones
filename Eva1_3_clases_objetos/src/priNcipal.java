//mai es metodo el objeto es args de tipo string
//lo arreglo en java tambien se comportan como objetos.
import java.util.*;
public class priNcipal
{
    public static void main(String[] args)
    {
        priNcipal objetoPrincipal;//declarando el objeto
        //asignación de memoria
        objetoPrincipal = new priNcipal();//constructor
        System.out.println("el objeto tiene: "+objetoPrincipal);
        priNcipal objeto2 = new priNcipal();//instanciación y declaración
        simple koko = new simple();
        //Scanner
        Scanner leer = new Scanner(System.in);//los parentesis son para enviar datos al momento de interactuar el objeto
    }
}
//clase sin comportamiento sin estado sin variables (vacia)
//crear objetos de clases
//cuando creamos objetos de la clase es como instanciar objetos
//nombre de la clase nombre del objeto
class simple
{
    
}