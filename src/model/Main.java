package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.animals.*;
import model.fences.Aquarium;
import model.fences.Fence;
import model.fences.PenguinFence;
import model.fences.Voliere;

import java.util.ArrayList;

/**
 * Classe publique Main
 */

public class Main extends Application {

    public static Employee employee = new Employee("Michel", true, 26);

    public static Fence fenceSouth = new Fence("Enclos Sud", 300, 10); // Enclos Loup
    public static Fence fenceNord = new Fence("Enclos Nord", 100, 2); // Enclos Ours
    public static Fence fenceEast = new Fence("Enclos Est", 200, 3); // Enclos Tigre
    public static Fence fenceOuest = new PenguinFence("Enclos Ouest", 300, 30, 15, 5, 20 );
    public static Fence privatefence = new Fence("Enclos non public", 500, 15); // Enclos Vide
    public static Aquarium wideAquarium = new Aquarium("Grand Aquarium", 1000, 100,10, 2 ); // Aquarium Baleine
    public static Aquarium mediumAquarium = new Aquarium("Aquarium Moyen", 500, 10,7, 3 ); // Aquarium Requins
    public static Aquarium smallAquarium = new Aquarium("Petit Aquarium", 10, 2,1, 30 ); // Aquarium Poissons Rouges
    public static Aquarium privateAquarium = new Aquarium("Aquarium non public", 500, 10,2, 50 ); // Aquarium Poissons Rouges
    public static Voliere wideVoliere = new Voliere("Grande Voliere", 100, 25,5); // Voliere Aigle
    public static Voliere privateVoliere = new Voliere("Voliere non public", 75, 20,10); // Voliere Aigle

    public static ArrayList<Fence> fences = new ArrayList<Fence>();
    public static Zoo zoo = new Zoo("Mon zoo", employee, 1, fences);

    public static int turnNumber = 1;
    public static int maxActionPoint = 10;
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

        for (int i = 0; i < 4; i++) {
            fenceOuest.addAnimal(new Penguin("Pingouin_" + i, true, 10, 30, 1));
        }
        fences.add(fenceOuest);

        for (int i = 0; i < 1; i++) {
            wideAquarium.addAnimal(new Whale("Wamer_" + i, false, 1000, 5000, 4));
        }
        fences.add(wideAquarium);

        for (int i = 0; i < 1; i++) {
            mediumAquarium.addAnimal(new Shark("Sharkou_" + i, true, 50, 100, 7));
        }
        fences.add(mediumAquarium);

        for (int i = 0; i < 24; i++) {
            smallAquarium.addAnimal(new RedFish("RedRiot_" + i, true, 0.5, 1, 1));
        }
        fences.add(smallAquarium);

        for (int i = 0; i < 4; i++) {
            wideVoliere.addAnimal(new Eagle("Piaf_" + i, true, 10, 30, 1));
        }
        fences.add(wideVoliere);

        fences.add(privatefence);
        fences.add(privateAquarium);
        fences.add(privateVoliere);

        primaryStage.setTitle("Mon ZOO");
        Parent root = FXMLLoader.load(getClass().getResource("../view/ZooMenuView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
