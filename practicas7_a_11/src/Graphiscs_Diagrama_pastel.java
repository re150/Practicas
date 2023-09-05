import javax.swing.*;
import java.awt.*;

public class Graphiscs_Diagrama_pastel extends JFrame {
   private int total ;
   private int []datos;
    public Graphiscs_Diagrama_pastel (int total, int[] datos){
        super("Diagrama de pastel");
        setSize(300,300);
        show();
        setResizable(false);
        this.datos = datos;
        this.total = total;
    }

    public Color  getRamdocolor(){

        int color1 = (int) (Math.random()* 256);
        int color2 = (int) (Math.random()* 256);
        int color3 = (int) (Math.random()* 256);

        return new Color(color1,color2,color3);
    }

    public void paint(Graphics g){
            int x = getWidth() /2;
            int y = getHeight() /2;
            int radio = 100;
            int angulo = 0;

            g.drawString("Grafica de pastel",120,50);
            for (int i= 0; i < datos.length; i++){

                int arc = (int)((double) datos[i] /total * 360);
                g.setColor(getRamdocolor());
                g.fillArc(x-radio, y-radio,radio * 2 ,radio * 2,angulo,arc);

                int labelAngle = angulo + arc / 2;
                double labelRadians = Math.toRadians(labelAngle);
                int labelX = (int) (x + (radio * 0.75 * Math.cos(labelRadians)));
                int labelY = (int) (y - (radio * 0.75 * Math.sin(labelRadians)));

                // Mostrar porcentaje dentro de la gráfica
                int porcentaje = (int) ((double) datos[i] / total * 100);
                g.setColor(Color.white);
                g.drawString(porcentaje + "%", labelX, labelY);
                angulo += arc;
            }


    }
}
