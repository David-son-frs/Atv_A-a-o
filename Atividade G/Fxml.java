<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<AnchorPane xmlns:fx="http://javafx.com/fxml/1" fx:controller="Controller">
    <children>
        <Label text="Digite uma palavra ou frase:" layoutX="30" layoutY="30"/>
        <TextField fx:id="inputField" layoutX="200" layoutY="30" prefWidth="250"/>
        
        <Button text="Verificar" layoutX="200" layoutY="70" onAction="#handleCheckPalindrome"/>
    </children>
</AnchorPane>
