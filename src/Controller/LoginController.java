package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LoginController {
  @FXML
  TextField emailAddress;

  @FXML
  PasswordField passwordField;

  @FXML
  Button createAccount, signIn;

  @FXML
  Label Incorrect;

  @FXML
  Hyperlink ForgotPass;

  @FXML
  Text or;

    public void Enter(ActionEvent event) throws IOException {

        String username = emailAddress.getText();
        String password = passwordField.getText();
        String command = "@national-u.edu.ph";

        if (username.endsWith(command) && !password.isEmpty()) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            Incorrect.setVisible(true);
        }
    }
}

  


