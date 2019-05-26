package Controller;
import Model.*;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private JFXCheckBox cheekrappeler;

    @FXML
    private JFXButton btnseconnecter;

    @FXML
    private JFXButton btnaccueil;

    @FXML
    private JFXTextField textpseudo;

    @FXML
    private JFXPasswordField textpassword;

    @FXML
    private JFXButton btnsinscrire;
    
    @FXML
    private Label lblerror;
    
    private static String pseudo;
    @FXML
    void acceuil(ActionEvent event) throws Exception {
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/accueil.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();

    }

    @FXML
    void connexion(ActionEvent event) throws Exception {
    	boolean test;
    	Eleve e=new Eleve();
    	setPseudo(textpseudo.getText());
    	test=e.verify_login(textpseudo.getText(),textpassword.getText());
    	if(test==true) {
    		Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
    		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Page_menu.fxml"));
    		 Scene scene = new Scene(root);
    	     stage.setScene(scene);
    	     stage.show();
    	}
    	else {
    		
    		lblerror.setVisible(true);    	}

    }

    @FXML
    void inscription(ActionEvent event) throws Exception {
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/S'inscrire.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();
    	
    }

	public static String getPseudo() {
		return pseudo;
	}

	public static void setPseudo(String pseudo) {
		LoginController.pseudo = pseudo;
	}

}
