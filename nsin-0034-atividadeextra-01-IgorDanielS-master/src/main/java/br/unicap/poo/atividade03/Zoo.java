package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo()
    {
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    ArrayList<Animal> listAnimals() {
        return animals;
    }

    boolean removeAnimal(long id)
    {
        for(int i = 0; i < animals.size(); i++)
        {
            if(animals.get(i).getId() == id)
            {
                animals.remove(i);
                return true;
            }
        }
        return false;
    }

    

}
