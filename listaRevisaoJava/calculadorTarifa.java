import java.util.Scanner;
public class calculadorTarifa
{   
    public static void main(String [] args)
    {
        Scanner leitor = new Scanner(System.in);
        double precoProduto = 1205;
        System.out.print("O valor do produto é de: R$" + precoProduto + " você deseja pagar a vista ou no cartão? (v/c)");
        String escolha = leitor.nextLine();

        Pagamento(precoProduto, escolha);
        leitor.close();
    }    
    public static void Pagamento(double precoProduto, String escolha)
    {
        switch (escolha) {
            case "c":
                precoProduto = precoProduto + (precoProduto * 0.05);
                System.out.print("O preço final do produto ficou: R$"+precoProduto);
                break;
        
            case "v":
                precoProduto = precoProduto - (precoProduto * 0.10);
                System.out.print("O preço final do produto ficou R$"+precoProduto);
                break;
        }
    }
}
