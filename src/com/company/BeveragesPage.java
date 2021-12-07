package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class BeveragesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, tuB, spriteB, mdB, pepsiB, buttonC;
    JComboBox tuQ, spriteQ, mdQ, pepsiQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    BeveragesPage(String email) {
        this.setTitle("Online Grocery Application | Beverages ");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.email=email;
        //=============================================================================================//
        JPanel panelB = new JPanel();
        panelB.setBounds(0,0,100,50);
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
        panelM = new JPanel(new BorderLayout());
        panelM.setBounds(1500,50, 390,50);
        panelM.setBackground(new Color(44, 167, 40));
        panelM.setVisible(false);
        labelM = new JLabel("  Item was added to cart !!    ");
        labelM.setForeground(Color.WHITE);
        labelM.setBackground(new Color(44, 167, 40));
        labelM.setFont(new Font("sans serif", Font.BOLD,25));
        buttonC = new JButton("X");
        buttonC.addActionListener(this);
        buttonC.setFocusable(false);
        buttonC.setBackground(new Color(44, 167, 40));
        buttonC.setForeground(Color.WHITE);
        buttonC.setFont(new Font("sans serif", Font.PLAIN,25));
        buttonC.setSize(60,60);
        buttonC.setBorder(BorderFactory.createEtchedBorder());
        buttonC.setEnabled(true);
        panelM.add(labelM, BorderLayout.WEST);
        panelM.add(buttonC, BorderLayout.CENTER);
        this.add(panelM);
        //=============================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,50,1920,150);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("Beverages");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.PLAIN,64));
        label1.setForeground(new Color(108, 117, 125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        this.add(panel1);
        //=============================================================================================//
        JPanel panel2 = new JPanel();
        panel2.setBounds(210,240,1500,150);
        panel2.setBackground(new Color(17, 16, 16));
        panel2.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label2 = new JLabel("Thumbs Up",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("Rs."+db.getCost(9)+"/- per 1.75L",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        tuQ = new JComboBox(qnt);
        tuQ.setBounds(1100,290,80,50);
        tuQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tuQ.setFont(new Font("sans serif", Font.PLAIN,25));
        tuQ.setBackground(new Color(108,117,125));
        tuQ.setForeground(new Color(17, 16, 16));
        ((JTextField) tuQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) tuQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) tuQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        tuQ.setEditable(true);
        this.add(tuQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("bottles",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        tuB = new JButton();
        tuB.addActionListener(this);
        tuB.setBounds(1400,282,232,66);
        tuB.setFocusable(false);
        tuB.setBackground(Color.black);
        tuB.setBorder(BorderFactory.createEtchedBorder());
        tuB.setEnabled(true);
        tuB.setIcon(ac);
        this.add(tuB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("Sprite",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("Rs."+db.getCost(10)+"/- per 2.25L",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        spriteQ = new JComboBox(qnt);
        spriteQ.setBounds(1100,470,80,50);
        spriteQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        spriteQ.setFont(new Font("sans serif", Font.PLAIN,25));
        spriteQ.setBackground(new Color(108,117,125));
        spriteQ.setForeground(new Color(17, 16, 16));
        ((JTextField) spriteQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) spriteQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) spriteQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        spriteQ.setEditable(true);
        this.add(spriteQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("bottles",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        spriteB = new JButton();
        spriteB.addActionListener(this);
        spriteB.setBounds(1400,462,232,66);
        spriteB.setFocusable(false);
        spriteB.setBackground(Color.black);
        spriteB.setBorder(BorderFactory.createEtchedBorder());
        spriteB.setEnabled(true);
        spriteB.setIcon(ac);
        this.add(spriteB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Mountain Dew",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("Rs."+db.getCost(11)+"/- per 0.75L",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        mdQ = new JComboBox(qnt);
        mdQ.setBounds(1100,650,80,50);
        mdQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        mdQ.setFont(new Font("sans serif", Font.PLAIN,25));
        mdQ.setBackground(new Color(108,117,125));
        mdQ.setForeground(new Color(17, 16, 16));
        ((JTextField) mdQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) mdQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) mdQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        mdQ.setEditable(true);
        this.add(mdQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("bottles",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        mdB = new JButton();
        mdB.addActionListener(this);
        mdB.setBounds(1400,642,232,66);
        mdB.setFocusable(false);
        mdB.setBackground(Color.black);
        mdB.setBorder(BorderFactory.createEtchedBorder());
        mdB.setEnabled(true);
        mdB.setIcon(ac);
        this.add(mdB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Pepsi",SwingConstants.CENTER);
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(12)+"/- per 0.25ML",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        pepsiQ = new JComboBox(qnt);
        pepsiQ.setBounds(1100,830,80,50);
        pepsiQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        pepsiQ.setFont(new Font("sans serif", Font.PLAIN,25));
        pepsiQ.setBackground(new Color(108,117,125));
        pepsiQ.setForeground(new Color(17, 16, 16));
        ((JTextField) pepsiQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) pepsiQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) pepsiQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        pepsiQ.setEditable(true);
        this.add(pepsiQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("bottles",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        pepsiB = new JButton();
        pepsiB.addActionListener(this);
        pepsiB.setBounds(1400,822,232,66);
        pepsiB.setFocusable(false);
        pepsiB.setBackground(Color.black);
        pepsiB.setBorder(BorderFactory.createEtchedBorder());
        pepsiB.setEnabled(true);
        pepsiB.setIcon(ac);
        this.add(pepsiB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel5);
        //=============================================================================================//
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonB){
            CustomerHomePage ch = new CustomerHomePage(email,0);
            this.dispose();
        }
        if(e.getSource() == tuB) {
            int q = Integer.parseInt(((JTextField) tuQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(9)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,9)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(9, q);
                db.addToCart(email, 9, q, q*db.getCost(9));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == spriteB) {
            int q = Integer.parseInt(((JTextField) spriteQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(10)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,10)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(10, q);
                db.addToCart(email, 10, q, q*db.getCost(10));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == mdB) {
            int q = Integer.parseInt(((JTextField) mdQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(11)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,11)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(11, q);
                db.addToCart(email, 11, q, q*db.getCost(11));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == pepsiB) {
            int q = Integer.parseInt(((JTextField) mdQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(12)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,12)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(12, q);
                db.addToCart(email, 12, q, q*db.getCost(12));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
