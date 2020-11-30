package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeMenuController {

    public TextArea text = null;

    public void showFence(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/ShowFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void cleanFence(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/CleanFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void feedFence(ActionEvent actionEvent) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../view/employee/FeedFenceView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }

    public void swapFence(ActionEvent actionEvent) throws IOException {
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
