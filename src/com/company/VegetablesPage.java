package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class VegetablesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, onionB, appleB, tomatoB, potatoB, buttonC;
    JComboBox onionQ, appleQ, tomatoQ, potatoQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    VegetablesPage(String email) {
        this.setTitle("Online Grocery Application | Vegetables and Fruits ");
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
        labelM = new JLabel();
        labelM.setText("  Item was added to cart !!  ");
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
        JLabel label1 = new JLabel("Vegetables and Fruits");
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
        JLabel label2 = new JLabel("Onion",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("Rs."+db.getCost(5)+"/- per kg",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        onionQ = new JComboBox(qnt);
        onionQ.setBounds(1100,290,80,50);
        onionQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        onionQ.setFont(new Font("sans serif", Font.PLAIN,25));
        onionQ.setBackground(new Color(108,117,125));
        onionQ.setForeground(new Color(17, 16, 16));
        ((JTextField) onionQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) onionQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) onionQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        onionQ.setEditable(true);
        this.add(onionQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("kg",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        onionB = new JButton();
        onionB.addActionListener(this);
        onionB.setBounds(1400,282,232,66);
        onionB.setFocusable(false);
        onionB.setBackground(Color.black);
        onionB.setBorder(BorderFactory.createEtchedBorder());
        onionB.setEnabled(true);
        onionB.setIcon(ac);
        this.add(onionB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("Apple",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("Rs."+db.getCost(6)+"/- per pc",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        appleQ = new JComboBox(qnt);
        appleQ.setBounds(1100,470,80,50);
        appleQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        appleQ.setFont(new Font("sans serif", Font.PLAIN,25));
        appleQ.setBackground(new Color(108,117,125));
        appleQ.setForeground(new Color(17, 16, 16));
        ((JTextField) appleQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) appleQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) appleQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        appleQ.setEditable(true);
        this.add(appleQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        appleB = new JButton();
        appleB.addActionListener(this);
        appleB.setBounds(1400,462,232,66);
        appleB.setFocusable(false);
        appleB.setBackground(Color.black);
        appleB.setBorder(BorderFactory.createEtchedBorder());
        appleB.setEnabled(true);
        appleB.setIcon(ac);
        this.add(appleB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Tomato",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("Rs."+db.getCost(7)+"/- per kg",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        tomatoQ = new JComboBox(qnt);
        tomatoQ.setBounds(1100,650,80,50);
        tomatoQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tomatoQ.setFont(new Font("sans serif", Font.PLAIN,25));
        tomatoQ.setBackground(new Color(108,117,125));
        tomatoQ.setForeground(new Color(17, 16, 16));
        ((JTextField) tomatoQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) tomatoQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) tomatoQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        tomatoQ.setEditable(true);
        this.add(tomatoQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("kg",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        tomatoB = new JButton();
        tomatoB.addActionListener(this);
        tomatoB.setBounds(1400,642,232,66);
        tomatoB.setFocusable(false);
        tomatoB.setBackground(Color.black);
        tomatoB.setBorder(BorderFactory.createEtchedBorder());
        tomatoB.setEnabled(true);
        tomatoB.setIcon(ac);
        this.add(tomatoB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Potato",SwingConstants.CENTER);
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(8)+"/- per kg",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        potatoQ = new JComboBox(qnt);
        potatoQ.setBounds(1100,830,80,50);
        potatoQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        potatoQ.setFont(new Font("sans serif", Font.PLAIN,25));
        potatoQ.setBackground(new Color(108,117,125));
        potatoQ.setForeground(new Color(17, 16, 16));
        ((JTextField) potatoQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) potatoQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) potatoQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        potatoQ.setEditable(true);
        this.add(potatoQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("kg",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        potatoB = new JButton();
        potatoB.addActionListener(this);
        potatoB.setBounds(1400,822,232,66);
        potatoB.setFocusable(false);
        potatoB.setBackground(Color.black);
        potatoB.setBorder(BorderFactory.createEtchedBorder());
        potatoB.setEnabled(true);
        potatoB.setIcon(ac);
        this.add(potatoB);
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
        if(e.getSource() == onionB) {
            int q = Integer.parseInt(((JTextField) onionQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(5)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,5)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(5, q);
                db.addToCart(email, 5, q, q*db.getCost(5));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == appleB) {
            int q = Integer.parseInt(((JTextField) appleQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(6)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,6)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(6, q);
                db.addToCart(email, 6, q, q*db.getCost(6));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == tomatoB) {
            int q = Integer.parseInt(((JTextField) tomatoQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(7)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,7)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(7, q);
                db.addToCart(email, 7, q, q*db.getCost(7));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == potatoB) {
            int q = Integer.parseInt(((JTextField) potatoQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(8)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,8)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(8, q);
                db.addToCart(email, 8, q, q*db.getCost(8));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
