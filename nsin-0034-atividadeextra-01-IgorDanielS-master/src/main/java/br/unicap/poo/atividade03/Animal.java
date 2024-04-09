package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Animal {
    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String>abilities;

    public Animal(int id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    
    String sound()
    {
        return "sound";
    }

    
    String performAbility(String ability) {
        for (String a : abilities) {
            if (a.equals(ability)) {
                return name + " can " + ability;
            }
        }
        return name + " can't " + ability;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }   
}
