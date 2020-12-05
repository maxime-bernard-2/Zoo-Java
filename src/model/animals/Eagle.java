package model.animals;

import model.animals.model.Animal;
import model.animals.model.Bird;
import model.animals.model.Mammal;
import model.animals.model.Other;

/**
 * Classe publique Eagle qui etend la classe abstraite Animal et implemente les interfaces Mammal et Bird
 *
 */
public class Eagle extends Animal implements Other, Bird {
    public Eagle(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void fly() {

    }
}
