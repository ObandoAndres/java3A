
public class examen extends javax.swing.JFrame {

    /**
     * Creates new form examen
     */
    public examen() {
        initComponents();
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innombre = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        campodeletra = new javax.swing.JTextField();
        mostrarrepetidas = new javax.swing.JTextField();
        mostrarnuevo = new javax.swing.JTextField();
        totalrepetidas = new javax.swing.JButton();
        nombrenuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        innombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innombreActionPerformed(evt);
            }
        });

        label1.setText("Por favor ingrese su nombre");

        label2.setText("Ingrese una letra");

        campodeletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campodeletraActionPerformed(evt);
            }
        });

        mostrarrepetidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarrepetidasActionPerformed(evt);
            }
        });

        mostrarnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarnuevoActionPerformed(evt);
            }
        });

        totalrepetidas.setText("Total letras repetidas");
        totalrepetidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalrepetidasActionPerformed(evt);
            }
        });

        nombrenuevo.setText("Mostrar nuevo nombre");
        nombrenuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrenuevoActionPerformed(evt);
            }
        });

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombrenuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalrepetidas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarrepetidas, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campodeletra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(innombre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campodeletra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalrepetidas)
                            .addComponent(mostrarrepetidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrenuevo))
                    .addComponent(mostrarnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void innombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innombreActionPerformed
       
    }//GEN-LAST:event_innombreActionPerformed

    private void nombrenuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrenuevoActionPerformed
          String nombrenuevo = innombre.getText();
        
             mostrarnuevo.setText(nombrenuevo);        // TODO add your handling code here:
    }//GEN-LAST:event_nombrenuevoActionPerformed

    private void totalrepetidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalrepetidasActionPerformed
        //obtiene el texto del nombre 
        String letrar = campodeletra.getText();
        String nombre = innombre.getText();
         
        int x;
        x = innombre.getText().length();

        String texto = innombre.getText();
        int i = 0;
        int r = 0;
        int d = 0;
        String texto2 = "";
        char letra;
        char letras;
        //obtiene la letra en tipo char
        letras = letrar.charAt(d);
        
        for (i = 0; i < x; i = i + 1) {
            
            
            letra = texto.charAt(i);  
            
            
            if (letra == letras){
                
                r = r  + 1;
                texto2 = texto2 + "XYZ";
            }
                else {
                
               texto2 = texto2 + letra;                 
            }   
                
                    
                    
                                  
        }
        
        mostrarnuevo.setText(texto2);
        mostrarrepetidas.setText(String.valueOf(r));
          
    
    }//GEN-LAST:event_totalrepetidasActionPerformed

    private void mostrarnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarnuevoActionPerformed

    private void mostrarrepetidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarrepetidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarrepetidasActionPerformed

    private void campodeletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campodeletraActionPerformed
            
    }//GEN-LAST:event_campodeletraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        innombre.setText("");
        campodeletra.setText("");
        mostrarrepetidas.setText("");
        mostrarnuevo.setText("");
     
    // End of variables declaration                   
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
            java.util.logging.Logger.getLogger(examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campodeletra;
    private javax.swing.JTextField innombre;
    private javax.swing.JButton jButton1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField mostrarnuevo;
    private javax.swing.JTextField mostrarrepetidas;
    private javax.swing.JButton nombrenuevo;
    private javax.swing.JButton totalrepetidas;
    // End of variables declaration//GEN-END:variables
}
