package net.scriptsource.java;

import javax.swing.*;

public class MyWindow extends JFrame{
    public MyWindow(){
        setTitle("MyWindow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(400,400);
        JPanel p = new JPanel();
        add(p);

        JTextField txtField1 = new JTextField();
        JTextArea txtArea1 = new JTextArea();
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Close");
        txtField1.setColumns(50);
        txtArea1.setColumns(50);
        txtArea1.setRows(20);
        p.add(b1);
        p.add(b2);
        p.add(txtField1);
        p.add(txtArea1);

        pack();
    }
}
