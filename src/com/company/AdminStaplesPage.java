package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminStaplesPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, riceB, oilB, attaB, sugarB, buttonC;
    JTextField riceC, oilC, attaC, sugarC, riceQ, oilQ, attaQ, sugarQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminStaplesPage(String email, int flag) {
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
        riceC = new JTextField();
        riceC.setBounds(650,290,100,50);
        riceC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        riceC.setFont(new Font("sans serif", Font.PLAIN,30));
        riceC.setBackground(new Color(17,16,16));
        riceC.setForeground(new Color(108,117,125));
        riceC.setCaretColor(Color.white);
        riceC.setEditable(true);
        riceC.setText(""+db.getCost(1));
        this.add(riceC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        riceQ = new JTextField();
        riceQ.setBounds(1100,290,100,50);
        riceQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        riceQ.setFont(new Font("sans serif", Font.PLAIN,30));
        riceQ.setBackground(new Color(17, 16, 16));
        riceQ.setForeground(new Color(108,117,125));
        riceQ.setCaretColor(Color.white);
        riceQ.setEditable(true);
        riceQ.setText(""+db.getQuantity(1));
        this.add(riceQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("kg",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        riceB = new JButton();
        riceB.addActionListener(this);
        riceB.setBounds(1400,282,162,62);
        riceB.setFocusable(false);
        riceB.setBackground(Color.black);
        riceB.setBorder(BorderFactory.createEtchedBorder());
        riceB.setEnabled(true);
        riceB.setIcon(update);
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
        oilC = new JTextField();
        oilC.setBounds(650,470,100,50);
        oilC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        oilC.setFont(new Font("sans serif", Font.PLAIN,30));
        oilC.setBackground(new Color(17,16,16));
        oilC.setForeground(new Color(108,117,125));
        oilC.setCaretColor(Color.white);
        oilC.setEditable(true);
        oilC.setText(""+db.getCost(2));
        this.add(oilC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per L",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        oilQ = new JTextField();
        oilQ.setBounds(1100,470,100,50);
        oilQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        oilQ.setFont(new Font("sans serif", Font.PLAIN,30));
        oilQ.setBackground(new Color(17, 16, 16));
        oilQ.setForeground(new Color(108,117,125));
        oilQ.setCaretColor(Color.white);
        oilQ.setEditable(true);
        oilQ.setText(""+db.getQuantity(2));
        this.add(oilQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("L",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        oilB = new JButton();
        oilB.addActionListener(this);
        oilB.setBounds(1400,462,162,63);
        oilB.setFocusable(false);
        oilB.setBackground(Color.black);
        oilB.setBorder(BorderFactory.createEtchedBorder());
        oilB.setEnabled(true);
        oilB.setIcon(update);
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
        attaC = new JTextField();
        attaC.setBounds(650,650,100,50);
        attaC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        attaC.setFont(new Font("sans serif", Font.PLAIN,30));
        attaC.setBackground(new Color(17,16,16));
        attaC.setForeground(new Color(108,117,125));
        attaC.setCaretColor(Color.white);
        attaC.setEditable(true);
        attaC.setText(""+db.getCost(3));
        this.add(attaC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        attaQ = new JTextField();
        attaQ.setBounds(1100,650,100,50);
        attaQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        attaQ.setFont(new Font("sans serif", Font.PLAIN,30));
        attaQ.setBackground(new Color(17, 16, 16));
        attaQ.setForeground(new Color(108,117,125));
        attaQ.setCaretColor(Color.white);
        attaQ.setEditable(true);
        attaQ.setText(""+db.getQuantity(3));
        this.add(attaQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("kg",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        attaB = new JButton();
        attaB.addActionListener(this);
        attaB.setBounds(1400,642,162,63);
        attaB.setFocusable(false);
        attaB.setBackground(Color.black);
        attaB.setBorder(BorderFactory.createEtchedBorder());
        attaB.setEnabled(true);
        attaB.setIcon(update);
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
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        sugarC = new JTextField();
        sugarC.setBounds(650,830,100,50);
        sugarC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        sugarC.setFont(new Font("sans serif", Font.PLAIN,30));
        sugarC.setBackground(new Color(17,16,16));
        sugarC.setForeground(new Color(108,117,125));
        sugarC.setCaretColor(Color.white);
        sugarC.setEditable(true);
        sugarC.setText(""+db.getCost(4));
        this.add(sugarC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per kg",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        sugarQ = new JTextField();
        sugarQ.setBounds(1100,830,100,50);
        sugarQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        sugarQ.setFont(new Font("sans serif", Font.PLAIN,30));
        sugarQ.setBackground(new Color(17, 16, 16));
        sugarQ.setForeground(new Color(108,117,125));
        sugarQ.setCaretColor(Color.white);
        sugarQ.setEditable(true);
        sugarQ.setText(""+db.getQuantity(4));
        this.add(sugarQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("kg",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        sugarB = new JButton();
        sugarB.addActionListener(this);
        sugarB.setBounds(1400,822,162,63);
        sugarB.setFocusable(false);
        sugarB.setBackground(Color.black);
        sugarB.setBorder(BorderFactory.createEtchedBorder());
        sugarB.setEnabled(true);
        sugarB.setIcon(update);
        this.add(sugarB);
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
        if(e.getSource() == riceB) {
            db.updateProduct(1,Integer.parseInt(riceC.getText()),Integer.parseInt(riceQ.getText()));
            AdminStaplesPage as = new AdminStaplesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == oilB) {
            db.updateProduct(2,Integer.parseInt(oilC.getText()),Integer.parseInt(oilQ.getText()));
            AdminStaplesPage as = new AdminStaplesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == attaB) {
            db.updateProduct(3,Integer.parseInt(attaC.getText()),Integer.parseInt(attaQ.getText()));
            AdminStaplesPage as = new AdminStaplesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == sugarB) {
            db.updateProduct(4,Integer.parseInt(sugarC.getText()),Integer.parseInt(sugarQ.getText()));
            AdminStaplesPage as = new AdminStaplesPage(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
