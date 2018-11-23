package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SampleController {

    @FXML
    private Button adminBtn;

    @FXML
    private Button buyerBtn;

    @FXML
    void handleAdminBtn(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("AdminWindow.fxml"));
            Scene secondScene = new Scene(root,550,300);
            Stage newWindow = new Stage();
            newWindow.setTitle("Simple Cash System - Admin");
            newWindow.setScene(secondScene);
            newWindow.show();
    	}
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void handleBuyerBtn(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("BuyerWindow.fxml"));
            Scene secondScene = new Scene(root,550,300);
            Stage newWindow = new Stage();
            newWindow.setTitle("Simple Cash System - Buyer");
            newWindow.setScene(secondScene);
            newWindow.show();
    	}
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

}
