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

public class FriendsListUI extends AnchorPane {

    protected final TableView<User> tableFriends;
    protected final TableColumn<User, String> colFriend;
    protected final TableColumn<User, Integer> colFid;

    protected final TableView<User> tableSuggest;
    protected final TableColumn<User, String> colSuggest;
    protected final TableColumn<User, Integer> colSid;

    protected final Button btn_Show;
    protected final Button btn_Remove;
    protected final AnchorPane anchorPane;
    protected final Button btn_profile;
    protected final Button btn_friends;
    protected final Button btn_items;
    protected final Button btn_signout;
    protected final Button btn_notifications;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Text text;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button btn_Add;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;

    public FriendsListUI() {
        tableFriends = new TableView<User>();
        colFid = new TableColumn<User, Integer>();
        colFriend = new TableColumn<User, String>();

        tableSuggest = new TableView<User>();
        colSid = new TableColumn<User, Integer>();
        colSuggest = new TableColumn<User, String>();
        btn_Show = new Button();
        btn_Remove = new Button();
        anchorPane = new AnchorPane();
        btn_profile = new Button();
        btn_friends = new Button();
        btn_items = new Button();
        btn_signout = new Button();
        btn_notifications = new Button();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        text = new Text();
        text0 = new Text();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        btn_Add = new Button();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(607.0);
        setPrefWidth(1095.0);
        setStyle("-fx-background-color: #F1FAEE;");

        btn_Show.setLayoutX(26.0);
        btn_Show.setLayoutY(278.0);
        btn_Show.setMnemonicParsing(false);
        btn_Show.setPrefHeight(37.0);
        btn_Show.setPrefWidth(170.0);
        btn_Show.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        btn_Show.setText("     Show Profile");
        btn_Show.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_Show.setFont(new Font("System Bold", 15.0));

        btn_Remove.setLayoutX(26.0);
        btn_Remove.setLayoutY(364.0);
        btn_Remove.setMnemonicParsing(false);
        btn_Remove.setPrefHeight(37.0);
        btn_Remove.setPrefWidth(170.0);
        btn_Remove.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        btn_Remove.setText(" Remove");
        btn_Remove.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_Remove.setFont(new Font("System Bold", 15.0));

        anchorPane.setLayoutX(-20.0);
        anchorPane.setLayoutY(-2.0);
        anchorPane.setPrefHeight(51.0);
        anchorPane.setPrefWidth(1117.0);
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

        imageView.setFitHeight(32.0);
        imageView.setFitWidth(78.0);
        imageView.setLayoutX(7.0);
        imageView.setLayoutY(1.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        imageView0.setFitHeight(46.0);
        imageView0.setFitWidth(45.0);
        imageView0.setLayoutX(37.0);
        imageView0.setLayoutY(3.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        tableFriends.setLayoutX(208.0);
        tableFriends.setLayoutY(128.0);
        tableFriends.setPrefHeight(424.0);
        tableFriends.setPrefWidth(293.0);
        tableFriends.setStyle("-fx-font-size: 22;");

        colFid.setMinWidth(0.0);
        colFid.setPrefWidth(0.0);
        colFid.setCellValueFactory(new PropertyValueFactory("UID"));
         
        colFriend.setPrefWidth(292.0);
        colFriend.setText("Name");
        colFriend.setCellValueFactory(new PropertyValueFactory("username"));
        colFriend.setStyle("-fx-text-fill: #34656d;  -fx-font-weight: 800;");
        

        tableSuggest.setLayoutX(590.0);
        tableSuggest.setLayoutY(124.0);
        tableSuggest.setPrefHeight(424.0);
        tableSuggest.setPrefWidth(293.0);
        tableSuggest.setStyle("-fx-font-size: 20;");

        colSid.setMinWidth(0.0);
        colSid.setPrefWidth(0.0);
        colSid.setCellValueFactory(new PropertyValueFactory("UID"));

        colSuggest.setPrefWidth(292.0);
        colSuggest.setText("Name");
        colSuggest.setCellValueFactory(new PropertyValueFactory("username"));
        colSuggest.setStyle("-fx-text-fill: #34656d;  -fx-font-weight: 800;");

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setLayoutX(607.0);
        text.setLayoutY(101.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Suggestion Friends");
        text.setFont(new Font("System Italic", 28.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text0.setLayoutX(235.0);
        text0.setLayoutY(102.0);
        text0.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        text0.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Friends List");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(161.20263671875);
        text0.setFont(new Font("System Italic", 26.0));

        imageView1.setFitHeight(34.0);
        imageView1.setFitWidth(37.0);
        imageView1.setLayoutX(31.0);
        imageView1.setLayoutY(280.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/eye-recognition.png").toExternalForm()));

        imageView2.setFitHeight(31.0);
        imageView2.setFitWidth(37.0);
        imageView2.setLayoutX(35.0);
        imageView2.setLayoutY(367.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/delete.png").toExternalForm()));

        btn_Add.setLayoutX(911.0);
        btn_Add.setLayoutY(303.0);
        btn_Add.setMnemonicParsing(false);
        btn_Add.setPrefHeight(37.0);
        btn_Add.setPrefWidth(156.0);
        btn_Add.setStyle("-fx-background-color: #34656D; -fx-border-radius: 80;");
        btn_Add.setText("   Add Friend");
        btn_Add.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_Add.setFont(new Font("System Bold", 15.0));

        imageView3.setFitHeight(37.0);
        imageView3.setFitWidth(37.0);
        imageView3.setLayoutX(918.0);
        imageView3.setLayoutY(303.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/friend.png").toExternalForm()));

        imageView4.setFitHeight(68.0);
        imageView4.setFitWidth(57.0);
        imageView4.setLayoutX(389.0);
        imageView4.setLayoutY(63.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("images/people.png").toExternalForm()));

        imageView5.setFitHeight(57.0);
        imageView5.setFitWidth(57.0);
        imageView5.setLayoutX(855.0);
        imageView5.setLayoutY(63.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("images/friendship.png").toExternalForm()));

        imageView6.setFitHeight(186.0);
        imageView6.setFitWidth(88.0);
        imageView6.setLayoutX(501.0);
        imageView6.setLayoutY(254.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        getChildren().add(btn_Show);
        getChildren().add(btn_Remove);
        anchorPane.getChildren().add(btn_profile);
        anchorPane.getChildren().add(btn_friends);
        anchorPane.getChildren().add(btn_items);
        anchorPane.getChildren().add(btn_signout);
        anchorPane.getChildren().add(btn_notifications);
        anchorPane0.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane.getChildren().add(imageView0);
        getChildren().add(anchorPane);
        tableFriends.getColumns().add(colFid);
        tableFriends.getColumns().add(colFriend);
        getChildren().add(tableFriends);
        tableSuggest.getColumns().add(colSid);
        tableSuggest.getColumns().add(colSuggest);
        getChildren().add(tableSuggest);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(btn_Add);
        getChildren().add(imageView3);
        getChildren().add(imageView4);
        getChildren().add(imageView5);
        getChildren().add(imageView6);

    }

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
