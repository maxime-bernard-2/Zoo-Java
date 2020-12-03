package model;

import model.animals.model.Animal;
import model.fences.Fence;

/**
 * Classe publique Employee
 *
 */
public class Employee {

	//Attributes
    private String name;
    private boolean sex;
    private int age;

    //Constructor
    public Employee(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Methode <strong>checkFence()</strong> examiner un enclos (en affichant les caracteristiques de l enclos ainsi que la liste des animaux)
     * @param fence - enclos
     */
    public String checkFence(Fence fence) {
        return fence.toString();
    }

    /**
     * Methode <strong>cleanFence()</strong> permet de nettoyer un enclos
     * @param fence - enclos
     * @see Fence#clean()
     */
    public void cleanFence(Fence fence) throws Exception {
        if (fence.getAnimals().size() == 0) {
            fence.clean();
        } else {
            throw new Exception("Nettoyage impossible: l'enclos n'est pas vide");
        }
    }

    /**
     * Methode <strong>feedFence()</strong> permet de nourrir les animaux d'un enclos
     * @param fence - enclos
     * @see Fence#feed()
     */
    public String feedFence(Fence fence) throws Exception {
        if (fence.getAnimals().size() > 0) {
            return fence.feed();
        } else {
            throw new Exception("Il n'y a pas d'animaux dans cet enclos.");
        }

    }

    /**
     * Methode <strong>swapFence()</strong> permet de transferer un animal d'un enclos a un autre
     * @param fenceToLeave - enleve animal
     * @param fenceToGo - ajoute animal
     * @param animal - animal
     */
    public void swapFence(Fence fenceToLeave, Fence fenceToGo, Animal animal) throws Exception {
        fenceToGo.addAnimal(animal);
        fenceToLeave.removeAnimal(animal);
    }


}
