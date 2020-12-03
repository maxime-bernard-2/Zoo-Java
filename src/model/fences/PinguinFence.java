package model.fences;

import model.animals.Pinguin;
import model.animals.model.Animal;


/**
 * Classe publique PinguinFence
 *
 */

public class PinguinFence extends Fence {

    //Attributes
    private int cleanliness;
    private int depth;
    private final int initialDepth;
    private int salinity;
    private final int height;
    private boolean roofState;


    //Constructor


    public PinguinFence(String name, double area, int maxAnimals, int depth, int salinity, int height) {
        super(name, area, maxAnimals);
        this.depth = depth;
        this.initialDepth = depth;
        this.salinity = salinity;
        this.height = height;
    }

    /**
     * Methode <strong>addAnimal()</strong> permet d'ajouter des pingouins dans l'enclos
     */
    @Override
    public void addAnimal(Animal animal) throws Exception {
        if (animal instanceof Pinguin) {
            super.addAnimal(animal);
        }
    }


    /**
     * Methode <strong>clean() </strong> permet de nettoyer l'enclos des pingouins
     */
    @Override
    public void clean() {
        this.setCleanliness(1);
        this.salinity = 5;
        this.depth = this.initialDepth;
        setRoofState(true);
    }

    //Getters and Setters

    @Override
    public int getCleanliness() {
        return cleanliness;
    }

    @Override
    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getInitialDepth() {
        return initialDepth;
    }

    public int getSalinity() {
        return salinity;
    }

    public void setSalinity(int salinity) {
        this.salinity = salinity;
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
