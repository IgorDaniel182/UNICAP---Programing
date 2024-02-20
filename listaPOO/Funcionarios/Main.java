package listaPOO.Funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionarios obj1 = new Funcionarios();
        Funcionarios obj2 = new Funcionarios();
        Funcionarios obj3 = new Funcionarios();

        obj1.departamento = "Limpeza";
        obj1.nome = "Claudio";
        obj1.salario = 2320.00;
        
        obj2.departamento = "Adiministração";
        obj2.nome = "Fabio";
        obj2.salario = 2420.00;

        obj3.departamento = "Financeiro";
        obj3.nome = "Ana";
        obj3.salario = 2720.00;

        System.out.print(obj1.departamento + " - " + obj1.nome + " - " + obj1.salario + "\n");
        System.out.print(obj2.departamento + " - " + obj2.nome + " - " + obj2.salario + "\n");
        System.out.print(obj3.departamento + " - " + obj3.nome + " - " + obj3.salario);

    }
}
