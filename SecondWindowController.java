/**
 * @file:    FXMLDocumentController.java
 * @package: javafx
 *
 * @author:  Moisés Alcocer, 2018
 * @link:    https://www.ironwoods.es
 * @license: http://opensource.org/licenses/MIT - MIT License
 *
 * @info: class to load fxml document contents
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SecondWindowController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Button closeApp;
    @FXML
    private Button closeButton;
    @FXML
    private Button closeButtonNew;
    @FXML
    private Label label;

    private Stage stage = null;
    private TwoWindows app = null;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText( "Second Window" );
    }

    /**
     * Sets the main app class
     *
     * @param app
     */
    public void setApp(TwoWindows app) {
        this.app = app;
    }

    /**
     * Sets the stage used to the window
     *
     * @param stage
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void closeApp() {
        System.exit(0);
    }

    @FXML
    private void closeWindow() {
        System.out.println(getClass() + " / closeWindow()");

        if (this.stage != null) {
            this.stage.close();
        }
    }

    /**
     * Method from: https://stackoverflow.com/a/13602324/3919660
     *
     */
    @FXML
    private void closeWindow2() {
        System.out.println(getClass() + " / closeWindow2()");

        Stage thisStage = (Stage) closeButton.getScene().getWindow();
        thisStage.close();
    }

    @FXML
    private void closeWindow3() {
        System.out.println(getClass() + " / closeWindow3()");

        this.app.closeSecondaryWindow();
    }

} // class
