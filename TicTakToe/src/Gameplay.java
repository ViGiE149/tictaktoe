
import java.awt.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Vusumuzi
 */
public class Gameplay extends javax.swing.JFrame {

    int mouseX = 0;
    int mouseY = 0;
    int count=0;
ImageIcon image=new ImageIcon("Winner.png");
ImageIcon dr=new ImageIcon("draw.png");
ImageIcon about=new ImageIcon("about.png");
ImageIcon newx=new ImageIcon("new.png");
ImageIcon option=new ImageIcon("options.png");
ImageIcon gameicon=new ImageIcon("gameicon.png");

    String played = "X";

    public Gameplay() {
        initComponents();
        jMenuItem2.setIcon(about);
        jMenuItem1.setIcon(newx);
         jMenu1.setIcon(option);
         setIconImage(gameicon.getImage());
   //   jLabel6.setIcon(back);
         one.setBackground(Color.gray);
         two.setBackground(Color.gray);
         three.setBackground(Color.gray);
         four.setBackground(Color.gray);
         five.setBackground(Color.gray);
          six.setBackground(Color.gray);
          seven.setBackground(Color.gray);
         eight.setBackground(Color.gray);
         nine.setBackground(Color.gray);
    }

    public void clear() {
        
        try { 
            
         
    

         Thread.sleep(100);
            
            one.setText("");
            two.setText("");
            three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eight.setText("");
            nine.setText("");
            
         one.setBackground(Color.gray);
         two.setBackground(Color.gray);
         three.setBackground(Color.gray);
         four.setBackground(Color.gray);
         five.setBackground(Color.gray);
         six.setBackground(Color.gray);
         seven.setBackground(Color.gray);
         eight.setBackground(Color.gray);
         nine.setBackground(Color.gray);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public void scoreX() {
        txtScoreP1.setText(Integer.toString(Integer.parseInt(txtScoreP1.getText()) + 1));
        JOptionPane.showMessageDialog(null, "player X", "winner decleration",  JOptionPane.PLAIN_MESSAGE, image);
    }

    public void scoreO() {
        txtScoreP2.setText(Integer.toString((Integer.parseInt(txtScoreP2.getText()) + 1)));
        JOptionPane.showMessageDialog(null, "player  O", "winner decleration",  JOptionPane.PLAIN_MESSAGE, image);
    }

    ////player win
    public void playerWin() {
        if (one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X")) {
            one.setBackground(Color.GREEN);
            two.setBackground(Color.GREEN);
            three.setBackground(Color.GREEN);
            scoreX();clear(); count=0;
        } else if (four.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X")) {
            four.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            scoreX();
            
            clear(); count=0;
        } else if (seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")) {
            seven.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreX(); 
            
            clear(); count=0;
        } else if (one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")) {
            seven.setBackground(Color.GREEN);
            one.setBackground(Color.GREEN);
            four.setBackground(Color.GREEN);
            scoreX();
            
            clear(); count=0;
        } else if (two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")) {
            five.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            two.setBackground(Color.GREEN);
            scoreX();
            
            clear();count=0; 
        } else if (three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")) {
            three.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreX();
            
            clear(); count=0;
        } else if (one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")) {
            one.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreX();clear(); count=0;
        } else if (three.getText().equals("X") && five.getText().equals("X") && seven.getText().equals("X")) {
            three.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            seven.setBackground(Color.GREEN);
            scoreX();clear(); count=0;
        }

       
       else  if (one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O")) {
            one.setBackground(Color.GREEN);
            two.setBackground(Color.GREEN);
            three.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        } else if (four.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O")) {
            four.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        } else if (seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")) {
            seven.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        } else if (one.getText().equals("O") && four.getText().equals("O") && seven.getText().equals("O")) {
            seven.setBackground(Color.GREEN);
            one.setBackground(Color.GREEN);
            four.setBackground(Color.GREEN);
            scoreO();clear(); 
        } else if (two.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O")) {
            five.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            two.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        } else if (three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")) {
            three.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreO();clear(); 
        } else if (one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")) {
            one.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        } else if (three.getText().equals("O") && five.getText().equals("O") && seven.getText().equals("O")) {
            three.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            seven.setBackground(Color.GREEN);
            scoreO();clear(); count=0;
        }
        else
        {
            if (count==9)
            {
           JOptionPane.showMessageDialog(null, "DRAW", "winner decleration",  JOptionPane.PLAIN_MESSAGE, dr);
            clear();
            count=0;
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

        jPanel4 = new javax.swing.JPanel();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        five = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtScoreP1 = new javax.swing.JLabel();
        txtScoreP2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        two.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel4.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 149, 141));

        three.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel4.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 149, 141));

        six.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel4.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 149, 141));

        eight.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel4.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 149, 141));

        four.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel4.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 149, 141));

        one.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel4.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 149, 141));

        seven.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel4.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 149, 141));

        five.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel4.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 149, 141));

        nine.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel4.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 149, 141));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 690, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 680, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 227, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 10, 560));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 20, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 10, 560));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel6MouseMoved(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 8, -1, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 0, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setText("score");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("player O");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("player X");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtScoreP1.setBackground(new java.awt.Color(153, 153, 255));
        txtScoreP1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtScoreP1.setForeground(new java.awt.Color(255, 255, 0));
        txtScoreP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtScoreP1.setText("0");
        jPanel4.add(txtScoreP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        txtScoreP2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtScoreP2.setForeground(new java.awt.Color(102, 255, 204));
        txtScoreP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtScoreP2.setText("0");
        jPanel4.add(txtScoreP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 90, 20));

        jMenu1.setText("Options");

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setText("new Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator4);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("about");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Gameplay.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        count++;
        if (one.getText().equals("X") || one.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");
            count--;
        } else {
            if (played.equals("X")) {
                
                one.setBackground(Color.orange);
                one.setText(played);
                played = "O";
                playerWin();
                
                

            } else {
                one.setBackground(Color.cyan);
                one.setText(played);
                played = "X";
                playerWin();
            }
        }

    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
 count++;
        if (two.getText().equals("X") || two.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                two.setBackground(Color.orange);
                two.setText(played);
                played = "O";
                playerWin();
            } else {
                two.setBackground(Color.cyan);
                two.setText(played);
                played = "X";
                playerWin();
            }
        }

    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
 count++;
        if (three.getText().equals("X") || three.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                three.setBackground(Color.orange);
                three.setText(played);
                played = "O";
                playerWin();
            } else {
                three.setBackground(Color.cyan);
                three.setText(played);
                played = "X";
                playerWin();
            }

        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
 count++;
        if (four.getText().equals("X") || four.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                four.setBackground(Color.orange);
                four.setText(played);
                played = "O";
                playerWin();
            } else {
                four.setBackground(Color.cyan);
                four.setText(played);
                played = "X";
                playerWin();
            }

        }

    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
 count++;
        if (five.getText().equals("X") || five.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                five.setBackground(Color.orange);
                five.setText(played);
                played = "O";
                playerWin();
            } else {
                five.setBackground(Color.cyan);
                five.setText(played);
                played = "X";
                playerWin();
            }

        }

    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
 count++;
        if (six.getText().equals("X") || six.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                six.setBackground(Color.orange);
                six.setText(played);
                played = "O";
                playerWin();
            } else {
                six.setBackground(Color.cyan);
                six.setText(played);
                played = "X";
                playerWin();
            }

        }

    }//GEN-LAST:event_sixActionPerformed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseMoved
        mouseY = evt.getY();
        mouseX = evt.getX();
    }//GEN-LAST:event_jPanel6MouseMoved

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
 count++;
        if (seven.getText().equals("X") || seven.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                seven.setBackground(Color.orange);
                seven.setText(played);
                played = "O";
                playerWin();
            } else {
                seven.setBackground(Color.cyan);
                seven.setText(played);
                played = "X";
                playerWin();
            }

        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
 count++;
        if (eight.getText().equals("X") || eight.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                eight.setBackground(Color.orange);
                eight.setText(played);
                played = "O";
                playerWin();
            } else {
                eight.setBackground(Color.cyan);
                eight.setText(played);
                played = "X";
            }

        }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        count++;
        if (nine.getText().equals("X") || nine.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "option has already been played!");   count--;
        } else {
            if (played.equals("X")) {
                nine.setBackground(Color.orange);
                nine.setText(played);
                played = "O";
                playerWin();
            } else if (played.equals("O")) {
                nine.setBackground(Color.cyan);
                nine.setText(played);
                played = "X";
                playerWin();
            }
        }

    }//GEN-LAST:event_nineActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Gameplay game=new Gameplay();
      this.dispose();
      game.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       JOptionPane.showMessageDialog(null,"this game was greated by vusumuzi aka vigie just "
               + "to sharpen the skill \n using java this game is a two player game PLAYER X AND PLAYER O"
               + "\n both these playes will take turns "
               + "if a player wins a point will give to that player then then game will resert the selected option \n "
               +"then the player that played first will make the firt selection again");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JLabel txtScoreP1;
    private javax.swing.JLabel txtScoreP2;
    // End of variables declaration//GEN-END:variables
}
