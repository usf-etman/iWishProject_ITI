package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import model.Item;

public class AmazonUI extends AnchorPane {

    protected final TableView<Item> tableItems;
    protected final TableColumn<Item, String> colName;
    protected final TableColumn<Item, String> colPrice;
    protected final TableColumn<Item, String> colDesc;
    protected final TableColumn<Item, Integer> colID;

    protected final Button btnElectronics;
    protected final Button btnFashion;
    protected final Button btnAdd;
    protected final Label lblAdded;
    protected final Button btnback;
    protected final Label lblTest;
    protected final ImageView imageView;

    public AmazonUI() {
        tableItems = new TableView<Item>();
        colName = new TableColumn<Item, String>();
        colPrice = new TableColumn<Item, String>();
        colDesc = new TableColumn<Item, String>();
        colID = new TableColumn<Item, Integer>();
        lblTest = new Label();

        btnElectronics = new Button();
        btnFashion = new Button();
        btnAdd = new Button(); 
        lblAdded = new Label();
        btnback = new Button();
        imageView = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(628.0);
        setPrefWidth(765.0);

        tableItems.setLayoutX(8.0);
        tableItems.setLayoutY(75.0);
        tableItems.setPrefHeight(493.0);
        tableItems.setPrefWidth(750.0);
        colID.setMaxWidth(35.0);
        colID.setPrefWidth(35.0);
        colID.setText("ID");
        colID.setCellValueFactory(new PropertyValueFactory("id"));
        colName.setMaxWidth(250.0);
        colName.setPrefWidth(250.0);
        colName.setText("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));

        colPrice.setMaxWidth(90.0);
        colPrice.setMinWidth(0.0);
        colPrice.setPrefWidth(90.0);
        colPrice.setText("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));

        colDesc.setMaxWidth(410.0);
        colDesc.setPrefWidth(410.0);
        colDesc.setText("Description");
        colDesc.setCellValueFactory(new PropertyValueFactory("desc"));

        btnElectronics.setLayoutX(171.0);
        btnElectronics.setLayoutY(25.0);
        btnElectronics.setMnemonicParsing(false);
        btnElectronics.setText("Amazon Electronics");
        btnElectronics.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        btnFashion.setLayoutX(465.0);
        btnFashion.setLayoutY(25.0);
        btnFashion.setMnemonicParsing(false);
        btnFashion.setText("Amazon Fashion");
        btnFashion.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        btnAdd.setLayoutX(77.0);
        btnAdd.setLayoutY(573.0);
        btnAdd.setMnemonicParsing(false);
        btnAdd.setPrefHeight(31.0);
        btnAdd.setPrefWidth(85.0);
        btnAdd.setText("Add");
        btnAdd.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        lblAdded.setLayoutX(375.0);
        lblAdded.setLayoutY(588.0);
        lblAdded.setPrefHeight(17.0);
        lblAdded.setPrefWidth(177.0);

        btnback.setLayoutX(577.0);
        btnback.setLayoutY(568.0);
        btnback.setMnemonicParsing(false);
        btnback.setPrefHeight(31.0);
        btnback.setPrefWidth(71.0);
        btnback.setText("BACK");
        btnback.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        imageView.setFitHeight(69.0);
        imageView.setFitWidth(85.0);
        imageView.setLayoutX(25.0);
        imageView.setLayoutY(6.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        tableItems.getColumns().add(colName);
        tableItems.getColumns().add(colPrice);
        tableItems.getColumns().add(colDesc);
        getChildren().add(tableItems);
        getChildren().add(btnElectronics);
        getChildren().add(btnFashion);
        getChildren().add(btnAdd);
        getChildren().add(lblAdded);
        getChildren().add(btnback);
        getChildren().add(imageView);
        getChildren().add(lblTest);

        // tableItems.getColumns().setAll(colName, colPrice, colDesc);
        tableItems.getColumns().setAll(colID, colName, colPrice, colDesc);

    }

    public TableView<Item> getTableItems() {
        return tableItems;
    }

    public TableColumn<Item, String> getColName() {
        return colName;
    }

    public TableColumn<Item, String> getColPrice() {
        return colPrice;
    }

    public Label getLblAdded() {
        return lblAdded;
    }

    public TableColumn<Item, String> getColDesc() {
        return colDesc;
    }

    public Button getBtnElectronics() {
        return btnElectronics;
    }

    public Button getBtnFashion() {
        return btnFashion;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Label getLblTest() {
        return lblTest;
    }
    public Button getBtnback() {
        return btnback;
    }
}
