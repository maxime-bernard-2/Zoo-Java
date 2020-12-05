package model.fences;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Bird;
import model.animals.model.Mammal;

/**
 * Classe publique Aquarium qui etend la classe Fence
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
     * @param animal - animal
     * @see Fence#addAnimal(Animal) 
     */
    @Override
    public void addAnimal(Animal animal) throws Exception {
        if (this.getAnimals().size() < this.getMaxAnimals()) {
            if (!this.getAnimals().isEmpty()) {
                if (animal.getClass() == this.getAnimals().get(0).getClass()) {

                    if(animal instanceof Aquatic) {
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
                if(animal instanceof Aquatic) {
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
