package com.company;

class MultiThreading extends Thread {
    public void run() {
        try {
            MainPage mp = new MainPage();
            StartPage sp = new StartPage();
            Thread.sleep(2000);
            mp.setVisible(true);
            sp.dispose();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {

    public static void main(String[] args){
        MultiThreading t = new MultiThreading();
        t.start();

	    // write your code here
    }
}
