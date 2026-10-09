import java.awt.*;
import javax.swing.*;

public class FlowDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Flow Layout");

        f.setLayout(new FlowLayout());

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));
        f.add(new JButton("Four"));
        f.add(new JButton("Five"));

        f.setSize(350, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
