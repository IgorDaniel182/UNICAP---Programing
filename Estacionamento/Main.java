package Estacionamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String repetir;
        Scanner input = new Scanner(System.in);  
        String modelo;
        String marca;
        String placa;
        int anoLanca;
        String cor;
        Carro c1 = null;
        CadastroCarro cc1 = new CadastroCarro();

        do{
            menu();
            int escolha = input.nextInt();
            input.nextLine();
            
            switch (escolha) {
                case 1:
                    System.out.print("Modelo: ");
                    modelo = input.nextLine();
                    System.out.print("Marca: ");
                    marca = input.nextLine();
                    System.out.print("Placa: ");
                    placa = input.nextLine();
                    System.out.print("Ano de lançamento: ");
                    anoLanca = input.nextInt();
                    System.out.print("Cor: ");
                    cor = input.nextLine();
                    input.nextLine();

                    c1 = new Carro(modelo, marca, placa, anoLanca, cor);
                    break;
            
                case 2:
                    String adicionaUltimo;
                    System.out.print("Você deseja inserir o ultimo carro adicionado? (sim/nao)");
                    adicionaUltimo = input.nextLine();
                    if (adicionaUltimo.equals("sim")) {
                        cc1.inserir(c1);
                    }
                    else{
                        System.out.println("Carro não adicionado!");
                    }
                    break;
                case 3:
                    cc1.listarCarros();
                    break;

                case 4:
                    System.out.println("Digite a placa do carro que você deseja remover: ");
                    placa = input.nextLine();
                    cc1.removerCarros(placa);
                    break;
                case 5:
                    System.out.println("Digite a placa do carro que você deseja consultar: ");
                    placa = input.nextLine();
                    cc1.consultarCarro(placa);
                    break;
            }
            System.out.println("Você deseja realizar outra operação? (sim/nao) ");
            repetir = input.nextLine();
        } while (repetir.equals("sim"));
    }

    public static void menu() {
        System.out.print("\nOpções de sistema: "
        + "\n 1- Criar carro" 
        + "\n 2- Cadastrar carro" 
        + "\n 3- Listar carros cadastrados" 
        + "\n 4- Remover carro cadastrado "
        + "\n 5- Consultar carro cadastrado"
        + "\n\n Escolha: ");
    }
}
