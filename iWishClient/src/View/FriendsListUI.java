package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import model.User;

public class FriendsListUI extends AnchorPane {

    protected final TableView<User> tableFriends;
    protected final TableColumn<User, String> colFriend;
    protected final TableColumn<User, Integer> colFid;

    protected final TableView<User> tableSuggest;
    protected final TableColumn<User, String> colSuggest;
    protected final TableColumn<User, Integer> colSid;

    protected final StackPane stackPane;
    protected final Rectangle rectangle;
    protected final AnchorPane anchorPane;
    protected final Button btn_profile;
    protected final Button btn_friends;
    protected final Button btn_items;
    protected final Button btn_signout;
    protected final Button btn_notifications;
    protected final StackPane stackPane0;
    protected final Rectangle rectangle0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane1;
    // protected final TableView tableView;

    // protected final TableColumn table_Friends;
    protected final Text text;
    protected final Rectangle rectangle1;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button btn_Show;
    protected final Button btn_Remove;
    protected final Button btn_Add;
    //protected final TableView tableView0;

    //protected final TableColumn table_suggest;
    public FriendsListUI() {
        tableFriends = new TableView<User>();
        colFid = new TableColumn<User, Integer>();
        colFriend = new TableColumn<User, String>();

        tableSuggest = new TableView<User>();
        colSid = new TableColumn<User, Integer>();
        colSuggest = new TableColumn<User, String>();

        stackPane = new StackPane();
        rectangle = new Rectangle();
        anchorPane = new AnchorPane();
        btn_profile = new Button();
        btn_friends = new Button();
        btn_items = new Button();
        btn_signout = new Button();
        btn_notifications = new Button();
        stackPane0 = new StackPane();
        rectangle0 = new Rectangle();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        anchorPane1 = new AnchorPane();
        //tableView = new TableView();

        //table_Friends = new TableColumn();
        text = new Text();
        rectangle1 = new Rectangle();
        text0 = new Text();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        btn_Show = new Button();
        btn_Remove = new Button();
        btn_Add = new Button();

        setId("AnchorPane");
        setPrefHeight(844.0);
        setPrefWidth(1168.0);

        stackPane.setLayoutX(270.0);
        stackPane.setLayoutY(-4.0);
        stackPane.setPrefHeight(82.0);
        stackPane.setPrefWidth(794.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        rectangle.setHeight(75.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(877.0);

        anchorPane.setPrefHeight(82.0);
        anchorPane.setPrefWidth(935.0);

        btn_profile.setLayoutX(53.0);
        btn_profile.setLayoutY(22.0);
        btn_profile.setMnemonicParsing(false);
        btn_profile.setStyle("-fx-background-color: #34656D;");
        btn_profile.setText("Profile");
        btn_profile.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_friends.setLayoutX(138.0);
        btn_friends.setLayoutY(22.0);
        btn_friends.setMnemonicParsing(false);
        btn_friends.setStyle("-fx-background-color: #34656D;");
        btn_friends.setText("Friends");
        btn_friends.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_items.setLayoutX(236.0);
        btn_items.setLayoutY(22.0);
        btn_items.setMnemonicParsing(false);
        btn_items.setStyle("-fx-background-color: #34656D;");
        btn_items.setText("Items");
        btn_items.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_signout.setLayoutX(439.0);
        btn_signout.setLayoutY(22.0);
        btn_signout.setMnemonicParsing(false);
        btn_signout.setStyle("-fx-background-color: #34656D;");
        btn_signout.setText("Sign Out");
        btn_signout.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_notifications.setLayoutX(310.0);
        btn_notifications.setLayoutY(22.0);
        btn_notifications.setMnemonicParsing(false);
        btn_notifications.setStyle("-fx-background-color: #34656D;");
        btn_notifications.setText("Notifications");
        btn_notifications.setTextFill(javafx.scene.paint.Color.WHITE);

        stackPane0.setLayoutX(-15.0);
        stackPane0.setLayoutY(-4.0);
        stackPane0.setPrefHeight(75.0);
        stackPane0.setPrefWidth(283.0);

        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle0.setHeight(79.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(293.0);

        anchorPane0.setLayoutX(2.0);
        anchorPane0.setLayoutY(3.0);
        anchorPane0.setPrefHeight(75.0);
        anchorPane0.setPrefWidth(274.0);

        imageView.setFitHeight(62.0);
        imageView.setFitWidth(76.0);
        imageView.setLayoutX(13.0);
        imageView.setLayoutY(7.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(75.0);
        imageView0.setFitWidth(210.0);
        imageView0.setLayoutX(66.0);
        imageView0.setLayoutY(-6.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        anchorPane1.setLayoutX(-5.0);
        anchorPane1.setLayoutY(78.0);
        anchorPane1.setPrefHeight(727.0);
        anchorPane1.setPrefWidth(1244.0);

        tableFriends.setLayoutX(190.0);
        tableFriends.setLayoutY(130.0);
        tableFriends.setPrefHeight(590.0);
        tableFriends.setPrefWidth(330.0);

        colFid.setMaxWidth(0.0);
        colFid.setMinWidth(0.0);
        colFid.setPrefWidth(0.0);
        colFid.setText("ID");
        colFid.setCellValueFactory(new PropertyValueFactory("UID"));

        colFriend.setMinWidth(0.0);
        colFriend.setPrefWidth(329.0);
        colFriend.setStyle("-fx-background-color: #34656d;");
        colFriend.setText("Name");
        colFriend.setCellValueFactory(new PropertyValueFactory("username"));

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(248.0);
        text.setLayoutY(107.0);
        text.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        text.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Friends List");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(161.20263671875);
        text.setFont(new Font("System Bold Italic", 26.0));

        rectangle1.setArcHeight(5.0);
        rectangle1.setArcWidth(5.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        rectangle1.setHeight(47.0);
        rectangle1.setLayoutY(717.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(1264.0);

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setLayoutX(697.0);
        text0.setLayoutY(109.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Suggestions");
        text0.setFont(new Font("System Bold Italic", 28.0));

        imageView1.setFitHeight(279.0);
        imageView1.setFitWidth(171.0);
        imageView1.setLayoutX(14.0);
        imageView1.setLayoutY(27.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        imageView2.setFitHeight(331.0);
        imageView2.setFitWidth(187.0);
        imageView2.setLayoutX(1063.0);
        imageView2.setLayoutY(353.0);
        imageView2.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        btn_Show.setLayoutX(89.0);
        btn_Show.setLayoutY(495.0);
        btn_Show.setMnemonicParsing(false);
        btn_Show.setPrefHeight(31.0);
        btn_Show.setPrefWidth(88.0);
        btn_Show.setStyle("-fx-background-color: #34656d;");
        btn_Show.setText("SHOW");
        btn_Show.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_Remove.setLayoutX(89.0);
        btn_Remove.setLayoutY(572.0);
        btn_Remove.setMnemonicParsing(false);
        btn_Remove.setPrefHeight(31.0);
        btn_Remove.setPrefWidth(88.0);
        btn_Remove.setStyle("-fx-background-color: #34656d;");
        btn_Remove.setText("Remove");
        btn_Remove.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_Add.setLayoutX(959.0);
        btn_Add.setLayoutY(382.0);
        btn_Add.setMnemonicParsing(false);
        btn_Add.setPrefHeight(37.0);
        btn_Add.setPrefWidth(104.0);
        btn_Add.setStyle("-fx-background-color: #34656d;");
        btn_Add.setText("ADD");
        btn_Add.setTextFill(javafx.scene.paint.Color.WHITE);

        tableSuggest.setLayoutX(617.0);
        tableSuggest.setLayoutY(130.0);
        tableSuggest.setPrefHeight(587.0);
        tableSuggest.setPrefWidth(330.0);

        colSid.setMaxWidth(0.0);
        colSid.setMinWidth(0.0);
        colSid.setPrefWidth(0.0);
        colSid.setText("ID");
        colSid.setCellValueFactory(new PropertyValueFactory("UID"));

        colSuggest.setPrefWidth(328.0);
        colSuggest.setStyle("-fx-background-color: #34656d;");
        colSuggest.setText("Name");
        colSuggest.setCellValueFactory(new PropertyValueFactory("username"));
        stackPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(btn_profile);
        anchorPane.getChildren().add(btn_friends);
        anchorPane.getChildren().add(btn_items);
        anchorPane.getChildren().add(btn_signout);
        anchorPane.getChildren().add(btn_notifications);
        stackPane.getChildren().add(anchorPane);
        getChildren().add(stackPane);
        stackPane0.getChildren().add(rectangle0);
        getChildren().add(stackPane0);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        getChildren().add(anchorPane0);
        tableFriends.getColumns().add(colFid);
        tableFriends.getColumns().add(colFriend);
        anchorPane1.getChildren().add(tableFriends);
        anchorPane1.getChildren().add(text);
        anchorPane1.getChildren().add(rectangle1);
        anchorPane1.getChildren().add(text0);
        anchorPane1.getChildren().add(imageView1);
        anchorPane1.getChildren().add(imageView2);
        anchorPane1.getChildren().add(btn_Show);
        anchorPane1.getChildren().add(btn_Remove);
        anchorPane1.getChildren().add(btn_Add);
        tableSuggest.getColumns().add(colSid);
        tableSuggest.getColumns().add(colSuggest);
        anchorPane1.getChildren().add(tableSuggest);
        getChildren().add(anchorPane1);

    }

    
    
    /*public TableView<User> getTableFriends() {
        return tableFriends;
    }

    public TableView<User> getTableSuggest() {
        return tableSuggest;
    }

    public TableColumn<User, String> getColFriend() {
        return colFriend;
    }

    public TableColumn<User, String> getColSuggest() {
        return colSuggest;
    }

    public TableColumn getColFid() {
        return colFid;
    }

    public Button getBtn_Show() {
        return btn_Show;
    }

    public Button getBtn_Remove() {
        return btn_Remove;
    }

    public Button getBtn_Add() {
        return btn_Add;
    }

    public Button getBtn_profile() {
        return btn_profile;
    }

    public Button getBtn_friends() {
        return btn_friends;
    }

    public Button getBtn_items() {
        return btn_items;
    }

    public Button getBtn_signout() {
        return btn_signout;
    }

    public Button getBtn_notifications() {
        return btn_notifications;
    }

    public TableColumn getColSid() {
        return colSid;
    }*/

    public TableView<User> getTableFriends() {
        return tableFriends;
    }

    public TableColumn<User, String> getColFriend() {
        return colFriend;
    }

    public TableColumn<User, Integer> getColFid() {
        return colFid;
    }

    public TableView<User> getTableSuggest() {
        return tableSuggest;
    }

    public TableColumn<User, String> getColSuggest() {
        return colSuggest;
    }

    public TableColumn<User, Integer> getColSid() {
        return colSid;
    }

    public Button getBtn_profile() {
        return btn_profile;
    }

    public Button getBtn_friends() {
        return btn_friends;
    }

    public Button getBtn_items() {
        return btn_items;
    }

    public Button getBtn_signout() {
        return btn_signout;
    }

    public Button getBtn_notifications() {
        return btn_notifications;
    }

    public Button getBtn_Show() {
        return btn_Show;
    }

    public Button getBtn_Remove() {
        return btn_Remove;
    }

    public Button getBtn_Add() {
        return btn_Add;
    }
}
