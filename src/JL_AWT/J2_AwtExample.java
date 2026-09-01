package JL_AWT;

import java.awt.*;

public class J2_AwtExample extends Frame {
    J2_AwtExample() {
        Button b = new Button("Click Me!!");
        b.setBounds(30, 50, 80, 30);
        add(b);
        setSize(300, 300);
        setTitle("This is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        J2_AwtExample f = new J2_AwtExample();
    }
}
