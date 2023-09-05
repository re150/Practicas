import javax.swing.*;
import java.awt.*;

public class Espiral_arquimides  extends  JPanel {
     double theta1 = 0;
     double theta2 = Math.PI;
     Color colorm = new Color(120, 20, 150);
     Color colorR = new Color(116, 4, 7);
     int currentStep = 0;
     int maxSteps = 200;

    public Espiral_arquimides() {
        setPreferredSize(new Dimension(500, 500));
        setDoubleBuffered(true);
    }

    public void setCurrentStep(int step) {
        currentStep = step;
    }

    public void paint(Graphics g) {
        super.paint(g);
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        double xAnterior1 = centroX;
        double yAnterior1 = centroY;
        double xAnterior2 = centroX;
        double yAnterior2 = centroY;

        for (int i = 0; i < currentStep; i++) {
            double r1 = Math.sqrt(i) * 10;
            double r2 = Math.sqrt(i) * 10;

            double x1 = centroX + r1 * Math.cos(theta1);
            double y1 = centroY + r1 * Math.sin(theta1);

            double x2 = centroX + r2 * Math.cos(theta2);
            double y2 = centroY + r2 * Math.sin(theta2);

            g.setColor(colorR);
            g.drawLine((int) xAnterior1, (int) yAnterior1, (int) x1, (int) y1);

            g.setColor(colorm);
            g.drawLine((int) xAnterior2, (int) yAnterior2, (int) x2, (int) y2);

            xAnterior1 = x1;
            yAnterior1 = y1;

            xAnterior2 = x2;
            yAnterior2 = y2;

            theta1 += 0.02;
            theta2 += 0.02;
        }

        if (currentStep < maxSteps) {
            currentStep++;
            repaint(); //  pintar para el siguiente paso
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Espiral_arquimides panel = new Espiral_arquimides();
            JFrame frame = new JFrame("Espiral de Arquímedes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel, BorderLayout.CENTER);
            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            Graphics_Thread spiralThread = new Graphics_Thread(panel, 800, 80);
            spiralThread.start();
        });
    }
}
