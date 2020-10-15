package main.animals;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Mammal;

public class Whale extends Animal implements Mammal, Aquatic {
    public Whale(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
