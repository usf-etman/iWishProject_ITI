package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
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
    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Button btnback;

    public itemsUI() {
  tableItems = new TableView<Item>();
        colName = new TableColumn<Item, String>();
        colPrice = new TableColumn<Item, String>();
        colDesc = new TableColumn<Item, String>();
     
        colID = new TableColumn<Item,Integer>();
        
    
        btnAmazon = new Button();
        btnDelete = new Button();
        btnInsert = new Button();
        rectangle = new Rectangle();
        imageView = new ImageView();
        imageView0 = new ImageView();
        btnback = new Button();

        setId("AnchorPane");
        setPrefHeight(813.0);
        setPrefWidth(979.0);

        tableItems.setLayoutX(257.0);
        tableItems.setLayoutY(70.0);
        tableItems.setPrefHeight(758.0);
        tableItems.setPrefWidth(916.0);

        colID.setMaxWidth(65.0);
        colID.setMinWidth(0.0);
        colID.setPrefWidth(0.0);
        colID.setText("ID");
        colName.setCellValueFactory(new PropertyValueFactory("ID"));

        colName.setMaxWidth(410.0);
        colName.setMinWidth(0.0);
        colName.setPrefWidth(409.99996948242188);
        colName.setText("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));

        colDesc.setMaxWidth(410.0);
        colDesc.setPrefWidth(410.0);
        colDesc.setText("Description");
        colDesc.setCellValueFactory(new PropertyValueFactory("desc"));

        colPrice.setMaxWidth(90.0);
        colPrice.setPrefWidth(90.0);
        colPrice.setText("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));

        btnAmazon.setLayoutX(14.0);
        btnAmazon.setLayoutY(544.0);
        btnAmazon.setMnemonicParsing(false);
        btnAmazon.setPrefHeight(31.0);
        btnAmazon.setPrefWidth(241.0);
        btnAmazon.setText("Add items from Amazon Egypt");
        btnAmazon.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        btnDelete.setLayoutX(34.0);
        btnDelete.setLayoutY(371.0);
        btnDelete.setMnemonicParsing(false);
        btnDelete.setText("Remove");
        btnDelete.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        btnInsert.setLayoutX(162.0);
        btnInsert.setLayoutY(371.0);
        btnInsert.setMnemonicParsing(false);
        btnInsert.setText("Insert");
        btnInsert.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#114e86"));
        rectangle.setHeight(76.0);
        rectangle.setLayoutX(252.0);
        rectangle.setLayoutY(-5.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(925.0);

        imageView.setFitHeight(70.0);
        imageView.setFitWidth(108.0);
        imageView.setLayoutX(17.0);
        imageView.setLayoutY(14.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(97.0);
        imageView0.setFitWidth(167.0);
        imageView0.setLayoutX(79.0);
        imageView0.setLayoutY(8.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        btnback.setLayoutX(102.0);
        btnback.setLayoutY(688.0);
        btnback.setMnemonicParsing(false);
        btnback.setText("BACK");
        btnback.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        tableItems.getColumns().add(colID);
        tableItems.getColumns().add(colName);
        tableItems.getColumns().add(colDesc);
        tableItems.getColumns().add(colPrice);
        getChildren().add(tableItems);
        getChildren().add(btnAmazon);
        getChildren().add(btnDelete);
        getChildren().add(btnInsert);
        getChildren().add(rectangle);
        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(btnback);

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

    public TableColumn<Item, String> getColDesc() {
        return colDesc;
    }

    public TableColumn<Item, Integer> getColID() {
        return colID;
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

    public Button getBtnback() {
        return btnback;
    }
}
