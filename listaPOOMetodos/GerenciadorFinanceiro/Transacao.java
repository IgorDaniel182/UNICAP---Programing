package listaPOOMetodos.GerenciadorFinanceiro;
import java.util.Scanner;

public class Transacao {
    String descricao;
    double valor;
    String tipo;
    Scanner leitor = new Scanner(System.in);
    
    void registrarTransacao()
    {
        System.out.println("Descricao: ");
        descricao = leitor.nextLine();
        System.out.println("Tipo de transação: ");
        tipo = leitor.nextLine();
        System.out.println("Valor: ");
        valor = leitor.nextDouble();

    }
    void alterarDescricao(String novaDescricao)
    {
        descricao = novaDescricao;
    }
    void exibirTransacao()
    {
        System.out.println("DESCRIÇÃO: "+ descricao + "\nVALOR: " + valor + "\nTIPO TRANSAÇÃO: " + tipo);
    }
    // void calcularSaldo(ArrayList<Transacao>transacoes)
    // {

    // }

}
