package br.unicap.poo.atividade03;

public class Dog extends Animal {
    public Dog(int id, String name, int age, double weight)
    {
        super(id, name, age, weight);
    }

    String sound()
    {
        return "au";
    }
}
