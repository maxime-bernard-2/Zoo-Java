package main.animals;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Other;

/**
 * Classe publique Redfish qui étend la classe abstraite Animal et implémente les interfaces Aquatic et Other
 *
 */
public class RedFish extends Animal implements Other, Aquatic {
	
	//Constructor
    public RedFish(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
