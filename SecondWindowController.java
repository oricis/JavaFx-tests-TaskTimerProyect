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
import javafx.scene.control.Label;

public class SecondWindowController implements Initializable {

    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText( "Second Window" );
    }

} // class