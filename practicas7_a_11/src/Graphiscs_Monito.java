import javax.swing.*;
import java.awt.*;

public class Graphiscs_Monito extends JFrame {
    public Graphiscs_Monito (){
        super("Practica");
        setSize(200,300);
        show();
    }
    public void paint(Graphics g){

        //menssage
        g.drawString("practica del monito", 10,50);
        //head
        g.drawArc(50,60,50,50,0,360);
        g.drawArc(60,70,30,30,180,180);
        g.fillOval(65,75,5,5);
        g.fillOval(80,75,5,5);
        //body
        g.drawLine(75,110,75,200);

        //arms
        g.drawLine(75,120,45,160);
        g.drawLine(75,120,105,160);
        //legs
        g.drawLine(75,200,45,240);
        g.drawLine(75,200,105,240);

    }

}
