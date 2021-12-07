package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyCartPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, buttonP;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    String s[][] = new String[100][5];
    JButton[] buttons = new JButton[20];
    DataBase db;
    MyCartPage(String email) {
        this.setTitle("Online Grocery Application | My Cart");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.email = email;
        this.setLocationRelativeTo(null);
        db = new DataBase();
        //=============================================================================================//
        JPanel panelB = new JPanel();
        panelB.setBounds(0,0,100,40);
        panelB.setBackground(new Color(17, 16, 16));
        buttonB = new JButton("");
        buttonB.setSize(25,25);
        buttonB.addActionListener(this);
        buttonB.setFocusable(false);
        buttonB.setBackground(Color.black);
        buttonB.setBorder(BorderFactory.createEtchedBorder());
        buttonB.setEnabled(true);
        ImageIcon bck = new ImageIcon("src/images/back2.png");
        buttonB.setIcon(bck);
        panelB.add(buttonB);
        this.add(panelB);
        //=============================================================================================//
        JPanel panelP = new JPanel();
        panelP.setBounds(1360,10,400,80);
        panelP.setBackground(new Color(17, 16, 16));
        buttonP = new JButton("");
        buttonP.addActionListener(this);
        buttonP.setFocusable(false);
        buttonP.setBackground(Color.black);
        buttonP.setBorder(BorderFactory.createEtchedBorder());
        buttonP.setEnabled(true);
        ImageIcon p = new ImageIcon("src/images/placeorder.png");
        buttonP.setIcon(p);
        panelP.add(buttonP);
        if(db.getNoOfItems(email) == 0) {
            panelP.setVisible(false);
        }
        else {
            panelP.setVisible(true);
        }
        this.add(panelP);
        //=============================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,40,1920,100);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("My Cart");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.PLAIN,50));
        label1.setForeground(new Color(108, 117, 125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        this.add(panel1);
        //=============================================================================================//
        s = db.getOrdersData(email);
        for(int i=0;i<db.getNoOfItems(email);i++) {
            buttons[i] = new JButton();
        }
        int n = db.getNoOfItems(email);
        for(int i=0;i<n;i++) {
            JPanel panel = new JPanel();
            panel.setBackground(new Color(17, 16, 16));
            panel.setBorder(border);
            panel.setBounds(210, 140+90*i,1500,80);
            panel.setVisible(true);
            //-----------------------------------------------------------------------------------------//
            JLabel label2 = new JLabel(db.getProductName(Integer.parseInt(s[i][1])),SwingConstants.CENTER);
            label2.setBounds(225, 155+90*i, 400,50);
            label2.setFont(new Font("sans serif", Font.PLAIN,25));
            label2.setForeground(new Color(108, 117, 125));
            label2.setBackground(new Color(17, 16, 16));
            this.add(label2);
            //-----------------------------------------------------------------------------------------//
            String txt;
            if(Integer.parseInt(s[i][2]) == 1) {
                txt = s[i][2]+" Unit";
            }
            else {
                txt = s[i][2]+" Units";
            }
            JLabel label3 = new JLabel(txt,SwingConstants.CENTER);
            label3.setBounds(625, 155+90*i, 400,50);
            label3.setFont(new Font("sans serif", Font.PLAIN,25));
            label3.setForeground(new Color(108, 117, 125));
            label3.setBackground(new Color(17, 16, 16));
            this.add(label3);
            //-----------------------------------------------------------------------------------------//
            JLabel label4 = new JLabel("Rs."+s[i][3]+"/-",SwingConstants.CENTER);
            label4.setBounds(1025, 155+90*i, 300,50);
            label4.setFont(new Font("sans serif", Font.PLAIN,25));
            label4.setForeground(new Color(108, 117, 125));
            label4.setBackground(new Color(17, 16, 16));
            this.add(label4);
            //-----------------------------------------------------------------------------------------//
            buttons[i].addActionListener(this);
            buttons[i].setBounds(1450,147+90*i,171,66);
            buttons[i].setFocusable(false);
            buttons[i].setBackground(Color.black);
            buttons[i].setBorder(BorderFactory.createEtchedBorder());
            buttons[i].setEnabled(true);
            buttons[i].setIcon(new ImageIcon("src/images/remove.png"));
            this.add(buttons[i]);
            //-----------------------------------------------------------------------------------------//
            this.add(panel);
        }
        //=============================================================================================//
        JPanel panelE = new JPanel();
        panelE.setBounds(0,400,1920,100);
        panelE.setBackground(new Color(17, 16, 16));
        JLabel labelE = new JLabel("Your Cart is empty !!");
        labelE.setHorizontalTextPosition(JLabel.CENTER);
        labelE.setFont(new Font("sans serif", Font.PLAIN,36));
        labelE.setBackground(new Color(17, 16, 16));
        labelE.setForeground(new Color(108, 117, 125));
        panelE.add(labelE);
        if(db.getNoOfItems(email) == 0) {
            labelE.setVisible(true);
        }
        else {
            labelE.setVisible(false);
        }
        this.add(panelE);
        //=============================================================================================//

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonB) {
            CustomerHomePage ch = new CustomerHomePage(email,0);
            this.dispose();
        }
        if(e.getSource() == buttonP) {
            SuccessfulPage sp = new SuccessfulPage(email);
            db.emptyCart(email);
            this.dispose();
        }
        for(int i=0;i<db.getNoOfItems(email);i++) {
            if(e.getSource() == buttons[i]) {
                db.reAddProduct(Integer.parseInt(s[i][1]),Integer.parseInt(s[i][2]));
                db.removeFromCart(email, Integer.parseInt(s[i][1]));
                MyCartPage mc = new MyCartPage(email);
                this.dispose();
            }
        }
    }
}
