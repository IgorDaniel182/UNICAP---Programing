import java.util.Scanner;
public class classificaTriangulo {
    public static void main(String [] args)
    {
        Scanner leitor = new Scanner(System.in);

        double a,b,c;

        System.out.print("Digite o valor de tamanho para A: ");
        a = leitor.nextDouble();
        System.out.print("Digite o valor de tamanho para B: ");
        b = leitor.nextDouble();
        System.out.print("Digite o valor de tamanho para C: ");
        c = leitor.nextDouble();

        VerificaERetornaTriangulo(a,b,c);

        leitor.close();


    }
    public static void VerificaERetornaTriangulo(double a, double b, double c)
    {
        if(a + b > c && a + c > b && b + c > a)
        {
            if(a == b && a == c && b == c)
            {
                System.out.print("Equilátero, todos os lados possuem a mesma medida.");
            }
            else if(a == b || b == c || c == a)
            {
                System.out.print("Isóceles, dois lados possuem a mesma medida.");
            }
            else //Poderia colocar a condição != para comparar se os lados são diferentes, mas acredito q se n passar
                //pelas outras condições, vai ser Escaleno.
            {
                System.out.print("Escaleno, todos os lados possuem medidas diferentes.");
            }
        }
        else
        {
            System.out.print("Não é um triângulo.");
        }
    }
}
