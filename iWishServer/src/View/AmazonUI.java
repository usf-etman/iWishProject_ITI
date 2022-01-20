package View;

import model.Item;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class AmazonUI extends AnchorPane {

    protected final TableView<Item> tableItems;
    protected final TableColumn<Item, Integer> colID;
    protected final TableColumn<Item, String> colName;
    protected final TableColumn<Item, String> colPrice;
    protected final TableColumn<Item, String> colDesc;
    protected final Button btnElectronics;
    protected final Button btnFashion;
    protected final Button btnAdd;
    protected final Label lblTest;
    protected final Label lblAdded;

    public AmazonUI() {

        tableItems = new TableView<Item>();
        colID = new TableColumn<Item, Integer>();
        colName = new TableColumn<Item, String>();
        colPrice = new TableColumn<Item, String>();
        colDesc = new TableColumn<Item, String>();
        btnElectronics = new Button();
        btnFashion = new Button();
        btnAdd = new Button();
        lblAdded = new Label();
        lblTest = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(628.0);
        setPrefWidth(850.0);

        tableItems.setLayoutX(8.0);
        tableItems.setLayoutY(60.0);
        tableItems.setPrefHeight(493.0);
        tableItems.setPrefWidth(835.0);
        
        lblTest.setLayoutX(8);
        lblTest.setLayoutY(25);
        
        colID.setMaxWidth(35.0);
        colID.setPrefWidth(35.0);
        colID.setText("ID");
        colID.setCellValueFactory(new PropertyValueFactory("id"));

        colName.setMaxWidth(260.0);
        colName.setPrefWidth(260.0);
        colName.setText("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));

        colPrice.setMaxWidth(90.0);
        colPrice.setMinWidth(0.0);
        colPrice.setPrefWidth(90.0);
        colPrice.setText("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));

        colDesc.setMaxWidth(450.0);
        colDesc.setPrefWidth(450.0);
        colDesc.setText("Description");
        colDesc.setCellValueFactory(new PropertyValueFactory("desc"));

        btnElectronics.setLayoutX(281.0);
        btnElectronics.setLayoutY(25.0);
        btnElectronics.setMnemonicParsing(false);
        btnElectronics.setText("Amazon Electronics");

        btnFashion.setLayoutX(532.0);
        btnFashion.setLayoutY(25.0);
        btnFashion.setMnemonicParsing(false);
        btnFashion.setText("Amazon Fashion");
        
        btnAdd.setLayoutX(442.0);
        btnAdd.setLayoutY(562.0);
        btnAdd.setMnemonicParsing(false);
        btnAdd.setText("Add");
        
        lblAdded.setLayoutX(375.0);
        lblAdded.setLayoutY(588.0);

        getChildren().add(tableItems);
        getChildren().add(btnElectronics);
        getChildren().add(btnFashion);
        getChildren().add(btnAdd);
        getChildren().add(lblAdded);
        getChildren().add(lblTest);

        tableItems.getColumns().setAll(colID, colName, colPrice, colDesc);
        //Item item = new Item(0, "item name", "987", "item desc");
        
        //tableItems.getItems().add(item);
    }

    public TableView<Item> getTableItems() {
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

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Label getLblAdded() {
        return lblAdded;
    } 
}
