package View;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ResetPasswordUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;

    public Button getBtn_confirm() {
        return btn_confirm;
    }

    public TextField getTxt_email() {
        return txt_email;
    }

    public PasswordField getTxt_newpass() {
        return txt_newpass;
    }

    public PasswordField getTxt_confirmpass() {
        return txt_confirmpass;
    }

    public TextField getTxt_user() {
        return txt_user;
    }
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane0;
    protected final Button btn_confirm;
    protected final Text lbl_newpass;
    protected final TextField txt_email;
    protected final Text lbl_confirmpass;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Text text;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final Text text0;
    protected final PasswordField txt_newpass;
    protected final PasswordField txt_confirmpass;
    protected final ImageView imageView5;
    protected final Text text1;
    protected final TextField txt_user;

    public ResetPasswordUI() {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        anchorPane0 = new AnchorPane();
        btn_confirm = new Button();
        lbl_newpass = new Text();
        txt_email = new TextField();
        lbl_confirmpass = new Text();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        text = new Text();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        text0 = new Text();
        txt_newpass = new PasswordField();
        txt_confirmpass = new PasswordField();
        imageView5 = new ImageView();
        text1 = new Text();
        txt_user = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(397.0);
        setPrefWidth(651.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(499.0);
        anchorPane.setPrefWidth(235.0);
        anchorPane.setStyle("-fx-background-color: #F1FAEE;");

        imageView.setFitHeight(207.0);
        imageView.setFitWidth(144.0);
        imageView.setLayoutX(55.0);
        imageView.setLayoutY(136.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(177.0);
        imageView0.setFitWidth(224.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(8.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwish-.png").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(581.0);
        anchorPane0.setPrefWidth(411.0);

        btn_confirm.setLayoutX(153.0);
        btn_confirm.setLayoutY(326.0);
        btn_confirm.setMnemonicParsing(false);
        btn_confirm.setStyle("-fx-background-color: #34656D;");
        btn_confirm.setText("CONFIRM");
        btn_confirm.setTextFill(javafx.scene.paint.Color.valueOf("#f1faee"));

        lbl_newpass.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lbl_newpass.setLayoutX(48.0);
        lbl_newpass.setLayoutY(245.0);
        lbl_newpass.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lbl_newpass.setStrokeWidth(0.0);
        lbl_newpass.setText("NEW PASSWORD");

        txt_email.setLayoutX(186.0);
        txt_email.setLayoutY(157.0);
        txt_email.setPrefHeight(33.0);
        txt_email.setPrefWidth(211.0);
        txt_email.setPromptText("please enter your email agian");
        txt_email.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        lbl_confirmpass.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lbl_confirmpass.setLayoutX(48.0);
        lbl_confirmpass.setLayoutY(303.0);
        lbl_confirmpass.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lbl_confirmpass.setStrokeWidth(0.0);
        lbl_confirmpass.setText("CONFIRM PASSWORD");

        imageView1.setFitHeight(32.0);
        imageView1.setFitWidth(60.0);
        imageView1.setLayoutX(14.0);
        imageView1.setLayoutY(223.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/encrypted.png").toExternalForm()));

        imageView2.setFitHeight(33.0);
        imageView2.setFitWidth(39.0);
        imageView2.setLayoutX(13.0);
        imageView2.setLayoutY(281.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/encrypted.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setLayoutX(120.0);
        text.setLayoutY(109.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("RESET PASSWORD");
        text.setFont(new Font("System Bold", 22.0));

        imageView3.setFitHeight(66.0);
        imageView3.setFitWidth(200.0);
        imageView3.setLayoutX(173.0);
        imageView3.setLayoutY(14.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/iconPass.png").toExternalForm()));

        imageView4.setFitHeight(37.0);
        imageView4.setFitWidth(34.0);
        imageView4.setLayoutX(13.0);
        imageView4.setLayoutY(167.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("images/email.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setLayoutX(78.0);
        text0.setLayoutY(189.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("EMAIL");

        txt_newpass.setLayoutX(198.0);
        txt_newpass.setLayoutY(213.0);
        txt_newpass.setPrefHeight(33.0);
        txt_newpass.setPrefWidth(196.0);
        txt_newpass.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        txt_confirmpass.setLayoutX(206.0);
        txt_confirmpass.setLayoutY(265.0);
        txt_confirmpass.setPrefHeight(33.0);
        txt_confirmpass.setPrefWidth(197.0);
        txt_confirmpass.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        imageView5.setFitHeight(33.0);
        imageView5.setFitWidth(59.0);
        imageView5.setLayoutX(13.0);
        imageView5.setLayoutY(124.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("images/iconUser.png").toExternalForm()));

        text1.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text1.setLayoutX(64.0);
        text1.setLayoutY(146.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("USER_NAME");

        txt_user.setLayoutX(184.0);
        txt_user.setLayoutY(114.0);
        txt_user.setPrefHeight(33.0);
        txt_user.setPrefWidth(209.0);
        txt_user.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");
        setRight(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(imageView0);
        anchorPane0.getChildren().add(btn_confirm);
        anchorPane0.getChildren().add(lbl_newpass);
        anchorPane0.getChildren().add(txt_email);
        anchorPane0.getChildren().add(lbl_confirmpass);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(imageView2);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(imageView3);
        anchorPane0.getChildren().add(imageView4);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(txt_newpass);
        anchorPane0.getChildren().add(txt_confirmpass);
        anchorPane0.getChildren().add(imageView5);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(txt_user);

    }
}
