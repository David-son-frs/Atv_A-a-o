

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);

        TextField textFieldEntrada = new TextField();
        TextField textFieldSaida = new TextField();
        textFieldSaida.setEditable(false); // O campo de saída não pode ser editado
        Button btnInverter = new Button("Inverter");

        btnInverter.setOnAction(e -> {
            String textoEntrada = textFieldEntrada.getText();
            
            if (textoEntrada.isEmpty()) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Campo vazio");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, insira um texto.");
                alert.showAndWait();
            } else {
                String textoInvertido = new StringBuilder(textoEntrada).reverse().toString();
                textFieldSaida.setText(textoInvertido);
            }
        });

        root.getChildren().addAll(textFieldEntrada, btnInverter, textFieldSaida);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Inversor de Texto");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
