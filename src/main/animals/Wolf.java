package main.animals;

import main.animals.model.Animal;
import main.animals.model.Hunter;
import main.animals.model.Mammal;

public class Wolf extends Animal implements Mammal, Hunter {
    public Wolf(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void wander() {
        System.out.println(this.getName() + " se balade \uD83C\uDFC3");
    }
}
