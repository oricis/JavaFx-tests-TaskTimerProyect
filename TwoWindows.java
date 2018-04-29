/**
 * @file:    TwoWindows.java
 * @package: javafx
 *
 * @author:  Moisés Alcocer, 2018
 * @link:    https://www.ironwoods.es
 * @license: http://opensource.org/licenses/MIT - MIT License
 *
 * @info: test: building two windows with JavaFx & FXML
 */
package javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TwoWindows extends Application {

    private Stage firstStage = null;
    private Stage secondStage = null;

    
    @Override
    public void start( Stage firstStage ) throws Exception {
        this.firstStage = firstStage;

        /**
         * Shows the first window
         */
        openMainWindow();
    }

    /**
     * Opens the main window
     * 
     */
    public void openMainWindow() {
        
        try {
            Parent firstRoot = FXMLLoader.load(
                getClass().getResource(
                    "resources/FXMLDocFirstWindow.fxml"));

            Scene firstScene  = new Scene( firstRoot );
            
            this.firstStage.setScene( firstScene );
            this.firstStage.setTitle("Main window");

            this.firstStage.show();
        } catch(IOException e) {
            System.err.println(
                "ERR -> Opening main window... \n" + e.toString( ));
        }
    }

    /**
     * Opens the secondary window
     * 
     */
    public void openSecondaryWindow() {

        try {
            Parent secondRoot = FXMLLoader.load(
                getClass().getResource(
                    "resources/FXMLDocSecondWindow.fxml"));
            
            this.secondStage  = new Stage();
            Scene secondScene = new Scene( secondRoot );
            secondStage.setScene( secondScene );

            secondStage.show();

        } catch(IOException e) {
            System.err.println(
                "ERR -> Opening secondary window... \n" + e.toString( ));
        }
    }

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        launch(args);
    }

} // class
