package model.fences;

import model.animals.model.Animal;
import model.animals.model.Bird;

/**
 * Classe publique Voliere qui �tend la classe Fence
 *
 */
public class Voliere extends Fence {

	//Attributes
    private final int height;
    private boolean roofState;

    //Constructor
    public Voliere(String name, double area, int height, int maxAnimals) {
        super(name, area, maxAnimals);
        this.height = height;
        this.roofState = true;
    }

    /**
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux dans la voli�re
     */
    @Override
    public void addAnimal(Animal animal) throws Exception {
        if (animal instanceof Bird) {
            super.addAnimal(animal);
        }
    }

    /**
     * Methode <strong>clean()</strong> permet de nettoyer la voli�re
     */
    @Override
    public void clean() {
        this.setCleanliness(1);
        setRoofState(true);
    }


    //Getters and Setters
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
