package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProductAddController {

    @FXML
    private Label skutype;

    @FXML
    private Label skuprice;

    @FXML
    private Label skuquant;

    @FXML
    private TextField skucode;

    @FXML
    private TextField skuname;

    @FXML
    private Button saveBtn;

    @FXML
    private Button exitBtn;

    @FXML
    void handleExit(ActionEvent event) {
    	Stage stage = (Stage) exitBtn.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void handleSubmit(ActionEvent event) {
    	System.out.print("Saved");
    }

}
