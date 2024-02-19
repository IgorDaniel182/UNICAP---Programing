
import java.util.Scanner;
public class conversor
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 

        System.out.print("Digite a temperatura em Celsius: ");
        
        double celsius = leitor.nextDouble();
        double fahrenheit;

        fahrenheit = Conversor(celsius);

        System.out.println("Transformado de Celsius em Fahrenheit: " + fahrenheit);
        leitor.close();


	}
    public static double Conversor(double celsius){
        double fahrenheit;
        fahrenheit = celsius * (9/5) + 32;
        
        return fahrenheit;
    }
}

//Done
