import javax.swing.*;

public class Practica_JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Practica ventana");
        JPanel panel = new JPanel();

        frame.getContentPane().add(panel, "Center");
        frame.setDefaultCloseOperation(3);

        frame.setSize(400, 500);
        frame.setVisible(true);

    }
}
