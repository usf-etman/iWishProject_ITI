package View;

import model.Item;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class AmazonUI extends AnchorPane {

    protected final TableView tableItems;
    protected final TableColumn colName;
    protected final TableColumn colPrice;
    protected final TableColumn colDesc;
    protected final Button btnElectronics;
    protected final Button btnFashion;
    protected final Label lblTest;

    public AmazonUI() {

        tableItems = new TableView();
        colName = new TableColumn();
        colPrice = new TableColumn();
        colDesc = new TableColumn();
        btnElectronics = new Button();
        btnFashion = new Button();
        lblTest = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(628.0);
        setPrefWidth(765.0);

        tableItems.setLayoutX(8.0);
        tableItems.setLayoutY(60.0);
        tableItems.setPrefHeight(493.0);
        tableItems.setPrefWidth(750.0);
        
        lblTest.setLayoutX(8);
        lblTest.setLayoutY(25);
        lblTest.setText("test label");

        colName.setMaxWidth(250.0);
        colName.setPrefWidth(250.0);
        colName.setText("Name");
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));

        colPrice.setMaxWidth(90.0);
        colPrice.setMinWidth(0.0);
        colPrice.setPrefWidth(90.0);
        colPrice.setText("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        colDesc.setMaxWidth(410.0);
        colDesc.setPrefWidth(410.0);
        colDesc.setText("Description");
        colDesc.setCellValueFactory(new PropertyValueFactory<>("desc"));

        btnElectronics.setLayoutX(196.0);
        btnElectronics.setLayoutY(25.0);
        btnElectronics.setMnemonicParsing(false);
        btnElectronics.setText("Amazon Electronics");

        btnFashion.setLayoutX(447.0);
        btnFashion.setLayoutY(25.0);
        btnFashion.setMnemonicParsing(false);
        btnFashion.setText("Amazon Fashion");

        getChildren().add(tableItems);
        getChildren().add(btnElectronics);
        getChildren().add(btnFashion);
        getChildren().add(lblTest);

        tableItems.getColumns().addAll(colName, colPrice, colDesc);
    }

    public TableView getTableItems() {
        return tableItems;
    }

    public TableColumn getColName() {
        return colName;
    }

    public TableColumn getColPrice() {
        return colPrice;
    }

    public TableColumn getColDesc() {
        return colDesc;
    }

    public Button getBtnElectronics() {
        return btnElectronics;
    }

    public Button getBtnFashion() {
        return btnFashion;
    }

    public Label getLblTest() {
        return lblTest;
    }
    
    
    
}
