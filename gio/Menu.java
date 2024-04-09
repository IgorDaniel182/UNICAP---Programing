import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoologico = new Zoo();
        boolean continuar = true;


        while (continuar) {
            System.out.println("\nMenu de Opções do Zoologico"); 
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastre um animal");
            System.out.println("2 - Visualize a lista de animais cadastrados");
            System.out.println("3- Busque o animal de acordo com a espécie");
            System.out.println("4- Sair");

            System.out.print("Opção: ");
            int opcoes = sc.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("\nCadastre o animal:");
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Especie: ");
                    String   especie = sc.next();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
    
                    Animal a1 = new Animal(nome, especie, idade);
                    zoologico.adicionarAnimal(a1);
                    break;
                case 2:
                    System.out.println("\nVisualize a lista de animais cadastrados");
                    zoologico.listarAnimais();
                    break;
                case 3:
                    System.out.print("\nBusque o animal de acordo com a sua espécie:");
                    especie = sc.next();
                    zoologico.buscarAnimal(especie);
                    break;

                case 4:
                    continuar = false;
                    break;
        
            }    
        }
    }
}