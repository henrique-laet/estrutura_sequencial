package execicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main_Terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.println("Base do retagulo: ");
        base = sc.nextDouble();

        System.out.println("Altura do retagulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        System.out.printf("AREA = %.4f%n", area);

        perimetro = 2*(base + altura);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);

        diagonal = Math.sqrt(base * base + altura * altura);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

    }
}
