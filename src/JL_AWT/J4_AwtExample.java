package JL_AWT;

import java.awt.*;

class J4_AwtExample {
    J4_AwtExample() {
        // Creating a Frame
        Frame f = new Frame();
        // Creating Labels
        Label l1 = new Label("Enter Your Name");
        Label l2 = new Label("Enter Your Password");
        // Creating TextFields
        TextField t1 = new TextField(30);
        TextField t2 = new TextField(30);
        // Creating Button
        Button b = new Button("Submit");
        // Setting position and size
        l1.setBounds(80, 80, 150, 30);
        t1.setBounds(250, 80, 200, 30);
        l2.setBounds(80, 140, 150, 30);
        t2.setBounds(250, 140, 200, 30);
        b.setBounds(250, 200, 100, 40);
        // Adding components to Frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        // Frame properties
        f.setSize(600, 500);
        f.setTitle("Employee Info");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        J4_AwtExample aw = new J4_AwtExample();
    }
}