package listaRevisaoJava;
import java.util.Scanner;
public class comparaNumeros
{
    public static void main(String[]args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o 1° número: ");
        double num1 = leitor.nextDouble();
        System.out.print("Digite o 2° número: "); 
        double num2 = leitor.nextDouble();

        String resposta = comparaNumerosMaiorMenorIgual(num1,num2);

        System.out.print(resposta);
        leitor.close();

    }
    public static String comparaNumerosMaiorMenorIgual(double num1, double num2)
    {
        String resposta;
        if(num1 > num2)
        {
            resposta = "Maior: " + num1 + "Menor: " + num2;
        }
        else if(num2 > num1)
        {
            resposta = "Maior: " + num2 + "Menor: " + num1;
        }
        else
        {
            resposta = num1 + " é igual a " + num2;
        }
        return resposta;
    }
}