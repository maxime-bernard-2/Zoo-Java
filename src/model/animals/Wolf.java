package model.animals;

import model.animals.model.Animal;
import model.animals.model.Hunter;
import model.animals.model.Mammal;

/**
 * Classe publique Wolf qui etend la classe abstraite Animal et implemente les interfaces Mammal et Hunter
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
