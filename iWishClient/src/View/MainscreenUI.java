package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class MainscreenUI extends BorderPane {

    protected final StackPane stackPane;
    protected final Rectangle rectangle;
    protected final AnchorPane anchorPane;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final StackPane stackPane0;
    protected final Rectangle rectangle0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane1;
    protected final Label label;
    protected final StackPane stackPane1;
    protected final Rectangle rectangle1;
    protected final StackPane stackPane2;
    protected final Rectangle rectangle2;
    protected final AnchorPane anchorPane2;
    protected final ImageView imageView1;
    protected final Button button3;
    protected final Separator separator;
    protected final Separator separator0;
    protected final Button button4;
    protected final Separator separator1;
    protected final Button button5;
    protected final Separator separator2;
    protected final AnchorPane anchorPane3;
    protected final Rectangle rectangle3;
    protected final Label label0;

    public MainscreenUI() {

        stackPane = new StackPane();
        rectangle = new Rectangle();
        anchorPane = new AnchorPane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        stackPane0 = new StackPane();
        rectangle0 = new Rectangle();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        anchorPane1 = new AnchorPane();
        label = new Label();
        stackPane1 = new StackPane();
        rectangle1 = new Rectangle();
        stackPane2 = new StackPane();
        rectangle2 = new Rectangle();
        anchorPane2 = new AnchorPane();
        imageView1 = new ImageView();
        button3 = new Button();
        separator = new Separator();
        separator0 = new Separator();
        button4 = new Button();
        separator1 = new Separator();
        button5 = new Button();
        separator2 = new Separator();
        anchorPane3 = new AnchorPane();
        rectangle3 = new Rectangle();
        label0 = new Label();

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

        button.setLayoutX(208.0);
        button.setLayoutY(1.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(41.0);
        button.setPrefWidth(54.0);
        button.setStyle("-fx-background-color: #34656D;");
        button.setText("Home");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Cambria Bold", 13.0));

        button0.setLayoutX(262.0);
        button0.setLayoutY(1.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(41.0);
        button0.setPrefWidth(59.0);
        button0.setStyle("-fx-background-color: #34656D;");
        button0.setText("Profile");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Cambria Bold", 13.0));

        button1.setLayoutX(321.0);
        button1.setLayoutY(1.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(41.0);
        button1.setPrefWidth(64.0);
        button1.setStyle("-fx-background-color: #34656D;");
        button1.setText("Friends");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);
        button1.setFont(new Font("Cambria Bold", 13.0));

        button2.setLayoutX(385.0);
        button2.setLayoutY(1.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(41.0);
        button2.setPrefWidth(52.0);
        button2.setStyle("-fx-background-color: #34656D;");
        button2.setText("Items");
        button2.setTextFill(javafx.scene.paint.Color.WHITE);
        button2.setFont(new Font("Cambria Bold", 13.0));

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
        setTop(stackPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        label.setLayoutX(11.0);
        label.setLayoutY(38.0);
        label.setText("Recently added items");
        label.setFont(new Font("Copperplate Gothic Light", 15.0));

        stackPane1.setLayoutY(62.0);
        stackPane1.setPrefHeight(466.0);
        stackPane1.setPrefWidth(200.0);

        rectangle1.setArcHeight(10.0);
        rectangle1.setArcWidth(10.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle1.setHeight(543.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(186.0);
        setRight(anchorPane1);

        BorderPane.setAlignment(stackPane2, javafx.geometry.Pos.CENTER);
        stackPane2.setPrefHeight(150.0);
        stackPane2.setPrefWidth(200.0);

        rectangle2.setArcHeight(10.0);
        rectangle2.setArcWidth(10.0);
        rectangle2.setFill(javafx.scene.paint.Color.WHITE);
        rectangle2.setHeight(622.0);
        rectangle2.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(200.0);

        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        imageView1.setFitHeight(405.0);
        imageView1.setFitWidth(200.0);
        imageView1.setLayoutY(317.0);
        imageView1.setOpacity(0.46);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/dandelions.png").toExternalForm()));

        button3.setLayoutX(-1.0);
        button3.setLayoutY(146.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(25.0);
        button3.setPrefWidth(200.0);
        button3.setStyle("-fx-background-color: #FFFFFF;");
        button3.setText("Notifications");
        button3.setFont(new Font("Cambria Bold", 13.0));

        separator.setLayoutX(-1.0);
        separator.setLayoutY(145.0);
        separator.setPrefWidth(200.0);

        separator0.setLayoutX(-1.0);
        separator0.setLayoutY(171.0);
        separator0.setPrefWidth(200.0);

        button4.setLayoutX(-2.0);
        button4.setLayoutY(173.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(25.0);
        button4.setPrefWidth(200.0);
        button4.setStyle("-fx-background-color: #FFFFFF;");
        button4.setText("Settings");
        button4.setFont(new Font("Cambria Bold", 13.0));

        separator1.setLayoutX(-1.0);
        separator1.setLayoutY(197.0);
        separator1.setPrefWidth(200.0);

        button5.setLayoutX(-2.0);
        button5.setLayoutY(199.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(25.0);
        button5.setPrefWidth(200.0);
        button5.setStyle("-fx-background-color: #FFFFFF;");
        button5.setText("Sign Out");
        button5.setFont(new Font("Cambria Bold", 13.0));

        separator2.setLayoutX(-1.0);
        separator2.setLayoutY(223.0);
        separator2.setPrefWidth(200.0);
        setLeft(stackPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        rectangle3.setArcHeight(10.0);
        rectangle3.setArcWidth(10.0);
        rectangle3.setFill(javafx.scene.paint.Color.valueOf("#f1faee"));
        rectangle3.setHeight(543.0);
        rectangle3.setLayoutX(25.0);
        rectangle3.setLayoutY(62.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(444.0);

        label0.setLayoutX(26.0);
        label0.setLayoutY(39.0);
        label0.setText("Feed");
        label0.setFont(new Font("Copperplate Gothic Light", 15.0));
        setCenter(anchorPane3);

        stackPane.getChildren().add(rectangle);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(button2);
        stackPane0.getChildren().add(rectangle0);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        stackPane0.getChildren().add(anchorPane0);
        anchorPane.getChildren().add(stackPane0);
        stackPane.getChildren().add(anchorPane);
        anchorPane1.getChildren().add(label);
        stackPane1.getChildren().add(rectangle1);
        anchorPane1.getChildren().add(stackPane1);
        stackPane2.getChildren().add(rectangle2);
        anchorPane2.getChildren().add(imageView1);
        anchorPane2.getChildren().add(button3);
        anchorPane2.getChildren().add(separator);
        anchorPane2.getChildren().add(separator0);
        anchorPane2.getChildren().add(button4);
        anchorPane2.getChildren().add(separator1);
        anchorPane2.getChildren().add(button5);
        anchorPane2.getChildren().add(separator2);
        stackPane2.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(rectangle3);
        anchorPane3.getChildren().add(label0);

    }
}
