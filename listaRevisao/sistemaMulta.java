import java.util.Scanner;
public class sistemaMulta {
    public static void main(String [] args)
    {
        Scanner leitor = new Scanner(System.in);
        double velLimite = 70;
        
        System.out.print("Qual a velocidade capturada? ");
        double velocidade = leitor.nextDouble();

        CalculaValorMulta(velLimite, velocidade);

        leitor.close();
    }
    public static void CalculaValorMulta( double velLimite, double velocidade)
    {   
        double valorMulta = 0;
        int pontos = 0;
        if(velocidade > velLimite && velocidade <= velLimite + 20)
        {   
            valorMulta = 120;
            pontos = 2;
            System.out.print("Você irá ter que pagar R$"+valorMulta+ " e teve " + pontos + " na carteira.");
        }
        else if(velocidade > velLimite && velocidade <= velLimite + 60)
        {
            valorMulta = 240;
            pontos = 4;
            System.out.print("Você irá ter que pagar R$"+valorMulta+ " e teve " + pontos + " na carteira.");
        }
        else
        {
            valorMulta = 750;
            pontos = 10;
            System.out.print("Você irá ter que pagar R$"+valorMulta+ " e teve " + pontos + " na carteira.");
        }
    }
}
