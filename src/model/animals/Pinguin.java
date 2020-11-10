package model.animals;

import model.animals.model.*;

public class Pinguin extends Animal implements Mammal, Bird, Aquatic {
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
