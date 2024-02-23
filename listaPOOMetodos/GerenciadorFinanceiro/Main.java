package listaPOOMetodos.GerenciadorFinanceiro;

public class Main {
    public static void main(String[] args) {
        Transacao obj1 = new Transacao();
        obj1.descricao = "Pagamento do bolo";
        obj1.tipo = "PIX";
        obj1.valor = 10;

        obj1.exibirTransacao();
    }
}
