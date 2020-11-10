package model.animals;

import model.animals.model.Animal;
import model.animals.model.Hunter;
import model.animals.model.Mammal;

public class Wolf extends Animal implements Mammal, Hunter {
    public Wolf(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void wander() {
        System.out.println(this.getName() + " se balade \uD83C\uDFC3");
    }
}
