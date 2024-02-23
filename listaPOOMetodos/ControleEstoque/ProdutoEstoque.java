package listaPOOMetodos.ControleEstoque;

public class ProdutoEstoque {
    String nome;
    int quantidade;
    double precoUnitario;

    public void adicionarEstoque(int quantidadePlus)
    {
        quantidade += quantidadePlus;
    }
    public void removerEstoque(int quantidadeMinus)
    {
        if(quantidade >= quantidadeMinus)
        {
            quantidade -= quantidadeMinus;
        }
    }
    public void atualizaPreco(double novoPreco)
    {
        precoUnitario = novoPreco;
    }
    public void exibirProduto()
    {
        System.out.println(nome + " - Estoque: " + quantidade + " - Preço: R$" + precoUnitario);
    }
}
