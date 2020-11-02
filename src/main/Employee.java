package main;

import main.animals.model.Animal;
import main.fences.Fence;

public class Employee {

    private String name;
    private boolean sex;
    private int age;

    public Employee(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void checkFence(Fence fence) {
        System.out.println(fence.toString());
    }

    public void cleanFence(Fence fence) {
        if (fence.getAnimals().size() == 0) {
            fence.clean();
        } else {
            System.out.println("\nNetoyage impossible: l'enclot n'est pas vide");
        }
    }

    public void feedFence(Fence fence) {
        fence.feed();
    }

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
