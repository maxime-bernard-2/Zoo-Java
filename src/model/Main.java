package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.animals.*;
import model.fences.Aquarium;
import model.fences.Fence;
import model.fences.Voliere;

import java.util.ArrayList;


public class Main extends Application {

    public static Employee employee = new Employee("Michel", true, 26);
    public static Fence fenceSouth = new Fence("Enclos Sud", 300, 10); // Enclos Loup
    public static Fence fenceNord = new Fence("Enclos Nord", 100, 2); // Enclos Ours
    public static Fence fenceEast = new Fence("Enclos Est", 200, 3); // Enclos Tigre
    public static Aquarium whideAquarium = new Aquarium("Grand Aquarium", 1000, 100,10, 2 ); // Aquarium Baleine
    public static Aquarium mediumAquarium = new Aquarium("Aquarium Moyen", 500, 10,7, 3 ); // Aquarium Requins
    public static Aquarium smallAquarium = new Aquarium("Petit Aquarium", 10, 2,1, 30 ); // Aquarium Poissons Rouges
    public static Voliere whideVoliere = new Voliere("Grande Voliere", 100, 25,5); // Voliere Aigle
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

        for (int i = 0; i < 8; i++) {
            fenceSouth.addAnimal(new Wolf("Wolfy_" + i, true, 50, 30, 10));
        }
        fences.add(fenceSouth);

        for (int i = 0; i < 1; i++) {
            fenceNord.addAnimal(new Bear("Kuma_" + i, false, 100, 70, 5));
        }
        fences.add(fenceNord);

        for (int i = 0; i < 2; i++) {
            fenceEast.addAnimal(new Tiger("Tigrou_" + i, true, 50, 50, 3));
        }
        fences.add(fenceEast);

        for (int i = 0; i < 1; i++) {
            whideAquarium.addAnimal(new Whale("Wamer_" + i, false, 1000, 5000, 4));
        }
        fences.add(whideAquarium);

        for (int i = 0; i < 1; i++) {
            mediumAquarium.addAnimal(new Shark("Sharkou_" + i, true, 50, 100, 7));
        }
        fences.add(mediumAquarium);

        for (int i = 0; i < 24; i++) {
            smallAquarium.addAnimal(new RedFish("RedRiot_" + i, true, 0.5, 1, 1));
        }
        fences.add(smallAquarium);

        for (int i = 0; i < 4; i++) {
            whideVoliere.addAnimal(new Eagle("Piaf_" + i, true, 10, 30, 1));
        }
        fences.add(whideVoliere);

        primaryStage.setTitle("Mon ZOO");
        Parent root = FXMLLoader.load(getClass().getResource("../view/ZooMenuView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
