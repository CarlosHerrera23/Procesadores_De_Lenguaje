package InicioEvaluador;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan carlos
 */
public class ArchivoTxt extends javax.swing.JFrame  {

    /**
     * Creates new form ArchivoTxt
     */
   // String barra = File.separator;
   //String ubicacion = System.getProperty("user.dir")+barra+"Archivo_TXT_Creado"+barra;
   
   
           
    public ArchivoTxt() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Precione El boton para Crear El archivo txt");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nombre del Archivo:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CopyRigth by Juan Carlos Herrera");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/copyrigth_13-16.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* private void crear() {
 String archivo=jtxtid.getText()+".txt";
 File crea_ubicacion = new File(ubicacion);
 File crea_Archivo = new File(ubicacion+archivo);
 if (jtxtid.getText().equals("")){
     JOptionPane.showMessageDialog(rootPane,"No hay nombre");
 }else{
     
     try{
     if(crea_Archivo.exists()){
     JOptionPane.showMessageDialog(rootPane,"El registro ya existe");
     }else{
     crea_ubicacion.mkdirs();
        Formatter crea = new Formatter(ubicacion+archivo);
     }
 }catch (Exception e){
 }
 }
 }*/
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu v=new menu();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           Lexico a=new Lexico();
    palabrainvertir b=new palabrainvertir();
            String ruta = "C:/Users/Juan carlos/Documents/NetBeansProjects/Procesadores_De_Lenguaje.txt";
            File archivo = new File(ruta);
            BufferedWriter bw = null;
            if(archivo.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            //bw.write("El archivo de Texto a Sido creado.");
            JOptionPane.showMessageDialog(null,"El archivo de Texto a Sido creado");
            } else {
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw.write("primer programa");
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw.write("Expresión = "+a.cadena);
                bw.newLine();
                bw.write("Cantidad= "+a.numeros+"  numeros = "+a.dato3);
                bw.newLine();
                bw.write("Cantidad= "+a.minus+"  Letras Minusculas = "+a.captura);
                bw.newLine();
                bw.write("Cantidad= "+a.mayus+"  letras mayúsculas = "+a.dato2);
                bw.newLine();
                bw.write("Cantidad= "+a.Operadoraritmetico+"  operadores aritméticos = "+a.dato1);
                bw.newLine();
                bw.write("Cantidad= "+a.logico+"  Operadores lógicos = "+a.dato5);
                bw.newLine();
                bw.write("Cantidad= "+a.Operadoralfa+"  Operadores alfabetico = "+a.dato4);
                bw.newLine();
                bw.write("espacios= "+a.espacio);
                bw.newLine();
                bw.newLine();
                
                bw.write("Segundo Programa");
                bw.newLine();
                bw.write("Cadena = "+b.cadena2);
                bw.newLine();
                bw.write("separar = "+b.captura2);
                bw.newLine();
                bw.write("Palabra Invertida = "+b.scadenaInvertida);
                bw.newLine();
                bw.write("Numero de Palabras = " +b.y.countTokens());
                bw.newLine();
                bw.write("Palabra = " +b.spalabra);
                bw.newLine();
                bw.newLine();
                bw.write("Hecho Por Juan Carlos Herrera Macias");
               
            } catch (IOException ex) {
                Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            JOptionPane.showMessageDialog(null,"El archivo de Texto ya se creo");
            JOptionPane.showMessageDialog(null,"La ruta del Archivo es : " +
                                               " "
                                               +"C:/Users/Juan carlos/Documents/NetBeansProjects/Procesadores_De_Lenguaje.txt"
                                               +"\nNota: Para que el archivo le aparesca en su pc solo Cambie despues de User - el nombre de usuario de su pc"
                                               +"\n                                                                                      Gracias                               ");
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArchivoTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArchivoTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArchivoTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArchivoTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArchivoTxt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtid;
    // End of variables declaration//GEN-END:variables
}
