
import java.util.Random;
import javax.swing.ImageIcon;

public class NumberRace extends javax.swing.JFrame {
    
    int i = 0, i2 = -1  ,nivel = 50;
    
    private int puntos[] = new int[1000];
    private int chocado[] = new int[1000];
    private int despuntos[] = new int[1000];
    private int canpares[] = new int[1000];
    
    public NumberRace() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        winner = new javax.swing.JLabel();
        botondados = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        dadoder = new javax.swing.JLabel();
        dadoizq = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        combo2 = new javax.swing.JComboBox<>();
        combo1 = new javax.swing.JComboBox<>();
        botoninicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        returns = new javax.swing.JLabel();
        missing = new javax.swing.JLabel();
        turn_c = new javax.swing.JLabel();
        advanced = new javax.swing.JLabel();
        botontry = new javax.swing.JButton();
        botondes = new javax.swing.JButton();
        botonconfig = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        pares = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        turn_a = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        turn_b = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number race");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Number Race"));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number race");
        panel1.add(jLabel1);
        jLabel1.setBounds(60, 50, 710, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car64px.png"))); // NOI18N
        panel1.add(jLabel2);
        jLabel2.setBounds(230, 0, 160, 120);

        jPanel2.setBackground(new java.awt.Color(255, 145, 1));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Scores Zone"));
        jPanel5.setLayout(null);

        jLabel9.setText("Turn Player : ");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 20, 160, 20);

        jLabel10.setText("Advanced Positions :");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(20, 60, 180, 20);

        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jTextField5);
        jTextField5.setBounds(20, 40, 60, 18);

        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jTextField6);
        jTextField6.setBounds(20, 80, 60, 18);

        jLabel11.setText("Missing Positions :");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(20, 100, 180, 20);

        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jTextField7);
        jTextField7.setBounds(20, 120, 80, 18);

        jLabel12.setText("Returns :");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(20, 150, 190, 14);

        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jTextField8);
        jTextField8.setBounds(20, 170, 80, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(260, 110, 230, 210);

        winner.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        winner.setText("?");
        winner.setToolTipText("");
        jPanel2.add(winner);
        winner.setBounds(100, 50, 120, 110);

        panel1.add(jPanel2);
        jPanel2.setBounds(560, 340, 220, 170);

        botondados.setBackground(new java.awt.Color(204, 0, 51));
        botondados.setEnabled(false);
        botondados.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botondados.setLabel("ROLL DICES ");
        botondados.setName(""); // NOI18N
        botondados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondadosActionPerformed(evt);
            }
        });
        panel1.add(botondados);
        botondados.setBounds(20, 470, 210, 40);

        jPanel3.setBackground(new java.awt.Color(255, 145, 1));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel3.setLayout(null);

        dadoder.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dadoder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pregunta.png"))); // NOI18N
        jPanel3.add(dadoder);
        dadoder.setBounds(90, 40, 90, 83);

        dadoizq.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dadoizq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoizq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pregunta.png"))); // NOI18N
        jPanel3.add(dadoizq);
        dadoizq.setBounds(10, 40, 100, 83);

        panel1.add(jPanel3);
        jPanel3.setBounds(20, 330, 210, 130);

        jPanel4.setBackground(new java.awt.Color(255, 145, 1));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel4.setLayout(null);

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic:(50 Points)", "Intermediate:(100 Points)", "Advanced: (200 Points)" }));
        jPanel4.add(combo2);
        combo2.setBounds(20, 120, 170, 20);

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel4.add(combo1);
        combo1.setBounds(20, 60, 170, 20);

        botoninicio.setBackground(new java.awt.Color(0, 204, 51));
        botoninicio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botoninicio.setText("Start game");
        botoninicio.setOpaque(false);
        botoninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioActionPerformed(evt);
            }
        });
        jPanel4.add(botoninicio);
        botoninicio.setBounds(20, 160, 160, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Number of players");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 30, 130, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Level");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 90, 120, 14);

        panel1.add(jPanel4);
        jPanel4.setBounds(20, 110, 210, 210);

        jPanel6.setBackground(new java.awt.Color(255, 145, 1));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scores Zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel6.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Turn Player : ");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(20, 20, 160, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Advanced Positions :");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(20, 60, 180, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Missing Positions :");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(20, 100, 180, 20);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("Returns :");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(20, 150, 190, 14);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Scores Zone"));
        jPanel7.setLayout(null);

        jLabel17.setText("Turn Player : ");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(20, 20, 160, 20);

        jLabel18.setText("Advanced Positions :");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(20, 60, 180, 20);

        jTextField13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jTextField13);
        jTextField13.setBounds(20, 40, 60, 18);

        jTextField14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jTextField14);
        jTextField14.setBounds(20, 80, 60, 18);

        jLabel19.setText("Missing Positions :");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(20, 100, 180, 20);

        jTextField15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jTextField15);
        jTextField15.setBounds(20, 120, 80, 18);

        jLabel20.setText("Returns :");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(20, 150, 190, 14);

        jTextField16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jTextField16);
        jTextField16.setBounds(20, 170, 80, 20);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(260, 110, 230, 210);

        returns.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(returns);
        returns.setBounds(20, 170, 70, 20);

        missing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(missing);
        missing.setBounds(20, 120, 70, 20);

        turn_c.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(turn_c);
        turn_c.setBounds(20, 40, 70, 20);

        advanced.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(advanced);
        advanced.setBounds(20, 80, 70, 20);

        panel1.add(jPanel6);
        jPanel6.setBounds(250, 110, 230, 210);

        botontry.setBackground(new java.awt.Color(0, 204, 51));
        botontry.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botontry.setText("Try Again");
        botontry.setEnabled(false);
        botontry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontryActionPerformed(evt);
            }
        });
        panel1.add(botontry);
        botontry.setBounds(570, 200, 140, 40);

        botondes.setBackground(new java.awt.Color(0, 204, 51));
        botondes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botondes.setText("About of");
        botondes.setEnabled(false);
        botondes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondesActionPerformed(evt);
            }
        });
        panel1.add(botondes);
        botondes.setBounds(490, 280, 140, 40);

        botonconfig.setBackground(new java.awt.Color(0, 204, 51));
        botonconfig.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonconfig.setText("Config Params");
        botonconfig.setEnabled(false);
        botonconfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonconfigActionPerformed(evt);
            }
        });
        panel1.add(botonconfig);
        botonconfig.setBounds(650, 120, 140, 40);

        jPanel8.setBackground(new java.awt.Color(255, 145, 1));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pairs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Scores Zone"));
        jPanel9.setLayout(null);

        jLabel21.setText("Turn Player : ");
        jPanel9.add(jLabel21);
        jLabel21.setBounds(20, 20, 160, 20);

        jLabel22.setText("Advanced Positions :");
        jPanel9.add(jLabel22);
        jLabel22.setBounds(20, 60, 180, 20);

        jTextField17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jTextField17);
        jTextField17.setBounds(20, 40, 60, 18);

        jTextField18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jTextField18);
        jTextField18.setBounds(20, 80, 60, 18);

        jLabel23.setText("Missing Positions :");
        jPanel9.add(jLabel23);
        jLabel23.setBounds(20, 100, 180, 20);

        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jTextField19);
        jTextField19.setBounds(20, 120, 80, 18);

        jLabel24.setText("Returns :");
        jPanel9.add(jLabel24);
        jLabel24.setBounds(20, 150, 190, 14);

        jTextField20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jTextField20);
        jTextField20.setBounds(20, 170, 80, 20);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(260, 110, 230, 210);

        pares.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        pares.setText("0");
        jPanel8.add(pares);
        pares.setBounds(100, 30, 120, 110);

        panel1.add(jPanel8);
        jPanel8.setBounds(320, 340, 230, 170);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Turn Player");
        panel1.add(jLabel27);
        jLabel27.setBounds(240, 340, 120, 14);

        turn_a.setForeground(new java.awt.Color(255, 255, 255));
        turn_a.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel1.add(turn_a);
        turn_a.setBounds(240, 370, 70, 20);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Next Player");
        panel1.add(jLabel29);
        jLabel29.setBounds(240, 410, 70, 14);

        turn_b.setForeground(new java.awt.Color(255, 255, 255));
        turn_b.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel1.add(turn_b);
        turn_b.setBounds(240, 440, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botondadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondadosActionPerformed

        
        String jugadores = combo1.getSelectedItem().toString();
        String dificultad = combo2.getSelectedItem().toString();
        // 
        int can = Integer.parseInt(jugadores); 
        int g = 0;
        String mi = "";
        
        int jugador[] = new int[can];
        for (int i2 = 1; i2 <= can; i2++) {
            
            jugador[g] = i2;
            g++;
        }
        String j = Integer.toString(jugador[i]);
        turn_c.setText(j);
        turn_a.setText(j);
        if (i == can - 1) {
            turn_b.setText("1");

        }else if (i < can - 1) {
            String j2 = Integer.toString(jugador[i + 1]);
            turn_b.setText(j2);
        }

        if ("Basic:(50 Points)".equals(dificultad)) {
            nivel = 50;
            System.out.println("basico");
        } else if ("Intermediate:(100 Points)".equals(dificultad)) {
            nivel = 100;
            System.out.println("intermedio");
        } else if ("Advanced: (200 Points)".equals(dificultad)) {
            nivel = 200;
            System.out.println("avanzado");
        }
        
        int d1 = 0, d2 = 0;
        Random D = new Random();
        d1 = (int) (D.nextDouble() * 6 + 1);
        d2 = (int) (D.nextDouble() * 6 + 1);
        int suma = d1 + d2;
        if(d1==1 && d2==1){
        suma=21;
        }
        puntos[i] = puntos[i] + suma;
        String points = Integer.toString(puntos[i]);
        advanced.setText(points);
        
        if (puntos[i] >= nivel ) {
            String winn = Integer.toString(jugador[i]);
            winner.setText(winn);
            botondados.setEnabled(false);
            botoninicio.setEnabled(false);
        }
        
        
        if (can >= 1) {
            
            if (i == 0) {
            for (int i2 = i + 1; i2 <= can; i2++) {
                if (puntos[i] == puntos[i2]) {
                    puntos[i2] = 0;
                    chocado[i2] = chocado[i2] + 1;
                    }
                }
                }else if (i >= 1) {
                    
            for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (puntos[i] == puntos[i2]) {
                        puntos[i2] = 0;
                        chocado[i2] = chocado[i2] + 1;                    
                    }
                }
            }

        }
        despuntos[i]= nivel-puntos[i];
        missing.setText(Integer.toString(despuntos[i]));
             if(puntos[i]>nivel){
               missing.setText("0");
             }
        
         
        mi = Integer.toString(chocado[i]);
        returns.setText(mi);
        if (d1 == d2){
            canpares[i] = canpares[i] + 1;
            String p = Integer.toString(canpares[i]);
            pares.setText(p);
            i--;
        }else if (d1 != d2){
            canpares[i]=0;
            pares.setText(Integer.toString(canpares[i]));
            String p = Integer.toString(canpares[i]);
            pares.setText(p);
    }
        
        
        for (int t=0;t<=can-1;t++){   
                System.out.println("points: "+puntos[t]+" missing: "+despuntos[t]+" returns: "+chocado[t]+" pairs: "+canpares[t]+" player: "+jugador[t]);       
    }   
    System.out.println("--------------------------------------------------------------------");  
    
    
    
    switch (d1) {

            case 1:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/1.png")));
                break;
            case 2:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/2.png")));
                break;
            case 3:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/3.png")));
                break;
            case 4:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/4.png")));
                break;
            case 5:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/5.png")));
                break;
            case 6:
                dadoder.setIcon(new ImageIcon(getClass().getResource("images/6.png")));
                break;
            default:
                break;
        }
        switch (d2) {

            case 1:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/1.png")));
                break;
            case 2:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/2.png")));
                break;
            case 3:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/3.png")));
                break;
            case 4:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/4.png")));
                break;
            case 5:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/5.png")));
                break;
            case 6:
                dadoizq.setIcon(new ImageIcon(getClass().getResource("images/6.png")));
                break;
            default:
                break;
        }
        i++;
        if (i == can) {
            i = 0;
        }

    }//GEN-LAST:event_botondadosActionPerformed

    private void botontryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontryActionPerformed
        NumberRace NumberRace = new NumberRace();
        NumberRace.setVisible(true);
        dispose();

    }//GEN-LAST:event_botontryActionPerformed

    private void botoninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninicioActionPerformed

        turn_a.setText("1");
        turn_b.setText("2");
        turn_c.setText("1");

        botondados.setEnabled(true);
        botonconfig.setEnabled(true);
        botondes.setEnabled(true);
        botontry.setEnabled(true);

    }//GEN-LAST:event_botoninicioActionPerformed

    private void botonconfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonconfigActionPerformed

        parametros parametros = new parametros();
        parametros.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonconfigActionPerformed

    private void botondesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondesActionPerformed
        creacion creacion = new creacion();
        creacion.setVisible(true);
       this.dispose();
     //    this.setVisible(false);
    }//GEN-LAST:event_botondesActionPerformed

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
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberRace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advanced;
    private javax.swing.JButton botonconfig;
    private java.awt.Button botondados;
    private javax.swing.JButton botondes;
    private javax.swing.JButton botoninicio;
    private javax.swing.JButton botontry;
    public static javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel dadoder;
    private javax.swing.JLabel dadoizq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel missing;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel pares;
    private javax.swing.JLabel returns;
    private javax.swing.JLabel turn_a;
    private javax.swing.JLabel turn_b;
    private javax.swing.JLabel turn_c;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
