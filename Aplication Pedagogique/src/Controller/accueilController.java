package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXButton;

public class accueilController {
	@FXML
	private JFXButton btn_decouvre_moi;
	@FXML
    void display(MouseEvent event) throws Exception {
		Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();
    }
}
