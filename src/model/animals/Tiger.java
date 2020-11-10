package model.animals;

import model.animals.model.Animal;
import model.animals.model.Hunter;
import model.animals.model.Mammal;

public class Tiger extends Animal implements Mammal, Hunter{
    public Tiger(String name, boolean sex, double weight, double height, int age) {
        super(name, sex, weight, height, age);
    }

    @Override
    public void wander() {

    }
}
