package model;

import model.animals.model.Animal;
import model.fences.Aquarium;
import model.fences.Fence;
import model.fences.Voliere;

import java.util.ArrayList;

/**
 * Classe publique Zoo
 *
 */
public class Zoo {

	//Attributes
    private String name;
    private Employee employee;
    private int maxFences;
    private ArrayList<Fence> fences;

    //Constructor
    public Zoo(String name, Employee employee, int maxFences, ArrayList<Fence> fences) {
        this.name = name;
        this.employee = employee;
        this.maxFences = maxFences;
        this.fences = fences;
    }

    /**
     * Methode <strong>howManyAnimals()</strong> permet d'afficher le nombre d'animaux pr�sents dans le zoo
     * @return compt
     */
    public int howManyAnimals() {
        int compt = 0;
        for (Fence fence: this.fences) {
            for (Animal animal: fence.getAnimals()) {
                compt++;
            }
        }
        return compt;
    }

    /**
     * Methode <strong>showAnyAnimal()</strong> permet d'afficher les animaux de tous les enclos
     */
    public String showAnyAnimal() {
        String animaux = new String("");
        for (Fence fence: this.fences) {
            for (Animal animal: fence.getAnimals()) {
                animaux += animal.toString();
            }
        }

        return animaux;
    }

    /**
     * Methode <strong>randomChangeAnimal()</strong> permet modifier al�atoirement l��tat de certains animaux (les rendre malades, les endormir, etc.)
     */
    public void randomChangeAnimal() {
        for (Fence fence: this.fences) {
            for (Animal animal: fence.getAnimals()) {
                // 70%
                if ((int)((Math.random() * 100)) > 30) {
                    animal.setHungry(animal.getHungry() - 10);
                }
                // 50%
                if ((int)((Math.random() * 100)) > 50) {
                    animal.toggleConciousness();
                }
                // 20%
                if ((int)((Math.random() * 100)) > 80) {
                    animal.setHealth(animal.getHealth() - 10);
                }
            }
        }
    }

    /**
     * Methode <strong>randomChangeFence()</strong> permet de modifier al�atoirement l��tat de certains enclos (leur propret�, leur salinit�, etc.)
     */
    public void randomChangeFence() {
        for (Fence fence: this.fences) {
            // 10%
            if ((int)((Math.random() * 100)) > 90) {
                if (fence.getCleanliness() < 3) {
                    fence.setCleanliness(fence.getCleanliness() + 1);
                }
            }

            if (fence instanceof Aquarium) {
                // 10%
                if ((int)((Math.random() * 100)) > 90) {
                    if (((Aquarium) fence).getDepth() > 0) {
                        ((Aquarium) fence).setDepth(((Aquarium) fence).getDepth() - 1);
                    }
                }
                // 10%
                if ((int)((Math.random() * 100)) > 90) {
                    ((Aquarium) fence).setDepth(((Aquarium) fence).getDepth() + 1);
                }
            }

            if (fence instanceof Voliere) {
                // 10%
                if ((int)((Math.random() * 100)) > 90) {
                    if (((Voliere) fence).isRoofState()) {
                        ((Voliere) fence).setRoofState(false);
                    }
                }
            }
        }
    }
}
