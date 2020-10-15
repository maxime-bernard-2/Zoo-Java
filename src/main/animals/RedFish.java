package main.animals;

import main.animals.model.Animal;
import main.animals.model.Aquatic;
import main.animals.model.Other;

public class RedFish extends Animal implements Other, Aquatic {
    public RedFish(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void swim() {

    }
}
