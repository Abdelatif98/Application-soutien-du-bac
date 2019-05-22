package Controller;



import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import Model.Eleve;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class inscrireController {

    @FXML
    private JFXTextField textnom;

    @FXML
    private JFXTextField textprenom;

    @FXML
    private JFXTextField textpseudo;

    @FXML
    private JFXTextField textmotdepasse;

    @FXML
    private JFXTextField textconfirmation;

    @FXML
    private JFXButton btninscrire;

    @FXML
    private JFXButton btnmembre;
    
    @FXML
    private Label lblerrorpseudo;

    @FXML
    private Label lblerrorconfirmation;

    @FXML
    void bienvenue(ActionEvent event) throws Exception {
    	Eleve e=new Eleve();
    	boolean test;
    	if(textmotdepasse.getText().equals(textconfirmation.getText())) {
    		test=e.inscrire_eleve(textnom.getText(),textprenom.getText(),textpseudo.getText(),textmotdepasse.getText());
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("inscription");
    		alert.setHeaderText("Bienvenue");
    		alert.setContentText("Votre inscription est effectuée avec succes");

    		alert.showAndWait();
    		
    		Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
    		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
    		 Scene scene = new Scene(root);
    	     stage.setScene(scene);
    	     stage.show();
    		if(test==false)  {
    			lblerrorpseudo.setVisible(true);
    			lblerrorpseudo.setVisible(false);
    		}
    			
    		
    	}
    	else {
    		lblerrorconfirmation.setVisible(true);
    		lblerrorpseudo.setVisible(false);
    		
    	}
    	

    }

    @FXML
    void membre(ActionEvent event) throws Exception {
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();

    }

}
