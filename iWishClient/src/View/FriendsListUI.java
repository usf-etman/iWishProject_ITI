package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FriendsListUI extends AnchorPane {

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
    protected final TableView tableView;
    protected final TableColumn table_Friends;
    protected final Text text;
    protected final Rectangle rectangle1;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button btn_Show;
    protected final Button btn_Remove;
    protected final Button btn_Add;
    protected final TableView tableView0;
    protected final TableColumn table_suggest;

    public FriendsListUI() {

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
        tableView = new TableView();
        table_Friends = new TableColumn();
        text = new Text();
        rectangle1 = new Rectangle();
        text0 = new Text();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        btn_Show = new Button();
        btn_Remove = new Button();
        btn_Add = new Button();
        tableView0 = new TableView();
        table_suggest = new TableColumn();

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

        tableView.setLayoutX(187.0);
        tableView.setLayoutY(130.0);
        tableView.setPrefHeight(579.0);
        tableView.setPrefWidth(329.0);

        table_Friends.setMinWidth(0.0);
        table_Friends.setPrefWidth(328.0);
        table_Friends.setStyle("-fx-background-color: #34656d;");
        table_Friends.setText("Name");

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(241.0);
        text.setLayoutY(116.0);
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

        tableView0.setLayoutX(617.0);
        tableView0.setLayoutY(122.0);
        tableView0.setPrefHeight(594.0);
        tableView0.setPrefWidth(329.0);

        table_suggest.setPrefWidth(328.0);
        table_suggest.setStyle("-fx-background-color: #34656d;");
        table_suggest.setText("Name");

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
        tableView.getColumns().add(table_Friends);
        anchorPane1.getChildren().add(tableView);
        anchorPane1.getChildren().add(text);
        anchorPane1.getChildren().add(rectangle1);
        anchorPane1.getChildren().add(text0);
        anchorPane1.getChildren().add(imageView1);
        anchorPane1.getChildren().add(imageView2);
        anchorPane1.getChildren().add(btn_Show);
        anchorPane1.getChildren().add(btn_Remove);
        anchorPane1.getChildren().add(btn_Add);
        tableView0.getColumns().add(table_suggest);
        anchorPane1.getChildren().add(tableView0);
        getChildren().add(anchorPane1);

    }
}
