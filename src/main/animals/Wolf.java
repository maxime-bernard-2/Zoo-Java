package main.animals;

import main.animals.model.Animal;
import main.animals.model.Hunter;
import main.animals.model.Mammal;

/**
 * Classe publique Wolf qui étend la classe abstraite Animal et implémente les interfaces Mammal et Hunter
 *
 */
public class Wolf extends Animal implements Mammal, Hunter {
	
	//Constructor
    public Wolf(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void wander() {
        System.out.println(this.getName() + " se balade \uD83C\uDFC3");
    }
}
