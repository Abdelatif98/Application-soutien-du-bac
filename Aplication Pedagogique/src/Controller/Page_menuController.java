package Controller;


import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Model.*;
 

public class Page_menuController {

	private static int mat;
	public static int getMat() {
		return mat;
	}
    @FXML
    private JFXButton btnscore;

    @FXML
    private JFXButton btn_chap;
    @FXML
    private JFXButton btn_math;

    @FXML
    private JFXButton btn_phy;

    @FXML
    private JFXButton btn_svt;

    @FXML
    void affichescore(ActionEvent eveint) throws Exception {
    	Stage primaryStage=new Stage();
    	
    	PieChart pieChart = new PieChart();
    	
    	
    	Passer p=new Passer();
    	Traitement_score[] ts=new Traitement_score[3];
    	ts=p.somme_score(LoginController.getPseudo());
    	
    
    	 System.out.println(LoginController.getPseudo());
    	 System.out.println(ts[0].getScore());

    	
    	if(ts[0] != null) {
    		PieChart.Data slice1 = new PieChart.Data(ts[0].getMat(), ts[0].getScore());
    		pieChart.getData().add(slice1);
    	}
    	if(ts[1] != null) {
    		PieChart.Data slice2 = new PieChart.Data(ts[1].getMat(), ts[1].getScore());
        	pieChart.getData().add(slice2);

    	}
    	if(ts[2] != null) {
    		PieChart.Data slice3 = new PieChart.Data(ts[2].getMat(), ts[2].getScore());
    		pieChart.getData().add(slice3);
    	}
        
        

        pieChart.setPrefSize(500, 350);
 
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setStartAngle(30);
 
        final Label caption = new Label("");
        caption.setTextFill(Color.WHITE);
        caption.setStyle("-fx-font: 12 arial;");
 
        for (final PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
                    caption.setTranslateX(e.getSceneX());
                    caption.setTranslateY(e.getSceneY());
 
                    caption.setText(String.valueOf(data.getPieValue()));
                }
            });
        }
 
        primaryStage.setTitle("Statistiques des scores par matière");
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(pieChart, caption);
        
        
 
        Scene scene = new Scene(root, 400, 300);
 
        primaryStage.setScene(scene);
 
        primaryStage.show();
        
    }
    	
    @FXML
    void stat_chap(ActionEvent event) throws Exception  {


Stage primaryStage=new Stage();
    	
    	PieChart pieChart = new PieChart();
    	
    	
    	Lire l=new Lire();
    	Traitement_chap[] tsh=new Traitement_chap[3];
    	tsh=l.count_res(LoginController.getPseudo());
    	
    
    	 System.out.println(LoginController.getPseudo());
    	
    	if(tsh[0] != null) {
    		PieChart.Data slice1 = new PieChart.Data(tsh[0].getMat(), tsh[0].getNbre_chap());
    		pieChart.getData().add(slice1);
    	}
    	if(tsh[1] != null) {
    		PieChart.Data slice2 = new PieChart.Data(tsh[1].getMat(), tsh[1].getNbre_chap());
        	pieChart.getData().add(slice2);

    	}
    	if(tsh[2] != null) {
    		PieChart.Data slice3 = new PieChart.Data(tsh[2].getMat(), tsh[2].getNbre_chap());
    		pieChart.getData().add(slice3);
    	}
        
        

        pieChart.setPrefSize(500, 350);
 
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setStartAngle(30);
 
        final Label caption = new Label("");
        caption.setTextFill(Color.WHITE);
        caption.setStyle("-fx-font: 12 arial;");
 
        for (final PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
                    caption.setTranslateX(e.getSceneX());
                    caption.setTranslateY(e.getSceneY());
 
                    caption.setText(String.valueOf(data.getPieValue()));
                }
            });
        }
 
        primaryStage.setTitle("Statistique résumés lus/matières");
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(pieChart, caption);
        
        
 
        Scene scene = new Scene(root, 500, 300);
 
        primaryStage.setScene(scene);
 
        primaryStage.show();
        
    }
    
    
    @FXML
    void ListeMath(ActionEvent event) throws Exception {
    	mat=1;
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Examen.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();

    }

    @FXML
    void ListePhy(ActionEvent event) throws Exception {
    	mat=2;
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Examen.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();


    }

    @FXML
    void ListeSvt(ActionEvent event) throws Exception {
    	mat=3;
    	Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Examen.fxml"));
		 Scene scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();


    }

    }

