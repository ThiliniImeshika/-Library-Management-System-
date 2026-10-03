package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginPageController {
    LoginController loginController = new LoginController();


    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnClearOnAction(ActionEvent event) {


    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {


        if(loginController.checkUsernameandPassword(txtUserName.getText(),txtPassword.getText())){
            Stage stage =new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homePage.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }


    }

    //in here control the logic part (this should stay in login controller)
//    private boolean checkUsernameandPassword(String name, String password) {
//        if(name.equals("nimal")&&password.equals("1234")){
//            return true;
//        }
//        return false;
//    }

}
