package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class MainPage extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    Border border = BorderFactory.createLineBorder(Color.WHITE,1);
    ImageIcon im = new ImageIcon("src/images/loginlight.png");
    MainPage() {
        this.setTitle("Online Grocery Application");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1920,1080);
        this.setVisible(false);
        this.setLayout(null);
        //===========================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(1,1,1, 0));
        panel1.setBorder(border);
        panel1.setBounds(1150,300,600,200);
        JLabel label1 = new JLabel("Login as Customer");
        label1.setBorder(new EmptyBorder(20,0,0,0));
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.BOLD,36));
        label1.setForeground(Color.white);
        label1.setBackground(new Color(0, 0, 0, 0));
        label1.setOpaque(true);
        panel1.add(label1);
        button1 = new JButton("");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBounds(1366,400,168,67);
        button1.setBackground(Color.black);
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.setEnabled(true);
        button1.setIcon(im);
        //===========================================================================================//
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(1,1,1, 0));
        panel2.setBorder(border);
        panel2.setBounds(1150,550,600,200);
        JLabel label2 = new JLabel("Login as Admin");
        label2.setBorder(new EmptyBorder(20,0,0,0));
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font("sans serif", Font.BOLD,36));
        label2.setForeground(Color.white);
        label2.setBackground(new Color(0, 0, 0, 0));
        label2.setOpaque(true);
        panel2.add(label2);
        button2 = new JButton("");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setBounds(1366,650,168,67);
        button2.setBackground(Color.black);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setEnabled(true);
        button2.setIcon(im);
        //===========================================================================================//
        JPanel panel = new JPanel();
        panel.setBounds(0,0,1920,1080);
        JLabel label = new JLabel();
        ImageIcon bim = new ImageIcon("src/images/start.png");
        label.setIcon(bim);
        panel.add(label);
        //=============================================================================================//
        this.add(panel1);
        this.add(button1);
        this.add(panel2);
        this.add(button2);
        this.add(panel);
        //===========================================================================================//
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1) {
            CustomerLogin cl = new CustomerLogin();
            this.dispose();
        }
        if(e.getSource()==button2) {
            AdminLogin al = new AdminLogin();
            this.dispose();
        }
    }
}
