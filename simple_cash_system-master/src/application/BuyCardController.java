package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BuyCardController {

    @FXML
    private Label sumPrice;

    @FXML
    private Button buyBtn;

    @FXML
    private Button exitBtn;

    @FXML
    void handleBuy(ActionEvent event) {
    	System.out.print("Buy");
    }

    @FXML
    void handleExit(ActionEvent event) {
    	Stage stage = (Stage) exitBtn.getScene().getWindow();
    	stage.close();
    }

}
