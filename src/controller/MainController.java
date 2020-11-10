package controller;

import model.Employee;
import model.Zoo;
import model.animals.Wolf;
import model.fences.Fence;

import java.util.ArrayList;

public class MainController {

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
