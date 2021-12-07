package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame implements ActionListener {
    JButton buttonB;
    JTextField email;
    JPasswordField password;
    JButton button1;
    JButton button2;
    JPanel panelE, panelP;
    DataBase db = new DataBase();
    AdminLogin() {
        this.setTitle("Online Grocery Application | Admin Login");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.setLayout(null);
        //=============================================================================================//
        JPanel panelB = new JPanel();
        panelB.setBounds(0,0,100,100);
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
        //=============================================================================================//
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,100,1920,200);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("Login");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.PLAIN,72));
        label1.setForeground(new Color(108, 117, 125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        //=============================================================================================//
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,300,1920,100);
        panel2.setBackground(new Color(17, 16, 16));
        JLabel label2 = new JLabel("Email");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font("sans serif", Font.PLAIN,36));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        label2.setOpaque(true);
        panel2.add(label2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(0,400,1920,100);
        panel3.setBackground(new Color(17, 16, 16));
        email = new JTextField();
        email.setPreferredSize(new Dimension(500,50));
        email.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        email.setFont(new Font("sans serif", Font.PLAIN,32));
        email.setBackground(new Color(17,16,16));
        email.setForeground(new Color(108,117,125));
        email.setCaretColor(Color.white);
        email.setEditable(true);
        panel3.add(email);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(0,500,1920,100);
        panel4.setBackground(new Color(17, 16, 16));
        JLabel label3 = new JLabel("Password");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setFont(new Font("sans serif", Font.PLAIN,36));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        label3.setOpaque(true);
        panel4.add(label3);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(0,600,1920,100);
        panel5.setBackground(new Color(17, 16, 16));
        password = new JPasswordField();
        password.setPreferredSize(new Dimension(500,50));
        password.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        password.setFont(new Font("sans serif", Font.PLAIN,32));
        password.setBackground(new Color(17,16,16));
        password.setForeground(new Color(108,117,125));
        password.setCaretColor(Color.white);
        password.setEditable(true);
        panel5.add(password);
        //=============================================================================================//
        JPanel panel6 = new JPanel();
        panel6.setBounds(0,700,1920,100);
        panel6.setBackground(new Color(17, 16, 16));
        button1 = new JButton("");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBackground(Color.black);
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.setEnabled(true);
        ImageIcon lg = new ImageIcon("src/images/loginbtn.png");
        button1.setIcon(lg);
        panel6.add(button1);
        //=============================================================================================//
        JPanel panel7 = new JPanel();
        panel7.setBounds(0,880,1920,100);
        panel7.setBackground(new Color(17, 16, 16));
        JLabel label4 = new JLabel("New to the Application ??        ");
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108,117,125));
        label4.setBackground(new Color(17, 16, 16));
        label4.setOpaque(true);
        panel7.add(label4);
        //=============================================================================================//
        button2 = new JButton();
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setBackground(Color.black);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setEnabled(true);
        ImageIcon sup = new ImageIcon("src/images/subtn.png");
        button2.setIcon(sup);
        panel7.add(button2);
        //=============================================================================================//
        panelE = new JPanel();
        panelE.setBounds(1500,50, 390,50);
        panelE.setBackground(new Color(167, 40, 40));
        panelE.setVisible(false);
        JLabel label6 = new JLabel("Email doesn't exist !!");
        label6.setBounds(1550,90,250,50);
        label6.setForeground(Color.WHITE);
        label6.setBackground(new Color(167, 40, 40));
        label6.setFont(new Font("sans serif", Font.BOLD,25));
        panelE.add(label6);
        //=============================================================================================//
        panelP = new JPanel();
        panelP.setBounds(1500,50, 390,50);
        panelP.setBackground(new Color(167, 40, 40));
        panelP.setVisible(false);
        JLabel label7 = new JLabel("Incorrect Password !!");
        label7.setBounds(1550,90,250,50);
        label7.setForeground(Color.WHITE);
        label7.setBackground(new Color(167, 40, 40));
        label7.setFont(new Font("sans serif", Font.BOLD,25));
        panelP.add(label7);
        //=============================================================================================//
        this.add(panelE);
        this.add(panelP);
        this.add(panelB);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        this.add(panel7);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonB) {
            MainPage mp = new MainPage();
            mp.setVisible(true);
            this.dispose();
        }
        if(e.getSource() == button1) {
            String[] s = {email.getText(), new String(password.getPassword())};
            int res = db.checkAdmin(s);
            if(res == 1) {
                AdminHomePage hp = new AdminHomePage(email.getText(),1);
                this.dispose();
            }
            else if (res == 2) {
                password.setText("");
                panelE.setVisible(false);
                panelP.setVisible(true);
            }
            else if (res == 0) {
                email.setText("");
                panelE.setVisible(false);
                panelE.setVisible(true);
            }
        }
        if(e.getSource() == button2) {
            AdminRegister ar = new AdminRegister();
            this.dispose();
        }
    }
}
