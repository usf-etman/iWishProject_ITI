package View;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RechargeUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane0;
    protected final Text cardNumberError;
    protected final Text firstNameError;
    protected final Text lastNameError;
    protected final Button btn_confirm;
    protected final Text rechargeError;
    protected final TextField txt_yy;
    protected final TextField txt_cvv;
    protected final TextField txt_mm;
    protected final TextField txt_card_number;
    protected final TextField txt_first_name;
    protected final TextField txt_last_name;
    protected final Text mmError;
    protected final Text yyError;
    protected final Text cvvError;
    
    protected final TextField txt_Amount;
     protected final Text amountError;

    public RechargeUI() {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        anchorPane0 = new AnchorPane();
        cardNumberError = new Text();
        firstNameError = new Text();
        lastNameError = new Text();
        btn_confirm = new Button();
        rechargeError = new Text();
        txt_yy = new TextField();
        txt_cvv = new TextField();
        txt_mm = new TextField();
        txt_card_number = new TextField();
        txt_first_name = new TextField();
        txt_last_name = new TextField();
        txt_Amount=new TextField();
        mmError = new Text();
        yyError = new Text();
        cvvError = new Text();
        amountError=new Text();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(172.0);
        anchorPane.setStyle("-fx-background-color: #F1FAEE;");

        imageView.setFitHeight(82.0);
        imageView.setFitWidth(177.0);
        imageView.setLayoutX(9.0);
        imageView.setLayoutY(43.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        cardNumberError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        cardNumberError.setLayoutX(81.0);
        cardNumberError.setLayoutY(165.0);
        cardNumberError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        cardNumberError.setStrokeWidth(0.0);
        cardNumberError.setWrappingWidth(234.369140625);

        firstNameError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        firstNameError.setLayoutX(79.0);
        firstNameError.setLayoutY(270.0);
        firstNameError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstNameError.setStrokeWidth(0.0);
        firstNameError.setWrappingWidth(117.369140625);

        lastNameError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lastNameError.setLayoutX(206.0);
        lastNameError.setLayoutY(270.0);
        lastNameError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lastNameError.setStrokeWidth(0.0);
        lastNameError.setWrappingWidth(133.369140625);

        btn_confirm.setLayoutX(85.0);
        btn_confirm.setLayoutY(345.0);
        btn_confirm.setMinHeight(40);
        btn_confirm.setMnemonicParsing(false);
        btn_confirm.setStyle("-fx-background-color: #34656D;");
        btn_confirm.setText("Confirm");
        btn_confirm.setTextFill(javafx.scene.paint.Color.WHITE);

        rechargeError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        rechargeError.setLayoutX(87.0);
        rechargeError.setLayoutY(365.0);
        rechargeError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        rechargeError.setStrokeWidth(0.0);
        rechargeError.setWrappingWidth(260.369140625);



        txt_yy.setLayoutX(139.0);
        txt_yy.setLayoutY(175.0);
        txt_yy.setPrefHeight(25.0);
        txt_yy.setPrefWidth(54.0);
        txt_yy.setPromptText("YY");

        txt_cvv.setLayoutX(205.0);
        txt_cvv.setLayoutY(175.0);
        txt_cvv.setPrefHeight(25.0);
        txt_cvv.setPrefWidth(112.0);
        txt_cvv.setPromptText("CVV");

        txt_mm.setLayoutX(81.0);
        txt_mm.setLayoutY(175.0);
        txt_mm.setPrefHeight(25.0);
        txt_mm.setPrefWidth(50.0);
        txt_mm.setPromptText("MM");

        txt_card_number.setLayoutX(81.0);
        txt_card_number.setLayoutY(123.0);
        txt_card_number.setPrefHeight(25.0);
        txt_card_number.setPrefWidth(235.0);
        txt_card_number.setPromptText("Card Number");

        txt_first_name.setLayoutX(81.0);
        txt_first_name.setLayoutY(227.0);
        txt_first_name.setPrefHeight(25.0);
        txt_first_name.setPrefWidth(114.0);
        txt_first_name.setPromptText("First Name");

        txt_last_name.setLayoutX(205.0);
        txt_last_name.setLayoutY(227.0);
        txt_last_name.setPrefHeight(25.0);
        txt_last_name.setPrefWidth(112.0);
        txt_last_name.setPromptText("Last Name");

        mmError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        mmError.setLayoutX(80.0);
        mmError.setLayoutY(217.0);
        mmError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        mmError.setStrokeWidth(0.0);
        mmError.setWrappingWidth(53.369140625);

        yyError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        yyError.setLayoutX(139.0);
        yyError.setLayoutY(218.0);
        yyError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        yyError.setStrokeWidth(0.0);
        yyError.setWrappingWidth(53.369140625);

        cvvError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        cvvError.setLayoutX(205.0);
        cvvError.setLayoutY(217.0);
        cvvError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        cvvError.setStrokeWidth(0.0);
        cvvError.setWrappingWidth(113.369140625);
        
        
        txt_Amount.setLayoutX(81.0);
        txt_Amount.setLayoutY(290.0);
        txt_Amount.setPrefHeight(25.0);
        txt_Amount.setPrefWidth(112.0);
        txt_Amount.setPromptText("Amount");
        
        amountError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        amountError.setLayoutX(81.0);
        amountError.setLayoutY(320.0);
        amountError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        amountError.setStrokeWidth(0.0);
        amountError.setWrappingWidth(113.369140625);
        
        setCenter(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane0.getChildren().add(cardNumberError);
        anchorPane0.getChildren().add(firstNameError);
        anchorPane0.getChildren().add(lastNameError);
        anchorPane0.getChildren().add(btn_confirm);
        anchorPane0.getChildren().add(rechargeError);
        anchorPane0.getChildren().add(txt_yy);
        anchorPane0.getChildren().add(txt_cvv);
        anchorPane0.getChildren().add(txt_mm);
        anchorPane0.getChildren().add(txt_card_number);
        anchorPane0.getChildren().add(txt_first_name);
        anchorPane0.getChildren().add(txt_last_name);
        anchorPane0.getChildren().add(txt_Amount);
        anchorPane0.getChildren().add(mmError);
        anchorPane0.getChildren().add(yyError);
        anchorPane0.getChildren().add(cvvError);
        anchorPane0.getChildren().add(amountError);

    }

    public Text getCardNumberError() {
        return cardNumberError;
    }

    public Text getFirstNameError() {
        return firstNameError;
    }

    public Text getLastNameError() {
        return lastNameError;
    }

    public Button getBtn_confirm() {
        return btn_confirm;
    }

    public Text getRechargeError() {
        return rechargeError;
    }

    public Text getMmError() {
        return mmError;
    }

    public Text getYyError() {
        return yyError;
    }

    public Text getCvvError() {
        return cvvError;
    }

    public TextField getTxt_yy() {
        return txt_yy;
    }

    public TextField getTxt_cvv() {
        return txt_cvv;
    }

    public TextField getTxt_card_number() {
        return txt_card_number;
    }

    public TextField getTxt_first_name() {
        return txt_first_name;
    }

    public TextField getTxt_last_name() {
        return txt_last_name;
    }

    public TextField getTxt_mm() {
        return txt_mm;
    }



    public TextField getTxt_Amount() {
        return txt_Amount;
    }

    public Text getAmountError() {
        return amountError;
    }
 

}
