import java.util.Scanner;
import java.math.MathContext;
public class imcCalculator {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);

        double altura, peso;
        System.out.print("Altura: ");
        altura = leitor.nextDouble();
        System.out.print("Peso: ");
        peso = leitor.nextDouble();

        double imc = imc(altura,peso);

        System.out.println("O seu IMC é: "+imc);
    }
    public static double imc(double altura, double peso)
    {
        double imc;

        imc = peso / Math.pow(altura, 2);

        return imc;
    }
}
