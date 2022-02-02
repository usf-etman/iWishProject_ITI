package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class AdditmManuallyUI extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Text text;
    protected final TextField nameTXT;
    protected final TextField priceTXT;
    protected final TextField descTXT;
    protected final Text text0;

    public TextField getNameTXT() {
        return nameTXT;
    }

    public TextField getPriceTXT() {
        return priceTXT;
    }

    public TextField getDescTXT() {
        return descTXT;
    }

    public Label getRsltLBL() {
        return rsltLBL;
    }

    public Button getAdditmBTN() {
        return additmBTN;
    }

    public Button getBtnback() {
        return btnback;
    }
    protected final Text text1;
    protected final Text text2;
    protected final Button additmBTN;
    protected final Pane pane;
    protected final Label rsltLBL;
    protected final Button btnback;

    public AdditmManuallyUI() {

        imageView = new ImageView();
        imageView0 = new ImageView();
        text = new Text();
        nameTXT = new TextField();
        priceTXT = new TextField();
        descTXT = new TextField();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        additmBTN = new Button();
        pane = new Pane();
        rsltLBL = new Label();
        btnback = new Button();

        setId("AnchorPane");
        setPrefHeight(508.0);
        setPrefWidth(750.0);

        imageView.setFitHeight(119.0);
        imageView.setFitWidth(126.0);
        imageView.setLayoutX(664.0);
        imageView.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(78.0);
        imageView0.setFitWidth(190.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#5681ab"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(229.0);
        text.setLayoutY(145.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Add New Item");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(351.99999801814556);
        text.setFont(new Font("Chiller", 74.0));

        nameTXT.setLayoutX(280.0);
        nameTXT.setLayoutY(188.0);
        nameTXT.setPrefHeight(43.0);
        nameTXT.setPrefWidth(220.0);

        priceTXT.setLayoutX(280.0);
        priceTXT.setLayoutY(259.0);
        priceTXT.setPrefHeight(43.0);
        priceTXT.setPrefWidth(220.0);

        descTXT.setLayoutX(280.0);
        descTXT.setLayoutY(336.0);
        descTXT.setPrefHeight(43.0);
        descTXT.setPrefWidth(220.0);

        text0.setFill(javafx.scene.paint.Color.valueOf("#5681ab"));
        text0.setLayoutX(57.0);
        text0.setLayoutY(219.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Item Name");
        text0.setWrappingWidth(152.6708984375);
        text0.setFont(new Font("Chiller", 38.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#5681ab"));
        text1.setLayoutX(57.0);
        text1.setLayoutY(365.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Item Description");
        text1.setWrappingWidth(152.6708984375);
        text1.setFont(new Font("Chiller", 31.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#5681ab"));
        text2.setLayoutX(57.0);
        text2.setLayoutY(286.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Item Price");
        text2.setWrappingWidth(152.6708984375);
        text2.setFont(new Font("Chiller", 38.0));

        additmBTN.setLayoutX(76.0);
        additmBTN.setLayoutY(448.0);
        additmBTN.setMnemonicParsing(false);
        additmBTN.setPrefHeight(43.0);
        additmBTN.setPrefWidth(153.0);
        additmBTN.setText("Add Item");
        additmBTN.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        pane.setLayoutY(423.0);
        pane.setPrefHeight(6.0);
        pane.setPrefWidth(779.0);
        pane.setStyle("-fx-background-color: #5681ab;");

        rsltLBL.setLayoutX(313.0);
        rsltLBL.setLayoutY(480.0);
        rsltLBL.setPrefHeight(21.0);
        rsltLBL.setPrefWidth(220.0);
        rsltLBL.setTextFill(javafx.scene.paint.Color.valueOf("#245582"));

        btnback.setLayoutX(520.0);
        btnback.setLayoutY(449.0);
        btnback.setMnemonicParsing(false);
        btnback.setPrefHeight(36.0);
        btnback.setPrefWidth(133.0);
        btnback.setText("Back");
        btnback.setTextFill(javafx.scene.paint.Color.valueOf("#114e86"));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(text);
        getChildren().add(nameTXT);
        getChildren().add(priceTXT);
        getChildren().add(descTXT);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(additmBTN);
        getChildren().add(pane);
        getChildren().add(rsltLBL);
        getChildren().add(btnback);

    }
}
