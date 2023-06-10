package lk.ijse.pharmacy.controller;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.pharmacy.bo.BOFactory;
import lk.ijse.pharmacy.bo.Custom.LoginBO;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class LoginFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField lblUserName;

    @FXML
    private TextField lblPassword;

    @FXML
    private Button btnSign;

    @FXML
    private Button btnLogin;
    private Label lblLoginText;
    private JFXPanel mainContext;


    LoginBO loginBO = (LoginBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.LOGIN);

    public void btnOnAction(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource() == btnLogin) {
            String username = lblUserName.getText();
            String password = lblPassword.getText();
            if (username.equalsIgnoreCase("kavi") && password.equalsIgnoreCase("1234")) {
                AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("D:\\2nd Semester\\Pharmacy\\src\\main\\resources\\view\\dashboard_from.fxml")));
                Scene scene = new Scene(anchorPane);
                Stage stage = (Stage) root.getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Dashboard");
                stage.centerOnScreen();
                return;
            }
            if
            (lblUserName.getText().isEmpty() && lblPassword.getText().isEmpty()) {
                lblLoginText.setText("Please enter your data.");
                //loginBO.btnOnAction(  ("Please enter your data."));
            } else {
               new Alert(Alert.AlertType.ERROR,"WRONG PASSWORD !!!").show();
            }
        }
        lblUserName.clear();
        lblPassword.clear();
    }



    public void btnForgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("resources\\view\\supplier_from.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage= (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }

    public void btnSignupOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/register_form.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage= (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }
    @FXML
    void btnCreateAccountOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/register_form.fxml"));
        Scene scene=new Scene(anchorPane);
        Stage stage= (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }

}
