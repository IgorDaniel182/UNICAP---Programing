import java.util.Scanner;
public class calculadoraSimples {
    public static void main(String[]args)
    {
        Scanner leitor = new Scanner(System.in);
        menuCalculadora();
        String operacao = leitor.nextLine();

        System.out.print("Digite o 1° número: ");
        double num1 = leitor.nextDouble();
        System.out.print("Digite o 2° número: ");
        double num2 = leitor.nextDouble();

        double resultado = calculadora(num1, num2, operacao);

        System.out.print("Resultado: "+ resultado);

        leitor.close();

    }
    public static void menuCalculadora()
    {
        System.out.print("As operações são: soma, subtracao, multiplicacao ou divisao. \nDigite a operação que deseja:");
    }
    public static double calculadora(double num1, double num2, String operacao)
    {
        double resultado = 0;
        
        switch (operacao) {
            case "soma":
                resultado = num1 + num2;
            break;       
            case "subtracao":
                resultado = num1 - num2;
            break;
            case "multiplicacao":
                resultado = num1 * num2;
            break;
            case "divisao":
                resultado = num1 / num2;
            break;       
        }
        return resultado;
    }
}
