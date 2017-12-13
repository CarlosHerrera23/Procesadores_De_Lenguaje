/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioEvaluador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class fechas {
    public static void main(String[] args) throws ParseException {
         //Aquí colocas tu objeto tipo Date
        Date myDate = new Date();

        //Aquí obtienes el formato que deseas
            System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(myDate));
            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(myDate));
            System.out.println(new SimpleDateFormat("dd-MM-yy").format(myDate));
            System.out.println(new SimpleDateFormat("dd/MM/yy").format(myDate));
        //JOptionPane.showMessageDialog(null,(new SimpleDateFormat("dd-MM-yy").format(myDate)));
        String entrada = "12/03/2016"; // Entrada recogida como sea (scanner)
DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
Date fecha = format.parse(entrada); // Creamos un date con la entrada en el formato especificado
System.out.println(fecha);
        
// el que parsea
SimpleDateFormat parseador = new SimpleDateFormat("ddMMyy");
// el que formatea
SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");

Date date = parseador.parse("31032016");
System.out.println(formateador.format(date));

    }
}
