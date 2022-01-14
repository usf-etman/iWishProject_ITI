package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Blend;
import javafx.scene.layout.AnchorPane;

public class serverUI extends AnchorPane {

    protected final TextArea txtLog;
    protected final ToggleButton btnStart;
    protected final Blend blend;
    protected final Button btnAdd;
    protected final Label label;
    protected final Label lblClients;

    public serverUI() {

        txtLog = new TextArea();
        btnStart = new ToggleButton();
        blend = new Blend();
        btnAdd = new Button();
        label = new Label();
        lblClients = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(690.0);

        txtLog.setEditable(false);
        txtLog.setLayoutX(14.0);
        txtLog.setLayoutY(14.0);
        txtLog.setPrefHeight(430.0);
        txtLog.setPrefWidth(663.0);

        btnStart.setLayoutX(206.0);
        btnStart.setLayoutY(452.0);
        btnStart.setMnemonicParsing(false);
        btnStart.setText("Start/Stop");

        btnStart.setEffect(blend);

        btnAdd.setLayoutX(338.0);
        btnAdd.setLayoutY(452.0);
        btnAdd.setMnemonicParsing(false);
        btnAdd.setText("Add items");

        label.setLayoutX(262.0);
        label.setLayoutY(532.0);
        label.setText("Number of connected clients: ");

        lblClients.setLayoutX(422.0);
        lblClients.setLayoutY(532.0);
        lblClients.setText("0");
        lblClients.setTextFill(javafx.scene.paint.Color.valueOf("#f50505"));

        getChildren().add(txtLog);
        getChildren().add(btnStart);
        getChildren().add(btnAdd);
        getChildren().add(label);
        getChildren().add(lblClients);

    }

    public TextArea getTxtLog() {
        return txtLog;
    }

    public ToggleButton getBtnStart() {
        return btnStart;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Label getLblClients() {
        return lblClients;
    }
    
    
}
