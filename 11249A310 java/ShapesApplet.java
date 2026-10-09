import javax.swing.*;
import java.awt.*;

public class ShapesApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.drawRect(30, 40, 100, 60);

        // Circle
        g.drawOval(160, 40, 60, 60);

        // Line
        g.drawLine(30, 140, 220, 140);

        // Triangle
        int x[] = {280, 240, 320};
        int y[] = {40, 110, 110};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometric Shapes");
        f.add(new ShapesApplet());
        f.setSize(400, 220);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
