package controller.employee;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Main;
import model.fences.Fence;

import java.io.IOException;

/**
 * Classe FeedFenceController
 */

public class FeedFenceController {

    @FXML
    private VBox buttonContainer;
    @FXML
    private TextArea text;

    public void initialize() {
        for (Fence fence: Main.fences) {
            addButton(fence);
        }
    }

    public void addButton(Fence fence) {
        Button newButton = new Button(fence.getName());
        newButton.setOnAction(e -> {
            try {
                Main.text = Main.employee.feedFence(fence);

                Parent choiceParent = null;
                try {
                    choiceParent = FXMLLoader.load(getClass().getResource("../../view/EmployeMenuView.fxml"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                Scene choiceScene = new Scene(choiceParent);

                Stage root = (Stage) ((Node)e.getSource()).getScene().getWindow();
                root.setScene(choiceScene);
                root.show();
            } catch(Exception ex) {
                text.setText(ex.getMessage());
                Main.text = ex.getMessage();
            }

        });
        buttonContainer.getChildren().add(newButton);
    }

    public void returnMenu(ActionEvent event) throws IOException {
        Parent choiceParent = FXMLLoader.load(getClass().getResource("../../view/EmployeMenuView.fxml"));
        Scene choiceScene = new Scene(choiceParent);

        Stage root = (Stage) ((Node)event.getSource()).getScene().getWindow();
        root.setScene(choiceScene);
        root.show();
    }


}
