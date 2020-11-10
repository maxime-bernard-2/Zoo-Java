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
     * Methode <strong>checkFence()</strong> examiner un enclos (en affichant les caractéristiques de l’enclos ainsi que la liste des animaux)
     * @param fence
     */
    public void checkFence(Fence fence) {
        System.out.println(fence.toString());
    }

    /**
     * Methode <strong>cleanFence()</strong> permet de nettoyer un enclos
     * @param fence
     */
    public void cleanFence(Fence fence) {
        if (fence.getAnimals().size() == 0) {
            fence.clean();
        } else {
            System.out.println("\nNettoyage impossible: l'enclos n'est pas vide");
        }
    }

    /**
     * Methode <strong>feedFence()</strong> permet de nourrir les animaux d'un enclos
     * @param fence
     */
    public void feedFence(Fence fence) {
        fence.feed();
    }

    /**
     * Methode <strong>swapFence()</strong> permet de transférer un animal d'un enclos à un autre
     * @param fenceToLeave
     * @param fenceToGo
     * @param animal
     */
    public void swapFence(Fence fenceToLeave, Fence fenceToGo, Animal animal) {
        try {
            fenceToLeave.removeAnimal(animal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fenceToGo.addAnimal(animal);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
