package accueil;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author oXCToo
 */
public class Main extends Application {

   

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/accueil.fxml"));
  
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("BAC prepa");
        stage.initStyle(StageStyle.DECORATED);
        stage.setMaximized(false);
        stage.sizeToScene();
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    

}
