package listaPOOMetodos.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente obj1 = new ContaCorrente();
        ContaCorrente obj2 = new ContaCorrente();

        obj1.nomeTitular = "igor";
        obj1.numeroConta = "0123-12321";
        obj1.saldo = 1000;
        
        obj2.nomeTitular = "Lara";
        obj2.numeroConta = "0222-33321";
        obj2.saldo = 500;

        obj1.exibirSaldo();
        obj1.transferir(obj2, 1000);
        obj2.exibirSaldo();
        obj1.exibirSaldo();

    }
}
