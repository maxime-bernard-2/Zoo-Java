package model.animals;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Other;

/**
 * Classe publique Shark qui etend la classe abstraite Animal et implemente les interfaces Aquatic et Other
 *
 */
public class Shark extends Animal implements Other, Aquatic {
	
	//Constructor
    public Shark(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
