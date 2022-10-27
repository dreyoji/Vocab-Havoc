package GUI;

import GUI.Menu;
import static IOstream.Istream.getWords;

/**
 *
 * @author Ryoji
 */


public class Game extends javax.swing.JFrame {

    static int seconds = 0;
    static int minutes = 0;
    static boolean state = true;

    public Game() {
        System.out.println(getWords());
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        first1 = new javax.swing.JLabel();
        first2 = new javax.swing.JLabel();
        first3 = new javax.swing.JLabel();
        first4 = new javax.swing.JLabel();
        first5 = new javax.swing.JLabel();
        second1 = new javax.swing.JLabel();
        second2 = new javax.swing.JLabel();
        second3 = new javax.swing.JLabel();
        second4 = new javax.swing.JLabel();
        second5 = new javax.swing.JLabel();
        third1 = new javax.swing.JLabel();
        third2 = new javax.swing.JLabel();
        third3 = new javax.swing.JLabel();
        third4 = new javax.swing.JLabel();
        third5 = new javax.swing.JLabel();
        fourth1 = new javax.swing.JLabel();
        fourth2 = new javax.swing.JLabel();
        fourth3 = new javax.swing.JLabel();
        fourth4 = new javax.swing.JLabel();
        fourth5 = new javax.swing.JLabel();
        fifth1 = new javax.swing.JLabel();
        fifth2 = new javax.swing.JLabel();
        fifth3 = new javax.swing.JLabel();
        fifth4 = new javax.swing.JLabel();
        fifth5 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        titles = new javax.swing.JLabel();
        keyboard = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocab Havoc");
        setMaximumSize(new java.awt.Dimension(500, 738));
        setMinimumSize(new java.awt.Dimension(500, 738));
        setPreferredSize(new java.awt.Dimension(500, 738));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        first1.setBackground(new java.awt.Color(102, 102, 102));
        first1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 50));

        first2.setBackground(new java.awt.Color(102, 102, 102));
        first2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 50, 50));

        first3.setBackground(new java.awt.Color(102, 102, 102));
        first3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, 50));

        first4.setBackground(new java.awt.Color(102, 102, 102));
        first4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 50, 50));

        first5.setBackground(new java.awt.Color(102, 102, 102));
        first5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(first5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        second1.setBackground(new java.awt.Color(102, 102, 102));
        second1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 50));

        second2.setBackground(new java.awt.Color(102, 102, 102));
        second2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 50, 50));

        second3.setBackground(new java.awt.Color(102, 102, 102));
        second3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, 50));

        second4.setBackground(new java.awt.Color(102, 102, 102));
        second4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, 50));

        second5.setBackground(new java.awt.Color(102, 102, 102));
        second5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        second5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(second5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 50, 50));

        third1.setBackground(new java.awt.Color(102, 102, 102));
        third1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 50, 50));

        third2.setBackground(new java.awt.Color(102, 102, 102));
        third2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 50, 50));

        third3.setBackground(new java.awt.Color(102, 102, 102));
        third3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 50, 50));

        third4.setBackground(new java.awt.Color(102, 102, 102));
        third4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 50, 50));

        third5.setBackground(new java.awt.Color(102, 102, 102));
        third5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        third5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(third5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 50, 50));

        fourth1.setBackground(new java.awt.Color(102, 102, 102));
        fourth1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 50, 50));

        fourth2.setBackground(new java.awt.Color(102, 102, 102));
        fourth2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 50, 50));

        fourth3.setBackground(new java.awt.Color(102, 102, 102));
        fourth3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 50, 50));

        fourth4.setBackground(new java.awt.Color(102, 102, 102));
        fourth4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 50, 50));

        fourth5.setBackground(new java.awt.Color(102, 102, 102));
        fourth5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourth5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fourth5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 50, 50));

        fifth1.setBackground(new java.awt.Color(102, 102, 102));
        fifth1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 50));

        fifth2.setBackground(new java.awt.Color(102, 102, 102));
        fifth2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 50, 50));

        fifth3.setBackground(new java.awt.Color(102, 102, 102));
        fifth3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 50, 50));

        fifth4.setBackground(new java.awt.Color(102, 102, 102));
        fifth4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 50, 50));

        fifth5.setBackground(new java.awt.Color(102, 102, 102));
        fifth5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fifth5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        getContentPane().add(fifth5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 50, 50));

        type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type.setText("(0 / 5)");
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        min.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        min.setText("00 :");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        sec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sec.setText("00");
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 100));

        titles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrenzyTitle.png"))); // NOI18N
        getContentPane().add(titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 430, 118));

        keyboard.setBackground(new java.awt.Color(0, 102, 102));
        keyboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/1.png"))); // NOI18N
        A.setLabelFor(A);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/2.png"))); // NOI18N
        B.setLabelFor(B);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/3.png"))); // NOI18N
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/4.png"))); // NOI18N
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/5.png"))); // NOI18N
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/6.png"))); // NOI18N
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/7.png"))); // NOI18N
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        H.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/8.png"))); // NOI18N
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/9.png"))); // NOI18N
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        J.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/10.png"))); // NOI18N
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        K.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/11.png"))); // NOI18N
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/12.png"))); // NOI18N
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/13.png"))); // NOI18N
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/14.png"))); // NOI18N
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/15.png"))); // NOI18N
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/16.png"))); // NOI18N
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/17.png"))); // NOI18N
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/18.png"))); // NOI18N
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/19.png"))); // NOI18N
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/20.png"))); // NOI18N
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        U.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/21.png"))); // NOI18N
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        V.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/22.png"))); // NOI18N
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        W.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/23.png"))); // NOI18N
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/24.png"))); // NOI18N
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/25.png"))); // NOI18N
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        Z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Letters/26.png"))); // NOI18N
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout keyboardLayout = new javax.swing.GroupLayout(keyboard);
        keyboard.setLayout(keyboardLayout);
        keyboardLayout.setHorizontalGroup(
            keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(A)
                            .addGap(10, 10, 10)
                            .addComponent(B)
                            .addGap(10, 10, 10)
                            .addComponent(C)
                            .addGap(10, 10, 10)
                            .addComponent(D)
                            .addGap(10, 10, 10)
                            .addComponent(E)
                            .addGap(10, 10, 10)
                            .addComponent(F)
                            .addGap(10, 10, 10)
                            .addComponent(G)
                            .addGap(10, 10, 10)
                            .addComponent(H)
                            .addGap(10, 10, 10)
                            .addComponent(I))
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(J)
                            .addGap(10, 10, 10)
                            .addComponent(K)
                            .addGap(10, 10, 10)
                            .addComponent(L)
                            .addGap(10, 10, 10)
                            .addComponent(M)
                            .addGap(10, 10, 10)
                            .addComponent(N)
                            .addGap(10, 10, 10)
                            .addComponent(O)
                            .addGap(10, 10, 10)
                            .addComponent(P)
                            .addGap(10, 10, 10)
                            .addComponent(Q)
                            .addGap(10, 10, 10)
                            .addComponent(R))
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(S)
                            .addGap(10, 10, 10)
                            .addComponent(T)
                            .addGap(10, 10, 10)
                            .addComponent(U)
                            .addGap(10, 10, 10)
                            .addComponent(V)
                            .addGap(10, 10, 10)
                            .addComponent(W)
                            .addGap(10, 10, 10)
                            .addComponent(X)
                            .addGap(10, 10, 10)
                            .addComponent(Y)
                            .addGap(10, 10, 10)
                            .addComponent(Z)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        keyboardLayout.setVerticalGroup(
            keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(A)
                        .addComponent(B)
                        .addComponent(C)
                        .addComponent(D)
                        .addComponent(E)
                        .addComponent(F)
                        .addComponent(G)
                        .addComponent(H)
                        .addComponent(I))
                    .addGap(10, 10, 10)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(J)
                        .addComponent(K)
                        .addComponent(L)
                        .addComponent(M)
                        .addComponent(N)
                        .addComponent(O)
                        .addComponent(P)
                        .addComponent(Q)
                        .addComponent(R))
                    .addGap(10, 10, 10)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S)
                        .addComponent(T)
                        .addComponent(U)
                        .addComponent(V)
                        .addComponent(W)
                        .addComponent(X)
                        .addComponent(Y)
                        .addComponent(Z))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(keyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 500, 170));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        Background.setText("jLabel1");
        Background.setMaximumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void LetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LetterMouseClicked
        Object source = evt.getSource();
      
        if (first1.getText() == "") {
            if(source == A) first1.setText("  A");
            if(source == B) first1.setText("  B");
            if(source == C) first1.setText("  C");
            if(source == D) first1.setText("  D");
            if(source == E) first1.setText("  E");
            if(source == F) first1.setText("  F");
            if(source == G) first1.setText("  G");
            if(source == H) first1.setText("  H");
            if(source == I) first1.setText("  I");
            if(source == J) first1.setText("  J");
            if(source == K) first1.setText("  K");
            if(source == L) first1.setText("  L");
            if(source == M) first1.setText("  M");
            if(source == N) first1.setText("  N");
            if(source == O) first1.setText("  O");
            if(source == P) first1.setText("  P");
            if(source == Q) first1.setText("  Q");
            if(source == R) first1.setText("  R");
            if(source == S) first1.setText("  S");
            if(source == T) first1.setText("  T");
            if(source == U) first1.setText("  U");
            if(source == V) first1.setText("  V");
            if(source == W) first1.setText("  W");
            if(source == X) first1.setText("  X");
            if(source == Y) first1.setText("  Y");
            if(source == Z) first1.setText("  Z");
        }
        
        else if (first2.getText() == "") {
            if(source == A) first2.setText("  A");
            if(source == B) first2.setText("  B");
            if(source == C) first2.setText("  C");
            if(source == D) first2.setText("  D");
            if(source == E) first2.setText("  E");
            if(source == F) first2.setText("  F");
            if(source == G) first2.setText("  G");
            if(source == H) first2.setText("  H");
            if(source == I) first2.setText("  I");
            if(source == J) first2.setText("  J");
            if(source == K) first2.setText("  K");
            if(source == L) first2.setText("  L");
            if(source == M) first2.setText("  M");
            if(source == N) first2.setText("  N");
            if(source == O) first2.setText("  O");
            if(source == P) first2.setText("  P");
            if(source == Q) first2.setText("  Q");
            if(source == R) first2.setText("  R");
            if(source == S) first2.setText("  S");
            if(source == T) first2.setText("  T");
            if(source == U) first2.setText("  U");
            if(source == V) first2.setText("  V");
            if(source == W) first2.setText("  W");
            if(source == X) first2.setText("  X");
            if(source == Y) first2.setText("  Y");
            if(source == Z) first2.setText("  Z");
        }

        else if (first3.getText() == "") {
            if(source == A) first3.setText("  A");
            if(source == B) first3.setText("  B");
            if(source == C) first3.setText("  C");
            if(source == D) first3.setText("  D");
            if(source == E) first3.setText("  E");
            if(source == F) first3.setText("  F");
            if(source == G) first3.setText("  G");
            if(source == H) first3.setText("  H");
            if(source == I) first3.setText("  I");
            if(source == J) first3.setText("  J");
            if(source == K) first3.setText("  K");
            if(source == L) first3.setText("  L");
            if(source == M) first3.setText("  M");
            if(source == N) first3.setText("  N");
            if(source == O) first3.setText("  O");
            if(source == P) first3.setText("  P");
            if(source == Q) first3.setText("  Q");
            if(source == R) first3.setText("  R");
            if(source == S) first3.setText("  S");
            if(source == T) first3.setText("  T");
            if(source == U) first3.setText("  U");
            if(source == V) first3.setText("  V");
            if(source == W) first3.setText("  W");
            if(source == X) first3.setText("  X");
            if(source == Y) first3.setText("  Y");
            if(source == Z) first3.setText("  Z");
        }            

        else if (first4.getText() == "") {
            if(source == A) first4.setText("  A");
            if(source == B) first4.setText("  B");
            if(source == C) first4.setText("  C");
            if(source == D) first4.setText("  D");
            if(source == E) first4.setText("  E");
            if(source == F) first4.setText("  F");
            if(source == G) first4.setText("  G");
            if(source == H) first4.setText("  H");
            if(source == I) first4.setText("  I");
            if(source == J) first4.setText("  J");
            if(source == K) first4.setText("  K");
            if(source == L) first4.setText("  L");
            if(source == M) first4.setText("  M");
            if(source == N) first4.setText("  N");
            if(source == O) first4.setText("  O");
            if(source == P) first4.setText("  P");
            if(source == Q) first4.setText("  Q");
            if(source == R) first4.setText("  R");
            if(source == S) first4.setText("  S");
            if(source == T) first4.setText("  T");
            if(source == U) first4.setText("  U");
            if(source == V) first4.setText("  V");
            if(source == W) first4.setText("  W");
            if(source == X) first4.setText("  X");
            if(source == Y) first4.setText("  Y");
            if(source == Z) first4.setText("  Z");
        }
        
        else if (first5.getText() == "") {
            if(source == A) first5.setText("  A");
            if(source == B) first5.setText("  B");
            if(source == C) first5.setText("  C");
            if(source == D) first5.setText("  D");
            if(source == E) first5.setText("  E");
            if(source == F) first5.setText("  F");
            if(source == G) first5.setText("  G");
            if(source == H) first5.setText("  H");
            if(source == I) first5.setText("  I");
            if(source == J) first5.setText("  J");
            if(source == K) first5.setText("  K");
            if(source == L) first5.setText("  L");
            if(source == M) first5.setText("  M");
            if(source == N) first5.setText("  N");
            if(source == O) first5.setText("  O");
            if(source == P) first5.setText("  P");
            if(source == Q) first5.setText("  Q");
            if(source == R) first5.setText("  R");
            if(source == S) first5.setText("  S");
            if(source == T) first5.setText("  T");
            if(source == U) first5.setText("  U");
            if(source == V) first5.setText("  V");
            if(source == W) first5.setText("  W");
            if(source == X) first5.setText("  X");
            if(source == Y) first5.setText("  Y");
            if(source == Z) first5.setText("  Z");
        }        
        


    }//GEN-LAST:event_LetterMouseClicked

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel T;
    private javax.swing.JLabel U;
    private javax.swing.JLabel V;
    private javax.swing.JLabel W;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    private javax.swing.JLabel fifth1;
    private javax.swing.JLabel fifth2;
    private javax.swing.JLabel fifth3;
    private javax.swing.JLabel fifth4;
    private javax.swing.JLabel fifth5;
    private javax.swing.JLabel first1;
    private javax.swing.JLabel first2;
    private javax.swing.JLabel first3;
    private javax.swing.JLabel first4;
    private javax.swing.JLabel first5;
    private javax.swing.JLabel fourth1;
    private javax.swing.JLabel fourth2;
    private javax.swing.JLabel fourth3;
    private javax.swing.JLabel fourth4;
    private javax.swing.JLabel fourth5;
    private javax.swing.JPanel keyboard;
    private javax.swing.JLabel min;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel second1;
    private javax.swing.JLabel second2;
    private javax.swing.JLabel second3;
    private javax.swing.JLabel second4;
    private javax.swing.JLabel second5;
    private javax.swing.JLabel third1;
    private javax.swing.JLabel third2;
    private javax.swing.JLabel third3;
    private javax.swing.JLabel third4;
    private javax.swing.JLabel third5;
    private javax.swing.JLabel titles;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
