package main.fences;

import main.animals.Pinguin;
import main.animals.model.Animal;
import main.animals.model.Bird;

public class Voliere extends Fence {

    private final int height;

    public Voliere(String name, double area, int height, int maxAnimals) {
        super(name, area, maxAnimals);
        this.height = height;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Bird) {
            super.addAnimal(animal);
        }
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Verification du toit de la cage ✔");
    }


    public int getHeight() {
        return height;
    }
}
