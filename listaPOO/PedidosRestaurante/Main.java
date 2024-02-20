package listaPOO.PedidosRestaurante;

public class Main {
    public static void main(String[] args) {
        Pedidos obj1 = new Pedidos();
        Pedidos obj2 = new Pedidos();
        Pedidos obj3 = new Pedidos();
        
        obj1.descricao = "Coxinha de frango";
        obj1.numeroPedido = 12320;
        obj1.valorTotal = 12.00;
        
        obj2.descricao = "Pastel de frango";
        obj2.numeroPedido = 12362;
        obj2.valorTotal = 12.00;

        obj3.descricao = "Coxinha de charque";
        obj3.numeroPedido = 12232;
        obj3.valorTotal = 14.00;

        System.out.print(obj1.descricao + " - " + obj1.numeroPedido + " - " + obj1.valorTotal + "\n");
        System.out.print(obj2.descricao + " - " + obj2.numeroPedido + " - " + obj2.valorTotal + "\n");
        System.out.print(obj3.descricao + " - " + obj3.numeroPedido + " - " + obj3.valorTotal);
    }
}
