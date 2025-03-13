import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField minField;

    @FXML
    private TextField maxField;

    @FXML
    private Label resultLabel;

    @FXML
    public void handleGenerate(ActionEvent event) {
        try {
            int min = Integer.parseInt(minField.getText());
            int max = Integer.parseInt(maxField.getText());

            if (min > max) {
                showAlert("Intervalo Inválido", "O número mínimo não pode ser maior que o máximo.");
                return;
            }

            Random random = new Random();
            int randomNumber = random.nextInt(max - min + 1) + min;

            resultLabel.setText("Número gerado: " + randomNumber);
        } catch (NumberFormatException e) {
            showAlert("Erro de Entrada", "Por favor, insira números válidos.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
