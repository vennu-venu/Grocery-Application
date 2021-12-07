package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerRegister extends JFrame implements ActionListener {
    JButton buttonB;
    JTextField username;
    JTextField name;
    JTextField email;
    JTextField mobile;
    JTextField city;
    JTextField pin;
    JPasswordField password;
    JPasswordField cPassword;
    JButton buttonS;
    DataBase db = new DataBase();
    CustomerRegister() {
        this.setTitle("Online Grocery Application | Customer Register");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.getContentPane().setBackground(new Color(17, 16, 16));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
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
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,50,1920,150);
        panel1.setBackground(new Color(17, 16, 16));
        JLabel label1 = new JLabel("Register");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("sans serif", Font.PLAIN,72));
        label1.setForeground(new Color(108, 117, 125));
        label1.setBackground(new Color(17, 16, 16));
        label1.setOpaque(true);
        panel1.add(label1);
        this.add(panel1);
        //=============================================================================================//
        JLabel label2 = new JLabel("Username",SwingConstants.CENTER);
        label2.setBounds(572, 220, 320,50);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //=============================================================================================//
        username = new JTextField();
        username.setBounds(950,225,360,40);
        username.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        username.setFont(new Font("sans serif", Font.PLAIN,30));
        username.setBackground(new Color(17,16,16));
        username.setForeground(new Color(108,117,125));
        username.setCaretColor(Color.white);
        username.setEditable(true);
        this.add(username);
        //=============================================================================================//
        JLabel label3 = new JLabel("Name",SwingConstants.CENTER);
        label3.setBounds(572, 300, 320,50);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //=============================================================================================//
        name = new JTextField();
        name.setBounds(950,305,360,40);
        name.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        name.setFont(new Font("sans serif", Font.PLAIN,30));
        name.setBackground(new Color(17,16,16));
        name.setForeground(new Color(108,117,125));
        name.setCaretColor(Color.white);
        name.setEditable(true);
        this.add(name);
        //=============================================================================================//
        JLabel label4 = new JLabel("Email",SwingConstants.CENTER);
        label4.setBounds(572, 380, 320,50);
        label4.setFont(new Font("sans serif", Font.PLAIN,32));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //=============================================================================================//
        email = new JTextField();
        email.setBounds(950,385,360,40);
        email.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        email.setFont(new Font("sans serif", Font.PLAIN,30));
        email.setBackground(new Color(17,16,16));
        email.setForeground(new Color(108,117,125));
        email.setCaretColor(Color.white);
        email.setEditable(true);
        this.add(email);
        //=============================================================================================//
        JLabel label5 = new JLabel("Mobile",SwingConstants.CENTER);
        label5.setBounds(572, 460, 320,50);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //=============================================================================================//
        mobile = new JTextField();
        mobile.setBounds(950,465,360,40);
        mobile.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        mobile.setFont(new Font("sans serif", Font.PLAIN,30));
        mobile.setBackground(new Color(17,16,16));
        mobile.setForeground(new Color(108,117,125));
        mobile.setCaretColor(Color.white);
        mobile.setEditable(true);
        this.add(mobile);
        //=============================================================================================//
        JLabel label6 = new JLabel("City",SwingConstants.CENTER);
        label6.setBounds(572, 540, 320,50);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //=============================================================================================//
        city = new JTextField();
        city.setBounds(950,545,360,40);
        city.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        city.setFont(new Font("sans serif", Font.PLAIN,30));
        city.setBackground(new Color(17,16,16));
        city.setForeground(new Color(108,117,125));
        city.setCaretColor(Color.white);
        city.setEditable(true);
        this.add(city);
        //=============================================================================================//
        JLabel label7 = new JLabel("PIN Code",SwingConstants.CENTER);
        label7.setBounds(572, 620, 320,50);
        label7.setFont(new Font("sans serif", Font.PLAIN,32));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //=============================================================================================//
        pin = new JTextField();
        pin.setBounds(950,625,360,40);
        pin.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        pin.setFont(new Font("sans serif", Font.PLAIN,30));
        pin.setBackground(new Color(17,16,16));
        pin.setForeground(new Color(108,117,125));
        pin.setCaretColor(Color.white);
        pin.setEditable(true);
        this.add(pin);
        //=============================================================================================//
        JLabel label8 = new JLabel("Password",SwingConstants.CENTER);
        label8.setBounds(572, 700, 320,50);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //=============================================================================================//
        password = new JPasswordField();
        password.setBounds(950,705,360,40);
        password.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        password.setFont(new Font("sans serif", Font.PLAIN,30));
        password.setBackground(new Color(17,16,16));
        password.setForeground(new Color(108,117,125));
        password.setCaretColor(Color.white);
        password.setEditable(true);
        this.add(password);
        //=============================================================================================//
        JLabel label9 = new JLabel("Confirm Password",SwingConstants.CENTER);
        label9.setBounds(572, 780, 320,50);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //=============================================================================================//
        cPassword = new JPasswordField();
        cPassword.setBounds(950,785,360,40);
        cPassword.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        cPassword.setFont(new Font("sans serif", Font.PLAIN,30));
        cPassword.setBackground(new Color(17,16,16));
        cPassword.setForeground(new Color(108,117,125));
        cPassword.setCaretColor(Color.white);
        cPassword.setEditable(true);
        this.add(cPassword);
        //=============================================================================================//
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(17,16,16));
        panel2.setBounds(0,880,1920,100);
        buttonS = new JButton();
        buttonS.addActionListener(this);
        buttonS.setFocusable(false);
        buttonS.setBackground(Color.black);
        buttonS.setBorder(BorderFactory.createEtchedBorder());
        buttonS.setEnabled(true);
        ImageIcon sup = new ImageIcon("src/images/subtn.png");
        buttonS.setIcon(sup);
        panel2.add(buttonS);
        this.add(panel2);
        //=============================================================================================//
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        boolean isValid = true;
        if(e.getSource() == buttonB) {
            CustomerLogin cl = new CustomerLogin();
            this.dispose();
        }
        if(e.getSource() == buttonS){
            if(isValid) {
                String[] s = {username.getText(), name.getText(), email.getText(), mobile.getText(), city.getText(), pin.getText(), new String(password.getPassword())};
                username.setText("");
                name.setText("");
                email.setText("");
                mobile.setText("");
                city.setText("");
                pin.setText("");
                password.setText("");
                cPassword.setText("");
                db.insertIntoCustomer(s);
                CustomerLogin cl = new CustomerLogin();
            }
        }
    }
}
