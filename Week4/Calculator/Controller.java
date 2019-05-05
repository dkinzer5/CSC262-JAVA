
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML private TextField firstNum;
    @FXML private TextField secondNum;
    @FXML private TextArea answerField;

    @FXML
    private void addIt(){
        Integer firstN = Integer.parseInt(firstNum.getText());
        Integer secondN = Integer.parseInt(secondNum.getText());

        Integer sum = firstN + secondN;


        answerField.setText(sum.toString());


    }

}
