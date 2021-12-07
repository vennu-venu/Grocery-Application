package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminBeveragesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, tuB, spriteB, mdB, pepsiB, buttonC;
    JTextField tuC, spriteC, mdC, pepsiC, tuQ, spriteQ, mdQ, pepsiQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminBeveragesPage(String email, int flag) {
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
        this.flag = flag;
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
        if( flag == 0) {
            panelM.setVisible(false);
        }
        labelM = new JLabel("  Updated Successfully !!    ");
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
        tuC = new JTextField();
        tuC.setBounds(650,290,100,50);
        tuC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tuC.setFont(new Font("sans serif", Font.PLAIN,30));
        tuC.setBackground(new Color(17,16,16));
        tuC.setForeground(new Color(108,117,125));
        tuC.setCaretColor(Color.white);
        tuC.setEditable(true);
        tuC.setText(""+db.getCost(9));
        this.add(tuC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per 1.75L",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        tuQ = new JTextField();
        tuQ.setBounds(1100,290,100,50);
        tuQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tuQ.setFont(new Font("sans serif", Font.PLAIN,30));
        tuQ.setBackground(new Color(17, 16, 16));
        tuQ.setForeground(new Color(108,117,125));
        tuQ.setCaretColor(Color.white);
        tuQ.setEditable(true);
        tuQ.setText(""+db.getQuantity(9));
        this.add(tuQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("bottle",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        tuB = new JButton();
        tuB.addActionListener(this);
        tuB.setBounds(1400,282,162,62);
        tuB.setFocusable(false);
        tuB.setBackground(Color.black);
        tuB.setBorder(BorderFactory.createEtchedBorder());
        tuB.setEnabled(true);
        tuB.setIcon(update);
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
        spriteC = new JTextField();
        spriteC.setBounds(650,470,100,50);
        spriteC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        spriteC.setFont(new Font("sans serif", Font.PLAIN,30));
        spriteC.setBackground(new Color(17,16,16));
        spriteC.setForeground(new Color(108,117,125));
        spriteC.setCaretColor(Color.white);
        spriteC.setEditable(true);
        spriteC.setText(""+db.getCost(10));
        this.add(spriteC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per 2.25L",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        spriteQ = new JTextField();
        spriteQ.setBounds(1100,470,100,50);
        spriteQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        spriteQ.setFont(new Font("sans serif", Font.PLAIN,30));
        spriteQ.setBackground(new Color(17, 16, 16));
        spriteQ.setForeground(new Color(108,117,125));
        spriteQ.setCaretColor(Color.white);
        spriteQ.setEditable(true);
        spriteQ.setText(""+db.getQuantity(10));
        this.add(spriteQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("bottle",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        spriteB = new JButton();
        spriteB.addActionListener(this);
        spriteB.setBounds(1400,462,162,63);
        spriteB.setFocusable(false);
        spriteB.setBackground(Color.black);
        spriteB.setBorder(BorderFactory.createEtchedBorder());
        spriteB.setEnabled(true);
        spriteB.setIcon(update);
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
        mdC = new JTextField();
        mdC.setBounds(650,650,100,50);
        mdC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        mdC.setFont(new Font("sans serif", Font.PLAIN,30));
        mdC.setBackground(new Color(17,16,16));
        mdC.setForeground(new Color(108,117,125));
        mdC.setCaretColor(Color.white);
        mdC.setEditable(true);
        mdC.setText(""+db.getCost(11));
        this.add(mdC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per 0.75L",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        mdQ = new JTextField();
        mdQ.setBounds(1100,650,100,50);
        mdQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        mdQ.setFont(new Font("sans serif", Font.PLAIN,30));
        mdQ.setBackground(new Color(17, 16, 16));
        mdQ.setForeground(new Color(108,117,125));
        mdQ.setCaretColor(Color.white);
        mdQ.setEditable(true);
        mdQ.setText(""+db.getQuantity(11));
        this.add(mdQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("bottle",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        mdB = new JButton();
        mdB.addActionListener(this);
        mdB.setBounds(1400,642,162,63);
        mdB.setFocusable(false);
        mdB.setBackground(Color.black);
        mdB.setBorder(BorderFactory.createEtchedBorder());
        mdB.setEnabled(true);
        mdB.setIcon(update);
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
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        pepsiC = new JTextField();
        pepsiC.setBounds(650,830,100,50);
        pepsiC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        pepsiC.setFont(new Font("sans serif", Font.PLAIN,30));
        pepsiC.setBackground(new Color(17,16,16));
        pepsiC.setForeground(new Color(108,117,125));
        pepsiC.setCaretColor(Color.white);
        pepsiC.setEditable(true);
        pepsiC.setText(""+db.getCost(12));
        this.add(pepsiC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per 0.25L",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        pepsiQ = new JTextField();
        pepsiQ.setBounds(1100,830,100,50);
        pepsiQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        pepsiQ.setFont(new Font("sans serif", Font.PLAIN,30));
        pepsiQ.setBackground(new Color(17, 16, 16));
        pepsiQ.setForeground(new Color(108,117,125));
        pepsiQ.setCaretColor(Color.white);
        pepsiQ.setEditable(true);
        pepsiQ.setText(""+db.getQuantity(12));
        this.add(pepsiQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("bottle",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        pepsiB = new JButton();
        pepsiB.addActionListener(this);
        pepsiB.setBounds(1400,822,162,63);
        pepsiB.setFocusable(false);
        pepsiB.setBackground(Color.black);
        pepsiB.setBorder(BorderFactory.createEtchedBorder());
        pepsiB.setEnabled(true);
        pepsiB.setIcon(update);
        this.add(pepsiB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel5);
        //=============================================================================================//
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonB){
            AdminHomePage hp = new AdminHomePage(email,0);
            this.dispose();
        }
        if(e.getSource() == tuB) {
            db.updateProduct(9,Integer.parseInt(tuC.getText()),Integer.parseInt(tuQ.getText()));
            AdminBeveragesPage ab = new AdminBeveragesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == spriteB) {
            db.updateProduct(10,Integer.parseInt(spriteC.getText()),Integer.parseInt(spriteQ.getText()));
            AdminBeveragesPage ab = new AdminBeveragesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == mdB) {
            db.updateProduct(11,Integer.parseInt(mdC.getText()),Integer.parseInt(mdQ.getText()));
            AdminBeveragesPage ab = new AdminBeveragesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == pepsiB) {
            db.updateProduct(12,Integer.parseInt(pepsiC.getText()),Integer.parseInt(pepsiQ.getText()));
            AdminBeveragesPage ab = new AdminBeveragesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
