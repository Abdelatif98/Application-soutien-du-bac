package Controller;
import Model.*;

import com.jfoenix.controls.JFXButton;

import Model.Connexion;
import Model.Traitement_chap;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ExamenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label l9;

    @FXML
    private Label l10;

    @FXML
    private JFXButton v1;

    @FXML
    private JFXButton v2;

    @FXML
    private JFXButton v3;

    @FXML
    private JFXButton v4;

    @FXML
    private JFXButton v5;

    @FXML
    private JFXButton v6;

    @FXML
    private JFXButton v7;

    @FXML
    private JFXButton v8;

    @FXML
    private JFXButton v9;

    @FXML
    private JFXButton v10;

    @FXML
    void voir1(ActionEvent event) {

    }

    @FXML
    void voir10(ActionEvent event) {

    }

    @FXML
    void voir2(ActionEvent event) {

    }

    @FXML
    void voir3(ActionEvent event) {

    }

    @FXML
    void voir4(ActionEvent event) {

    }

    @FXML
    void voir5(ActionEvent event) {

    }

    @FXML
    void voir6(ActionEvent event) {

    }

    @FXML
    void voir7(ActionEvent event) {

    }

    @FXML
    void voir8(ActionEvent event) {

    }

    @FXML
    void voir9(ActionEvent event) {

    }

    @FXML
    void initialize() throws Exception {
    int mat=Page_menuController.getMat();
    Connection cn = Connexion.Connecter();
	Statement st = null;
	ResultSet rs = null;
	try {
		st = cn.createStatement();
        rs = st.executeQuery("select titre from Examen where id_mat="+mat);
        String[] tab_titre=new String[2];
        int i=0;
        while(rs.next()){
        	tab_titre[i]=rs.getString("titre");
        	i++;
    		
        }
       
        		l1.setText(tab_titre[0]);
        		l2.setText(tab_titre[1]);
        		
        	

	}
	finally {
		try {
			cn.close();
			st.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		
}
	

    }
}
