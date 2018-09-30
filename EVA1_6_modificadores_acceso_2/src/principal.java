//@author Alberto O, Salazar 18550300
//demostracion de niveles de acceso
//para usar algo de una clase de un paquete fuera de un paquete hay que importar
//cuando es de otro paquete solo se puede usar lo publico
import java.util.*;
import secu.secu;
public class principal
{
    public int iPublico=10;
    private int iPrivado=20;
    protected int iProtegido=30;
    int iDefault=40;
    public static void main(String[] args)
    {
        principal kk=new principal();
        System.out.println(kk.iPublico);
        System.out.println(kk.iPrivado);
        System.out.println(kk.iProtegido);
        System.out.println(kk.iDefault);
        Default lk=new Default();
        System.out.println(lk.iPublico);
        System.out.println(lk.iProtegido);
        System.out.println(lk.iDefault);
        secu jj=new secu();
    }
}
class Default
{
    public int iPublico=10;
    private int iPrivado=20;
    protected int iProtegido=30;
    int iDefault=40;
}
class Default_main
{
    public int iPublico=10;
    private int iPrivado=20;
    protected int iProtegido=30;
    int iDefault=40;
}