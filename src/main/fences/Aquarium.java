package main.fences;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Bird;

public class Aquarium extends Fence {


    private int depth;
    private final int initialDepth;
    private int salinity;

    public Aquarium(String name, double area, int depth, int salinity, int maxAnimals) {
        super(name, area, maxAnimals);
        this.depth = depth;
        this.initialDepth = depth;
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
        this.setCleanliness(1);
        this.salinity = 5;
        this.depth = this.initialDepth;
    }


    public int getDepth() {
        return depth;
    }

    public int getSalinity() {
        return salinity;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setSalinity(int salinity) {
        this.salinity = salinity;
    }
}
