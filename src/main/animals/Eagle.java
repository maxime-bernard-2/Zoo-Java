package main.animals;

import main.animals.model.Animal;
import main.animals.model.Bird;
import main.animals.model.Mammal;

/**
 * Classe publique Eagle qui �tend la classe abstraite Animal et impl�mente les interfaces Mammal et Bird
 *
 */
public class Eagle extends Animal implements Mammal, Bird {
    public Eagle(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void fly() {

    }
}
