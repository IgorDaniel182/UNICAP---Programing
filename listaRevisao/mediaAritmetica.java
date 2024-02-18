import java.util.Scanner;
public class mediaAritmetica
{
    public static void main(String []args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua 1° nota: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite sua 2° nota: ");
        double n2 = leitor.nextDouble();
        System.out.print("Digite sua 3° nota: ");
        double n3 = leitor.nextDouble();

        resultadoMedia(n1,n2,n3);

    }
    public static void resultadoMedia(double n1, double n2, double n3)
    {
        double media = (n1+n2+n3)/3;

        if(media >= 7)
        {
            System.out.print("Você foi Aprovado! Nota final: "+ media);
        }
        else
        {
            System.out.print("Você foi Reprovado. Nota final: "+ media);
        }
    }
}