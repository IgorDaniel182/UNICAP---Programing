package listaPOOMetodos.GerenciadorFinanceiro;
import java.util.ArrayList;
import java.util.Scanner;

public class Transacao {
    String tipo;
    double valor;
    String descricao;

    ArrayList<Transacao> historico = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);
    
    void registrarTransacao(Transacao transacao)
    {
        historico.add(transacao);
    }
    
    void exibirHistorico()
    {
        for(Transacao transacao : historico) {
            transacao.exibirTransacao();
            System.out.println();
        }
    }
    
    double calcularSaldo()
    {
        double saldo = 0;
        for(Transacao transacao : historico) {
            saldo += transacao.tipo.equals("receita") ? transacao.valor : -transacao.valor;
        }
        return saldo;
    }
    void exibirTransacao()
    {
        System.out.println("DESCRIÇÃO: "+ descricao + "\nVALOR: " + valor + "\nTIPO TRANSAÇÃO: " + tipo);
    }
}
