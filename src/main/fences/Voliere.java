package main.fences;

import main.animals.Pinguin;
import main.animals.model.Animal;
import main.animals.model.Bird;

/**
 * Classe publique Voliere qui étend la classe Fence
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
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux dans la volière
     */
    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Bird) {
            super.addAnimal(animal);
        }
    }

    /**
     * Methode <strong>clean()</strong> permet de nettoyer la volière
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
