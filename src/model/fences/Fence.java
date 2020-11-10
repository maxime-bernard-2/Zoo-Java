package model.fences;

import model.animals.model.Animal;

import java.util.ArrayList;

/**
 * Classe publique Fence
 *
 */
public class Fence {

	//Attributes
    private String name;
    private final double area;
    private final int maxAnimals;
    private ArrayList<Animal> animals;
    private int cleanliness;


    //Constructor
    public Fence(String name, double area, int maxAnimals) {
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.animals = new ArrayList<Animal>(maxAnimals);
        this.cleanliness = 1;
    }

    /**
     * Methode <strong>toString()</strong> permet d'afficher les caractéristiques d'un enclos
     */
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

    /**
     * Methode <strong>removeAnimal()</strong> permet de retirer des animaux
     * @param animal
     */
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    /**
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux
     * @param animal
     */
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

    /**
     * Methode <strong>feed()</strong> permet de nourrir les animaux
     */
    public void feed() {
        for (Animal animal: animals) {
            animal.eat();
        }
    }

    /**
     * Methode <strong>clean()</strong> permet de donner la possibilité à un enclos d'être entretenu lorsqu'il est sale et vide
     */
    public void clean() {
        this.cleanliness = 1;
    }


    //Getters and Setters
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
