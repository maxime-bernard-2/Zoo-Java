package main.fences;

import main.animals.Pinguin;
import main.animals.model.Animal;
import main.animals.model.Bird;

public class Voliere extends Fence {

    private final int height;
    private boolean roofState;

    public Voliere(String name, double area, int height, int maxAnimals) {
        super(name, area, maxAnimals);
        this.height = height;
        this.roofState = true;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Bird) {
            super.addAnimal(animal);
        }
    }

    @Override
    public void clean() {
        this.setCleanliness(1);
        setRoofState(true);
    }


    public int getHeight() {
        return height;
    }

    public boolean isRoofState() {
        return roofState;
    }

    public void setRoofState(boolean roofState) {
        this.roofState = roofState;
    }
}
