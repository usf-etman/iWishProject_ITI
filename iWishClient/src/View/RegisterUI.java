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

public class RegisterUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane0;
    protected final TextField txt_user_name;
    protected final Text usernameError;
    protected final PasswordField txt_password;
    protected final Text passwordError;
    protected final TextField txt_email;
    protected final Text emailError;
    protected final TextField txt_security;
    protected final Text securityError;
    protected final Button btn_signup;
    protected final Text text;
    protected final Text signupError;
    protected final Hyperlink lmk_login;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;

    public RegisterUI() {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        anchorPane0 = new AnchorPane();
        txt_user_name = new TextField();
        usernameError = new Text();
        txt_password = new PasswordField();
        passwordError = new Text();
        txt_email = new TextField();
        emailError = new Text();
        txt_security = new TextField();
        securityError = new Text();
        btn_signup = new Button();
        text = new Text();
        signupError = new Text();
        lmk_login = new Hyperlink();
        text0 = new Text();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(252.0);
        anchorPane.setStyle("-fx-background-color: #F1FAEE;");

        imageView.setFitHeight(252.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(26.0);
        imageView.setLayoutY(125.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/Logo.png").toExternalForm()));

        imageView0.setFitHeight(97.0);
        imageView0.setFitWidth(204.0);
        imageView0.setLayoutX(24.0);
        imageView0.setLayoutY(43.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/iwishh.png").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        txt_user_name.setLayoutX(71.0);
        txt_user_name.setLayoutY(125.0);
        txt_user_name.setPrefHeight(27.0);
        txt_user_name.setPrefWidth(257.0);
        txt_user_name.setPromptText("User Name");
        txt_user_name.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        usernameError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        usernameError.setLayoutX(71.0);
        usernameError.setLayoutY(169.0);
        usernameError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameError.setStrokeWidth(0.0);
        usernameError.setWrappingWidth(255.369140625);
        usernameError.setFont(new Font("System Bold", 15.0));
        
  
        usernameError.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        txt_password.setLayoutX(71.0);
        txt_password.setLayoutY(220.0);
        txt_password.setPrefHeight(27.0);
        txt_password.setPrefWidth(257.0);
        txt_password.setPromptText("Password");
        txt_password.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        passwordError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        passwordError.setLayoutX(71.0);
        passwordError.setLayoutY(262.0);
        passwordError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordError.setStrokeWidth(0.0);
        passwordError.setWrappingWidth(266.369140625);
        passwordError.setFont(new Font("System Bold", 15.0));

        txt_email.setLayoutX(71.0);
        txt_email.setLayoutY(175.0);
        txt_email.setPrefHeight(27.0);
        txt_email.setPrefWidth(257.0);
        txt_email.setPromptText("Email");
        txt_email.setStyle("-fx-background-color: transparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        emailError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        emailError.setLayoutX(71.0);
        emailError.setLayoutY(215.0);
        emailError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        emailError.setStrokeWidth(0.0);
        emailError.setWrappingWidth(266.369140625);
        emailError.setFont(new Font("System Bold", 15.0));

        txt_security.setLayoutX(71.0);
        txt_security.setLayoutY(272.0);
        txt_security.setPrefHeight(27.0);
        txt_security.setPrefWidth(257.0);
        txt_security.setPromptText("What's your Favorite Color?");
        txt_security.setStyle("-fx-background-color: trasnparent; -fx-border-color: #34656D; -fx-border-width: 0px 0px 2px 0px;");

        securityError.setFill(javafx.scene.paint.Color.valueOf("#ea1212"));
        securityError.setLayoutX(71.0);
        securityError.setLayoutY(310.0);
        securityError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        securityError.setStrokeWidth(0.0);
        securityError.setFont(new Font("System Bold", 15.0));
        
        

        btn_signup.setLayoutX(145.0);
        btn_signup.setLayoutY(330.0);
        btn_signup.setMnemonicParsing(false);
        btn_signup.setStyle("-fx-background-color: #34656D;");
        btn_signup.setText("Sign Up");
        btn_signup.setTextFill(javafx.scene.paint.Color.WHITE);

        text.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text.setLayoutX(112.0);
        text.setLayoutY(373.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Have an account?");
        text.setWrappingWidth(98.369140625);

        signupError.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        signupError.setLayoutX(104.0);
        signupError.setLayoutY(388.0);
        signupError.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        signupError.setStrokeWidth(0.0);
        signupError.setWrappingWidth(167.369140625);

        lmk_login.setLayoutX(203.0);
        lmk_login.setLayoutY(357.0);
        lmk_login.setText("Login");
        lmk_login.setTextFill(javafx.scene.paint.Color.valueOf("#34656d"));

        text0.setFill(javafx.scene.paint.Color.valueOf("#34656d"));
        text0.setLayoutX(37.0);
        text0.setLayoutY(80.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Create your IWish Account");
        text0.setFont(new Font("System Bold", 18.0));

        imageView1.setFitHeight(24.0);
        imageView1.setFitWidth(29.0);
        imageView1.setLayoutX(25.0);
        imageView1.setLayoutY(125.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/iconUser.png").toExternalForm()));

        imageView2.setFitHeight(24.0);
        imageView2.setFitWidth(29.0);
        imageView2.setLayoutX(25.0);
        imageView2.setLayoutY(175.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/email.png").toExternalForm()));

        imageView3.setFitHeight(24.0);
        imageView3.setFitWidth(29.0);
        imageView3.setLayoutX(25.0);
        imageView3.setLayoutY(225.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("images/iconPass.png").toExternalForm()));

        imageView4.setFitHeight(24.0);
        imageView4.setFitWidth(29.0);
        imageView4.setLayoutX(25.0);
        imageView4.setLayoutY(277.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("images/encrypted.png").toExternalForm()));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(imageView0);
        anchorPane0.getChildren().add(txt_user_name);
        anchorPane0.getChildren().add(usernameError);
        anchorPane0.getChildren().add(txt_password);
        anchorPane0.getChildren().add(passwordError);
        anchorPane0.getChildren().add(txt_email);
        anchorPane0.getChildren().add(emailError);
        anchorPane0.getChildren().add(txt_security);
        anchorPane0.getChildren().add(securityError);
        anchorPane0.getChildren().add(btn_signup);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(signupError);
        anchorPane0.getChildren().add(lmk_login);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(imageView2);
        anchorPane0.getChildren().add(imageView3);
        anchorPane0.getChildren().add(imageView4);

    }

    public TextField getTxt_user_name() {
        return txt_user_name;
    }

    public Text getUsernameError() {
        return usernameError;
    }

    public PasswordField getTxt_password() {
        return txt_password;
    }

    public Text getPasswordError() {
        return passwordError;
    }

    public TextField getTxt_email() {
        return txt_email;
    }

    public Text getEmailError() {
        return emailError;
    }

    public TextField getTxt_security() {
        return txt_security;
    }

    public Text getSecurityError() {
        return securityError;
    }

    public Button getBtn_signup() {
        return btn_signup;
    }

    public Text getSignupError() {
        return signupError;
    }
    
    public Hyperlink getLmk_login(){
        return lmk_login;
    }

}
