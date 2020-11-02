package main;

import main.animals.Pinguin;
import main.animals.Whale;
import main.animals.Wolf;
import main.fences.Fence;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Employee employee = new Employee("Michel", true, 26);

        Fence fence = new Fence("enclot des loups", 25, 5);

        for (int i = 0; i < 4; i++) {
            fence.addAnimal(new Wolf("wolfy" + i, true, 50, 50, 10));
        }

        Wolf w = new Wolf("wolfy", true, 50, 50, 10);
        w.wander();


        ArrayList<Fence> fences = new ArrayList<Fence>();
        fences.add(fence);

        Zoo zoo = new Zoo("Mon zoo", employee, 1, fences);

        zoo.launchMenu();

    }

}
