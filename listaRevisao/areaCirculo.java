import java.util.Scanner;
import java.math.MathContext;
public class areaCirculo {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = leitor.nextDouble();
        double area = areaCirculo(raio);

        System.out.print("A área do circulo com raio "+ raio + " é de " + area);

    }
    public static double areaCirculo(double raio)
    {
        double pi = Math.PI;
        double area = pi * Math.pow(raio, 2);
        

        return area;
    }
}
