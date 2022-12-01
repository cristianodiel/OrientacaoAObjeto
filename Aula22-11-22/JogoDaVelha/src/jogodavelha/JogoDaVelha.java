/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodavelha;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;

/**
 *
 * @author CristianoLuizDiel
 */
public class JogoDaVelha extends javax.swing.JFrame {

    //atributos
    private int contadorClick = 0;
    private JButton botao[][];
    private int linha;
    private int coluna;
    private int numX = 0;
    private int numO = 0;
    private String win;
    private JButton restartButton;

    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
        initComponents();
        botao = new JButton[3][3];
        botao[0][0] = A1;
        botao[0][1] = A2;
        botao[0][2] = A3;
        botao[1][0] = B1;
        botao[1][1] = B2;
        botao[1][2] = B3;
        botao[2][0] = C1;
        botao[2][1] = C2;
        botao[2][2] = C3;
        restartButton = new JButton("Restart game");
    }

    //métodos
    private void clicaBotao(int linha, int coluna) {
        contadorClick++;
        botao[linha][coluna].setEnabled(false);
        if ((contadorClick % 2) == 0) {
            botao[linha][coluna].setText("X");
        } else {
            botao[linha][coluna].setText("O");
        }

        checkEndGame();
    }

    private void checkEndGame() {

        //check columns
        for (linha = 0; linha < 3; linha++) {
            numO = 0;
            numX = 0;
            for (coluna = 0; coluna < 3; coluna++) {
                if (botao[linha][coluna].getText().equals("X")) {
                    numX++;
                }
                if (botao[linha][coluna].getText().equals("O")) {
                    numO++;
                }
            }

            if (numX == 3) {
                xWins();
                win = "X";
            }
            if (numO == 3) {
                oWins();
                win = "O";
            }

        }
        //check lines
        for (coluna = 0; coluna < 3; coluna++) {
            numO = 0;
            numX = 0;
            for (linha = 0; linha < 3; linha++) {
                if (botao[linha][coluna].getText().equals("X")) {
                    numX++;
                }
                if (botao[linha][coluna].getText().equals("O")) {
                    numO++;
                }
            }

            if (numX == 3) {
                xWins();
            }
            if (numO == 3) {
                oWins();
            }

        }
        //check diagonal principal
        numO = 0;
        numX = 0;
        for (linha = 0; linha < 3; linha++) {

            if (botao[linha][linha].getText().equals("X")) {
                numX++;
            }
            if (botao[linha][linha].getText().equals("O")) {
                numO++;
            }

        }

        if (numX == 3) {
            xWins();
        }
        if (numO == 3) {
            oWins();
        }

        //check diagonal secundaria
        numO = 0;
        numX = 0;
        for (linha = 0; linha < 3; linha++) {

            if (botao[linha][2 - linha].getText().equals("X")) {
                numX++;
            }
            if (botao[linha][2 - linha].getText().equals("O")) {
                numO++;
            }

        }

        if (numX == 3) {
            xWins();
        }
        if (numO == 3) {
            oWins();
        }
        if (contadorClick == 9) {
            if (ResultPanel.getText().contains("wins")) {
            } else {
                draw();
            }
        }

    }

    private void xWins() {
        ResultPanel.setText("X wins!");
        restartGameButton();
    }

    private void oWins() {
        ResultPanel.setText("O wins!");
        restartGameButton();

        // capturar os botoes do painel e colocar em um vetor
        Component vetComponet[] = painelDeBotoes.getComponents();

        for (int i = 0; i < vetComponet.length; i++) {
            JButton aux = (JButton) vetComponet[i];
            aux.setEnabled(false);
        }

        /*
        for(Component cp : painelDeBotoes.getComponents()) {
            JButton aux = (JButton) cp;
            aux.setEnabled(false);
            
        }
         */
    }

    private void draw() {
        ResultPanel.setText("Draw!");
        restartGameButton();
    }

    private void restartGameButton() {

        restartButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            clickRestart();
            ResultPanel.setText("");
            EndPanel.setEnabled(true);
            EndPanel.setEnabled(false);
            EndPanel.remove(restartButton);
            contadorClick = 0;
        });

        EndPanel.setLayout(new FlowLayout());
        EndPanel.add(restartButton);
    }

    private void clickRestart() {
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                botao[linha][coluna].setText("");
                botao[linha][coluna].setEnabled(true);

            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EndPanel = new javax.swing.JPanel();
        ResultPanel = new javax.swing.JLabel();
        painelDeBotoes = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        HeaderPanel = new javax.swing.JPanel();
        scoreX = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EndPanel.add(ResultPanel);

        A1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDeBotoesLayout = new javax.swing.GroupLayout(painelDeBotoes);
        painelDeBotoes.setLayout(painelDeBotoesLayout);
        painelDeBotoesLayout.setHorizontalGroup(
            painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDeBotoesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painelDeBotoesLayout.setVerticalGroup(
            painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDeBotoesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelDeBotoesLayout.createSequentialGroup()
                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelDeBotoesLayout.createSequentialGroup()
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelDeBotoesLayout.createSequentialGroup()
                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        scoreX.setText("jLabel1");

        scoreO.setText("jLabel2");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(scoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreX)
                    .addComponent(scoreO))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelDeBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EndPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EndPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        clicaBotao(0, 0);
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        clicaBotao(0, 1);
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        clicaBotao(0, 2);
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        clicaBotao(1, 0);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        clicaBotao(1, 1);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        clicaBotao(1, 2);
    }//GEN-LAST:event_B3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        clicaBotao(2, 0);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        clicaBotao(2, 1);
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        clicaBotao(2, 2);
    }//GEN-LAST:event_C3ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JPanel EndPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel ResultPanel;
    private javax.swing.JPanel painelDeBotoes;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    // End of variables declaration//GEN-END:variables
}
