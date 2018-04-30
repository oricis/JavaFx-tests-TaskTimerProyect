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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TwoWindows extends Application {

    private AnchorPane firstRoot;
    private FXMLLoader loader;
    private Stage firstStage = null;
    private Stage secondStage = null;


    @Override
    public void start( Stage firstStage ) throws Exception {
        this.firstStage = firstStage;

        /**
         * Shows the first window
         */
        openMainWindow();

        /**
         * Connect the first window controller with this class
         * with this the button in the controller can open the secondary window
         *
         */
        connectWithController();
    }

    /**
     * Opens the main window
     *
     */
    public void openMainWindow() {
        String fxml = "resources/fxml/FXMLDocFirstWindow.fxml";
        try {
            this.loader = new FXMLLoader(
                getClass().getResource( fxml ));

            this.firstRoot = (AnchorPane) this.loader.load();

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
                    "resources/fxml/FXMLDocSecondWindow.fxml"));

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

    /**
     * Connect a FXML controller with this class
     *
     * @param fxml
     */
    private void connectWithController() {

        FirstWindowController controller = this.loader.getController();
        controller.setApp(this);
    }

} // class
