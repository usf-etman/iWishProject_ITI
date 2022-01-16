package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class itemsUI extends AnchorPane {

    protected final TableView tableItems;
    protected final TableColumn colName;
    protected final TableColumn colPrice;
    protected final TableColumn colDesc;
    protected final Button btnDelete;
    protected final Button btnUpdate;
    protected final Button btnAmazon;
    protected final Button btnInsert;

    public itemsUI() {

        tableItems = new TableView();
        colName = new TableColumn();
        colPrice = new TableColumn();
        colDesc = new TableColumn();
        btnDelete = new Button();
        btnUpdate = new Button();
        btnAmazon = new Button();
        btnInsert = new Button();

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

        colName.setMaxWidth(250.0);
        colName.setPrefWidth(250.0);
        colName.setText("Name");

        colPrice.setMaxWidth(90.0);
        colPrice.setMinWidth(0.0);
        colPrice.setPrefWidth(90.0);
        colPrice.setText("Price");

        colDesc.setMaxWidth(410.0);
        colDesc.setPrefWidth(410.0);
        colDesc.setText("Description");

        btnDelete.setLayoutX(295.0);
        btnDelete.setLayoutY(561.0);
        btnDelete.setMnemonicParsing(false);
        btnDelete.setText("Remove");

        btnUpdate.setLayoutX(365.0);
        btnUpdate.setLayoutY(561.0);
        btnUpdate.setMnemonicParsing(false);
        btnUpdate.setText("Update");

        btnAmazon.setLayoutX(294.0);
        btnAmazon.setLayoutY(593.0);
        btnAmazon.setMnemonicParsing(false);
        btnAmazon.setPrefWidth(183.0);
        btnAmazon.setText("Add items from Amazon Egypt");

        btnInsert.setLayoutX(430.0);
        btnInsert.setLayoutY(561.0);
        btnInsert.setMnemonicParsing(false);
        btnInsert.setText("Insert");

        tableItems.getColumns().add(colName);
        tableItems.getColumns().add(colPrice);
        tableItems.getColumns().add(colDesc);
        getChildren().add(tableItems);
        getChildren().add(btnDelete);
        getChildren().add(btnUpdate);
        getChildren().add(btnAmazon);
        getChildren().add(btnInsert);

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

    public Button getBtnDelete() {
        return btnDelete;
    }

    public Button getBtnUpdate() {
        return btnUpdate;
    }

    public Button getBtnAmazon() {
        return btnAmazon;
    }

    public Button getBtnInsert() {
        return btnInsert;
    }
    
    
}
