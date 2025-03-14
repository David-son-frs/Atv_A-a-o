<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.VBox?>

<VBox xmlns:fx="http://javafx.com/fxml" fx:controller="Controller" spacing="10" alignment="center">
    <TextField fx:id="inputField" promptText="Digite o texto aqui" />
    <Button text="Contar Vogais" onAction="#countVowels"/>
    <Label fx:id="resultLabel" text="Vogais: 0"/>
</VBox>
