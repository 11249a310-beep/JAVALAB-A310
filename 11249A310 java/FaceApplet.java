import javax.swing.*;
import java.awt.*;

public class FaceApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.drawOval(100, 30, 150, 180);

        // Eyes
        g.fillOval(135, 80, 15, 15);
        g.fillOval(200, 80, 15, 15);

        // Nose
        g.drawLine(175, 100, 160, 135);
        g.drawLine(160, 135, 180, 135);

        // Mouth
        g.drawArc(145, 140, 65, 35, 180, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");
        f.add(new FaceApplet());
        f.setSize(350, 280);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
