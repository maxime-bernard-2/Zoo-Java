package model.animals;

import model.animals.model.*;

/**
 * Classe publique Pinguin qui etend la classe abstraite Animal et implemente les interfaces Mammal, Aquatic et Bird
 *
 */
public class Pinguin extends Animal implements Mammal, Bird, Aquatic {
	
	//Constructor
    public Pinguin(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
