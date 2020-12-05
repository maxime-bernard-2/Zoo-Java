package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.Main;
import model.fences.Fence;

import java.io.IOException;

/**
 * Classe EmployeMenuController
 */

public class EmployeMenuController {

    public TextArea text = null;
    public Button showButton;
    public Button cleanButton;
    public Button feedButton;
    public Button swapButton;
    public Label labelDay;

    public void initialize() {

        text.setText(Main.text);
        labelDay.setText("Jour " + Main.turnNumber + "             Points d'action restant: " + Main.actualActionPoint);

        if (Main.actualActionPoint == 0) {
            showButton.setDisable(true);
            cleanButton.setDisable(true);
            feedButton.setDisable(true);
            swapButton.setDisable(true);
        }

    }

    public void showFence(ActionEvent actionEvent) throws IOException {
        Main.actualActionPoint--;
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/ShowFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void cleanFence(ActionEvent actionEvent) throws IOException {
        Main.actualActionPoint--;
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/CleanFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void feedFence(ActionEvent actionEvent) throws IOException {
        Main.actualActionPoint--;
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/FeedFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void swapFence(ActionEvent actionEvent) throws IOException {
        Main.actualActionPoint--;
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/SwapFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void returnToZoo(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/ZooMenuView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }
}
