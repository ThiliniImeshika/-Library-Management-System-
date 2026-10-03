package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewMemberController {

    @FXML
    private Button btnHome;

    @FXML
    private TextField txtDeleteMember;

    @FXML
    private TextField txtEditMemberDetails;

    @FXML
    private TextField txtSearchMember;

    @FXML
    void deletememberOnAction(ActionEvent event) {

    }

    @FXML
    void editmemberdetailsOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(ActionEvent event) {

        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    @FXML
    void searchmemberOnAction(ActionEvent event) {

    }

}
