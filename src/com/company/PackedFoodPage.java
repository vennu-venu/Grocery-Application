package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class PackedFoodPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, dmB, kcB, bmB, kissanB, buttonC;
    JComboBox dmQ, kcQ, bmQ, kissanQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    PackedFoodPage(String email) {
        this.setTitle("Online Grocery Application | Packed Food Items ");
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
        JLabel label1 = new JLabel("Packed Food Items");
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
        JLabel label2 = new JLabel("Dairy Milk Silk",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("Rs."+db.getCost(13)+"/- per pc",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        dmQ = new JComboBox(qnt);
        dmQ.setBounds(1100,290,80,50);
        dmQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        dmQ.setFont(new Font("sans serif", Font.PLAIN,25));
        dmQ.setBackground(new Color(108,117,125));
        dmQ.setForeground(new Color(17, 16, 16));
        ((JTextField) dmQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) dmQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) dmQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        dmQ.setEditable(true);
        this.add(dmQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("pc",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        dmB = new JButton();
        dmB.addActionListener(this);
        dmB.setBounds(1400,282,232,66);
        dmB.setFocusable(false);
        dmB.setBackground(Color.black);
        dmB.setBorder(BorderFactory.createEtchedBorder());
        dmB.setEnabled(true);
        dmB.setIcon(ac);
        this.add(dmB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("Kellogg's Choco",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("Rs."+db.getCost(14)+"/- per pouch",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        kcQ = new JComboBox(qnt);
        kcQ.setBounds(1100,470,80,50);
        kcQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kcQ.setFont(new Font("sans serif", Font.PLAIN,25));
        kcQ.setBackground(new Color(108,117,125));
        kcQ.setForeground(new Color(17, 16, 16));
        ((JTextField) kcQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) kcQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) kcQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        kcQ.setEditable(true);
        this.add(kcQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pouch",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        kcB = new JButton();
        kcB.addActionListener(this);
        kcB.setBounds(1400,462,232,66);
        kcB.setFocusable(false);
        kcB.setBackground(Color.black);
        kcB.setBorder(BorderFactory.createEtchedBorder());
        kcB.setEnabled(true);
        kcB.setIcon(ac);
        this.add(kcB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Bambino Vermicelli",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("Rs."+db.getCost(15)+"/- per pc",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        bmQ = new JComboBox(qnt);
        bmQ.setBounds(1100,650,80,50);
        bmQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        bmQ.setFont(new Font("sans serif", Font.PLAIN,25));
        bmQ.setBackground(new Color(108,117,125));
        bmQ.setForeground(new Color(17, 16, 16));
        ((JTextField) bmQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) bmQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) bmQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        bmQ.setEditable(true);
        this.add(bmQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        bmB = new JButton();
        bmB.addActionListener(this);
        bmB.setBounds(1400,642,232,66);
        bmB.setFocusable(false);
        bmB.setBackground(Color.black);
        bmB.setBorder(BorderFactory.createEtchedBorder());
        bmB.setEnabled(true);
        bmB.setIcon(ac);
        this.add(bmB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Kissan Mixed Fruit",SwingConstants.CENTER);
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(16)+"/- per 0.5kg",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        kissanQ = new JComboBox(qnt);
        kissanQ.setBounds(1100,830,80,50);
        kissanQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kissanQ.setFont(new Font("sans serif", Font.PLAIN,25));
        kissanQ.setBackground(new Color(108,117,125));
        kissanQ.setForeground(new Color(17, 16, 16));
        ((JTextField) kissanQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) kissanQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) kissanQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        kissanQ.setEditable(true);
        this.add(kissanQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("bottles",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        kissanB = new JButton();
        kissanB.addActionListener(this);
        kissanB.setBounds(1400,822,232,66);
        kissanB.setFocusable(false);
        kissanB.setBackground(Color.black);
        kissanB.setBorder(BorderFactory.createEtchedBorder());
        kissanB.setEnabled(true);
        kissanB.setIcon(ac);
        this.add(kissanB);
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
        if(e.getSource() == dmB) {
            int q = Integer.parseInt(((JTextField) dmQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(13)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,13)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(13, q);
                db.addToCart(email, 13, q, q*db.getCost(13));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == kcB) {
            int q = Integer.parseInt(((JTextField) kcQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(14)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,14)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(14, q);
                db.addToCart(email, 14, q, q*db.getCost(14));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == bmB) {
            int q = Integer.parseInt(((JTextField) bmQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(15)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,15)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(15, q);
                db.addToCart(email, 15, q, q*db.getCost(15));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == kissanB) {
            int q = Integer.parseInt(((JTextField) kissanQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(16)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,16)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(16, q);
                db.addToCart(email, 16, q, q*db.getCost(16));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
