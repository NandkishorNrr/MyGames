package com.terminal;

import javax.swing.*;
import java.awt.*;

public class ChorChitthiFrame extends JFrame {
   public ChorChitthiFrame(){
//       System.out.println("this is my game frame");

       String[] players = {"Nrr", "Rtr", "Hmr", "Tnr"};

       JLabel label = new JLabel();
       label.setText("Welcome to Chor-Chitthi!");
       label.setText("Enter name of players:-");
       label.setBounds(5, 5, 750, 100);

       JLabel label1 = new JLabel();
       label1.setText("Player 1: " + players[0]);
//       label1.setHorizontalAlignment(JLabel.LEFT);
//       label1.setVerticalAlignment(JLabel.TOP);
       label1.setBounds(5, 5, 100, 100);

       JLabel label2 = new JLabel();
       label2.setText("Player 2: " + players[1]);
//       label2.setHorizontalAlignment(JLabel.LEFT);
//       label2.setVerticalAlignment(JLabel.TOP);
       label2.setBounds(5, 5, 100, 100);

       JLabel label3 = new JLabel();
       label3.setText("Player 3: " + players[2]);
//       label3.setHorizontalAlignment(JLabel.LEFT);
//       label3.setVerticalAlignment(JLabel.TOP);
       label3.setBounds(5, 5, 100, 100);

       JLabel label4 = new JLabel();
       label4.setText("Player 4: " + players[3]);
//       label4.setHorizontalAlignment(JLabel.LEFT);
//       label4.setVerticalAlignment(JLabel.TOP);
       label4.setBounds(5, 5, 100, 100);

       JPanel panel = new JPanel();
       panel.setBackground(Color.GRAY);
       panel.setBounds(0, 0, 750, 750);
       panel.setLayout(null);
       panel.add(label);

       JPanel panel1 = new JPanel();
       panel1.setBackground(Color.red);
       panel1.setBounds(0, 0, 375, 375);
       panel1.setLayout(null);
       panel1.add(label1);

       JPanel panel2 = new JPanel();
       panel2.setBackground(Color.green);
       panel2.setBounds(375, 0, 375, 375);
       panel2.setLayout(null);
       panel2.add(label2);

       JPanel panel3 = new JPanel();
       panel3.setBackground(Color.blue);
       panel3.setBounds(0, 375, 375, 375);
       panel3.setLayout(null);
       panel3.add(label3);

       JPanel panel4 = new JPanel();
       panel4.setBackground(Color.yellow);
       panel4.setBounds(375, 375, 375, 375);
       panel4.setLayout(null);
       panel4.add(label4);

       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(755, 755);
       frame.setVisible(true);
       frame.setTitle("MyGames");
       frame.setResizable(false);

       frame.add(panel);
       frame.add(panel1);
       frame.add(panel2);
       frame.add(panel3);
       frame.add(panel4);

      /* ImageIcon imgIcon = new ImageIcon("imgIcon.png");
       frame.setIconImage(imgIcon.getImage());*/
    }
}
