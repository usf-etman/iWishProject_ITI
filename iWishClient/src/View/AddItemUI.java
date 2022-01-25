package View;

import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import model.Item;

public  class AddItemUI extends AnchorPane {

    protected final StackPane stackPane;
    protected final Rectangle rectangle;
    protected final AnchorPane anchorPane;
    protected final Button btnProfile;
    protected final Button btnFriends;
    protected final Button btnItems;
    protected final Button btnNotifications;
    protected final Button btnSignout;
    protected final StackPane stackPane0;
    protected final Rectangle rectangle0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Separator separator;
    protected final Separator separator0;
    protected final Separator separator1;
    protected final Separator separator2;
    protected final Separator separator3;
    protected final Pane pane;
     protected final TableView<Item> tableView;
    protected final TableColumn<Item, Integer> ItemID;
    protected final TableColumn<Item, String> ItemName;
    protected final TableColumn<Item, String> ItemPrice;
    protected final TableColumn<Item, String> ItemDescription;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final Button btnAddIIem;

    public AddItemUI() {

        stackPane = new StackPane();
        rectangle = new Rectangle();
        anchorPane = new AnchorPane();
        btnProfile = new Button();
        btnFriends = new Button();
        btnItems = new Button();
        btnNotifications = new Button();
        btnSignout = new Button();
        stackPane0 = new StackPane();
        rectangle0 = new Rectangle();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        separator = new Separator();
        separator0 = new Separator();
        separator1 = new Separator();
        separator2 = new Separator();
        separator3 = new Separator();
        pane = new Pane();
          tableView = new TableView<Item>();
          ItemID = new TableColumn<Item, Integer>();
        ItemName = new TableColumn<Item, String>();
        ItemPrice = new TableColumn<Item, String>();
        ItemDescription = new TableColumn<Item, String>();       
        
       
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        btnAddIIem = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(675.0);
        setPrefWidth(902.0);

        stackPane.setLayoutX(10.0);
        stackPane.setLayoutY(10.0);
        stackPane.setPrefHeight(44.0);
        stackPane.setPrefWidth(892.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        rectangle.setHeight(44.0);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(892.0);

        anchorPane.setPrefHeight(89.0);
        anchorPane.setPrefWidth(892.0);

        btnProfile.setLayoutX(202.0);
        btnProfile.setLayoutY(1.0);
        btnProfile.setMnemonicParsing(false);
        btnProfile.setPrefHeight(41.0);
        btnProfile.setPrefWidth(59.0);
        btnProfile.setStyle("-fx-background-color: #34656D;");
        btnProfile.setText("Profile");
        btnProfile.setTextFill(javafx.scene.paint.Color.WHITE);
        btnProfile.setFont(new Font("Cambria Bold", 13.0));

        btnFriends.setLayoutX(261.0);
        btnFriends.setLayoutY(1.0);
        btnFriends.setMnemonicParsing(false);
        btnFriends.setPrefHeight(41.0);
        btnFriends.setPrefWidth(64.0);
        btnFriends.setStyle("-fx-background-color: #34656D;");
        btnFriends.setText("Friends");
        btnFriends.setTextFill(javafx.scene.paint.Color.WHITE);
        btnFriends.setFont(new Font("Cambria Bold", 13.0));

        btnItems.setLayoutX(325.0);
        btnItems.setLayoutY(1.0);
        btnItems.setMnemonicParsing(false);
        btnItems.setPrefHeight(41.0);
        btnItems.setPrefWidth(52.0);
        btnItems.setStyle("-fx-background-color: #34656D;");
        btnItems.setText("Items");
        btnItems.setTextFill(javafx.scene.paint.Color.WHITE);
        btnItems.setFont(new Font("Cambria Bold", 13.0));

        btnNotifications.setLayoutX(377.0);
        btnNotifications.setLayoutY(1.0);
        btnNotifications.setMnemonicParsing(false);
        btnNotifications.setPrefHeight(41.0);
        btnNotifications.setPrefWidth(97.0);
        btnNotifications.setStyle("-fx-background-color: #34656D;");
        btnNotifications.setText("Notifications");
        btnNotifications.setTextFill(javafx.scene.paint.Color.WHITE);
        btnNotifications.setFont(new Font("Cambria Bold", 13.0));

        btnSignout.setLayoutX(474.0);
        btnSignout.setLayoutY(1.0);
        btnSignout.setMnemonicParsing(false);
        btnSignout.setPrefHeight(41.0);
        btnSignout.setPrefWidth(72.0);
        btnSignout.setStyle("-fx-background-color: #34656D;");
        btnSignout.setText("Sign Out");
        btnSignout.setTextFill(javafx.scene.paint.Color.WHITE);
        btnSignout.setFont(new Font("Cambria Bold", 13.0));

        stackPane0.setLayoutY(-1.0);
        stackPane0.setPrefHeight(45.0);
        stackPane0.setPrefWidth(200.0);

        rectangle0.setArcHeight(10.0);
        rectangle0.setArcWidth(10.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle0.setHeight(45.0);
        rectangle0.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(200.0);

        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        imageView.setFitHeight(39.0);
        imageView.setFitWidth(39.0);
        imageView.setLayoutX(14.0);
        imageView.setLayoutY(3.0);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(37.0);
        imageView0.setFitWidth(111.0);
        imageView0.setLayoutX(69.0);
        imageView0.setLayoutY(2.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        separator.setLayoutX(261.0);
        separator.setLayoutY(1.0);
        separator.setOpacity(0.1);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(41.0);
        separator.setPrefWidth(1.0);

        separator0.setLayoutX(325.0);
        separator0.setLayoutY(1.0);
        separator0.setOpacity(0.1);
        separator0.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator0.setPrefHeight(41.0);
        separator0.setPrefWidth(1.0);

        separator1.setLayoutX(377.0);
        separator1.setLayoutY(1.0);
        separator1.setOpacity(0.1);
        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(41.0);
        separator1.setPrefWidth(1.0);

        separator2.setLayoutX(474.0);
        separator2.setLayoutY(1.0);
        separator2.setOpacity(0.1);
        separator2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator2.setPrefHeight(41.0);
        separator2.setPrefWidth(1.0);

        separator3.setLayoutX(543.0);
        separator3.setLayoutY(1.0);
        separator3.setOpacity(0.1);
        separator3.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator3.setPrefHeight(41.0);
        separator3.setPrefWidth(1.0);

        pane.setLayoutX(-2.0);
        pane.setLayoutY(154.0);
        pane.setPrefHeight(10.0);
        pane.setPrefWidth(903.0);
        pane.setStyle("-fx-background-color: #34656D;");

        tableView.setLayoutY(161.0);
        tableView.setPrefHeight(443.0);
        tableView.setPrefWidth(903.0);

        ItemID.setMaxWidth(0.0);
        ItemID.setMinWidth(0.0);
        ItemID.setPrefWidth(0.0);
        ItemID.setResizable(false);
        ItemID.setStyle("-fx-background-color: #B8DFD8;");
        ItemID.setText("Item-ID");
        ItemID.setCellValueFactory(new PropertyValueFactory("id"));

        ItemName.setPrefWidth(319.0);
        ItemName.setResizable(false);
        ItemName.setStyle("-fx-background-color: #B8DFD8;");
        ItemName.setText("Item-Name");
        ItemName.setCellValueFactory(new PropertyValueFactory("name"));


        ItemPrice.setPrefWidth(189.0);
        ItemPrice.setResizable(false);
        ItemPrice.setStyle("-fx-background-color: #B8DFD8;");
        ItemPrice.setText("Item-Price");
        ItemPrice.setCellValueFactory(new PropertyValueFactory("price"));
        
        ItemDescription.setPrefWidth(394.0);
        ItemDescription.setResizable(false);
        ItemDescription.setStyle("-fx-background-color: #B8DFD8;");
        ItemDescription.setText("Item-Description");
        ItemDescription.setCellValueFactory(new PropertyValueFactory("desc"));

        imageView1.setFitHeight(84.0);
        imageView1.setFitWidth(222.0);
        imageView1.setLayoutY(70.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        imageView2.setFitHeight(311.0);
        imageView2.setFitWidth(404.0);
        imageView2.setLayoutX(139.0);
        imageView2.setLayoutY(-8.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/items.png").toExternalForm()));

        imageView3.setFitHeight(100.0);
        imageView3.setFitWidth(92.0);
        imageView3.setLayoutX(837.0);
        imageView3.setLayoutY(54.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        btnAddIIem.setLayoutX(352.0);
        btnAddIIem.setLayoutY(604.0);
        btnAddIIem.setMnemonicParsing(false);
        btnAddIIem.setPrefHeight(67.0);
        btnAddIIem.setPrefWidth(209.0);
        btnAddIIem.setStyle("-fx-background-color: #34656D;");
        btnAddIIem.setText("add to your wish list");
        btnAddIIem.setTextFill(javafx.scene.paint.Color.valueOf("#f8f5f5"));
        btnAddIIem.setFont(new Font("Bodoni MT", 18.0));

        stackPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(btnProfile);
        anchorPane.getChildren().add(btnFriends);
        anchorPane.getChildren().add(btnItems);
        anchorPane.getChildren().add(btnNotifications);
        anchorPane.getChildren().add(btnSignout);
        stackPane0.getChildren().add(rectangle0);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        stackPane0.getChildren().add(anchorPane0);
        anchorPane.getChildren().add(stackPane0);
        anchorPane.getChildren().add(separator);
        anchorPane.getChildren().add(separator0);
        anchorPane.getChildren().add(separator1);
        anchorPane.getChildren().add(separator2);
        anchorPane.getChildren().add(separator3);
        stackPane.getChildren().add(anchorPane);
        getChildren().add(stackPane);
        getChildren().add(pane);
        /*tableView.getColumns().add(ItemID);
        tableView.getColumns().add(ItemName);
        tableView.getColumns().add(ItemPrice);
        tableView.getColumns().add(ItemDescription);*/
        getChildren().add(tableView);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(imageView3);
        getChildren().add(btnAddIIem);
        tableView.getColumns().setAll(ItemID,ItemName, ItemPrice, ItemDescription);

    }

    public Button getBtnProfile() {
        return btnProfile;
    }

    public Button getBtnFriends() {
        return btnFriends;
    }

    public Button getBtnItems() {
        return btnItems;
    }

    public Button getBtnNotifications() {
        return btnNotifications;
    }

    public Button getBtnSignout() {
        return btnSignout;
    }

    public TableView<Item> getTableView() {
        return tableView;
    }

    public TableColumn<Item, Integer> getItemID() {
        return ItemID;
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
