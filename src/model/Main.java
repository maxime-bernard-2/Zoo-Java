package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.animals.Bear;
import model.animals.Tiger;
import model.animals.Wolf;
import model.fences.Fence;

import java.util.ArrayList;


public class Main extends Application {

    public static Employee employee = new Employee("Michel", true, 26);
    public static Fence fence = new Fence("enclot des loups", 25, 5);
    public static Fence fence2 = new Fence("enclot des ours", 50, 2);
    public static Fence fence3 = new Fence("enclot des tigres", 30, 3);
    public static ArrayList<Fence> fences = new ArrayList<Fence>();
    public static Zoo zoo = new Zoo("Mon zoo", employee, 1, fences);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        for (int i = 0; i < 4; i++) {
            fence.addAnimal(new Wolf("wolfy" + i, true, 50, 50, 10));
        }

        for (int i = 0; i < 1; i++) {
            fence.addAnimal(new Bear("bear" + i, true, 50, 50, 10));
        }

        for (int i = 0; i < 2; i++) {
            fence.addAnimal(new Tiger("tigre" + i, true, 50, 50, 10));
        }

        fences.add(fence);
        fences.add(fence2);
        fences.add(fence3);

        primaryStage.setTitle("Mon ZOO");
        Parent root = FXMLLoader.load(getClass().getResource("../view/ZooMenuView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
