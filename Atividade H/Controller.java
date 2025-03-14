import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField inputField;
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private void countVowels(ActionEvent event) {
        String text = inputField.getText();
        int vowelCount = VowelCounter.countVowels(text);
        resultLabel.setText("Vogais: " + vowelCount);
    }
}
