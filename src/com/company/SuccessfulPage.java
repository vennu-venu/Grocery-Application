package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuccessfulPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB;
    DataBase db = new DataBase();
    SuccessfulPage(String email) {
        this.setTitle("Online Grocery Application | Final");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.setLayout(null);
        this.email=email;
        //=============================================================================================//
        JPanel panelB = new JPanel();
        panelB.setBounds(0,0,100,100);
        panelB.setBackground(new Color(17, 16, 16));
        buttonB = new JButton("");
        buttonB.addActionListener(this);
        buttonB.setFocusable(false);
        buttonB.setBackground(Color.black);
        buttonB.setBorder(BorderFactory.createEtchedBorder());
        buttonB.setEnabled(true);
        ImageIcon bck = new ImageIcon("src/images/back.png");
        buttonB.setIcon(bck);
        panelB.add(buttonB);
        this.add(panelB);
        //=============================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,200,1920,100);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("Your order was successfully placed !!");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.PLAIN,50));
        label1.setForeground(new Color(108,117,125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        this.add(panel1);
        //=============================================================================================//
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,300,1920,200);
        panel2.setBackground(new Color(17, 16, 16));
        JLabel label2 = new JLabel("");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setForeground(new Color(108,117,125));
        label2.setBackground(new Color(17, 16, 16));
        label2.setIcon(new ImageIcon("src/images/done.png"));
        label2.setOpaque(true);
        panel2.add(label2);
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(0,500,1920,100);
        panel3.setBackground(new Color(17, 16, 16));
        JLabel label3 = new JLabel("Amount Rs."+db.getTotalAmount(email)+"/-");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setFont(new Font("sans serif", Font.PLAIN,36));
        label3.setForeground(new Color(108,117,125));
        label3.setBackground(new Color(17, 16, 16));
        label3.setOpaque(true);
        panel3.add(label3);
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(0,800,1920,100);
        panel4.setBackground(new Color(17, 16, 16));
        JLabel label4 = new JLabel("Stay Home Stay Safe !!");
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setFont(new Font("sans serif", Font.PLAIN,36));
        label4.setForeground(new Color(108,117,125));
        label4.setBackground(new Color(17, 16, 16));
        label4.setOpaque(true);
        panel4.add(label4);
        this.add(panel4);
        //=============================================================================================//
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonB) {
            MyCartPage mp = new MyCartPage(email);
            this.dispose();
        }
    }
}
