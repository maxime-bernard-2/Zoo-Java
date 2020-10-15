package main.animals;

import main.animals.model.Animal;
import main.animals.model.Mammal;

public class Bear extends Animal implements Mammal {
    public Bear(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }
}
