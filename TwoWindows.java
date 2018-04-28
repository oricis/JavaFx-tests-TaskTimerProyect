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

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TwoWindows extends Application {

    @Override
    public void start( Stage firstStage ) throws Exception {
        // creates the secondary stage
        final Stage secondStage = new Stage();

        Parent firstRoot = FXMLLoader.load(
            getClass().getResource(
                "resources/FXMLDocFirstWindow.fxml"));
        Parent secondRoot = FXMLLoader.load(
            getClass().getResource(
                "resources/FXMLDocFirstWindow.fxml"));
        
        Scene firstScene  = new Scene( firstRoot );
        Scene secondScene = new Scene( secondRoot );

        firstStage.setScene( firstScene );
        secondStage.setScene( secondScene );

        /**
         * Shows in first place the first window and behind the second one
         */
        secondStage.show();
        firstStage.show();
    }

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        launch(args);
    }

} // class
