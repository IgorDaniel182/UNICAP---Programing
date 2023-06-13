
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i, valorM,resultado;
		Scanner scanner;
		scanner = new Scanner(System.in);
		i = 1;
		
		System.out.print("Digite de que numero você deseja ver a tabuada: ");
		valorM = scanner.nextInt();
	
	    if(valorM >= 1 && valorM <= 10){
    		   
    		    while(i <= 10){
    		     resultado = valorM * i;
    		     System.out.print(i + " X " + valorM + " = " + resultado + "\n");
    		     i++;
    		}
	    }else{
	        System.out.print("A tabuada se limita de 1 a 10! ");
	    }
	}
}
