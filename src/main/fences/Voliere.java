package main.fences;

import main.animals.Pinguin;
import main.animals.model.Animal;
import main.animals.model.Bird;

public class Voliere extends Fence {


    public Voliere(String name, double area, int maxAnimals) {
        super(name, area, maxAnimals);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Bird) {
            super.addAnimal(animal);
        }

    }

}
