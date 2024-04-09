package br.unicap.poo.atividade03;

public class Cat extends Animal {
    public Cat(int id, String name, int age, double weight)
    {
        super(id, name, age, weight);
    }

    @Override
    String sound()
    {
        return "meow";
    }
}
