import javax.swing.*;
import java.awt.*;

public class VisorImagen extends JFrame {
    private JScrollPane panel;
    private Pantalla pantalla;

    public VisorImagen(String archivo){

        super("visor Imagen");
        Image img = Toolkit.getDefaultToolkit().getImage(archivo);
        pantalla = new Pantalla(img);
        panel = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
                ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        getContentPane().add(panel);
        panel.setViewportView(pantalla);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,300);
        show();

    }

    public static void main(String[] args) {
        String url = "C:\\Users\\angel\\Documents\\6M\\Imagen_2D_3D\\P1\\Practicas_de_7a11\\Practica11\\Visor_de_imagen\\imagenes\\imagen.jpg";
       new VisorImagen(url);
    }
}
