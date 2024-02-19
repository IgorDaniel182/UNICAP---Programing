package listaRevisaoJava;
import java.util.Scanner;
public class faixaEtaria 
{
    public static void main(String [] args)
    {   
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        FaixaEtaria(idade);
        
        leitor.close();
    }    
    public static void FaixaEtaria(int idade)
    {
        if(idade < 16)
        {
            System.out.println("Criança.");
        }
        else if( idade >= 16 && idade < 27)
        {
            System.out.print("Adolescente.");
        }
        else if(idade >= 27 && idade <60)
        {
            System.out.print("Adulto.");
        }
        else if(idade >= 60 && idade < 120)
        {
            System.out.print("Idoso");
        }
        else
        {
            System.out.print("Criatura não indentificada. :o");
        }
    }
}
