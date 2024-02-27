package codeTestJava.construtores.Carros;

public class Main {
    public static void main(String[] args) {
        Carros obj1 = new Carros("Fiat", 2020, 0);
        Carros obj2 = new Carros("Renault", 2022, 1242);
        Carros obj3 = new Carros("Gol", 2021, 102.032);

        obj1.Demonstracao();
        obj2.Demonstracao();
        obj3.Demonstracao();
    }
}
