package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class PendingFriendUI extends AnchorPane {

    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final Button button;
    protected final ImageView imageView;
    protected final Button button0;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Text text;
    protected final AnchorPane anchorPane;
    protected final Button btn_profile;
    protected final Button btn_friends;
    protected final Button btn_items;
    protected final Button btn_signout;
    protected final Button btn_notifications;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView2;
    protected final ImageView imageView3;

    public PendingFriendUI() {

        tableView = new TableView();
        tableColumn = new TableColumn();
        button = new Button();
        imageView = new ImageView();
        button0 = new Button();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        text = new Text();
        anchorPane = new AnchorPane();
        btn_profile = new Button();
        btn_friends = new Button();
        btn_items = new Button();
        btn_signout = new Button();
        btn_notifications = new Button();
        anchorPane0 = new AnchorPane();
        imageView2 = new ImageView();
        imageView3 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(569.0);
        setPrefWidth(610.0);
        setStyle("-fx-background-color: #F1FAEE;");

        tableView.setLayoutX(52.0);
        tableView.setLayoutY(120.0);
        tableView.setPrefHeight(370.0);
        tableView.setPrefWidth(287.0);

        tableColumn.setId("stylename");
        tableColumn.setPrefWidth(286.0);
        tableColumn.setStyle("-fx-background-color: #34656D;");
        tableColumn.setText("Name ");

        button.setLayoutX(369.0);
        button.setLayoutY(246.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(132.0);
        button.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        button.setText("  Accept");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("System Bold", 15.0));

        imageView.setFitHeight(31.0);
        imageView.setFitWidth(30.0);
        imageView.setLayoutX(375.0);
        imageView.setLayoutY(247.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/correction.png").toExternalForm()));

        button0.setLayoutX(369.0);
        button0.setLayoutY(344.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(132.0);
        button0.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        button0.setText("  Decline");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("System Bold", 15.0));

        imageView0.setFitHeight(31.0);
        imageView0.setFitWidth(30.0);
        imageView0.setLayoutX(375.0);
        imageView0.setLayoutY(345.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/failed.png").toExternalForm()));

        imageView1.setFitHeight(46.0);
        imageView1.setFitWidth(51.0);
        imageView1.setLayoutX(254.0);
        imageView1.setLayoutY(54.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/participation.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setLayoutX(76.0);
        text.setLayoutY(84.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Pending Friends");
        text.setFont(new Font("System Italic", 24.0));

        anchorPane.setLayoutX(-20.0);
        anchorPane.setLayoutY(-2.0);
        anchorPane.setPrefHeight(51.0);
        anchorPane.setPrefWidth(631.0);
        anchorPane.setStyle("-fx-background-color: #34656D;");

        btn_profile.setLayoutX(181.0);
        btn_profile.setLayoutY(7.0);
        btn_profile.setMnemonicParsing(false);
        btn_profile.setStyle("-fx-background-color: #34656D;");
        btn_profile.setText("Profile");
        btn_profile.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_friends.setLayoutX(244.0);
        btn_friends.setLayoutY(7.0);
        btn_friends.setMnemonicParsing(false);
        btn_friends.setPrefHeight(31.0);
        btn_friends.setPrefWidth(78.0);
        btn_friends.setStyle("-fx-background-color: #34656D;");
        btn_friends.setText("Friends");
        btn_friends.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_items.setLayoutX(322.0);
        btn_items.setLayoutY(7.0);
        btn_items.setMnemonicParsing(false);
        btn_items.setStyle("-fx-background-color: #34656D;");
        btn_items.setText("Items");
        btn_items.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_signout.setLayoutX(483.0);
        btn_signout.setLayoutY(7.0);
        btn_signout.setMnemonicParsing(false);
        btn_signout.setPrefHeight(0.0);
        btn_signout.setPrefWidth(78.0);
        btn_signout.setStyle("-fx-background-color: #34656D;");
        btn_signout.setText("Sign Out");
        btn_signout.setTextFill(javafx.scene.paint.Color.WHITE);

        btn_notifications.setLayoutX(379.0);
        btn_notifications.setLayoutY(7.0);
        btn_notifications.setMnemonicParsing(false);
        btn_notifications.setPrefHeight(1.0);
        btn_notifications.setPrefWidth(104.0);
        btn_notifications.setStyle("-fx-background-color: #34656D;");
        btn_notifications.setText("Notifications");
        btn_notifications.setTextFill(javafx.scene.paint.Color.WHITE);

        anchorPane0.setLayoutX(79.0);
        anchorPane0.setLayoutY(9.0);
        anchorPane0.setPrefHeight(34.0);
        anchorPane0.setPrefWidth(78.0);

        imageView2.setFitHeight(32.0);
        imageView2.setFitWidth(78.0);
        imageView2.setLayoutX(7.0);
        imageView2.setLayoutY(1.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        imageView3.setFitHeight(46.0);
        imageView3.setFitWidth(45.0);
        imageView3.setLayoutX(37.0);
        imageView3.setLayoutY(3.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        tableView.getColumns().add(tableColumn);
        getChildren().add(tableView);
        getChildren().add(button);
        getChildren().add(imageView);
        getChildren().add(button0);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(text);
        anchorPane.getChildren().add(btn_profile);
        anchorPane.getChildren().add(btn_friends);
        anchorPane.getChildren().add(btn_items);
        anchorPane.getChildren().add(btn_signout);
        anchorPane.getChildren().add(btn_notifications);
        anchorPane0.getChildren().add(imageView2);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane.getChildren().add(imageView3);
        getChildren().add(anchorPane);

    }
}
