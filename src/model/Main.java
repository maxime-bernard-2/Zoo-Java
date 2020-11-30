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

    public static int turnNumber = 1;
    public static int maxActionPoint = 3;
    public static int actualActionPoint = maxActionPoint;
    public static String text = new String("");



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        for (int i = 0; i < 4; i++) {
            fence.addAnimal(new Wolf("Wolfy_" + i, true, 50, 50, 10));
        }

        for (int i = 0; i < 1; i++) {
            fence2.addAnimal(new Bear("Kuma_" + i, true, 100, 70, 5));
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
