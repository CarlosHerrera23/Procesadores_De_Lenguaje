/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioEvaluador;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class AFD_2 extends javax.swing.JFrame {

    /**
     * Creates new form AFD
     */
    public AFD_2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //Metodo de limpiar textfield
    void limpiar(){
        textcadena.setText("");
    }
    //Metodo limpiar variables
    void limpiarvariables(){
        nestados=0;
        finalesta=new char[0];
        fin="";
        nalfabeto=0;
        tablatransicion1=new int[0][0];
        v1="";
        alfabeto=new char[0];
        contador=0;
        tablatransicion1=new int[0][0];
        btnestados.setEnabled(true);
        btnalfabeto.setEnabled(true);
        btntablatransicion.setEnabled(true);
    }
     //Metodo para ingresar estados 
     void estados(){ 
        //Se utiliza un try catch para cualquier posible error 
        try{     
        String e=JOptionPane.showInputDialog("Numero de Estados: ");
        nestados=Integer.parseInt(e);
        String t=JOptionPane.showInputDialog("Numero de Estados Finales: ");
        finalesta=new char[Integer.parseInt(t)];
        for(int i=0; i<finalesta.length; i++){
            String f=JOptionPane.showInputDialog("Estado Final "+i+": ");
            fin=fin+f;
        }
        finalesta=fin.toCharArray();
        for(int i=0; i<finalesta.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+finalesta[i]+" ingresado");
        }
        btnestados.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e); 
            nestados=0;
            finalesta=new char[0];
            fin="";
        }
    }
    //Metodo para ingresar el alfabeto
    void alfabeto(){
        //Se utiliza un try catch para cualquier posible error
        try{
        String a=JOptionPane.showInputDialog("Tamaño del Alfabeto: ");
        nalfabeto=Integer.parseInt(a);
        tablatransicion1=new int[nestados][nalfabeto];
        for(int i=0; i<nalfabeto; i++){
            String v=JOptionPane.showInputDialog("Caracter "+i+" del alfabeto:");
            v1=v1+v;
        }
        alfabeto=v1.toCharArray();
        for(int i=0; i<alfabeto.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+alfabeto[i]+" ingresado");
        }
        btnalfabeto.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e); 
            nalfabeto=0;
            tablatransicion1=new int[0][0];
            v1="";
            alfabeto=new char[0];
        }
    }
    //Metodo para ingresar la tabla de transicion
    void datostransicion(){
        //Se utiliza un try catch para cualquier posible error
        try{
        contador=1;
        for(int ii=0; ii<nestados; ii++){
            for(int jj=0; jj<nalfabeto; jj++){
                String r=JOptionPane.showInputDialog("Ingrese el valor de la tabla de transicion en["+ii+"]["+jj+"]");
                tablatransicion1[ii][jj]=Integer.parseInt(r);
            }
        }
        for(int ii=0; ii<nestados; ii++){
            for(int jj=0; jj<nalfabeto; jj++){
                JOptionPane.showMessageDialog(null,"Valor en posicion["+ii+"]["+jj+"]="+tablatransicion1[ii][jj]);
            }
        }
        btntablatransicion.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e);
            contador=0;
            tablatransicion1=new int[0][0];
        }
    } 
    //Metodo para obtener la posicion de la letra
    public int obtenerposicionletra(char n){
        int posicion=0;
        for(int i=0; i<alfabeto.length; i++){
            if(alfabeto[i]==n){ posicion=i; }
        }
        return posicion;        
    }
    //Metodo para obtener la letra
    public char obtenerletra(char n){
        char e=' ';
        for(int i=0; i<alfabeto.length; i++){
            if(alfabeto[i]==n){ e=alfabeto[i]; }
        }
        return e;
    }
    //Metodo para verificar los estados finales
    public int obteneref(int n){
        int ef=-1;
        String s="";
        s=s+Integer.toString(n);
        char [] ff=s.toCharArray();
        for(int i=0; i<finalesta.length; i++){
            if(finalesta[i]==ff[0]){ 
                String f="";
                f=f+finalesta[i];
                ef=Integer.parseInt(f);
            }
        }
        return ef;
    }    
    
    //Variables a utilizar
    int contador=0;
    int nestados;
    int estadosf;
    String fin="";
    char finalesta[];
    int nalfabeto;
    char [] alfabeto;
    String v1="";
    int tablatransicion1[][];
    int salestado[];
    
    boolean bandera;
    int est;
    char []cad;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textcadena = new javax.swing.JTextField();
        btntablatransicion = new javax.swing.JButton();
        btnevaluar = new javax.swing.JButton();
        btnestados = new javax.swing.JButton();
        btnalfabeto = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textError = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Ingrese La Cadena : ");

        btntablatransicion.setText(" Tabla/Transicion");
        btntablatransicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntablatransicionMouseClicked(evt);
            }
        });
        btntablatransicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntablatransicionActionPerformed(evt);
            }
        });

        btnevaluar.setText("Evaluar Cadena");
        btnevaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnevaluarMouseClicked(evt);
            }
        });

        btnestados.setText("Numero De Estados");
        btnestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnestadosMouseClicked(evt);
            }
        });
        btnestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadosActionPerformed(evt);
            }
        });

        btnalfabeto.setText("Simbolos");
        btnalfabeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalfabetoMouseClicked(evt);
            }
        });

        btnlimpiar.setText("Valores Nuevos");
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Estado de Aceptacion: ");

        textEstado.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Error:");

        textError.setEditable(false);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Automata Finito Deterministico");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("1 :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("2 :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("3 :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("4 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("5 :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btntablatransicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnalfabeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnestados, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnevaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(textError, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(textEstado)
                            .addComponent(textcadena))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnestados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnalfabeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntablatransicion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnevaluar)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnlimpiar)
                                    .addComponent(jLabel9))
                                .addContainerGap(126, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textcadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btntablatransicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntablatransicionMouseClicked
        // TODO add your handling code here:
        //Verifca que se ingreso el alfabeto antes de ingresar la tabla de transicion
        if(nalfabeto!=0){datostransicion();}
        else{JOptionPane.showMessageDialog(null,"Falta ingresar Alfabeto");}
    }//GEN-LAST:event_btntablatransicionMouseClicked

    private void btnevaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMouseClicked
        // TODO add your handling code here:
        //Aqui nos encontramos con el codigo que se ejecuta al momento de evaluar una cadena
        //Inicializamos est en 0 ,textEstado con nada y textError con nada
        textEstado.setText("");
        textError.setText("");
        est=0;
        //Verificamos que se halla ingresado correctamente la tabla de transicion
        if(textcadena.getText().length()==0 || contador==0){JOptionPane.showMessageDialog(null,"Falta Ingresar Algunas Cosas");}
        else{
            //Codigo para evaluar la cadena
            cad=textcadena.getText().toCharArray();
            salestado=new int[cad.length+1];
            salestado[0]=0;
            //Este ciclo recorre todo la cadena para evaluarla
            for(int i=0; i<cad.length; i++){
                if(cad[i]==obtenerletra(cad[i])){
                    est=tablatransicion1[est][obtenerposicionletra(cad[i])];
                    bandera=true;
                    salestado[i+1]=est;
                }
                else{
                    textEstado.setText("No Aceptado");
                    textError.setText("Caracter No Aceptado");
                    est=100;
                    salestado[i+1]=est;
                    bandera=false;
                    break;
                }
            }
            //Verificamos el estado final sea correcto
            if(bandera!=false){
                if(est==obteneref(est)){
                    bandera=true;
                }
                else{
                    bandera=false;
                    textEstado.setText("NO Aceptado");
                    textError.setText("Estado de Aceptacion");
                }
            }
            //Se imprime lo siguiente si no hubo ningun problema en la cadena
            if(bandera==true){textEstado.setText("Aceptado");
                textError.setText("Ninguno");}
            //En este ciclo se imprime los cambios que existierion en el estado
            for(int i=0; i<salestado.length; i++){
                JOptionPane.showMessageDialog(null,"Estado "+salestado[i]);
            }
        }
        //Llamamos al metodo limpiar
        limpiar();
    }//GEN-LAST:event_btnevaluarMouseClicked

    private void btnestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnestadosMouseClicked
        // TODO add your handling code here:
        //Llama al metodo estados
        estados();
    }//GEN-LAST:event_btnestadosMouseClicked

    private void btnalfabetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalfabetoMouseClicked
        // TODO add your handling code here:
        //Verifica que se hallan ingresado estados antes de agregar alfabetos
        if(nestados!=0){alfabeto();}
        else{JOptionPane.showMessageDialog(null,"Falta ingresar Estados!!");}
    }//GEN-LAST:event_btnalfabetoMouseClicked

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
        // TODO add your handling code here:
        //Llamar el metodo limpiar variables
        limpiarvariables();
    }//GEN-LAST:event_btnlimpiarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu n=new menu();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btntablatransicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntablatransicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntablatransicionActionPerformed

    private void btnestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnestadosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AFD_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AFD_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AFD_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFD_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFD_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalfabeto;
    private javax.swing.JButton btnestados;
    private javax.swing.JButton btnevaluar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btntablatransicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textcadena;
    // End of variables declaration//GEN-END:variables
}
