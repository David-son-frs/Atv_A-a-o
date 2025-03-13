<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<AnchorPane xmlns:fx="http://javafx.com/fxml/1" fx:controller="Controller">
    <children>
        <Label text="Número Mínimo:" layoutX="30" layoutY="30"/>
        <TextField fx:id="minField" layoutX="120" layoutY="30" prefWidth="100"/>
        
        <Label text="Número Máximo:" layoutX="30" layoutY="70"/>
        <TextField fx:id="maxField" layoutX="120" layoutY="70" prefWidth="100"/>
        
        <Button text="Gerar" layoutX="120" layoutY="110" onAction="#handleGenerate"/>
        
        <Label fx:id="resultLabel" layoutX="120" layoutY="150"/>
    </children>
</AnchorPane>
