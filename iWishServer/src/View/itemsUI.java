package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Item;

public  class itemsUI extends AnchorPane {
protected final TableView<Item> tableItems;
    protected final TableColumn<Item, String> colName;
    protected final TableColumn<Item, String> colPrice;
    protected final TableColumn<Item, String> colDesc;
 
    protected final TableColumn<Item,Integer> colID;

    protected final Button btnAmazon;
    protected final Button btnDelete;
    protected final Button btnInsert;

    public itemsUI() {
        tableItems = new TableView<Item>();
        colName = new TableColumn<Item, String>();
        colPrice = new TableColumn<Item, String>();
        colDesc = new TableColumn<Item, String>();
     
        colID = new TableColumn<Item,Integer>();
        
        btnAmazon = new Button();
        btnDelete = new Button();
        btnInsert = new Button();

        setId("AnchorPane");
        setPrefHeight(892.0);
        setPrefWidth(1266.0);

        tableItems.setLayoutX(18.0);
        tableItems.setLayoutY(70.0);
        tableItems.setPrefHeight(676.0);
        tableItems.setPrefWidth(900.0);

        colID.setMaxWidth(0.0);
        colID.setMinWidth(0.0);
        colID.setPrefWidth(0.0);
        colID.setText("ID");

        colName.setMaxWidth(90.0);
        colName.setMinWidth(0.0);
        colName.setPrefWidth(90.0);
        colName.setText("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));

        colPrice.setMaxWidth(410.0);
        colPrice.setPrefWidth(410.0);
        colPrice.setText("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));

        colDesc.setMaxWidth(410.0);
        colDesc.setPrefWidth(410.0);
        colDesc.setText("Description");
        colDesc.setCellValueFactory(new PropertyValueFactory("desc"));

        btnAmazon.setLayoutX(986.0);
        btnAmazon.setLayoutY(564.0);
        btnAmazon.setMnemonicParsing(false);
        btnAmazon.setPrefWidth(183.0);
        btnAmazon.setText("Add items from Amazon Egypt");

        btnDelete.setLayoutX(964.0);
        btnDelete.setLayoutY(408.0);
        btnDelete.setMnemonicParsing(false);
        btnDelete.setText("Remove");

        btnInsert.setLayoutX(1124.0);
        btnInsert.setLayoutY(408.0);
        btnInsert.setMnemonicParsing(false);
        btnInsert.setText("Insert");

        tableItems.getColumns().add(colID);
        tableItems.getColumns().add(colName);
        tableItems.getColumns().add(colPrice);
        tableItems.getColumns().add(colDesc);
        getChildren().add(tableItems);
        getChildren().add(btnAmazon);
        getChildren().add(btnDelete);
        getChildren().add(btnInsert);

    }

    public TableColumn<Item, String> getColName() {
        return colName;
    }

    public TableColumn<Item, String> getColPrice() {
        return colPrice;
    }

    public TableColumn<Item, String> getColDesc() {
        return colDesc;
    }

    public TableColumn<Item, Integer> getColID() {
        return colID;
    }

    public TableView<Item> getTableItems() {
        return tableItems;
    }

    public Button getBtnAmazon() {
        return btnAmazon;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public Button getBtnInsert() {
        return btnInsert;
    }
}
