<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<AnchorPane xmlns:fx="http://javafx.com/fxml/1" fx:controller="Controller">
    <children>
        <Label text="Usuário:" layoutX="30" layoutY="30"/>
        <TextField fx:id="usernameField" layoutX="100" layoutY="30" prefWidth="200"/>
        
        <Label text="Senha:" layoutX="30" layoutY="70"/>
        <TextField fx:id="passwordField" layoutX="100" layoutY="70" prefWidth="200" promptText="Senha" />
        
        <Button text="Login" layoutX="100" layoutY="110" onAction="#handleLogin"/>
        
        <Label fx:id="resultLabel" layoutX="100" layoutY="150"/>
    </children>
</AnchorPane>
