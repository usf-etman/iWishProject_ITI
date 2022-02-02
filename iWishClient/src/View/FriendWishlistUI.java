package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import model.Item;

public  class FriendWishlistUI extends BorderPane {

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
    protected final StackPane stackPane1;
    protected final AnchorPane anchorPane1;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final BorderPane borderPane;
    protected final Label lblName;
    protected final FlowPane flowPane;
    protected final Label label;
    protected final StackPane stackPane2;
    protected final TableView<Item> tableView;
    protected final TableColumn<Item, Integer> colWishID;
    protected final TableColumn<Item, String> colWishname;
    protected final TableColumn<Item, String> colWishprice;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final BorderPane borderPane0;
    protected final Label label0;
    protected final BorderPane borderPane1;
    protected final Spinner<Integer> spinAmount;
    protected final Label label1;
    protected final BorderPane borderPane2;
    protected final Button btnContribute;
    protected final DropShadow dropShadow;
    protected final Label lblResult;

    public FriendWishlistUI() {

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
        stackPane1 = new StackPane();
        anchorPane1 = new AnchorPane();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        borderPane = new BorderPane();
        lblName = new Label();
        flowPane = new FlowPane();
        label = new Label();
        stackPane2 = new StackPane();
        tableView = new TableView<Item>();
        colWishID = new TableColumn<Item, Integer>();
        colWishname = new TableColumn<Item, String>();
        colWishprice = new TableColumn<Item, String>();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        borderPane0 = new BorderPane();
        label0 = new Label();
        borderPane1 = new BorderPane();
        spinAmount = new Spinner<Integer>();
        label1 = new Label();
        borderPane2 = new BorderPane();
        btnContribute = new Button();
        dropShadow = new DropShadow();
        lblResult = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(666.0);
        setPrefWidth(892.0);

        BorderPane.setAlignment(stackPane, javafx.geometry.Pos.CENTER);
        stackPane.setPrefHeight(44.0);
        stackPane.setPrefWidth(892.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        rectangle.setHeight(44.0);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(892.0);

        anchorPane.setPrefHeight(40.0);
        anchorPane.setPrefWidth(768.0);

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
        setTop(stackPane);

        BorderPane.setAlignment(stackPane1, javafx.geometry.Pos.CENTER);
        stackPane1.setPrefHeight(150.0);
        stackPane1.setPrefWidth(200.0);

        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        imageView1.setFitHeight(270.0);
        imageView1.setFitWidth(400.0);
        imageView1.setLayoutY(351.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        imageView2.setFitHeight(270.0);
        imageView2.setFitWidth(400.0);
        imageView2.setLayoutX(715.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setRotate(180.0);
        imageView2.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(291.33331298828125);
        columnConstraints.setMinWidth(0.0);
        columnConstraints.setPrefWidth(180.3333339691162);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(796.6666679382324);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(530.3333740234375);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(191.3333740234375);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(178.6666259765625);

        rowConstraints.setMaxHeight(201.3333282470703);
        rowConstraints.setMinHeight(1.3333320617675781);
        rowConstraints.setPrefHeight(1.3333320617675781);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(413.6666679382324);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(413.6666679382324);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(borderPane, 1);
        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(lblName, javafx.geometry.Pos.CENTER);
        lblName.setText("Youssef Etman");
        lblName.setTextFill(javafx.scene.paint.Color.valueOf("#2883b8"));
        lblName.setFont(new Font("Lucida Bright Regular", 30.0));
        borderPane.setCenter(lblName);

        BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
        flowPane.setPrefHeight(21.0);
        flowPane.setPrefWidth(531.0);

        label.setPrefHeight(47.0);
        label.setPrefWidth(245.0);
        label.setText("Your friend wish list");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#2883b8"));
        label.setFont(new Font("Edwardian Script ITC", 34.0));
        borderPane.setBottom(flowPane);

        GridPane.setColumnIndex(stackPane2, 1);
        GridPane.setRowIndex(stackPane2, 1);
        stackPane2.setPrefHeight(150.0);
        stackPane2.setPrefWidth(200.0);

        tableView.setPrefHeight(25.0);
        tableView.setPrefWidth(25.0);

        colWishID.setMaxWidth(0.0);
        colWishID.setMinWidth(0.0);
        colWishID.setPrefWidth(0.0);
        colWishID.setText("uid");
        colWishID.setCellValueFactory(new PropertyValueFactory("id"));

        colWishname.setPrefWidth(330.0);
        colWishname.setText("Wish Name");
        colWishname.setCellValueFactory(new PropertyValueFactory("name"));

        colWishprice.setMinWidth(0.0);
        colWishprice.setPrefWidth(201.0);
        colWishprice.setText("Wish Price");
        colWishprice.setCellValueFactory(new PropertyValueFactory("price"));

        GridPane.setColumnIndex(gridPane0, 1);
        GridPane.setRowIndex(gridPane0, 2);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(label0, javafx.geometry.Pos.CENTER);
        label0.setText("Do you want to make your friend happier?!!");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#2883b8"));
        label0.setFont(new Font("Edwardian Script ITC", 41.0));
        borderPane0.setLeft(label0);

        GridPane.setRowIndex(borderPane1, 1);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(spinAmount, javafx.geometry.Pos.CENTER);
        spinAmount.setEditable(true);
        borderPane1.setCenter(spinAmount);

        BorderPane.setAlignment(label1, javafx.geometry.Pos.CENTER);
        label1.setPrefHeight(37.0);
        label1.setPrefWidth(220.0);
        label1.setText("Countribute with..");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#2883b8"));
        label1.setFont(new Font("Edwardian Script ITC", 35.0));
        borderPane1.setLeft(label1);

        GridPane.setRowIndex(borderPane2, 2);
        borderPane2.setPrefHeight(200.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(btnContribute, javafx.geometry.Pos.CENTER);
        btnContribute.setMnemonicParsing(false);
        btnContribute.setPrefHeight(46.0);
        btnContribute.setPrefWidth(129.0);
        btnContribute.setStyle("-fx-background-color: #f1faee;");
        btnContribute.setText("Contribute");
        btnContribute.setTextFill(javafx.scene.paint.Color.valueOf("#226e9a"));

        dropShadow.setBlurType(javafx.scene.effect.BlurType.ONE_PASS_BOX);
        btnContribute.setEffect(dropShadow);
        btnContribute.setFont(new Font("Forte", 20.0));
        borderPane2.setCenter(btnContribute);

        BorderPane.setAlignment(lblResult, javafx.geometry.Pos.CENTER);
        lblResult.setTextFill(javafx.scene.paint.Color.valueOf("#2883b8"));
        lblResult.setFont(new Font("Edwardian Script ITC", 25.0));
        borderPane2.setRight(lblResult);
        setCenter(stackPane1);

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
        anchorPane1.getChildren().add(imageView1);
        anchorPane1.getChildren().add(imageView2);
        stackPane1.getChildren().add(anchorPane1);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        flowPane.getChildren().add(label);
        gridPane.getChildren().add(borderPane);
        tableView.getColumns().add(colWishID);
        tableView.getColumns().add(colWishname);
        tableView.getColumns().add(colWishprice);
        stackPane2.getChildren().add(tableView);
        gridPane.getChildren().add(stackPane2);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getChildren().add(borderPane0);
        gridPane0.getChildren().add(borderPane1);
        gridPane0.getChildren().add(borderPane2);
        gridPane.getChildren().add(gridPane0);
        stackPane1.getChildren().add(gridPane);

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

    public Label getLblName() {
        return lblName;
    }

    public TableView<Item> getTableView() {
        return tableView;
    }

    public Spinner<Integer> getSpinAmount() {
        return spinAmount;
    }

    public Button getBtnContribute() {
        return btnContribute;
    }

    public Label getLblResult() {
        return lblResult;
    }
    
}
