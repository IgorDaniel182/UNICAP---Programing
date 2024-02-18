
import java.util.Scanner;
public class conversor
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 

        System.out.print("Digite a temperatura em Celsius: ");
        
        double celsius = leitor.nextDouble();
        double fahrenheit;

        fahrenheit = conversor(celsius);

        System.out.println("Transformado de Celsius em Fahrenheit: " + fahrenheit);


	}
    public static double conversor(double celsius){
        double fahrenheit;
        fahrenheit = celsius * (9/5) + 32;
        
        return fahrenheit;
    }
}

//Done
