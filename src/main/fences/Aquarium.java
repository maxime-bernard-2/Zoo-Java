package main.fences;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Bird;

public class Aquarium extends Fence {

    private final int depth;
    private int salinity;

    public Aquarium(String name, double area, int depth, int salinity, int maxAnimals) {
        super(name, area, maxAnimals);
        this.depth = depth;
        this.salinity = salinity;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Aquatic) {
            super.addAnimal(animal);
        }
    }

    @Override
    public void clean() {
        super.clean();
        this.salinity = 5;
    }


    public int getDepth() {
        return depth;
    }

    public int getSalinity() {
        return salinity;
    }
}
