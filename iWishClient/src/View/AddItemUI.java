package View;

import model.Item;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class AddItemUI extends AnchorPane {

    protected final TableView<Item> tableView;
    protected final TableColumn<Item, String> ItemName;
    protected final TableColumn<Item, String> ItemPrice;
    protected final TableColumn<Item, String> ItemDescription;
    protected final Pane pane;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Button btnAddIIem;
    protected final ImageView imageView1;

    public AddItemUI() {

        tableView = new TableView<Item>();
        ItemName = new TableColumn<Item, String>();
        ItemPrice = new TableColumn<Item, String>();
        ItemDescription = new TableColumn<Item, String>();
        pane = new Pane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        btnAddIIem = new Button();
        imageView1 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        tableView.setLayoutX(-2.0);
        tableView.setLayoutY(84.0);
        tableView.setPrefHeight(266.0);
        tableView.setPrefWidth(614.0);

        ItemName.setPrefWidth(196.0);
        ItemName.setResizable(false);
        ItemName.setStyle("-fx-background-color: #B8DFD8;");
        ItemName.setText("Item-Name");
        ItemName.setCellValueFactory(new PropertyValueFactory("name"));

        ItemPrice.setPrefWidth(127.0);
        ItemPrice.setResizable(false);
        ItemPrice.setStyle("-fx-background-color: #B8DFD8;");
        ItemPrice.setText("Item-Price");
        ItemPrice.setCellValueFactory(new PropertyValueFactory("price"));

        ItemDescription.setPrefWidth(290.0);
        ItemDescription.setResizable(false);
        ItemDescription.setStyle("-fx-background-color: #B8DFD8;");
        ItemDescription.setText("Item-Description");
        ItemDescription.setCellValueFactory(new PropertyValueFactory("desc"));

        pane.setLayoutY(85.0);
        pane.setPrefHeight(6.0);
        pane.setPrefWidth(614.0);
        pane.setStyle("-fx-background-color: #34656D;");

        imageView.setFitHeight(72.0);
        imageView.setFitWidth(162.0);
        imageView.setLayoutY(5.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        imageView0.setFitHeight(272.0);
        imageView0.setFitWidth(266.0);
        imageView0.setLayoutX(105.0);
        imageView0.setLayoutY(-66.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/items.png").toExternalForm()));

        btnAddIIem.setLayoutX(216.0);
        btnAddIIem.setLayoutY(350.0);
        btnAddIIem.setMnemonicParsing(false);
        btnAddIIem.setPrefHeight(52.0);
        btnAddIIem.setPrefWidth(179.0);
        btnAddIIem.setStyle("-fx-background-color: #34656D;");
        btnAddIIem.setText("add to your wish list");
        btnAddIIem.setTextFill(javafx.scene.paint.Color.valueOf("#f8f5f5"));
        btnAddIIem.setFont(new Font("Bodoni MT", 18.0));

        imageView1.setFitHeight(91.0);
        imageView1.setFitWidth(69.0);
        imageView1.setLayoutX(554.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        /*tableView.getColumns().add(ItemName);
        tableView.getColumns().add(ItemPrice);
        tableView.getColumns().add(ItemDescription);*/
        getChildren().add(tableView);
        getChildren().add(pane);
        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(btnAddIIem);
        getChildren().add(imageView1);
        tableView.getColumns().setAll(ItemName, ItemPrice, ItemDescription);
    }

    
    
    /*public Button getBtnAddIIem() {
        return btnAddIIem;
    }*/

    public TableView<Item> getTableView() {
        return tableView;
    }

    public TableColumn<Item, String> getItemName() {
        return ItemName;
    }

    public TableColumn<Item, String> getItemPrice() {
        return ItemPrice;
    }

    public TableColumn<Item, String> getItemDescription() {
        return ItemDescription;
    }

    public Button getBtnAddIIem() {
        return btnAddIIem;
    }
    

}
