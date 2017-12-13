package InicioEvaluador;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan carlos
 */
public class Lexico extends javax.swing.JFrame {

    /**
     * Creates new form Lexico
     */
    public Lexico() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        imprimir = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Ingrese La Cadena :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        imprimir.setColumns(20);
        imprimir.setRows(5);
        jScrollPane1.setViewportView(imprimir);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Convertir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("txt crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                .addGap(89, 89, 89)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       public static String Soption;
       public static int opcion;
       public static int espacio=0;
       public static int numeros=0;
       public static int minus=0,mayus=0;
       public static int Operadoraritmetico=0,Operadoralfa=0,OperadorRelacionales=0;
       public static int logico = 0;
      public static String cadena ="  ", captura="  ",dato1="  ",dato2="  ",dato3="  ",dato4="  ",dato5="  ",dato6="  ";
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu g=new menu();
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cadena = this.jTextField1.getText();
        for (int i = 0; i < cadena.length(); i++) 
      
       {
           
          if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122) 
            {
                minus++;
              captura=captura+cadena.charAt(i);
              
            }
          
            if (cadena.charAt(i) >= 65 && cadena.charAt(i) <= 90) 
            {
                mayus++;
                dato2+=cadena.charAt(i);
            }
            
              if (cadena.charAt(i)==42 || cadena.charAt(i) == 44 || cadena.charAt(i) == 45 || cadena.charAt(i) == 47)
            {
                Operadoraritmetico++;
                dato1+=cadena.charAt(i);
            }
         

         if (cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57) 
            {
                numeros++;
                dato3+=cadena.charAt(i);
            }
         
         
         if (cadena.charAt(i) == 32) 
            {
                espacio++;
                
            }
         if((cadena.charAt(i)==38||cadena.charAt(i)==124))
         {
         logico++;
         dato5+=cadena.charAt(i);
         
         if(cadena.charAt(i)==38)
             logico=2;
         }
         
         if ((cadena.charAt(i) == 58&&cadena.charAt(i+1) == 61) ||cadena.charAt(i)>=39&&cadena.charAt(i)<=41||cadena.charAt(i)>=59&&cadena.charAt(i)<=60) 
            {
                Operadoralfa++;
                dato4+=cadena.charAt(i);
                dato4+=" ";
               /* if(cadena.charAt(i)==58)
                {
                    dato4+="=";
                } */  
              
                    }
       }
       
        imprimir.setText("Expresion = "+cadena
                        +"\nCantidad= "+numeros+ "  numeros = "+dato3
                        +"\nCantidad= "+minus+"  Letras Minusculas = "+captura
                        +"\nCantidad= "+mayus+"  letras mayúsculas = "+dato2
                        +"\nCantidad= "+Operadoraritmetico+"  operadores aritméticos = "+dato1
                        +"\nCantidad= "+Operadoralfa+"  Operadores alfabetico = "+dato4
                        +"\nCantidad= "+logico+"  Operadores lógicos = "+dato5
                        +"\nespacios= "+espacio);    
                       /*  "Cantidad= "+OperadorRelacionales+"  Operadores relacionales = "+dato6*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw.write("Expresión= "+cadena);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw.write("Cantidad= "+numeros+"  numeros = "+dato3);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                bw.write("Cantidad= "+minus+"  Letras Minusculas = "+captura);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                bw.write("Cantidad= "+mayus+"  letras mayúsculas = "+dato2);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                bw.write("Cantidad= "+Operadoraritmetico+"  operadores aritméticos = "+dato1);
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
            bw.write("Cantidad= "+logico+"  Operadores lógicos = "+dato5);
            bw.newLine();
            bw.write("\nCantidad= "+Operadoralfa+"  Operadores alfabetico = "+dato4);
            bw.newLine();
            bw.write("espacios= "+espacio);
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.write("Hecho Por Juan Carlos Herrera Macias");
                
            }catch (IOException ex) {
                Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*
            
           
            
            bw.write("Cantidad= "+logico+"  Operadores lógicos = "+dato5);
            bw.newLine();
            bw.write("Cantidad= "+Operadoralfa+"  Operadores alfabetico = "+dato4);
            bw.newLine();
            bw.write("Cantidad= "+OperadorRelacionales+"  Operadores relacionales = "+dato6);
            bw.newLine();
            bw.write("espacios= "+espacio);
            bw.newLine();
            bw.newLine();
           
            bw.newLine();
            bw.write("Hecho Por Juan Carlos Herrera Macias");
            */
            
          //  bw.write(cadena+dato3+captura+dato2+dato1+dato5+dato4+dato6+espacio);
          //  bw.write(cadena2+captura2+scadenaInvertida+spalabra);
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
            Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lexico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea imprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
