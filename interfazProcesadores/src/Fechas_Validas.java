import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
 
public class Fechas_Validas {
public static void main(String[] args) {
        String fecha,fecha2;
        Scanner leer=new Scanner(System.in);
    boolean res=true;
    boolean res2=true;
        System.out.println("Dame la fecha");
        fecha=leer.next();
        fecha2=leer.next();
        res=validarFecha(fecha);
        res2=validarFecha2(fecha2);
        if(res==true){
            System.out.println("La fecha es valida");
             }else
                 System.out.println("La fecha no es valida");
        
        if(res2==true){
            System.out.println("La fecha es valida");
             }else
                 System.out.println("La fecha no es valida");
         }

 
public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }


public static boolean validarFecha2(String fecha2) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha2);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}