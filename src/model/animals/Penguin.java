package model.animals;

import model.animals.model.*;

/**
 * Classe publique Pinguin qui etend la classe abstraite Animal et implemente les interfaces Mammal, Aquatic et Bird
 *
 */
public class Penguin extends Animal implements Other, Bird, Aquatic {
	
	//Constructor
    public Penguin(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
