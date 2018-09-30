import java.util.*;
//se puede declarar clases dentro de la principal pero causa problemas a la hora de usarlas
//las clases que declararemos hoy son fuera de la clase principal
//clase(espacio)objeto=new(espacio)clase();  --> delcaración e instanciación de un objeto
public class main
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        //1.- los onjetos son identificadores (variables)
        int iVal;
        Persona persona1; //pura declaracion (aun no tiene valor en memoria)
        //instanciar = asignar un valor (MEMORIA) -> new
        iVal=10;
        persona1=new Persona();//el objeto existe
        Persona persona2=new Persona();//instancio y declaro a la vez el objeto "persona2"
        System.out.println("escriube tu nombre");
        persona1.nombre=leer.nextLine();
        System.out.println("escribe tu primer apeido");
        persona1.apeido1=leer.nextLine();
        System.out.println("escriube tu nombre");
        persona2.nombre=leer.nextLine();
        System.out.println(persona1.nombre);//aqui ya se puede usart el objeto porque ya se inicializó (tiene memoria)
        System.out.println(persona2.nombre);
        System.out.println(persona1.apeido1);
        System.out.println("tu nombre completo es:");
        persona1.imp_nom_comp();
        
    }
}
class Persona
{
    //las variables dentro de una clase se les llaman atributos de la clase
    //y los atributos determinan el estado del objeto
    String nombre, apeido1, apeido2, rfc, genero, ciudad, est_civil;
    int edad, est_nac;
    //comportamiento de la clase
    //metodos y/o funciones
    //niveles de acceso | valor de retorno | nombre (argumentos)
    public void imp_nom_comp()//esto es un metodo de la clase y se puede llamar desde la clase principal con el objetos de esta clase
    {
        System.out.println(nombre+" "+apeido1);
    }
}