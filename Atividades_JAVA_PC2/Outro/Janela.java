
package forca;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Janela extends javax.swing.JFrame {
    private Forca jogo;
    private boolean pos1;
    private boolean pos2;
    private boolean pos3;
    private boolean pos4;
    private boolean pos5;
    private boolean pos6;
    private boolean pos7;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    private String p5;
    private String p6;
    private String p7;
    public Janela() {
        jogo=new Forca();
        pos1=false;
        pos2=false;
        pos3=false;
        pos4=false;
        pos5=false;
        pos6=false;
        pos1=false;
        p1=jogo.getLet(0);
        p2=jogo.getLet(1);
        p3=jogo.getLet(2);
        p4=jogo.getLet(3);
        p5=jogo.getLet(4);
        p6=jogo.getLet(5);
        p7=jogo.getLet(6);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Letras = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        PainelTentativas = new javax.swing.JPanel();
        TxtTent = new javax.swing.JLabel();
        Tents = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LetrasErradas = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        novoJogo = new javax.swing.JButton();
        mostrarPalavra = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        Teclado = new javax.swing.JPanel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1.setBackground(new java.awt.Color(0, 0, 255));
        L1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L2.setBackground(new java.awt.Color(0, 0, 255));
        L2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L3.setBackground(new java.awt.Color(0, 0, 255));
        L3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L4.setBackground(new java.awt.Color(0, 0, 255));
        L4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L5.setBackground(new java.awt.Color(0, 0, 255));
        L5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L6.setBackground(new java.awt.Color(0, 0, 255));
        L6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        L7.setBackground(new java.awt.Color(0, 0, 255));
        L7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        L7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout LetrasLayout = new javax.swing.GroupLayout(Letras);
        Letras.setLayout(LetrasLayout);
        LetrasLayout.setHorizontalGroup(
            LetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetrasLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LetrasLayout.setVerticalGroup(
            LetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nome.setText("Jogo da forca");

        PainelTentativas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtTent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtTent.setText("TENTATIVAS:");

        Tents.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Letras incorretas:");

        LetrasErradas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout PainelTentativasLayout = new javax.swing.GroupLayout(PainelTentativas);
        PainelTentativas.setLayout(PainelTentativasLayout);
        PainelTentativasLayout.setHorizontalGroup(
            PainelTentativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTentativasLayout.createSequentialGroup()
                .addComponent(TxtTent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tents, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LetrasErradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelTentativasLayout.setVerticalGroup(
            PainelTentativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTentativasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTentativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LetrasErradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtTent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelTentativasLayout.createSequentialGroup()
                        .addComponent(Tents, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        novoJogo.setText("NOVO JOGO");
        novoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoActionPerformed(evt);
            }
        });

        mostrarPalavra.setText("MOSTRAR PALAVRA");
        mostrarPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPalavraActionPerformed(evt);
            }
        });

        finalizar.setText("FINALIZAR JOGO");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addComponent(novoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mostrarPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Teclado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Teclado.setLayout(new java.awt.GridLayout(2, 13));

        A.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        Teclado.add(A);

        B.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        Teclado.add(B);

        C.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        Teclado.add(C);

        D.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        Teclado.add(D);

        E.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        Teclado.add(E);

        F.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        Teclado.add(F);

        G.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        G.setText("G");
        G.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        Teclado.add(G);

        H.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        H.setText("H");
        H.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        Teclado.add(H);

        I.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        I.setText("I");
        I.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        Teclado.add(I);

        J.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        J.setText("J");
        J.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        Teclado.add(J);

        K.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        K.setText("K");
        K.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        Teclado.add(K);

        L.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L.setText("L");
        L.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        Teclado.add(L);

        M.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        M.setText("M");
        M.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        Teclado.add(M);

        N.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        N.setText("N");
        N.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        Teclado.add(N);

        O.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        O.setText("O");
        O.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        Teclado.add(O);

        P.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        P.setText("P");
        P.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        Teclado.add(P);
        P.getAccessibleContext().setAccessibleName("Q");

        Q.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Q.setText("Q");
        Q.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        Teclado.add(Q);

        R.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        R.setText("R");
        R.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        Teclado.add(R);

        S.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        S.setText("S");
        S.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        Teclado.add(S);

        T.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        T.setText("T");
        T.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        Teclado.add(T);

        U.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        U.setText("U");
        U.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        Teclado.add(U);

        V.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        V.setText("V");
        V.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });
        Teclado.add(V);

        W.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        W.setText("W");
        W.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        Teclado.add(W);

        X.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        X.setText("X");
        X.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        Teclado.add(X);

        Y.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Y.setText("Y");
        Y.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        Teclado.add(Y);

        Z.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Z.setText("Z");
        Z.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });
        Teclado.add(Z);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Nome)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Letras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Teclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PainelTentativas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Letras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setLabel(int a,String str){
        switch(a){
            case 0:
                L1.setText(str);
                break;
            case 1:
                L2.setText(str);
                break;
            case 2:
                L3.setText(str);
                break;
            case 3:
                L4.setText(str);
                break;
            case 4:
                L5.setText(str);
                break;
            case 5:
                L6.setText(str);
                break;
            case 6:
                L7.setText(str);
                break;
        }
    }
    private void mostrarPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPalavraActionPerformed
        
        if(pos1==false){
            L1.setText(p1);
        }
        if(pos1==false){
            L2.setText(p2);
        }
        if(pos1==false){
            L3.setText(p3);
        }
        if(pos1==false){
            L4.setText(p4);
        }
        if(pos1==false){
            L5.setText(p5);
        }
        if(pos1==false){
            L6.setText(p6);
        }
        if(pos1==false){
            L7.setText(p7);
        }
    }//GEN-LAST:event_mostrarPalavraActionPerformed

    private void novoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoActionPerformed
        jogo.novoJogo();
        L1.setText(" ");
        L2.setText(" ");
        L3.setText(" ");
        L4.setText(" ");
        L5.setText(" ");
        L6.setText(" ");
        L7.setText(" ");
        LetrasErradas.setText(" ");
    }//GEN-LAST:event_novoJogoActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_finalizarActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
       int a=0;
       String str = "A";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('a')==true){
               while(a>=0){
                   a=jogo.posLetras('a');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
                   
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        int a=0;
       String str = "B";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('b')==true){
               while(a>=0){
                   a=jogo.posLetras('b');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
               
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        int a=0;
       String str = "C";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('c')==true){
               while(a>=0){
                   a=jogo.posLetras('c');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        } 
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
       int a=0;
       String str = "D";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('d')==true){
               while(a>=0){
                   a=jogo.posLetras('d');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
        
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
       int a=0;
       String str = "E";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('e')==true){
               while(a>=0){
                   a=jogo.posLetras('e');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
               
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
        
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        int a=0;
       String str = "F";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('f')==true){
               while(a>=0){
                   a=jogo.posLetras('f');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
         int a=0;
       String str = "G";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('g')==true){
               while(a>=0){
                   a=jogo.posLetras('g');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
         int a=0;
       String str = "F";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('f')==true){
               while(a>=0){
                   a=jogo.posLetras('f');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
         int a=0;
       String str = "I";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('i')==true){
               while(a>=0){
                   a=jogo.posLetras('i');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
         int a=0;
       String str = "J";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('j')==true){
               while(a>=0){
                   a=jogo.posLetras('j');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        int a=0;
       String str = "K";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('k')==true){
               while(a>=0){
                   a=jogo.posLetras('k');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
         int a=0;
       String str = "L";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('l')==true){
               while(a>=0){
                   a=jogo.posLetras('l');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
         int a=0;
       String str = "M";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('m')==true){
               while(a>=0){
                   a=jogo.posLetras('m');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
         int a=0;
       String str = "N";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('n')==true){
               while(a>=0){
                   a=jogo.posLetras('n');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
         int a=0;
       String str = "O";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('o')==true){
               while(a>=0){
                   a=jogo.posLetras('o');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
         int a=0;
       String str = "P";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('p')==true){
               while(a>=0){
                   a=jogo.posLetras('p');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
         int a=0;
       String str = "Q";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('q')==true){
               while(a>=0){
                   a=jogo.posLetras('q');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
         int a=0;
       String str = "R";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('r')==true){
               while(a>=0){
                   a=jogo.posLetras('r');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
         int a=0;
       String str = "S";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('s')==true){
               while(a>=0){
                   a=jogo.posLetras('s');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
         int a=0;
       String str = "T";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('t')==true){
               while(a>=0){
                   a=jogo.posLetras('t');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
         int a=0;
       String str = "u";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('u')==true){
               while(a>=0){
                   a=jogo.posLetras('u');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
         int a=0;
       String str = "V";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('v')==true){
               while(a>=0){
                   a=jogo.posLetras('v');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
         int a=0;
       String str = "W";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('w')==true){
               while(a>=0){
                   a=jogo.posLetras('w');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
         int a=0;
       String str = "X";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('x')==true){
               while(a>=0){
                   a=jogo.posLetras('x');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
         int a=0;
       String str = "Y";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('y')==true){
               while(a>=0){
                   a=jogo.posLetras('y');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
         int a=0;
       String str = "Z";
        if(jogo.checaLose()==true){
            jogo.tentMM();
            if(jogo.checaLetra('z')==true){
               while(a>=0){
                   a=jogo.posLetras('z');
                   setLabel(a,str);
                   if(a==0){
                       pos1=true;
                   }
                   else if(a==1){
                       pos2=true;
                   }
                   else if(a==2){
                       pos3=true;
                   }
                   else if(a==3){
                       pos4=true;
                   }
                   else if(a==4){
                       pos5=true;
                   }
                   else if(a==5){
                       pos6=true;
                   }
                   else if(a==6){
                       pos7=true;
                   }
               }
            }
            else{
                str=jogo.getLetras();
                LetrasErradas.setText(str);
                
            }
        }
        else{
            JFrame frame= new JFrame("GAME OVER");
            str = "Voce gastou todas suas tentativas\n a palavra era: " + jogo.getPalavraStr();
            JOptionPane.showMessageDialog(frame,str);
        }
        str="" + jogo.getTentativas();
        Tents.setText(str);
    }//GEN-LAST:event_ZActionPerformed


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
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JPanel Letras;
    private javax.swing.JLabel LetrasErradas;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JPanel PainelTentativas;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JPanel Teclado;
    private javax.swing.JLabel Tents;
    private javax.swing.JLabel TxtTent;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarPalavra;
    private javax.swing.JButton novoJogo;
    private javax.swing.JPanel painelOpcoes;
    // End of variables declaration//GEN-END:variables
}
