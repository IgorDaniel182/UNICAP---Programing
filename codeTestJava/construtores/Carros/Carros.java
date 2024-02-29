package codeTestJava.construtores.Carros;

public class Carros {
    String marca;
    int ano;
    double kilometragem;

     Carros(String marca, int ano, double kilometragem)
    {
        this.marca = marca;
        this.kilometragem = kilometragem;
        this.ano = ano;
    }
    void Demonstracao()
    {
        System.out.println("Marca: " + this.marca + " Ano: "+ this.ano + " Kilometragem: " + this.kilometragem);
    }
}
