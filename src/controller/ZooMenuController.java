package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.Main;

import java.io.IOException;

/**
 * Classe ZooMenuController
 */

public class ZooMenuController {

    public TextArea text = null;
    public Label labelDay;

    public void initialize() {
        text.setText(Main.text);
    }

    public void showFence(ActionEvent event) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/ShowFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)event.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void cleanFence(ActionEvent event) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/CleanFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)event.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void showAnimalNumber(ActionEvent actionEvent) {
        String howMany = "Il y a actuellement " + String.valueOf(Main.zoo.howManyAnimals()) + " animaux dans le Zoo.";
        text.setText(howMany);
        Main.text = howMany;
    }

    public void showAnimals(ActionEvent actionEvent) {
        text.setText(Main.zoo.showAnyAnimal());
        Main.text = Main.zoo.showAnyAnimal();
    }

    public void employeMenu(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/EmployeMenuView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void nextDay(ActionEvent actionEvent) {
        Main.turnNumber++;
        Main.actualActionPoint = Main.maxActionPoint;
        text.clear();
        Main.text = "";
        labelDay.setText("Jour " + Main.turnNumber);
        Main.zoo.randomChangeAnimal();
        Main.zoo.randomChangeFence();
    }
}
