package listaRevisaoJava;
import java.util.Scanner;
public class imparPar
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero para verificar se é par ou ímpar: ");
        int numero = leitor.nextInt();

        String resposta = verificaImparouPar(numero);

        System.out.print("O número é: " + resposta);
        leitor.close();

    }
    public static String verificaImparouPar(int numero)
    {
        String resposta;
        if(numero % 2 == 0)
        {
            resposta = "Par";
        }else
        {
            resposta = "Ímpar";
        }
        return resposta;
    }
}