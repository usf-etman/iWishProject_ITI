package View;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class ResetPasswordUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane0;
    protected final Button btn_confirm;
    protected final Text lbl_newpass;
    protected final TextField txt_newpass;
    protected final Text lbl_confirmpass;
    protected final TextField txt_confirmpass;

    public Button getBtn_confirm() {
        return btn_confirm;
    }

    public TextField getTxt_newpass() {
        return txt_newpass;
    }

    public TextField getTxt_confirmpass() {
        return txt_confirmpass;
    }
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Text text;
    protected final ImageView imageView3;

    public ResetPasswordUI() {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        anchorPane0 = new AnchorPane();
        btn_confirm = new Button();
        lbl_newpass = new Text();
        txt_newpass = new TextField();
        lbl_confirmpass = new Text();
        txt_confirmpass = new TextField();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        text = new Text();
        imageView3 = new ImageView();

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

        btn_confirm.setLayoutX(148.0);
        btn_confirm.setLayoutY(292.0);
        btn_confirm.setMnemonicParsing(false);
        btn_confirm.setStyle("-fx-background-color: #34656D;");
        btn_confirm.setText("CONFIRM");
        btn_confirm.setTextFill(javafx.scene.paint.Color.valueOf("#f1faee"));

        lbl_newpass.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lbl_newpass.setLayoutX(75.0);
        lbl_newpass.setLayoutY(152.0);
        lbl_newpass.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lbl_newpass.setStrokeWidth(0.0);
        lbl_newpass.setText("NEW PASSWORD");

        txt_newpass.setLayoutX(206.0);
        txt_newpass.setLayoutY(129.0);
        txt_newpass.setPromptText("enter your new password");
        txt_newpass.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        lbl_confirmpass.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lbl_confirmpass.setLayoutX(59.0);
        lbl_confirmpass.setLayoutY(225.0);
        lbl_confirmpass.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lbl_confirmpass.setStrokeWidth(0.0);
        lbl_confirmpass.setText("CONFIRM PASSWORD");

        txt_confirmpass.setLayoutX(206.0);
        txt_confirmpass.setLayoutY(202.0);
        txt_confirmpass.setPromptText("rewrite again to confirm");
        txt_confirmpass.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        imageView1.setFitHeight(32.0);
        imageView1.setFitWidth(60.0);
        imageView1.setLayoutX(12.0);
        imageView1.setLayoutY(131.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/encrypted.png").toExternalForm()));

        imageView2.setFitHeight(33.0);
        imageView2.setFitWidth(39.0);
        imageView2.setLayoutX(11.0);
        imageView2.setLayoutY(203.0);
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
        setCenter(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(imageView0);
        anchorPane0.getChildren().add(btn_confirm);
        anchorPane0.getChildren().add(lbl_newpass);
        anchorPane0.getChildren().add(txt_newpass);
        anchorPane0.getChildren().add(lbl_confirmpass);
        anchorPane0.getChildren().add(txt_confirmpass);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(imageView2);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(imageView3);

    }
}
