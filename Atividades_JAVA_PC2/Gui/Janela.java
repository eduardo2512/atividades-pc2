
package janela;


public class Janela extends javax.swing.JFrame {

    private int estado;
    private boolean rep1;
    private boolean rep2;
    private boolean rep3;
    private boolean rep4;
    private boolean rep5;
    private boolean rep6;
    private boolean rep7;
    private boolean rep8;
    private boolean rep9;
    private Jogo a;
    private boolean vitoria;
    private JanVitoria ganhou;
    private JanDerrota perdeu;
    public Janela() {
        initComponents();
        estado=0;
        rep1=false;
        rep2=false;
        rep3=false;
        rep4=false;
        rep5=false;
        rep6=false;
        rep7=false;
        rep8=false;
        rep9=false;
        vitoria=false;
        a=new Jogo();
        ganhou= new JanVitoria();
        perdeu= new JanDerrota();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        b6 = new javax.swing.JToggleButton();
        b7 = new javax.swing.JToggleButton();
        b8 = new javax.swing.JToggleButton();
        b9 = new javax.swing.JToggleButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        p11 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        p22 = new javax.swing.JButton();
        p23 = new javax.swing.JButton();
        p31 = new javax.swing.JButton();
        p32 = new javax.swing.JButton();
        p33 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Checawin = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton6.setText("jToggleButton6");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("A soma de cada linha,coluna e diagonal deve ser sempre 15");

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        p11.setText("0");
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        jPanel2.add(p11);

        p12.setText("0");
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });
        jPanel2.add(p12);

        p13.setText("0");
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });
        jPanel2.add(p13);

        p21.setText("0");
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });
        jPanel2.add(p21);

        p22.setText("0");
        p22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p22ActionPerformed(evt);
            }
        });
        jPanel2.add(p22);

        p23.setText("0");
        p23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23ActionPerformed(evt);
            }
        });
        jPanel2.add(p23);

        p31.setText("0");
        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });
        jPanel2.add(p31);

        p32.setText("0");
        p32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p32ActionPerformed(evt);
            }
        });
        jPanel2.add(p32);

        p33.setText("0");
        p33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p33ActionPerformed(evt);
            }
        });
        jPanel2.add(p33);

        jLabel2.setText("SELECIONE O NUMERO ABAIXO QUE DESEJA COLOCAR");

        jLabel3.setText("SELECIONE A POSICAO QUE DESEJA INSERIR O NUMERO");

        Checawin.setText("Checar Vitoria");
        Checawin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecawinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Checawin)
                .addGap(18, 18, 18)
                .addComponent(reset)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(exit)
                    .addComponent(Checawin))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        estado=3;
        
    }//GEN-LAST:event_b3ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        p11.setText("0");
        p12.setText("0");
        p13.setText("0");
        p21.setText("0");
        p22.setText("0");
        p23.setText("0");
        p31.setText("0");
        p32.setText("0");
        p33.setText("0");
        a.reset();
        rep1=false;
        rep2=false;
        rep3=false;
        rep4=false;
        rep5=false;
        rep6=false;
        rep7=false;
        rep8=false;
        rep9=false;
    }//GEN-LAST:event_resetActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p11.setText("1");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p11.setText("2");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p11.setText("3");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p11.setText("4");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p11.setText("5");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p11.setText("6");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p11.setText("7");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p11.setText("8");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p11.setText("9");
                a.setP11(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
    }//GEN-LAST:event_p11ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        estado=1;
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        estado=2;
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        estado=4;
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        estado=6;
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        estado=7;
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        estado=8;
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        estado=9;
    }//GEN-LAST:event_b9ActionPerformed

    private void ChecawinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecawinActionPerformed
        vitoria=a.cheacaVitoria();
        if(vitoria==true){
            ganhou.setVisible(true);
        }
        else{
           perdeu.setVisible(true);
        }
          a.reset();
        p11.setText("0");
        p12.setText("0");
        p13.setText("0");
        p21.setText("0");
        p22.setText("0");
        p23.setText("0");
        p31.setText("0");
        p32.setText("0");
        p33.setText("0");
        rep1=false;
        rep2=false;
        rep3=false;
        rep4=false;
        rep5=false;
        rep6=false;
        rep7=false;
        rep8=false;
        rep9=false;
    }//GEN-LAST:event_ChecawinActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p12.setText("1");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p12.setText("2");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p12.setText("3");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p12.setText("4");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p12.setText("5");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p12.setText("6");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p12.setText("7");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p12.setText("8");
                a.setP12(estado);
                a.setLinha1();
                a.setColuna2();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p12.setText("9");
                a.setP12(estado);
                a.setLinha1();
                a.setDiag1();
                a.setDiag2();
                a.setColuna1();
            }
        }
    }//GEN-LAST:event_p12ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p13.setText("1");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p13.setText("2");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p13.setText("3");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p13.setText("4");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p13.setText("5");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p13.setText("6");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p13.setText("7");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p13.setText("8");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p13.setText("9");
                a.setP13(estado);
                a.setDiag2();
                a.setLinha1();
                a.setColuna3();
            }
        }
    }//GEN-LAST:event_p13ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p21.setText("1");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p21.setText("2");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p21.setText("3");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p21.setText("4");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p21.setText("5");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p21.setText("6");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p21.setText("7");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p21.setText("8");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p21.setText("9");
                a.setP21(estado);
                a.setLinha2();
                a.setColuna2();
            }
        }
    }//GEN-LAST:event_p21ActionPerformed

    private void p22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p22ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p22.setText("1");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p22.setText("2");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p22.setText("3");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p22.setText("4");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p22.setText("5");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p22.setText("6");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p22.setText("7");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p22.setText("8");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p22.setText("9");
                a.setP22(estado);
                a.setLinha2();
                a.setDiag1();
                a.setColuna2();
            }
        }
    }//GEN-LAST:event_p22ActionPerformed

    private void p23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p23.setText("1");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p23.setText("2");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p23.setText("3");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p23.setText("4");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p23.setText("5");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p23.setText("6");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p23.setText("7");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p23.setText("8");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p23.setText("9");
                a.setP23(estado);
                a.setLinha2();
                a.setColuna3();
            }
        }
    }//GEN-LAST:event_p23ActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p31.setText("1");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p31.setText("2");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p31.setText("3");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p31.setText("4");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p31.setText("5");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p31.setText("6");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p31.setText("7");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p31.setText("8");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p31.setText("9");
                a.setP31(estado);
                a.setLinha3();
                a.setDiag2();
                a.setColuna1();
            }
        }
    }//GEN-LAST:event_p31ActionPerformed

    private void p32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p32ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p32.setText("1");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p32.setText("2");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p32.setText("3");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p32.setText("4");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p32.setText("5");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p32.setText("6");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p32.setText("7");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p32.setText("8");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p32.setText("9");
                a.setP32(estado);
                a.setLinha3();
                a.setColuna2();
            }
        }
    }//GEN-LAST:event_p32ActionPerformed

    private void p33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p33ActionPerformed
        if(estado==1){
            if(rep1==false){
                rep1=true;
                p33.setText("1");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==2){
            if(rep2==false){
                rep2=true;
                p33.setText("2");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==3){
            if(rep3==false){
                rep3=true;
                p33.setText("3");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==4){
            if(rep4==false){
                rep4=true;
                p33.setText("4");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==5){
            if(rep5==false){
                rep5=true;
                p33.setText("5");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==6){
            if(rep6==false){
                rep6=true;
                p33.setText("6");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==7){
            if(rep7==false){
                rep7=true;
                p33.setText("7");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==8){
            if(rep8==false){
                rep8=true;
                p33.setText("8");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
        if(estado==9){
            if(rep9==false){
                rep9=true;
                p33.setText("9");
                a.setP33(estado);
                a.setLinha3();
                a.setDiag1();
                a.setColuna3();
            }
        }
    }//GEN-LAST:event_p33ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        estado=5;
    }//GEN-LAST:event_b5ActionPerformed

  
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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checawin;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.JToggleButton b6;
    private javax.swing.JToggleButton b7;
    private javax.swing.JToggleButton b8;
    private javax.swing.JToggleButton b9;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JButton p11;
    private javax.swing.JButton p12;
    private javax.swing.JButton p13;
    private javax.swing.JButton p21;
    private javax.swing.JButton p22;
    private javax.swing.JButton p23;
    private javax.swing.JButton p31;
    private javax.swing.JButton p32;
    private javax.swing.JButton p33;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
