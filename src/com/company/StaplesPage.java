package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class StaplesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, riceB, oilB, attaB, sugarB, buttonC;
    JComboBox riceQ, oilQ, attaQ, sugarQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    StaplesPage(String email) {
        this.setTitle("Online Grocery Application | Staples ");
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
        JLabel label1 = new JLabel("Staples");
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
        JLabel label2 = new JLabel("Rice",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("Rs."+db.getCost(1)+"/- per kg",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        riceQ = new JComboBox(qnt);
        riceQ.setBounds(1100,290,80,50);
        riceQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        riceQ.setFont(new Font("sans serif", Font.PLAIN,25));
        riceQ.setBackground(new Color(108,117,125));
        riceQ.setForeground(new Color(17, 16, 16));
        ((JTextField) riceQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) riceQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) riceQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        riceQ.setEditable(true);
        this.add(riceQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("kg",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        riceB = new JButton();
        riceB.addActionListener(this);
        riceB.setBounds(1400,282,232,66);
        riceB.setFocusable(false);
        riceB.setBackground(Color.black);
        riceB.setBorder(BorderFactory.createEtchedBorder());
        riceB.setEnabled(true);
        riceB.setIcon(ac);
        this.add(riceB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("Sunflower Oil",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("Rs."+db.getCost(2)+"/- per L",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        oilQ = new JComboBox(qnt);
        oilQ.setBounds(1100,470,80,50);
        oilQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        oilQ.setFont(new Font("sans serif", Font.PLAIN,25));
        oilQ.setBackground(new Color(108,117,125));
        oilQ.setForeground(new Color(17, 16, 16));
        ((JTextField) oilQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) oilQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) oilQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        oilQ.setEditable(true);
        this.add(oilQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("L",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        oilB = new JButton();
        oilB.addActionListener(this);
        oilB.setBounds(1400,462,232,66);
        oilB.setFocusable(false);
        oilB.setBackground(Color.black);
        oilB.setBorder(BorderFactory.createEtchedBorder());
        oilB.setEnabled(true);
        oilB.setIcon(ac);
        this.add(oilB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Wheat Atta",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("Rs."+db.getCost(3)+"/- per kg",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        attaQ = new JComboBox(qnt);
        attaQ.setBounds(1100,650,80,50);
        attaQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        attaQ.setFont(new Font("sans serif", Font.PLAIN,25));
        attaQ.setBackground(new Color(108,117,125));
        attaQ.setForeground(new Color(17, 16, 16));
        ((JTextField) attaQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) attaQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) attaQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        attaQ.setEditable(true);
        this.add(attaQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("kg",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        attaB = new JButton();
        attaB.addActionListener(this);
        attaB.setBounds(1400,642,232,66);
        attaB.setFocusable(false);
        attaB.setBackground(Color.black);
        attaB.setBorder(BorderFactory.createEtchedBorder());
        attaB.setEnabled(true);
        attaB.setIcon(ac);
        this.add(attaB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Sugar",SwingConstants.CENTER);
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(4)+"/- per kg",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        sugarQ = new JComboBox(qnt);
        sugarQ.setBounds(1100,830,80,50);
        sugarQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        sugarQ.setFont(new Font("sans serif", Font.PLAIN,25));
        sugarQ.setBackground(new Color(108,117,125));
        sugarQ.setForeground(new Color(17, 16, 16));
        ((JTextField) sugarQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) sugarQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) sugarQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        sugarQ.setEditable(true);
        this.add(sugarQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("kg",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        sugarB = new JButton();
        sugarB.addActionListener(this);
        sugarB.setBounds(1400,822,232,66);
        sugarB.setFocusable(false);
        sugarB.setBackground(Color.black);
        sugarB.setBorder(BorderFactory.createEtchedBorder());
        sugarB.setEnabled(true);
        sugarB.setIcon(ac);
        this.add(sugarB);
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
        if(e.getSource() == riceB) {
            int q = Integer.parseInt(((JTextField) riceQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(1)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,1)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(1, q);
                db.addToCart(email, 1, q, q*db.getCost(1));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == oilB) {
            int q = Integer.parseInt(((JTextField) oilQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(2)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,2)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(2, q);
                db.addToCart(email, 2, q, q*db.getCost(2));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == attaB) {
            int q = Integer.parseInt(((JTextField) attaQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(3)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,3)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(3, q);
                db.addToCart(email, 3, q, q*db.getCost(3));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == sugarB) {
            int q = Integer.parseInt(((JTextField) sugarQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(4)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,4)){
                labelM.setText("  You can't add new Item ! ");
            }
            else{
                db.consumeProduct(4, q);
                db.addToCart(email, 4, q, q*db.getCost(4));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
