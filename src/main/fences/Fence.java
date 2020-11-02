package main.fences;

import main.animals.model.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Fence {

    private String name;
    private final double area;
    private final int maxAnimals;
    private ArrayList<Animal> animals;
    private int cleanliness;


    public Fence(String name, double area, int maxAnimals) {
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.animals = new ArrayList<Animal>(maxAnimals);
        this.cleanliness = 1;
    }

    @Override
    public String toString() {
        return "Fence{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", maxAnimals=" + maxAnimals +
                ", animals=" + animals +
                ", cleanliness=" + cleanliness +
                '}';
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void addAnimal(Animal animal) {
        if (animals.size() != maxAnimals) {
            if (!animals.isEmpty()) {
                if (animal.getClass() == animals.get(0).getClass()) {
                    animals.add(animal);
                }
            } else {
                animals.add(animal);
            }
        }
    }

    public void feed() {
        for (Animal animal: animals) {
            animal.eat();
        }
    }

    public void clean() {
        this.cleanliness = 1;
    }


    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }
}
