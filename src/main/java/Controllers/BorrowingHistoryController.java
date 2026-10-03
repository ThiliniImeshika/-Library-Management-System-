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

public class BorrowingHistoryController {

    @FXML
    private Button btnHome;

    @FXML
    private DatePicker dateIssueDate;

    @FXML
    private TextField tctBookTitle;

    @FXML
    private DatePicker txtDueDate;

    @FXML
    private TextField txtMemberId;

    @FXML
    private DatePicker txtReturnDate;

    @FXML
    private TextField txtStatus;

    @FXML
    void booktitleOnAction(ActionEvent event) {

    }

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
    void issueDateOnAction(ActionEvent event) {

    }

    @FXML
    void memberidOnAction(ActionEvent event) {

    }

    @FXML
    void returndateOnAction(ActionEvent event) {

    }

    @FXML
    void ststusOnAction(ActionEvent event) {

    }

}
