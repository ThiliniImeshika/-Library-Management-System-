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

public class ReturnBookController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnReturnBook;

    @FXML
    private DatePicker dateBorrowedDate;

    @FXML
    private DatePicker dateDueDate;

    @FXML
    private DatePicker dateReturnDate;

    @FXML
    private TextField txtFullMemberInfo;

    @FXML
    private TextField txtSearchBorrowedBook;

    @FXML
    void borroweddateOnAction(ActionEvent event) {

    }

    @FXML
    void duedateOnAction(ActionEvent event) {

    }

    @FXML
    void fullmemberinfoOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homePage.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    @FXML
    void returnbookOnAction(ActionEvent event) {

    }

    @FXML
    void returndateOnAction(ActionEvent event) {

    }

    @FXML
    void searchborrowedbookOnAction(ActionEvent event) {

    }

}
