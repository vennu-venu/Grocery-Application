package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class AdminHouseholdItems extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, vimB, lizolB, rinB, seB, buttonC;
    JTextField vimC, lizolC, rinC, seC, vimQ, lizolQ, rinQ, seQ;
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon update = new ImageIcon("src/images/update.png");
    DataBase db = new DataBase();
    JLabel labelM;
    int flag;
    AdminHouseholdItems(String email, int flag) {
        this.setTitle("Online Grocery Application | Household Items ");
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
        JLabel label1 = new JLabel("Household Items");
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
        JLabel label2 = new JLabel("Vim Dish Cleaning Gel",SwingConstants.CENTER);
        label2.setBounds(225, 265, 400,100);
        label2.setFont(new Font("sans serif", Font.PLAIN,32));
        label2.setForeground(new Color(108, 117, 125));
        label2.setBackground(new Color(17, 16, 16));
        this.add(label2);
        //---------------------------------------------------------------------------------------------//
        vimC = new JTextField();
        vimC.setBounds(650,290,100,50);
        vimC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        vimC.setFont(new Font("sans serif", Font.PLAIN,30));
        vimC.setBackground(new Color(17,16,16));
        vimC.setForeground(new Color(108,117,125));
        vimC.setCaretColor(Color.white);
        vimC.setEditable(true);
        vimC.setText(""+db.getCost(21));
        this.add(vimC);
        //---------------------------------------------------------------------------------------------//
        JLabel label3 = new JLabel("  Rs/- per 0.75L",SwingConstants.LEFT);
        label3.setBounds(750, 265, 200,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,25));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        vimQ = new JTextField();
        vimQ.setBounds(1100,290,100,50);
        vimQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        vimQ.setFont(new Font("sans serif", Font.PLAIN,30));
        vimQ.setBackground(new Color(17, 16, 16));
        vimQ.setForeground(new Color(108,117,125));
        vimQ.setCaretColor(Color.white);
        vimQ.setEditable(true);
        vimQ.setText(""+db.getQuantity(21));
        this.add(vimQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("bottles",SwingConstants.LEFT);
        label4.setBounds(1220, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        vimB = new JButton();
        vimB.addActionListener(this);
        vimB.setBounds(1400,282,162,62);
        vimB.setFocusable(false);
        vimB.setBackground(Color.black);
        vimB.setBorder(BorderFactory.createEtchedBorder());
        vimB.setEnabled(true);
        vimB.setIcon(update);
        this.add(vimB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel2);
        //=============================================================================================//
        JPanel panel3 = new JPanel();
        panel3.setBounds(210,420,1500,150);
        panel3.setBackground(new Color(17, 16, 16));
        panel3.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label5 = new JLabel("LIZOL Surface Cleaner",SwingConstants.CENTER);
        label5.setBounds(225, 445, 400,100);
        label5.setFont(new Font("sans serif", Font.PLAIN,32));
        label5.setForeground(new Color(108, 117, 125));
        label5.setBackground(new Color(17, 16, 16));
        this.add(label5);
        //---------------------------------------------------------------------------------------------//
        lizolC = new JTextField();
        lizolC.setBounds(650,470,100,50);
        lizolC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        lizolC.setFont(new Font("sans serif", Font.PLAIN,30));
        lizolC.setBackground(new Color(17,16,16));
        lizolC.setForeground(new Color(108,117,125));
        lizolC.setCaretColor(Color.white);
        lizolC.setEditable(true);
        lizolC.setText(""+db.getCost(22));
        this.add(lizolC);
        //---------------------------------------------------------------------------------------------//
        JLabel label6 = new JLabel("  Rs/- per 1.8L",SwingConstants.LEFT);
        label6.setBounds(750, 445, 200,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,25));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        lizolQ = new JTextField();
        lizolQ.setBounds(1100,470,100,50);
        lizolQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        lizolQ.setFont(new Font("sans serif", Font.PLAIN,30));
        lizolQ.setBackground(new Color(17, 16, 16));
        lizolQ.setForeground(new Color(108,117,125));
        lizolQ.setCaretColor(Color.white);
        lizolQ.setEditable(true);
        lizolQ.setText(""+db.getQuantity(22));
        this.add(lizolQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1220, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        lizolB = new JButton();
        lizolB.addActionListener(this);
        lizolB.setBounds(1400,462,162,63);
        lizolB.setFocusable(false);
        lizolB.setBackground(Color.black);
        lizolB.setBorder(BorderFactory.createEtchedBorder());
        lizolB.setEnabled(true);
        lizolB.setIcon(update);
        this.add(lizolB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel3);
        //=============================================================================================//
        JPanel panel4 = new JPanel();
        panel4.setBounds(210,600,1500,150);
        panel4.setBackground(new Color(17, 16, 16));
        panel4.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label8 = new JLabel("Rin Detergent Bar",SwingConstants.CENTER);
        label8.setBounds(225, 625, 400,100);
        label8.setFont(new Font("sans serif", Font.PLAIN,32));
        label8.setForeground(new Color(108, 117, 125));
        label8.setBackground(new Color(17, 16, 16));
        this.add(label8);
        //---------------------------------------------------------------------------------------------//
        rinC = new JTextField();
        rinC.setBounds(650,650,100,50);
        rinC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        rinC.setFont(new Font("sans serif", Font.PLAIN,30));
        rinC.setBackground(new Color(17,16,16));
        rinC.setForeground(new Color(108,117,125));
        rinC.setCaretColor(Color.white);
        rinC.setEditable(true);
        rinC.setText(""+db.getCost(23));
        this.add(rinC);
        //---------------------------------------------------------------------------------------------//
        JLabel label9 = new JLabel("  Rs/- per 4x250g",SwingConstants.LEFT);
        label9.setBounds(750, 625, 200,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,25));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        rinQ = new JTextField();
        rinQ.setBounds(1100,650,100,50);
        rinQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        rinQ.setFont(new Font("sans serif", Font.PLAIN,30));
        rinQ.setBackground(new Color(17, 16, 16));
        rinQ.setForeground(new Color(108,117,125));
        rinQ.setCaretColor(Color.white);
        rinQ.setEditable(true);
        rinQ.setText(""+db.getQuantity(23));
        this.add(rinQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1220, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        rinB = new JButton();
        rinB.addActionListener(this);
        rinB.setBounds(1400,642,162,63);
        rinB.setFocusable(false);
        rinB.setBackground(Color.black);
        rinB.setBorder(BorderFactory.createEtchedBorder());
        rinB.setEnabled(true);
        rinB.setIcon(update);
        this.add(rinB);
        //---------------------------------------------------------------------------------------------//
        this.add(panel4);
        //=============================================================================================//
        JPanel panel5 = new JPanel();
        panel5.setBounds(210,780,1500,150);
        panel5.setBackground(new Color(17, 16, 16));
        panel5.setBorder(border);
        //---------------------------------------------------------------------------------------------//
        JLabel label11 = new JLabel("Surf excel Easy Wash",SwingConstants.CENTER);
        label11.setBounds(225, 805, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        seC = new JTextField();
        seC.setBounds(650,830,100,50);
        seC.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        seC.setFont(new Font("sans serif", Font.PLAIN,30));
        seC.setBackground(new Color(17,16,16));
        seC.setForeground(new Color(108,117,125));
        seC.setCaretColor(Color.white);
        seC.setEditable(true);
        seC.setText(""+db.getCost(24));
        this.add(seC);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("  Rs/- per 1.5kg",SwingConstants.LEFT);
        label12.setBounds(750, 805, 200,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,25));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        seQ = new JTextField();
        seQ.setBounds(1100,830,100,50);
        seQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        seQ.setFont(new Font("sans serif", Font.PLAIN,30));
        seQ.setBackground(new Color(17, 16, 16));
        seQ.setForeground(new Color(108,117,125));
        seQ.setCaretColor(Color.white);
        seQ.setEditable(true);
        seQ.setText(""+db.getQuantity(24));
        this.add(seQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("pc",SwingConstants.LEFT);
        label13.setBounds(1220, 805, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        seB = new JButton();
        seB.addActionListener(this);
        seB.setBounds(1400,822,162,63);
        seB.setFocusable(false);
        seB.setBackground(Color.black);
        seB.setBorder(BorderFactory.createEtchedBorder());
        seB.setEnabled(true);
        seB.setIcon(update);
        this.add(seB);
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
        if(e.getSource() == vimB) {
            db.updateProduct(21,Integer.parseInt(vimC.getText()),Integer.parseInt(vimQ.getText()));
            AdminHouseholdItems ah = new AdminHouseholdItems(email,1);
            this.dispose();
        }
        if(e.getSource() == lizolB) {
            db.updateProduct(22,Integer.parseInt(lizolC.getText()),Integer.parseInt(lizolQ.getText()));
            AdminHouseholdItems ah = new AdminHouseholdItems(email,1);
            this.dispose();
        }
        if(e.getSource() == rinB) {
            db.updateProduct(23,Integer.parseInt(rinC.getText()),Integer.parseInt(rinQ.getText()));
            AdminHouseholdItems ah = new AdminHouseholdItems(email,1);
            this.dispose();
        }
        if(e.getSource() == seB) {
            db.updateProduct(24,Integer.parseInt(seC.getText()),Integer.parseInt(seQ.getText()));
            AdminHouseholdItems ah = new AdminHouseholdItems(email,1);
            this.dispose();
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
