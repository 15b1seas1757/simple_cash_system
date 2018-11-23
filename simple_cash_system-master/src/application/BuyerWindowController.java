package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BuyerWindowController {

    @FXML
    private TextField skucode;

    @FXML
    private Label skuname;

    @FXML
    private Label skutype;

    @FXML
    private Label skuprice;

    @FXML
    private TextField quantity;

    @FXML
    private Button addCardBtn;

    @FXML
    private Button buyBtn;

    @FXML
    private Button exitBtn;

    @FXML
    void handleAddCard(ActionEvent event) {
    	System.out.print("Added");
    }

    @FXML
    void handleBuy(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("BuyCard.fxml"));
            Scene secondScene = new Scene(root,550,300);
            Stage newWindow = new Stage();
            newWindow.setTitle("Simple Cash System - Buy");
            newWindow.setScene(secondScene);
            newWindow.show();
    	}
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void handleExit(ActionEvent event) {
    	Stage stage = (Stage) exitBtn.getScene().getWindow();
    	stage.close();
    }

}
