package model.fences;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Bird;
import model.animals.model.Mammal;

import java.util.Arrays;

/**
 * Classe publique Voliere qui etend la classe Fence
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
     * Methode <strong>addAnimal()</strong> permet d'ajouter des animaux dans la voliere
     */
    @Override
    public void addAnimal(Animal animal) throws Exception {
        if (this.getAnimals().size() < this.getMaxAnimals()) {
            if (!this.getAnimals().isEmpty()) {
                if (animal.getClass() == this.getAnimals().get(0).getClass()) {

                    if(animal instanceof Bird) {
                        System.out.println(Arrays.toString(animal.getClass().getAnnotatedInterfaces()));
                        this.getAnimals().add(animal);
                    } else {
                        throw new Exception("L'animal que vous tentez d'ajouter a cet enclos " +
                                "n'est pas compatible avec celui-ci !");
                    }

                } else {
                    throw new Exception("L'animal que vous tentez d'ajouter a cet enclos " +
                            "n'est pas compatible avec les animaux deja presents: " +
                            this.getAnimals().get(0).getClass().getSimpleName() );
                }
            } else {
                if(animal instanceof Bird) {
                    System.out.println(Arrays.toString(animal.getClass().getAnnotatedInterfaces()));
                    this.getAnimals().add(animal);
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
     * Methode <strong>clean()</strong> permet de nettoyer la voliere
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
