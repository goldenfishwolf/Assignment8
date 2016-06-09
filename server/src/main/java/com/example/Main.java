package com.example;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Main extends JFrame {
    private JTextArea area;
    public Main(JTextArea a)
    {
        area = a;
        add(area);
    }

    public void settext(String s)
    {
        area.append(s);
    }


    public static void main(String[] args)
    {
        JTextArea area = new JTextArea();
        Main main = new Main(area);
        Server obj = new Server(main);
        main.setLocation(100,100);
        main.setSize(500,500);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setVisible(true);

    }
}