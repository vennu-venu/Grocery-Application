package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHomePage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, button1, button2, button3, button4, button5, button6, buttonR;
    JPanel panelM;
    String[] userData;
    AdminHomePage(String email, int flag) {
        this.setTitle("Online Grocery Application | Home");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.email = email;
        //=============================================================================================//
        DataBase db = new DataBase();
        userData = db.getAdminData(email);
        //=============================================================================================//
        JPanel panelB = new JPanel();
        panelB.setBounds(1700,10,200,80);
        panelB.setBackground(new Color(17, 16, 16));
        buttonB = new JButton("");
        buttonB.addActionListener(this);
        buttonB.setFocusable(false);
        buttonB.setBackground(Color.black);
        buttonB.setBorder(BorderFactory.createEtchedBorder());
        buttonB.setEnabled(true);
        ImageIcon bck = new ImageIcon("src/images/logout.png");
        buttonB.setIcon(bck);
        panelB.add(buttonB);
        this.add(panelB);
        //=============================================================================================//
        panelM = new JPanel(new BorderLayout());
        panelM.setBounds(1450,120, 420,50);
        panelM.setBackground(new Color(44, 167, 40));
        JLabel labelM = new JLabel("  Welcome! Successful Login!  ");
        labelM.setForeground(Color.WHITE);
        labelM.setBackground(new Color(44, 167, 40));
        labelM.setFont(new Font("sans serif", Font.BOLD,25));
        buttonR = new JButton("X");
        buttonR.addActionListener(this);
        buttonR.setFocusable(false);
        buttonR.setBackground(new Color(44, 167, 40));
        buttonR.setForeground(Color.WHITE);
        buttonR.setFont(new Font("sans serif", Font.PLAIN,25));
        buttonR.setSize(60,60);
        buttonR.setBorder(BorderFactory.createEtchedBorder());
        buttonR.setEnabled(true);
        panelM.add(labelM, BorderLayout.WEST);
        panelM.add(buttonR, BorderLayout.CENTER);
        if(flag == 0){
            panelM.setVisible(false);
        }
        this.add(panelM);
        //=============================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,50,1920,150);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("Hello! "+userData[0]);
        label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setFont(new Font("sans serif", Font.PLAIN,48));
        label1.setForeground(new Color(108, 117, 125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        this.add(panel1);
        //=============================================================================================//
        ImageIcon staples = new ImageIcon("src/images/staples.png");
        ImageIcon veg = new ImageIcon("src/images/veg.png");
        ImageIcon beverages = new ImageIcon("src/images/beverages.png");
        ImageIcon packed = new ImageIcon("src/images/packed.png");
        ImageIcon dairy = new ImageIcon("src/images/dairy.png");
        ImageIcon household = new ImageIcon("src/images/household.png");
        //=============================================================================================//
        JPanel panel = new JPanel();
        panel.setBounds(310,280,1300,650);
        panel.setBackground(new Color(17, 16, 16));
        panel.setLayout(new GridLayout(2,3,50,50));
        this.add(panel);
        //=============================================================================================//
        button1 = new JButton("");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.setEnabled(true);
        button1.setIcon(staples);
        panel.add(button1);
        //=============================================================================================//
        button2 = new JButton("");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setEnabled(true);
        button2.setIcon(veg);
        panel.add(button2);
        //=============================================================================================//
        button3 = new JButton("");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setBackground(Color.black);
        button3.setBorder(BorderFactory.createEtchedBorder());
        button3.setEnabled(true);
        button3.setIcon(beverages);
        panel.add(button3);
        //=============================================================================================//
        button4 = new JButton("");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setBackground(Color.black);
        button4.setBorder(BorderFactory.createEtchedBorder());
        button4.setEnabled(true);
        button4.setIcon(packed);
        panel.add(button4);
        //=============================================================================================//
        button5 = new JButton("");
        button5.addActionListener(this);
        button5.setFocusable(false);
        button5.setBackground(Color.black);
        button5.setBorder(BorderFactory.createEtchedBorder());
        button5.setEnabled(true);
        button5.setIcon(dairy);
        panel.add(button5);
        //=============================================================================================//
        button6 = new JButton("");
        button6.addActionListener(this);
        button6.setFocusable(false);
        button6.setBackground(Color.black);
        button6.setBorder(BorderFactory.createEtchedBorder());
        button6.setEnabled(true);
        button6.setIcon(household);
        panel.add(button6);
        //=============================================================================================//
        //=============================================================================================//
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonB) {
            AdminLogin cl = new AdminLogin();
            this.dispose();
        }
        if(e.getSource() == button1) {
            AdminStaplesPage sp = new AdminStaplesPage(email,0);
            this.dispose();
        }
        if(e.getSource() == button2) {
            AdminVegetablesPage vp = new AdminVegetablesPage(email,0);
            this.dispose();
        }
        if(e.getSource() == button3) {
            AdminBeveragesPage bp = new AdminBeveragesPage(email,0);
            this.dispose();
        }
        if(e.getSource() == button4) {
            AdminPackedFoodPage pp = new AdminPackedFoodPage(email,0);
            this.dispose();
        }
        if(e.getSource() == button5) {
            AdminDairyEggsPage dp = new AdminDairyEggsPage(email,0);
            this.dispose();
        }
        if(e.getSource() == button6) {
            AdminHouseholdItems hp = new AdminHouseholdItems(email,0);
            this.dispose();
        }
        if(e.getSource() == buttonR) {
            panelM.setVisible(false);
        }
    }
}
