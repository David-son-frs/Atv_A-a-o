Main atividade C

import javafx.application.Application;
import javafx.scene.Scene;
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
        Button btnContar = new Button("Contar");
        Label contadorLabel = new Label();

        btnContar.setOnAction(e -> {
            String texto = textField.getText();
            int numeroDeCaracteres = texto.length();
            contadorLabel.setText("Número de caracteres: " + numeroDeCaracteres);
        });

        root.getChildren().addAll(textField, btnContar, contadorLabel);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Contador de Caracteres");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
