package listaPOO.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos obj1 = new Produtos();
        Produtos obj2 = new Produtos();
        Produtos obj3 = new Produtos();

        obj1.categoria = "Produto de limpeza";
        obj1.nome = "Omo";
        obj1.preco = 20.00;

        obj2.categoria = "Eletrodomestico";
        obj2.nome = "Geladeira";
        obj2.preco = 3000.00;

        obj3.categoria = "Produto de limpeza";
        obj3.nome = "Detergente";
        obj3.preco = 16.00;

        System.out.print(obj1.categoria + " - " + obj1.nome + " - " + obj1.preco + "\n");
        System.out.print(obj2.categoria + " - " + obj2.nome + " - " + obj2.preco + "\n");
        System.out.print(obj3.categoria + " - " + obj3.nome + " - " + obj3.preco);
    }
}
