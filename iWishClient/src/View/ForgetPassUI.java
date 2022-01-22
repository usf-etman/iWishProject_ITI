package View;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ForgetPassUI extends BorderPane {

    public Button getBtn_send() {
        return btn_send;
    }

    public TextField getTxt_email0() {
        return txt_email0;
    }

    public TextField getTxt_ansquestion() {
        return txt_ansquestion;
    }

    protected final AnchorPane anchorPane;
    protected final Button btn_send;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final Text txt_email;
    protected final TextField txt_email0;
    protected final Text text;
    protected final Text txt_question;
    protected final TextField txt_ansquestion;
    protected final Text text0;
    protected final ImageView imageView0;
    protected final Hyperlink lnk_login;

    public ForgetPassUI() {

        anchorPane = new AnchorPane();
        btn_send = new Button();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        txt_email = new Text();
        txt_email0 = new TextField();
        text = new Text();
        txt_question = new Text();
        txt_ansquestion = new TextField();
        text0 = new Text();
        imageView0 = new ImageView();
        lnk_login = new Hyperlink();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(86.0);
        anchorPane.setPrefWidth(600.0);
        anchorPane.setStyle("-fx-background-color: #34656D;");

        btn_send.setLayoutX(214.0);
        btn_send.setLayoutY(28.0);
        btn_send.setMnemonicParsing(false);
        btn_send.setPrefHeight(31.0);
        btn_send.setPrefWidth(154.0);
        btn_send.setStyle("-fx-background-color: #F1FAEE;");
        btn_send.setText("Verify");
        btn_send.setTextFill(javafx.scene.paint.Color.valueOf("#34656d"));
        setBottom(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(321.0);
        anchorPane0.setPrefWidth(633.0);
        anchorPane0.setStyle("-fx-background-color: #F1FAEE;");

        imageView.setFitHeight(98.0);
        imageView.setFitWidth(155.0);
        imageView.setLayoutX(14.0);
        imageView.setLayoutY(14.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        txt_email.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        txt_email.setLayoutX(142.0);
        txt_email.setLayoutY(118.0);
        txt_email.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_email.setStrokeWidth(0.0);
        txt_email.setText("ENTER YOUR EMAIL");

        txt_email0.setLayoutX(353.0);
        txt_email0.setLayoutY(85.0);
        txt_email0.setPromptText("enter your email");
        txt_email0.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setLayoutX(218.0);
        text.setLayoutY(177.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("ANSWER SEQUIRTY QUESTION");

        txt_question.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        txt_question.setLayoutX(127.0);
        txt_question.setLayoutY(227.0);
        txt_question.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_question.setStrokeWidth(0.0);
        txt_question.setText("what's your favourite color?");

        txt_ansquestion.setLayoutX(353.0);
        txt_ansquestion.setLayoutY(194.0);
        txt_ansquestion.setPromptText("answer");
        txt_ansquestion.setStyle("-fx-background-color: transparent; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #34656D;");

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setLayoutX(215.0);
        text0.setLayoutY(72.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("FORGET PASSWORD");
        text0.setFont(new Font("System Bold", 22.0));

        imageView0.setFitHeight(45.0);
        imageView0.setFitWidth(56.0);
        imageView0.setLayoutX(163.0);
        imageView0.setLayoutY(149.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/encrypted.png").toExternalForm()));

        lnk_login.setLayoutX(417.0);
        lnk_login.setLayoutY(256.0);
        lnk_login.setText("RETURN TO LOGIN");
        setTop(anchorPane0);

        anchorPane.getChildren().add(btn_send);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(txt_email);
        anchorPane0.getChildren().add(txt_email0);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(txt_question);
        anchorPane0.getChildren().add(txt_ansquestion);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(lnk_login);

    }

    public Hyperlink getLnk_login() {
        return lnk_login;
    }
}
