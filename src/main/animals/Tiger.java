package main.animals;

import main.animals.model.Animal;
import main.animals.model.Hunter;
import main.animals.model.Mammal;

/**
 * Classe publique Tiger qui étend la classe abstraite Animal et implémente les interfaces Mammal et Hunter
 *
 */
public class Tiger extends Animal implements Mammal, Hunter{
	
	//Constructor
    public Tiger(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void wander() {

    }
}
