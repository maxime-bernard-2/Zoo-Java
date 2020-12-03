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
import model.animals.model.Animal;
import model.fences.Fence;

import java.io.IOException;

/**
 * Classe SwapFenceController
 */

public class SwapFenceController {

    @FXML
    private VBox buttonContainer;
    @FXML
    private TextArea text;

    private Fence fenceToLeave;
    private Animal animalToTransfer;
    private Fence fenceToGo;

    public void initialize() {
        for (Fence fence: Main.fences) {
            addFenceButton(fence);
        }
    }

    public void addFenceButton(Fence fence) {
        Button newButton = new Button(fence.getName());
        newButton.setOnAction(e -> {

            fenceToLeave = fence;
            buttonContainer.getChildren().clear();

            for (Animal animal: fence.getAnimals()) {
                addAnimalButton(animal);
            }

        });
        buttonContainer.getChildren().add(newButton);
    }

    public void addAnimalButton(Animal animal) {
        Button newButton = new Button(animal.getName());
        newButton.setOnAction(e -> {

            animalToTransfer = animal;
            buttonContainer.getChildren().clear();

            for (Fence fence: Main.fences) {
                addFenceToButton(fence);
            }

        });
        buttonContainer.getChildren().add(newButton);
    }

    public void addFenceToButton(Fence fence) {
        Button newButton = new Button(fence.getName());
        newButton.setOnAction(e -> {

            fenceToGo = fence;
            try {
                Main.employee.swapFence(fenceToLeave, fenceToGo, animalToTransfer);

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
            } catch (Exception ex) {
                text.setText(ex.getLocalizedMessage());
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
