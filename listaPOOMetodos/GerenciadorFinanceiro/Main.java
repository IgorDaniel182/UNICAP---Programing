package listaPOOMetodos.GerenciadorFinanceiro;

public class Main {
    public static void main(String[] args) {
        Transacao gerenciador = new Transacao();
        
        Transacao transacao1 = new Transacao();
        transacao1.descricao = "Salário";
        transacao1.valor = 2000.0;
        transacao1.tipo = "receita";
        
        Transacao transacao2 = new Transacao();
        transacao2.descricao = "Aluguel";
        transacao2.valor = 800.0;
        transacao2.tipo = "despesa";
        
        gerenciador.registrarTransacao(transacao1);
        gerenciador.registrarTransacao(transacao2);
        
        gerenciador.exibirHistorico();
        
        double saldoFinal = gerenciador.calcularSaldo();
        System.out.println("Saldo final: " + saldoFinal);
    }
}
