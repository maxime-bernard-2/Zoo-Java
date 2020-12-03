package model.animals;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Mammal;

/**
 * Classe publique Whale qui etend la classe abstraite Animal et implemente les interfaces Mammal et Aquatic
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
