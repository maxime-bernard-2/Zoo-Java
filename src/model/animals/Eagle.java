package model.animals;

import model.animals.model.Animal;
import model.animals.model.Bird;
import model.animals.model.Mammal;

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
