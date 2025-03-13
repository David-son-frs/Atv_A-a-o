import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    public void handleCheckPalindrome(ActionEvent event) {
        String input = inputField.getText().trim();

        if (input.isEmpty()) {
            showAlert("Erro", "Por favor, insira uma palavra ou frase.");
            return;
        }

        // Remove espaços e converte para minúsculas para verificar como palíndromo
        String cleanedInput = input.replaceAll("[\\W_]+", "").toLowerCase();
        
        if (isPalindrome(cleanedInput)) {
            showAlert("Resultado", "A entrada é um palíndromo!");
        } else {
            showAlert("Resultado", "A entrada não é um palíndromo.");
        }
    }

    private boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private void showAlert(String title, String message)
