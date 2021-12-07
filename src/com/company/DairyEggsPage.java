package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class DairyEggsPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, milkB, paneerB, cheeseB, eggsB, buttonC;
    JComboBox milkQ, paneerQ, cheeseQ, eggsQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    DairyEggsPage(String email) {
        this.setTitle("Online Grocery Application | Dairy and Eggs ");
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
        JLabel label1 = new JLabel("Milk and Egg Products");
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
        JLabel label2 = new JLabel("Toned Milk",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("Rs."+db.getCost(17)+"/- per L",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        milkQ = new JComboBox(qnt);
        milkQ.setBounds(1100,290,80,50);
        milkQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        milkQ.setFont(new Font("sans serif", Font.PLAIN,25));
        milkQ.setBackground(new Color(108,117,125));
        milkQ.setForeground(new Color(17, 16, 16));
        ((JTextField) milkQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) milkQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) milkQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        milkQ.setEditable(true);
        this.add(milkQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("L",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        milkB = new JButton();
        milkB.addActionListener(this);
        milkB.setBounds(1400,282,232,66);
        milkB.setFocusable(false);
        milkB.setBackground(Color.black);
        milkB.setBorder(BorderFactory.createEtchedBorder());
        milkB.setEnabled(true);
        milkB.setIcon(ac);
        this.add(milkB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("Paneer",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("Rs."+db.getCost(18)+"/- per 0.2kg",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        paneerQ = new JComboBox(qnt);
        paneerQ.setBounds(1100,470,80,50);
        paneerQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        paneerQ.setFont(new Font("sans serif", Font.PLAIN,25));
        paneerQ.setBackground(new Color(108,117,125));
        paneerQ.setForeground(new Color(17, 16, 16));
        ((JTextField) paneerQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) paneerQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) paneerQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        paneerQ.setEditable(true);
        this.add(paneerQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        paneerB = new JButton();
        paneerB.addActionListener(this);
        paneerB.setBounds(1400,462,232,66);
        paneerB.setFocusable(false);
        paneerB.setBackground(Color.black);
        paneerB.setBorder(BorderFactory.createEtchedBorder());
        paneerB.setEnabled(true);
        paneerB.setIcon(ac);
        this.add(paneerB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Cheese Cubes",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("Rs."+db.getCost(19)+"/- per 0.2kg",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        cheeseQ = new JComboBox(qnt);
        cheeseQ.setBounds(1100,650,80,50);
        cheeseQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        cheeseQ.setFont(new Font("sans serif", Font.PLAIN,25));
        cheeseQ.setBackground(new Color(108,117,125));
        cheeseQ.setForeground(new Color(17, 16, 16));
        ((JTextField) cheeseQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) cheeseQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) cheeseQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        cheeseQ.setEditable(true);
        this.add(cheeseQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        cheeseB = new JButton();
        cheeseB.addActionListener(this);
        cheeseB.setBounds(1400,642,232,66);
        cheeseB.setFocusable(false);
        cheeseB.setBackground(Color.black);
        cheeseB.setBorder(BorderFactory.createEtchedBorder());
        cheeseB.setEnabled(true);
        cheeseB.setIcon(ac);
        this.add(cheeseB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Eggs",SwingConstants.CENTER);
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(20)+"/- per 6units",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        eggsQ = new JComboBox(qnt);
        eggsQ.setBounds(1100,830,80,50);
        eggsQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        eggsQ.setFont(new Font("sans serif", Font.PLAIN,25));
        eggsQ.setBackground(new Color(108,117,125));
        eggsQ.setForeground(new Color(17, 16, 16));
        ((JTextField) eggsQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) eggsQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) eggsQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        eggsQ.setEditable(true);
        this.add(eggsQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("pc",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        eggsB = new JButton();
        eggsB.addActionListener(this);
        eggsB.setBounds(1400,822,232,66);
        eggsB.setFocusable(false);
        eggsB.setBackground(Color.black);
        eggsB.setBorder(BorderFactory.createEtchedBorder());
        eggsB.setEnabled(true);
        eggsB.setIcon(ac);
        this.add(eggsB);
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
        if(e.getSource() == milkB) {
            int q = Integer.parseInt(((JTextField) milkQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(17)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,17)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(17, q);
                db.addToCart(email, 17, q, q*db.getCost(17));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == paneerB) {
            int q = Integer.parseInt(((JTextField) paneerQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(18)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,18)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(18, q);
                db.addToCart(email, 18, q, q*db.getCost(18));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == cheeseB) {
            int q = Integer.parseInt(((JTextField) cheeseQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(19)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,19)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(19, q);
                db.addToCart(email, 19, q, q*db.getCost(19));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == eggsB) {
            int q = Integer.parseInt(((JTextField) eggsQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(20)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,20)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(20, q);
                db.addToCart(email, 20, q, q*db.getCost(20));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
