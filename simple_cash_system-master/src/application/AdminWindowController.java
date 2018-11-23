package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class AdminWindowController {

    @FXML
    private TableColumn<?, ?> skucode;

    @FXML
    private TableColumn<?, ?> skuname;

    @FXML
    private TableColumn<?, ?> skutype;

    @FXML
    private TableColumn<?, ?> skuprice;

    @FXML
    private TableColumn<?, ?> skuqua;

    @FXML
    private Button addbtn;

    @FXML
    private Button exitBtn;

    @FXML
    void handleAdd(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("ProductAdd.fxml"));
            Scene secondScene = new Scene(root,400,300);
            Stage newWindow = new Stage();
            newWindow.setTitle("Simple Cash System - Product Add");
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
