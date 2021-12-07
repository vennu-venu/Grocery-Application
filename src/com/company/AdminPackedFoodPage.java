package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminPackedFoodPage extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, dmB, kcB, bmB, kissanB, buttonC;
    JTextField dmC, kcC, bmC, kissanC, dmQ, kcQ, bmQ, kissanQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminPackedFoodPage(String email, int flag) {
        this.setTitle("Online Grocery Application | Packed Foods ");
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
        JLabel label1 = new JLabel("Packed Foods");
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
        dmC = new JTextField();
        dmC.setBounds(650,290,100,50);
        dmC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        dmC.setFont(new Font("sans serif", Font.PLAIN,30));
        dmC.setBackground(new Color(17,16,16));
        dmC.setForeground(new Color(108,117,125));
        dmC.setCaretColor(Color.white);
        dmC.setEditable(true);
        dmC.setText(""+db.getCost(13));
        this.add(dmC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per pc",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        dmQ = new JTextField();
        dmQ.setBounds(1100,290,100,50);
        dmQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        dmQ.setFont(new Font("sans serif", Font.PLAIN,30));
        dmQ.setBackground(new Color(17, 16, 16));
        dmQ.setForeground(new Color(108,117,125));
        dmQ.setCaretColor(Color.white);
        dmQ.setEditable(true);
        dmQ.setText(""+db.getQuantity(13));
        this.add(dmQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("pc",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        dmB = new JButton();
        dmB.addActionListener(this);
        dmB.setBounds(1400,282,162,62);
        dmB.setFocusable(false);
        dmB.setBackground(Color.black);
        dmB.setBorder(BorderFactory.createEtchedBorder());
        dmB.setEnabled(true);
        dmB.setIcon(update);
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
        kcC = new JTextField();
        kcC.setBounds(650,470,100,50);
        kcC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kcC.setFont(new Font("sans serif", Font.PLAIN,30));
        kcC.setBackground(new Color(17,16,16));
        kcC.setForeground(new Color(108,117,125));
        kcC.setCaretColor(Color.white);
        kcC.setEditable(true);
        kcC.setText(""+db.getCost(14));
        this.add(kcC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per pouch",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        kcQ = new JTextField();
        kcQ.setBounds(1100,470,100,50);
        kcQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kcQ.setFont(new Font("sans serif", Font.PLAIN,30));
        kcQ.setBackground(new Color(17, 16, 16));
        kcQ.setForeground(new Color(108,117,125));
        kcQ.setCaretColor(Color.white);
        kcQ.setEditable(true);
        kcQ.setText(""+db.getQuantity(14));
        this.add(kcQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pouch",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        kcB = new JButton();
        kcB.addActionListener(this);
        kcB.setBounds(1400,462,162,63);
        kcB.setFocusable(false);
        kcB.setBackground(Color.black);
        kcB.setBorder(BorderFactory.createEtchedBorder());
        kcB.setEnabled(true);
        kcB.setIcon(update);
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
        bmC = new JTextField();
        bmC.setBounds(650,650,100,50);
        bmC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        bmC.setFont(new Font("sans serif", Font.PLAIN,30));
        bmC.setBackground(new Color(17,16,16));
        bmC.setForeground(new Color(108,117,125));
        bmC.setCaretColor(Color.white);
        bmC.setEditable(true);
        bmC.setText(""+db.getCost(15));
        this.add(bmC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per pc",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        bmQ = new JTextField();
        bmQ.setBounds(1100,650,100,50);
        bmQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        bmQ.setFont(new Font("sans serif", Font.PLAIN,30));
        bmQ.setBackground(new Color(17, 16, 16));
        bmQ.setForeground(new Color(108,117,125));
        bmQ.setCaretColor(Color.white);
        bmQ.setEditable(true);
        bmQ.setText(""+db.getQuantity(15));
        this.add(bmQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        bmB = new JButton();
        bmB.addActionListener(this);
        bmB.setBounds(1400,642,162,63);
        bmB.setFocusable(false);
        bmB.setBackground(Color.black);
        bmB.setBorder(BorderFactory.createEtchedBorder());
        bmB.setEnabled(true);
        bmB.setIcon(update);
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
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        kissanC = new JTextField();
        kissanC.setBounds(650,830,100,50);
        kissanC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kissanC.setFont(new Font("sans serif", Font.PLAIN,30));
        kissanC.setBackground(new Color(17,16,16));
        kissanC.setForeground(new Color(108,117,125));
        kissanC.setCaretColor(Color.white);
        kissanC.setEditable(true);
        kissanC.setText(""+db.getCost(16));
        this.add(kissanC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per 0.5kg",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        kissanQ = new JTextField();
        kissanQ.setBounds(1100,830,100,50);
        kissanQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        kissanQ.setFont(new Font("sans serif", Font.PLAIN,30));
        kissanQ.setBackground(new Color(17, 16, 16));
        kissanQ.setForeground(new Color(108,117,125));
        kissanQ.setCaretColor(Color.white);
        kissanQ.setEditable(true);
        kissanQ.setText(""+db.getQuantity(16));
        this.add(kissanQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("bottle",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        kissanB = new JButton();
        kissanB.addActionListener(this);
        kissanB.setBounds(1400,822,162,63);
        kissanB.setFocusable(false);
        kissanB.setBackground(Color.black);
        kissanB.setBorder(BorderFactory.createEtchedBorder());
        kissanB.setEnabled(true);
        kissanB.setIcon(update);
        this.add(kissanB);
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
        if(e.getSource() == dmB) {
            db.updateProduct(13,Integer.parseInt(dmC.getText()),Integer.parseInt(dmQ.getText()));
            AdminPackedFoodPage ap = new AdminPackedFoodPage(email,1);
            this.dispose();
        }
        if(e.getSource() == kcB) {
            db.updateProduct(14,Integer.parseInt(kcC.getText()),Integer.parseInt(kcQ.getText()));
            AdminPackedFoodPage ap = new AdminPackedFoodPage(email,1);
            this.dispose();
        }
        if(e.getSource() == bmB) {
            db.updateProduct(15,Integer.parseInt(bmC.getText()),Integer.parseInt(bmQ.getText()));
            AdminPackedFoodPage ap = new AdminPackedFoodPage(email,1);
            this.dispose();
        }
        if(e.getSource() == kissanB) {
            db.updateProduct(16,Integer.parseInt(kissanC.getText()),Integer.parseInt(kissanQ.getText()));
            AdminPackedFoodPage ap = new AdminPackedFoodPage(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
