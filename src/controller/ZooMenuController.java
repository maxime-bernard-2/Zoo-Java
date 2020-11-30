package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.Main;

import java.io.IOException;

public class ZooMenuController {

    public TextArea text = null;

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
        text.setText(String.valueOf(Main.zoo.howManyAnimals()));
    }

    public void showAnimals(ActionEvent actionEvent) {
        text.setText(Main.zoo.showAnyAnimal());
    }

    public void employeMenu(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/EmployeMenuView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }
}
