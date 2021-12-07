package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminVegetablesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, onionB, appleB, tomatoB, potatoB, buttonC;
    JTextField onionC, appleC, tomatoC, potatoC, onionQ, appleQ, tomatoQ, potatoQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminVegetablesPage(String email, int flag) {
        this.setTitle("Online Grocery Application | Fruits and Vegetables ");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.email=email;
        this.flag=flag;
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
        if(flag == 0) {
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
        JLabel label1 = new JLabel("Fruits and Vegetables");
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
        onionC = new JTextField();
        onionC.setBounds(650,290,100,50);
        onionC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        onionC.setFont(new Font("sans serif", Font.PLAIN,30));
        onionC.setBackground(new Color(17,16,16));
        onionC.setForeground(new Color(108,117,125));
        onionC.setCaretColor(Color.white);
        onionC.setEditable(true);
        onionC.setText(""+db.getCost(5));
        this.add(onionC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        onionQ = new JTextField();
        onionQ.setBounds(1100,290,100,50);
        onionQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        onionQ.setFont(new Font("sans serif", Font.PLAIN,30));
        onionQ.setBackground(new Color(17, 16, 16));
        onionQ.setForeground(new Color(108,117,125));
        onionQ.setCaretColor(Color.white);
        onionQ.setEditable(true);
        onionQ.setText(""+db.getQuantity(5));
        this.add(onionQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("kg",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        onionB = new JButton();
        onionB.addActionListener(this);
        onionB.setBounds(1400,282,162,62);
        onionB.setFocusable(false);
        onionB.setBackground(Color.black);
        onionB.setBorder(BorderFactory.createEtchedBorder());
        onionB.setEnabled(true);
        onionB.setIcon(update);
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
        appleC = new JTextField();
        appleC.setBounds(650,470,100,50);
        appleC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        appleC.setFont(new Font("sans serif", Font.PLAIN,30));
        appleC.setBackground(new Color(17,16,16));
        appleC.setForeground(new Color(108,117,125));
        appleC.setCaretColor(Color.white);
        appleC.setEditable(true);
        appleC.setText(""+db.getCost(6));
        this.add(appleC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per pc",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        appleQ = new JTextField();
        appleQ.setBounds(1100,470,100,50);
        appleQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        appleQ.setFont(new Font("sans serif", Font.PLAIN,30));
        appleQ.setBackground(new Color(17, 16, 16));
        appleQ.setForeground(new Color(108,117,125));
        appleQ.setCaretColor(Color.white);
        appleQ.setEditable(true);
        appleQ.setText(""+db.getQuantity(6));
        this.add(appleQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        appleB = new JButton();
        appleB.addActionListener(this);
        appleB.setBounds(1400,462,162,63);
        appleB.setFocusable(false);
        appleB.setBackground(Color.black);
        appleB.setBorder(BorderFactory.createEtchedBorder());
        appleB.setEnabled(true);
        appleB.setIcon(update);
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
        tomatoC = new JTextField();
        tomatoC.setBounds(650,650,100,50);
        tomatoC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tomatoC.setFont(new Font("sans serif", Font.PLAIN,30));
        tomatoC.setBackground(new Color(17,16,16));
        tomatoC.setForeground(new Color(108,117,125));
        tomatoC.setCaretColor(Color.white);
        tomatoC.setEditable(true);
        tomatoC.setText(""+db.getCost(7));
        this.add(tomatoC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        tomatoQ = new JTextField();
        tomatoQ.setBounds(1100,650,100,50);
        tomatoQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        tomatoQ.setFont(new Font("sans serif", Font.PLAIN,30));
        tomatoQ.setBackground(new Color(17, 16, 16));
        tomatoQ.setForeground(new Color(108,117,125));
        tomatoQ.setCaretColor(Color.white);
        tomatoQ.setEditable(true);
        tomatoQ.setText(""+db.getQuantity(7));
        this.add(tomatoQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("kg",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        tomatoB = new JButton();
        tomatoB.addActionListener(this);
        tomatoB.setBounds(1400,642,162,63);
        tomatoB.setFocusable(false);
        tomatoB.setBackground(Color.black);
        tomatoB.setBorder(BorderFactory.createEtchedBorder());
        tomatoB.setEnabled(true);
        tomatoB.setIcon(update);
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
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        potatoC = new JTextField();
        potatoC.setBounds(650,830,100,50);
        potatoC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        potatoC.setFont(new Font("sans serif", Font.PLAIN,30));
        potatoC.setBackground(new Color(17,16,16));
        potatoC.setForeground(new Color(108,117,125));
        potatoC.setCaretColor(Color.white);
        potatoC.setEditable(true);
        potatoC.setText(""+db.getCost(8));
        this.add(potatoC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        potatoQ = new JTextField();
        potatoQ.setBounds(1100,830,100,50);
        potatoQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        potatoQ.setFont(new Font("sans serif", Font.PLAIN,30));
        potatoQ.setBackground(new Color(17, 16, 16));
        potatoQ.setForeground(new Color(108,117,125));
        potatoQ.setCaretColor(Color.white);
        potatoQ.setEditable(true);
        potatoQ.setText(""+db.getQuantity(8));
        this.add(potatoQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("kg",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        potatoB = new JButton();
        potatoB.addActionListener(this);
        potatoB.setBounds(1400,822,162,63);
        potatoB.setFocusable(false);
        potatoB.setBackground(Color.black);
        potatoB.setBorder(BorderFactory.createEtchedBorder());
        potatoB.setEnabled(true);
        potatoB.setIcon(update);
        this.add(potatoB);
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
        if(e.getSource() == onionB) {
            db.updateProduct(5,Integer.parseInt(onionC.getText()),Integer.parseInt(onionQ.getText()));
            AdminVegetablesPage av = new AdminVegetablesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == appleB) {
            db.updateProduct(6,Integer.parseInt(appleC.getText()),Integer.parseInt(appleQ.getText()));
            AdminVegetablesPage av = new AdminVegetablesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == tomatoB) {
            db.updateProduct(7,Integer.parseInt(tomatoC.getText()),Integer.parseInt(tomatoQ.getText()));
            AdminVegetablesPage av = new AdminVegetablesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == potatoB) {
            db.updateProduct(8,Integer.parseInt(potatoC.getText()),Integer.parseInt(potatoQ.getText()));
            AdminVegetablesPage av = new AdminVegetablesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
