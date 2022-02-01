package View;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import model.User;

public class PendingFriendUI extends AnchorPane {

    protected final Button Btn_accept;
    protected final ImageView imageView;
    protected final Button Btn_decline;
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

    protected final TableView<User> pendingTable;
    protected final TableColumn<User, Integer> colid;
    protected final TableColumn<User, String> colname;

    public PendingFriendUI() {

        Btn_accept = new Button();
        imageView = new ImageView();
        Btn_decline = new Button();
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
        pendingTable = new TableView<User>();
        colid = new TableColumn<User, Integer>();
        colname = new TableColumn<User, String>();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(569.0);
        setPrefWidth(610.0);
        setStyle("-fx-background-color: #F1FAEE;");

        Btn_accept.setLayoutX(369.0);
        Btn_accept.setLayoutY(246.0);
        Btn_accept.setMnemonicParsing(false);
        Btn_accept.setPrefHeight(31.0);
        Btn_accept.setPrefWidth(132.0);
        Btn_accept.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        Btn_accept.setText("  Accept");
        Btn_accept.setTextFill(javafx.scene.paint.Color.WHITE);
        Btn_accept.setFont(new Font("System Bold", 15.0));

        imageView.setFitHeight(31.0);
        imageView.setFitWidth(30.0);
        imageView.setLayoutX(375.0);
        imageView.setLayoutY(247.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/correction.png").toExternalForm()));

        Btn_decline.setLayoutX(369.0);
        Btn_decline.setLayoutY(344.0);
        Btn_decline.setMnemonicParsing(false);
        Btn_decline.setPrefHeight(31.0);
        Btn_decline.setPrefWidth(132.0);
        Btn_decline.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        Btn_decline.setText("  Decline");
        Btn_decline.setTextFill(javafx.scene.paint.Color.WHITE);
        Btn_decline.setFont(new Font("System Bold", 15.0));

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

        pendingTable.setLayoutX(35.0);
        pendingTable.setLayoutY(146.0);
        pendingTable.setPrefHeight(358.0);
        pendingTable.setPrefWidth(293.0);

        colid.setMinWidth(0.0);
        colid.setPrefWidth(7.0);
           colid.setCellValueFactory(new PropertyValueFactory("UID"));

        
        
        colname.setPrefWidth(285.0);
        colname.setText("Name");
        colname.setCellValueFactory(new PropertyValueFactory("username"));

        getChildren().add(Btn_accept);
        getChildren().add(imageView);
        getChildren().add(Btn_decline);
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
        pendingTable.getColumns().add(colid);
        pendingTable.getColumns().add(colname);
        getChildren().add(pendingTable);

    }

    public Button getBtn_accept() {
        return Btn_accept;
    }

    public Button getBtn_decline() {
        return Btn_decline;
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

    public TableView<User> getPendingTable() {
        return pendingTable;
    }

    public TableColumn<User, Integer> getColid() {
        return colid;
    }

    public TableColumn<User, String> getColname() {
        return colname;
    }
}
