
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        
        TextField textField = new TextField();
        Button btnVerificar = new Button("Verificar");
        Label resultadoLabel = new Label();
        
        btnVerificar.setOnAction(e -> {
            try {
                int numero = Integer.parseInt(textField.getText());
                if (numero % 2 == 0) {
                    resultadoLabel.setText("O número digitado é Par");
                } else {
                    resultadoLabel.setText("O número digitado é Ímpar");
                }
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Entrada inválida");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, insira um número válido.");
                alert.showAndWait();
            }
        });
        
        root.getChildren().addAll(textField, btnVerificar, resultadoLabel);
        
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Verificador de Par ou Ímpar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
