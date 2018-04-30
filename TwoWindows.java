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
    private FXMLLoader loader, loader2;
    private Stage firstStage  = null;
    private Stage secondStage = null;
    private FirstWindowController controller  = null;
    private SecondWindowController controller2 = null;



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
     * Closes the secondary window
     *
     */
    public void closeSecondaryWindow() {
        this.secondStage.close();
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
            String fxml = "resources/fxml/FXMLDocSecondWindow.fxml";
            this.loader2 = new FXMLLoader();
            this.loader2.setLocation(getClass().getResource( fxml ));
            AnchorPane aPane = (AnchorPane) this.loader2.load();


            Scene secondScene = new Scene( aPane );
            this.secondStage = new Stage();
            this.secondStage.setScene(secondScene);

            this.secondStage.show();

            /**
             * Connect the second window controller with this class to
             * handle close window methods
             *
             */
            connectWithController2();

        } catch(IOException e) {
            System.err.println(
                "ERR -> Opening secondary window... \n" + e.toString( ));
        }
    }

    /**
     * Main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Connects a FXML controller with this class
     *
     * @param fxml
     */
    private void connectWithController() {

        this.controller = this.loader.getController();
        this.controller.setApp(this);
    }

    /**
     * Connects a FXML controller with this class
     *
     * @param fxml
     */
    private void connectWithController2() {

        this.controller2 = this.loader2.getController();
        this.controller2.setApp(this);
        this.controller2.setStage(this.secondStage);
    }

} // class
