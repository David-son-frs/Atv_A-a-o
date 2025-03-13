

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);

        TextField textFieldUsuario = new TextField();
        PasswordField passwordFieldSenha = new PasswordField();
        Button btnLogin = new Button("Login");
        Label resultadoLabel = new Label();

        btnLogin.setOnAction(e -> {
            String usuario = textFieldUsuario.getText();
            String senha = passwordFieldSenha.getText();
            
            if ("admin".equals(usuario) && "1234".equals(senha)) {
                resultadoLabel.setText("Login bem-sucedido");
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erro de Login");
                alert.setHeaderText(null);
                alert.setContentText("Usuário ou senha incorretos.");
                alert.showAndWait();
            }
        });

        root.getChildren().addAll(textFieldUsuario, passwordFieldSenha, btnLogin, resultadoLabel);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Simulador de Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
