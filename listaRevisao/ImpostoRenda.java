import java.util.Scanner;
public class ImpostoRenda {
    public static void main(String[] args) {
        double salarioAnual, imposto;
        int faixa;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Salario anual: ");
        salarioAnual = leitor.nextInt();
        System.out.print("Faixa : ");
        faixa = leitor.nextInt();

        imposto = calculaImposto(faixa, salarioAnual);

        System.out.println("Imposto a ser pago: "+ imposto);
        leitor.close();

    }   
    static double calculaImposto(int escolha, double salario)
    {
        double imposto = 0;

        switch (escolha) {
            case 1:
            imposto = salario * 0.12;
            break;        
            case 2:
            imposto = salario * 0.13;
            break;
            case 3:
            imposto = salario * 0.15;
            break;
        }
        return imposto;
    }
}
