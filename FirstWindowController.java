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

public class FirstWindowController implements Initializable {

    private TwoWindows app = null;

    @FXML
    private Label label;
    @FXML
    private Button btn;

    @FXML
    private void openSecondWindow() {
        System.out.println(getClass() + " / openSecondWindow()");

        if (this.app == null) {
            System.err.println("Err -> App instance don't exist!");
        } else {
            this.app.openSecondaryWindow();
        }
    }

    public void setApp(TwoWindows app) {
        this.app = app;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText( "First Window" );
    }

} // class
