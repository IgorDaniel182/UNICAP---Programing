package br.unicap.poo.atividade03;

public class Bird extends Animal {
    public Bird(int id, String name, int age, double weight)
    {
        super(id, name, age, weight);
    }

    @Override
    String sound()
    {
        return "piu";
    }
}
