package main;

import main.animals.model.Animal;
import main.fences.Aquarium;
import main.fences.Fence;
import main.fences.Voliere;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private String name;
    private Employee employee;
    private int maxFences;
    private ArrayList<Fence> fences;

    public Zoo(String name, Employee employee, int maxFences, ArrayList<Fence> fences) {
        this.name = name;
        this.employee = employee;
        this.maxFences = maxFences;
        this.fences = fences;
    }

    public int howManyAnimals() {
        int compt = 0;
        for (Fence fence: this.fences) {
            for (Animal animal: fence.getAnimals()) {
                compt++;
            }
        }
        return compt;
    }

    public void showAnyAnimal() {
        int compt = 0;
        for (Fence fence: this.fences) {
            for (Animal animal: fence.getAnimals()) {
                System.out.println(animal.toString());
            }
        }
    }

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

    public void launchMenu() {
        Menu menu = new Menu();
        try {
            menu.employeeMenu(this.employee, this.fences);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
