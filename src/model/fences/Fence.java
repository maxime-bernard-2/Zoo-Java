package model.fences;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Bird;
import model.animals.model.Mammal;

import java.util.ArrayList;
import java.util.Arrays;

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
        this.cleanliness = 0;
    }

    /**
     * Methode <strong>toString()</strong> permet d'afficher les caracteristiques d'un enclos
     */
    @Override
    public String toString() {
        return "Nom de l'enclos: " + name + "\n" +
               "Superficie de l'enclos: " + area + " m2\n" +
               "Etat de l'enclos: " + (cleanliness == 0 ? "Sale": "Propre") + "\n" +
               "Nombre max d'animaux: " + maxAnimals + "\n" +
               "Animaux: \n" + animals.toString() + "\n";

    }

    /**
     * Methode <strong>removeAnimal()</strong> permet de retirer des animaux
     * @param animal - animal
     */
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    /**
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux
     * @param animal - animal
     */
    public void addAnimal(Animal animal) throws Exception {
        if (animals.size() < maxAnimals) {
            if (!animals.isEmpty()) {
                if (animal.getClass() == animals.get(0).getClass()) {

                    if(animal instanceof Mammal && !(animal instanceof Aquatic) && !(animal instanceof Bird)) {
                        animals.add(animal);
                    } else {
                        throw new Exception("L'animal que vous tentez d'ajouter a cet enclos " +
                                            "n'est pas compatible avec celui-ci !");
                    }

                } else {
                    throw new Exception("L'animal que vous tentez d'ajouter a cet enclos " +
                                        "n'est pas compatible avec les animaux deja presents: " +
                                        animals.get(0).getClass().getSimpleName() );
                }
            } else {
                if(animal instanceof Mammal && !(animal instanceof Aquatic) && !(animal instanceof Bird)) {
                    animals.add(animal);
                } else {
                    throw new Exception("L'animal que vous tentez d'ajouter a cet enclos " +
                            "n'est pas compatible avec celui-ci !");
                }
            }
        } else {
            throw new Exception("L'enclos de destination est plein");
        }
    }

    /**
     * Methode <strong>feed()</strong> permet de nourrir les animaux
     */
    public String feed() throws Exception {
        String returnBuffer = "";
        for (Animal animal: animals) {
            returnBuffer += animal.eat() + "\n";
        }
        return  returnBuffer;
    }

    public String recover() throws Exception {
        String returnBuffer = "";
        for (Animal animal: animals) {
            returnBuffer += animal.recover() + "\n";
        }
        return  returnBuffer;
    }

    /**
     * Methode <strong>clean()</strong> permet de donner la possibilite a un enclos d'etre entretenu lorsqu'il est sale et vide
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
