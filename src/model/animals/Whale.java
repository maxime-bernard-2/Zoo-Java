package model.animals;

import model.animals.model.Animal;
import model.animals.model.Aquatic;
import model.animals.model.Mammal;

public class Whale extends Animal implements Mammal, Aquatic {
    public Whale(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
