package listaPOOMetodos.ControleEstoque;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque obj1 = new ProdutoEstoque();

        obj1.nome = "Sazon";
        obj1.precoUnitario = 7.80;
        obj1.quantidade = 4;

        obj1.exibirProduto();

        obj1.atualizaPreco(5.40);
        obj1.removerEstoque(3);
        obj1.adicionarEstoque(1);
        obj1.exibirProduto();
    }
}
