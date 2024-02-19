package listaRevisaoJava;
import java.util.Scanner;
public class maiorDosTres {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o 1° número: ");
        double num1 = leitor.nextDouble();
        System.out.print("Digite o 2° número: ");
        double num2 = leitor.nextDouble();
        System.out.print("Digite o 3° número: ");
        double num3 = leitor.nextDouble();

//Teria como fazer utilizando a biblioteca math, mas a lista pede para utilizar condicionais.

        MaiorNumero(num1,num2,num3);

        leitor.close();
    }
    public static void MaiorNumero(double n1, double n2, double n3)
    {
        if(n1 > n2 && n1 > n3 )
        {
            System.out.print("O maior número é o " + n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.print("O maior número é o " + n2);
        }
        else if(n3>n1 && n3>n2)
        {
            System.out.print("O maior número é o " + n3);
        }
        else if(n1 == n2 && n1 == n3)
        {
            System.out.print("Os números são iguais. ");
        }
        else
        {
            System.out.print("Erro");
        }
    }
}
