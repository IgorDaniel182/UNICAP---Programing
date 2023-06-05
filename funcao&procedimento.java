import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		double acubo, vcubo,altura, largura, comprimento, vparalelepipedo,raio, vesfera, pi,vcilindro;
		int opcao;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		
		do{
		    System.out.println("");
		    menu();
		    System.out.print("Digite a opção: ");
		    opcao = scanner.nextInt();
		    System.out.println("");
		    
		    switch(opcao){
		        case 1: 
		            System.out.print("Digite a aresta do cubo: ");
	                acubo = scanner.nextDouble();
	                vcubo = volumeCubo(acubo);
	                System.out.print("O volume do cubo de aresta " + acubo + " é " + vcubo);
	                break;
    		    
    		    case 2:
    		        System.out.print("Digite a altura do paralelepipedo: ");
	                altura = scanner.nextDouble();
	                System.out.print("Digite a largura do paralelepipedo: ");
	                largura = scanner.nextDouble();
	                System.out.print("Digite a comprimento do paralelepipedo: ");
	                comprimento = scanner.nextDouble();
	                
	                vparalelepipedo = volumeParalelepipedo(altura, largura, comprimento);
	                System.out.print("O volume do Paralelepípedo de altura:  " + altura  + ", largura  " + largura + " e comprimento " + comprimento + " é  "+ vparalelepipedo);
    		        
    		        break;
    		        
    		    case 3:
    		        System.out.print("Digite o raio da esfera: ");
    		        raio = scanner.nextDouble();
    		        System.out.print("Digite o valor para PI: ");
    		        pi = scanner.nextDouble();
    		        vesfera = volumeEsfera(raio,pi);
    		        System.out.print("O volume da sua esfera com " + raio + " de raio e com o valor de pi sendo " + pi + " é " + vesfera);
    		        
    		        break;
    		        
    		    case 4:
    		        System.out.print("Digite a altura do cilindro: ");
    		        altura = scanner.nextDouble();
    		        System.out.print("Digite o raio da base do cilindro: ");
    		        raio = scanner.nextDouble();
    		        System.out.print("Digite o valor para PI: ");
    		        pi = scanner.nextDouble();
    		        
    		        vcilindro = volumeCilindro(altura, raio,pi);
    		        System.out.print("O volume do cilindro de "+ altura + " altura, "+ raio + " raio e "+ pi + " sendo o valor para PI, é: " + vcilindro);
    		        break;
    		        
    		    case 0:
    		            System.out.print("Fim do programa! ");
    		        break;
		    }
		    System.out.println("");
		    
		}while(opcao != 0 );
		    
		
		
		
	    
	}
	
	public static double volumeCubo(double acubo){
	    return(acubo * acubo * acubo);
	}
	
	public static double volumeParalelepipedo(double altura, double largura, double comprimento){
	    return(altura*largura*comprimento);
	}
	public static double volumeEsfera(double raioesfera, double pi){
	    return((4/3) * pi * (raioesfera*raioesfera*raioesfera));
	}
	public static double volumeCilindro(double altura, double raio , double pi){
	    return(altura*(raio*raio)*pi);
	}
	
	public static void menu(){
	    System.out.println("Opções: ");
	     System.out.println("(1) - Calcular o volume do Cubo.");
	     System.out.println("(2) - Calcular o volume do Paralelepípedo. ");
	     System.out.println("(3) - Calcular o volume da Esfera. ");
	     System.out.println("(4) - Calcular o volume do Cilindro. ");
	     System.out.println("(0) - Sair ");
	    
	}
	
}
