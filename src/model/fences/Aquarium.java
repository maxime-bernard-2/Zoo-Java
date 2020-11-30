package model.fences;

import model.animals.model.Animal;
import model.animals.model.Aquatic;

/**
 * Classe publique Aquarium qui �tend la classe Fence
 *
 */
public class Aquarium extends Fence {

	//Attributes
    private int depth;
    private final int initialDepth;
    private int salinity;

    //Constructor
    public Aquarium(String name, double area, int depth, int salinity, int maxAnimals) {
        super(name, area, maxAnimals);
        this.depth = depth;
        this.initialDepth = depth;
        this.salinity = salinity;
    }

    /**
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux
     * @param animal
     */
    @Override
    public void addAnimal(Animal animal) throws Exception {
        if (animal instanceof Aquatic) {
            super.addAnimal(animal);
        }
    }

    /**
     * Methode <strong>clean() </strong> permet de nettoyer l'aquarium
     */
    @Override
    public void clean() {
        this.setCleanliness(1);
        this.salinity = 5;
        this.depth = this.initialDepth;
    }


    //Getters and Setters
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
