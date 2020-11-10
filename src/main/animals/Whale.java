package main.animals;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Mammal;

/**
 * Classe publique Whale qui étend la classe abstraite Animal et implémente les interfaces Mammal et Aquatic
 *
 */
public class Whale extends Animal implements Mammal, Aquatic {
	
	//Constructor
    public Whale(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
