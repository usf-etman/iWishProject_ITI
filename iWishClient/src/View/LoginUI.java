package View;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LoginUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Text text;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane0;
    protected final TextField txtUname;
    protected final PasswordField txtPass;
    protected final Button btnLogin;
    protected final Hyperlink btnForget;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Text text0;
    protected final ImageView imageView3;
    protected final Hyperlink lnkSignup;
    protected final Text text1;
    protected final Text txtEmailError;
    protected final Text txtPassError;
    protected final Text loginError;

    public LoginUI() {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        text = new Text();
        imageView0 = new ImageView();
        anchorPane0 = new AnchorPane();
        txtUname = new TextField();
        txtPass = new PasswordField();
        btnLogin = new Button();
        btnForget = new Hyperlink();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        text0 = new Text();
        imageView3 = new ImageView();
        lnkSignup = new Hyperlink();
        text1 = new Text();
        txtEmailError = new Text();
        txtPassError = new Text();
        loginError = new Text();

 
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(700.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(500.0);
        anchorPane.setPrefWidth(350.0);
        anchorPane.setStyle("-fx-background-color: #F1FAEE;");

        imageView.setFitHeight(253.0);
        imageView.setFitWidth(252.0);
        imageView.setLayoutX(53.0);
        imageView.setLayoutY(149.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        text.setLayoutX(133.0);
        text.setLayoutY(63.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setFont(new Font(25.0));

        imageView0.setFitHeight(242.0);
        imageView0.setFitWidth(227.0);
        imageView0.setLayoutX(42.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(500.0);
        anchorPane0.setPrefWidth(415.0);
        anchorPane0.setStyle("-fx-background-color: #ffffff;");

        txtUname.setLayoutX(83.0);
        txtUname.setLayoutY(158.0);
        txtUname.setPrefHeight(33.0);
        txtUname.setPrefWidth(203.0);
        txtUname.setPromptText("Email");
        txtUname.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        txtPass.setLayoutX(82.0);
        txtPass.setLayoutY(217.0);
        txtPass.setPrefWidth(204.0);
        txtPass.setPromptText("Password");
        txtPass.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        btnLogin.setLayoutX(124.0);
        btnLogin.setLayoutY(349.0);
        btnLogin.setMnemonicParsing(false);
        btnLogin.setPrefHeight(29.0);
        btnLogin.setPrefWidth(100.0);
        btnLogin.setStyle("-fx-background-color: #34656D;");
        btnLogin.setText("Login");
        btnLogin.setTextFill(javafx.scene.paint.Color.WHITE);
        btnLogin.setFont(new Font("System Bold", 17.0));

        btnForget.setLayoutX(99.0);
        btnForget.setLayoutY(289.0);
        btnForget.setPrefHeight(35.0);
        btnForget.setPrefWidth(171.0);
        btnForget.setStyle("-fx-background-color: #ffffff;");
        btnForget.setText("Forget Password ?");
        btnForget.setTextFill(javafx.scene.paint.Color.valueOf("#34656d"));
        btnForget.setFont(new Font(18.0));

        imageView1.setFitHeight(35.0);
        imageView1.setFitWidth(42.0);
        imageView1.setLayoutX(26.0);
        imageView1.setLayoutY(165.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/iconUser.png").toExternalForm()));

        imageView2.setFitHeight(29.0);
        imageView2.setFitWidth(32.0);
        imageView2.setLayoutX(28.0);
        imageView2.setLayoutY(227.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/iconPass.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setLayoutX(119.0);
        text0.setLayoutY(124.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("User Login");
        text0.setFont(new Font("System Bold", 22.0));

        imageView3.setFitHeight(63.0);
        imageView3.setFitWidth(64.0);
        imageView3.setLayoutX(143.0);
        imageView3.setLayoutY(25.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/loginUsers.png").toExternalForm()));

        lnkSignup.setLayoutX(165.0);
        lnkSignup.setLayoutY(435.0);
        lnkSignup.setText("Create an Account ");
        lnkSignup.setTextFill(javafx.scene.paint.Color.valueOf("#34656d"));
        lnkSignup.setFont(new Font(18.0));

        text1.setLayoutX(46.0);
        text1.setLayoutY(460.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("New to iWish ?");
        text1.setFont(new Font(18.0));

        txtEmailError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        txtEmailError.setLayoutX(82.0);
        txtEmailError.setLayoutY(216.0);
        txtEmailError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtEmailError.setStrokeWidth(0.0);
        txtEmailError.setWrappingWidth(204.6708984375);
        txtEmailError.setFont(new Font("System Bold", 15.0));

        txtPassError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        txtPassError.setLayoutX(82.0);
        txtPassError.setLayoutY(272.0);
        txtPassError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtPassError.setStrokeWidth(0.0);
        txtPassError.setWrappingWidth(205.6708984375);
        txtPassError.setFont(new Font("System Bold", 15.0));

        loginError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        loginError.setLayoutX(77.0);
        loginError.setLayoutY(416.0);
        loginError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        loginError.setStrokeWidth(0.0);
        loginError.setWrappingWidth(214.6708984375);
        loginError.setFont(new Font("System Bold", 15.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(text);
        anchorPane.getChildren().add(imageView0);
        anchorPane0.getChildren().add(txtUname);
        anchorPane0.getChildren().add(txtPass);
        anchorPane0.getChildren().add(btnLogin);
        anchorPane0.getChildren().add(btnForget);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(imageView2);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(imageView3);
        anchorPane0.getChildren().add(lnkSignup);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(txtEmailError);
        anchorPane0.getChildren().add(txtPassError);
        anchorPane0.getChildren().add(loginError);

    }

    public TextField getTxtUname() {
        return txtUname;
    }

    public PasswordField getTxtPass() {
        return txtPass;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public Hyperlink getBtnForget() {
        return btnForget;
    }

    public Hyperlink getLnkSignup() {
        return lnkSignup;
    }

    public Text getTxtEmailError() {
        return txtEmailError;
    }

    public Text getTxtPassError() {
        return txtPassError;
    }

    public Text getLoginError() {
        return loginError;
    }
}
