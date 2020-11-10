package model.animals;

import model.animals.model.Animal;
import model.animals.model.Mammal;

/**
 * Classe publique Bear qui �tend la classe abstraite Animal et impl�mente l'interface Mammal
 *
 */
public class Bear extends Animal implements Mammal {
	//Constructor
    public Bear(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }
}
