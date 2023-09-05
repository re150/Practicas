import javax.swing.*;
import java.util.Scanner;

public class Diagrama_de_pastel {
    public static void main(String[] args) {
        int []datos;
        int size = 0,total = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el numero de datos de la grafica");
        size = s.nextInt();
        datos = new int [size];

        System.out.println("ingresa  las cantidades de la grafica");
        for (int i = 0; i < size ; i++){
            datos[i] = s.nextInt();
            total = total +datos[i];
        }
        Graphiscs_Diagrama_pastel patel = new Graphiscs_Diagrama_pastel(total,datos);

        patel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
