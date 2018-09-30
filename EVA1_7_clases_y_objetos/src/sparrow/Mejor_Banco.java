/*
 * 
 * 
 * 
 */
package sparrow;
public class Mejor_Banco
{
    //declarando atributos de la clase ¡SIEMPRE PRIVADOS!
    private String nombre;
    private double saldo;
    //siempre debe de haber un  intermediario con los datos
    //los intermediarios son metodos: y en orientados a objetos es "get" (lectura) y "set" (escritura)
    //metodos:
    //nivel de accceso - valor de retorno - nombre (variables de entrada)
    //leer datos de nuestra clase
    public String getNombre() {
        return nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
