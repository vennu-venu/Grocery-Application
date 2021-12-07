package com.company;

import javax.swing.*;

public class StartPage extends JFrame {
    StartPage() {
        this.setTitle("Online Grocery Application");
        ImageIcon icn = new ImageIcon("src/images/logo.png");
        this.setIconImage(icn.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1920,1080);
        this.setVisible(true);

        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("src/images/start.png");
        label.setIcon(img);

        this.add(label);
        this.pack();
    }
}
