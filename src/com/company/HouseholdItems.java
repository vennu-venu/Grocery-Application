package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class HouseholdItems extends JFrame implements ActionListener {
    private String email;
    JButton buttonB, vimB, lizolB, rinB, seB, buttonC;
    JComboBox vimQ, lizolQ, rinQ, seQ;
    String[] qnt = {"1", "2", "3", "4", "5"};
    JPanel panelM;
    Border border = BorderFactory.createLineBorder(new Color(108, 117, 125),2);
    ImageIcon ac = new ImageIcon("src/images/addcart.png");
    DataBase db = new DataBase();
    JLabel labelM;
    HouseholdItems(String email) {
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
        JLabel label3 = new JLabel("Rs."+db.getCost(21)+"/- per 0.75L",SwingConstants.CENTER);
        label3.setBounds(625, 265, 300,100);
        label3.setFont(new Font("sans serif", Font.PLAIN,32));
        label3.setForeground(new Color(108, 117, 125));
        label3.setBackground(new Color(17, 16, 16));
        this.add(label3);
        //---------------------------------------------------------------------------------------------//
        vimQ = new JComboBox(qnt);
        vimQ.setBounds(1100,290,80,50);
        vimQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        vimQ.setFont(new Font("sans serif", Font.PLAIN,25));
        vimQ.setBackground(new Color(108,117,125));
        vimQ.setForeground(new Color(17, 16, 16));
        ((JTextField) vimQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) vimQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) vimQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        vimQ.setEditable(true);
        this.add(vimQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label4 = new JLabel("bottles",SwingConstants.LEFT);
        label4.setBounds(1210, 265, 100,100);
        label4.setFont(new Font("sans serif", Font.PLAIN,25));
        label4.setForeground(new Color(108, 117, 125));
        label4.setBackground(new Color(17, 16, 16));
        this.add(label4);
        //---------------------------------------------------------------------------------------------//
        vimB = new JButton();
        vimB.addActionListener(this);
        vimB.setBounds(1400,282,232,66);
        vimB.setFocusable(false);
        vimB.setBackground(Color.black);
        vimB.setBorder(BorderFactory.createEtchedBorder());
        vimB.setEnabled(true);
        vimB.setIcon(ac);
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
        JLabel label6 = new JLabel("Rs."+db.getCost(22)+"/- per 1.8L",SwingConstants.CENTER);
        label6.setBounds(625, 445, 300,100);
        label6.setFont(new Font("sans serif", Font.PLAIN,32));
        label6.setForeground(new Color(108, 117, 125));
        label6.setBackground(new Color(17, 16, 16));
        this.add(label6);
        //---------------------------------------------------------------------------------------------//
        lizolQ = new JComboBox(qnt);
        lizolQ.setBounds(1100,470,80,50);
        lizolQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        lizolQ.setFont(new Font("sans serif", Font.PLAIN,25));
        lizolQ.setBackground(new Color(108,117,125));
        lizolQ.setForeground(new Color(17, 16, 16));
        ((JTextField) lizolQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) lizolQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) lizolQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        lizolQ.setEditable(true);
        this.add(lizolQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label7 = new JLabel("pc",SwingConstants.LEFT);
        label7.setBounds(1210, 445, 100,100);
        label7.setFont(new Font("sans serif", Font.PLAIN,25));
        label7.setForeground(new Color(108, 117, 125));
        label7.setBackground(new Color(17, 16, 16));
        this.add(label7);
        //---------------------------------------------------------------------------------------------//
        lizolB = new JButton();
        lizolB.addActionListener(this);
        lizolB.setBounds(1400,462,232,66);
        lizolB.setFocusable(false);
        lizolB.setBackground(Color.black);
        lizolB.setBorder(BorderFactory.createEtchedBorder());
        lizolB.setEnabled(true);
        lizolB.setIcon(ac);
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
        JLabel label9 = new JLabel("Rs."+db.getCost(23)+"/- per 4x250g",SwingConstants.CENTER);
        label9.setBounds(625, 625, 300,100);
        label9.setFont(new Font("sans serif", Font.PLAIN,32));
        label9.setForeground(new Color(108, 117, 125));
        label9.setBackground(new Color(17, 16, 16));
        this.add(label9);
        //---------------------------------------------------------------------------------------------//
        rinQ = new JComboBox(qnt);
        rinQ.setBounds(1100,650,80,50);
        rinQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        rinQ.setFont(new Font("sans serif", Font.PLAIN,25));
        rinQ.setBackground(new Color(108,117,125));
        rinQ.setForeground(new Color(17, 16, 16));
        ((JTextField) rinQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) rinQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) rinQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        rinQ.setEditable(true);
        this.add(rinQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label10 = new JLabel("pc",SwingConstants.LEFT);
        label10.setBounds(1210, 625, 100,100);
        label10.setFont(new Font("sans serif", Font.PLAIN,25));
        label10.setForeground(new Color(108, 117, 125));
        label10.setBackground(new Color(17, 16, 16));
        this.add(label10);
        //---------------------------------------------------------------------------------------------//
        rinB = new JButton();
        rinB.addActionListener(this);
        rinB.setBounds(1400,642,232,66);
        rinB.setFocusable(false);
        rinB.setBackground(Color.black);
        rinB.setBorder(BorderFactory.createEtchedBorder());
        rinB.setEnabled(true);
        rinB.setIcon(ac);
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
        label11.setBounds(225, 815, 400,100);
        label11.setFont(new Font("sans serif", Font.PLAIN,32));
        label11.setForeground(new Color(108, 117, 125));
        label11.setBackground(new Color(17, 16, 16));
        this.add(label11);
        //---------------------------------------------------------------------------------------------//
        JLabel label12 = new JLabel("Rs."+db.getCost(24)+"/- per 1.5kg",SwingConstants.CENTER);
        label12.setBounds(625, 815, 300,100);
        label12.setFont(new Font("sans serif", Font.PLAIN,32));
        label12.setForeground(new Color(108, 117, 125));
        label12.setBackground(new Color(17, 16, 16));
        this.add(label12);
        //---------------------------------------------------------------------------------------------//
        seQ = new JComboBox(qnt);
        seQ.setBounds(1100,830,80,50);
        seQ.setBorder(BorderFactory.createLineBorder(new Color(108,117,125)));
        seQ.setFont(new Font("sans serif", Font.PLAIN,25));
        seQ.setBackground(new Color(108,117,125));
        seQ.setForeground(new Color(17, 16, 16));
        ((JTextField) seQ.getEditor().getEditorComponent()).setBackground(new Color(17, 16, 16));
        ((JTextField) seQ.getEditor().getEditorComponent()).setForeground(new Color(108,117,125));
        ((JTextField) seQ.getEditor().getEditorComponent()).setCaretColor(new Color(108,117,125));
        seQ.setEditable(true);
        this.add(seQ);
        //---------------------------------------------------------------------------------------------//
        JLabel label13 = new JLabel("pc",SwingConstants.LEFT);
        label13.setBounds(1210, 815, 100,100);
        label13.setFont(new Font("sans serif", Font.PLAIN,25));
        label13.setForeground(new Color(108, 117, 125));
        label13.setBackground(new Color(17, 16, 16));
        this.add(label13);
        //---------------------------------------------------------------------------------------------//
        seB = new JButton();
        seB.addActionListener(this);
        seB.setBounds(1400,822,232,66);
        seB.setFocusable(false);
        seB.setBackground(Color.black);
        seB.setBorder(BorderFactory.createEtchedBorder());
        seB.setEnabled(true);
        seB.setIcon(ac);
        this.add(seB);
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
        if(e.getSource() == vimB) {
            int q = Integer.parseInt(((JTextField) vimQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(21)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,21)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(21, q);
                db.addToCart(email, 21, q, q*db.getCost(21));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == lizolB) {
            int q = Integer.parseInt(((JTextField) lizolQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(22)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,22)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(22, q);
                db.addToCart(email, 22, q, q*db.getCost(22));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == rinB) {
            int q = Integer.parseInt(((JTextField) rinQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(23)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,23)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(23, q);
                db.addToCart(email, 23, q, q*db.getCost(23));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == seB) {
            int q = Integer.parseInt(((JTextField) seQ.getEditor().getEditorComponent()).getText());
            if(q > db.getQuantity(24)){
                labelM.setText(" Sorry ! Stock unavailable ! ");
            }
            else if(db.getNoOfItems(email)>=10 && db.isNotPresent(email,24)){
                labelM.setText("  You can't add new Item  ");
            }
            else{
                db.consumeProduct(24, q);
                db.addToCart(email, 24, q, q*db.getCost(24));
                labelM.setText("  Item was added to cart !!  ");
            }
            panelM.setVisible(true);
        }
        if(e.getSource() == buttonC) {
            panelM.setVisible(false);
        }
    }
}
