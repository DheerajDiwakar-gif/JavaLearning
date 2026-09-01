package JL_AWT;
import java.awt.*;
import java.awt.event.*;
// Extending Frame to create a window
    public class J1_AwtExample extends Frame {

        public J1_AwtExample() {
            // 1. Set the layout manager
            setLayout(new FlowLayout());

            // 2. Create UI components
            Label label = new Label("Hello, AWT!");
            Button button = new Button("Click Me");

            // 3. Add components to the frame
            add(label);
            add(button);

            // 4. Configure window properties
            setTitle("AWT Basic Window");
            setSize(300, 200);
            setVisible(true);

            // 5. Handle window closing event
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose(); // Closes the frame
                    System.exit(0); // Terminates the program
                }
            });
        }

        public static void main(String[] args) {
            new J1_AwtExample();
        }
    }


