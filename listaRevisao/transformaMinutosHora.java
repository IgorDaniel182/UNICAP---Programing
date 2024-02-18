import java.util.Scanner;
public class transformaMinutosHora 
{
    public static void main(String[]args)
    {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite quantos minutos você deseja transformar em horas?");
        int minutos = leitor.nextInt();

        int horas = minutos / 60;
        int newMinutos = minutos % 60;

        System.out.print(horas + " hora(s) e " + newMinutos + " minutos");
    }    
}
