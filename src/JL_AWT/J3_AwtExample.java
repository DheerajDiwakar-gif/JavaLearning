package JL_AWT;

import java.awt.*;
class J3_AwtExample
{
    J3_AwtExample()
    {
        Frame f = new Frame();  // creating a Frame
        Label l = new Label("Employee id:");       // creating a Label
        Button b = new Button("Submit");    // creating a Button
        TextField t = new TextField("My name is Dheeraj");  // creating a TextField
        l.setBounds(20, 50, 80, 30);
        t.setBounds(20, 100, 200, 30);
        b.setBounds(100, 150, 80, 30);
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(400,300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String []args)
    {
        J3_AwtExample aw= new J3_AwtExample();
    }
}
