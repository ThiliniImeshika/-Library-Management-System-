package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IssueBookController {

    @FXML
    private Button btnHome;


    @FXML
    private Button btnIssueBook;

    @FXML
    private DatePicker dateDueDate;

    @FXML
    private DatePicker dateIssueDate;

    @FXML
    private TextField txtSelectBook;

    @FXML
    private TextField txtSelectMember;

    @FXML
    void duedateOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homePage_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    @FXML
    void issuebookOnAction(ActionEvent event) {

    }

    @FXML
    void issuedateOnAction(ActionEvent event) {

    }


    @FXML
    void selectbookOnActiom(ActionEvent event) {

    }

    @FXML
    void selectmemberOnAction(ActionEvent event) {

    }

}
