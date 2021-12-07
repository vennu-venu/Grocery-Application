package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminDairyEggsPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, milkB, paneerB, cheeseB, eggsB, buttonC;
    JTextField milkC, paneerC, cheeseC, eggsC, milkQ, paneerQ, cheeseQ, eggsQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminDairyEggsPage(String email, int flag) {
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
        JLabel label1 = new JLabel("Dairy and Eggs");
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
        milkC = new JTextField();
        milkC.setBounds(650,290,100,50);
        milkC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        milkC.setFont(new Font("sans serif", Font.PLAIN,30));
        milkC.setBackground(new Color(17,16,16));
        milkC.setForeground(new Color(108,117,125));
        milkC.setCaretColor(Color.white);
        milkC.setEditable(true);
        milkC.setText(""+db.getCost(17));
        this.add(milkC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per L",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        milkQ = new JTextField();
        milkQ.setBounds(1100,290,100,50);
        milkQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        milkQ.setFont(new Font("sans serif", Font.PLAIN,30));
        milkQ.setBackground(new Color(17, 16, 16));
        milkQ.setForeground(new Color(108,117,125));
        milkQ.setCaretColor(Color.white);
        milkQ.setEditable(true);
        milkQ.setText(""+db.getQuantity(17));
        this.add(milkQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("L",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        milkB = new JButton();
        milkB.addActionListener(this);
        milkB.setBounds(1400,282,162,62);
        milkB.setFocusable(false);
        milkB.setBackground(Color.black);
        milkB.setBorder(BorderFactory.createEtchedBorder());
        milkB.setEnabled(true);
        milkB.setIcon(update);
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
        paneerC = new JTextField();
        paneerC.setBounds(650,470,100,50);
        paneerC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        paneerC.setFont(new Font("sans serif", Font.PLAIN,30));
        paneerC.setBackground(new Color(17,16,16));
        paneerC.setForeground(new Color(108,117,125));
        paneerC.setCaretColor(Color.white);
        paneerC.setEditable(true);
        paneerC.setText(""+db.getCost(18));
        this.add(paneerC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per 0.2kg",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        paneerQ = new JTextField();
        paneerQ.setBounds(1100,470,100,50);
        paneerQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        paneerQ.setFont(new Font("sans serif", Font.PLAIN,30));
        paneerQ.setBackground(new Color(17, 16, 16));
        paneerQ.setForeground(new Color(108,117,125));
        paneerQ.setCaretColor(Color.white);
        paneerQ.setEditable(true);
        paneerQ.setText(""+db.getQuantity(18));
        this.add(paneerQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        paneerB = new JButton();
        paneerB.addActionListener(this);
        paneerB.setBounds(1400,462,162,63);
        paneerB.setFocusable(false);
        paneerB.setBackground(Color.black);
        paneerB.setBorder(BorderFactory.createEtchedBorder());
        paneerB.setEnabled(true);
        paneerB.setIcon(update);
        this.add(paneerB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Cheese",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        cheeseC = new JTextField();
        cheeseC.setBounds(650,650,100,50);
        cheeseC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        cheeseC.setFont(new Font("sans serif", Font.PLAIN,30));
        cheeseC.setBackground(new Color(17,16,16));
        cheeseC.setForeground(new Color(108,117,125));
        cheeseC.setCaretColor(Color.white);
        cheeseC.setEditable(true);
        cheeseC.setText(""+db.getCost(19));
        this.add(cheeseC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per 0.2kg",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        cheeseQ = new JTextField();
        cheeseQ.setBounds(1100,650,100,50);
        cheeseQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        cheeseQ.setFont(new Font("sans serif", Font.PLAIN,30));
        cheeseQ.setBackground(new Color(17, 16, 16));
        cheeseQ.setForeground(new Color(108,117,125));
        cheeseQ.setCaretColor(Color.white);
        cheeseQ.setEditable(true);
        cheeseQ.setText(""+db.getQuantity(19));
        this.add(cheeseQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        cheeseB = new JButton();
        cheeseB.addActionListener(this);
        cheeseB.setBounds(1400,642,162,63);
        cheeseB.setFocusable(false);
        cheeseB.setBackground(Color.black);
        cheeseB.setBorder(BorderFactory.createEtchedBorder());
        cheeseB.setEnabled(true);
        cheeseB.setIcon(update);
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
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        eggsC = new JTextField();
        eggsC.setBounds(650,830,100,50);
        eggsC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        eggsC.setFont(new Font("sans serif", Font.PLAIN,30));
        eggsC.setBackground(new Color(17,16,16));
        eggsC.setForeground(new Color(108,117,125));
        eggsC.setCaretColor(Color.white);
        eggsC.setEditable(true);
        eggsC.setText(""+db.getCost(20));
        this.add(eggsC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per 6Units",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        eggsQ = new JTextField();
        eggsQ.setBounds(1100,830,100,50);
        eggsQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        eggsQ.setFont(new Font("sans serif", Font.PLAIN,30));
        eggsQ.setBackground(new Color(17, 16, 16));
        eggsQ.setForeground(new Color(108,117,125));
        eggsQ.setCaretColor(Color.white);
        eggsQ.setEditable(true);
        eggsQ.setText(""+db.getQuantity(20));
        this.add(eggsQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("pc",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        eggsB = new JButton();
        eggsB.addActionListener(this);
        eggsB.setBounds(1400,822,162,63);
        eggsB.setFocusable(false);
        eggsB.setBackground(Color.black);
        eggsB.setBorder(BorderFactory.createEtchedBorder());
        eggsB.setEnabled(true);
        eggsB.setIcon(update);
        this.add(eggsB);
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
        if(e.getSource() == milkB) {
            db.updateProduct(17,Integer.parseInt(milkC.getText()),Integer.parseInt(milkQ.getText()));
            AdminDairyEggsPage ad = new AdminDairyEggsPage(email,1);
            this.dispose();
        }
        if(e.getSource() == paneerB) {
            db.updateProduct(18,Integer.parseInt(paneerC.getText()),Integer.parseInt(paneerQ.getText()));
            AdminDairyEggsPage ad = new AdminDairyEggsPage(email,1);
            this.dispose();
        }
        if(e.getSource() == cheeseB) {
            db.updateProduct(19,Integer.parseInt(cheeseC.getText()),Integer.parseInt(cheeseQ.getText()));
            AdminDairyEggsPage ad = new AdminDairyEggsPage(email,1);
            this.dispose();
        }
        if(e.getSource() == eggsB) {
            db.updateProduct(20,Integer.parseInt(eggsC.getText()),Integer.parseInt(eggsQ.getText()));
            AdminDairyEggsPage ad = new AdminDairyEggsPage(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
