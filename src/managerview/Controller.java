package managerview;

import entityPost.UserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import entityPost.UserAttributes;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField txtName;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Button btnLogin;
    @FXML
    private Hyperlink btnFogotPass;
    @FXML
    private Button btnRegister;
    @FXML
    private ImageView gifLoading;
    @FXML
    private Label errLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    int change = 1;

    public void handleLogin(ActionEvent actionEvent) {

        if ((!(txtName.getText().length() == 0 && txtName.getText().equals(""))) && (!(txtPass.getText().length() == 0 && txtPass.getText().equals("")))) {
            if (change == 1) {
                btnLogin.setText("Cancel");
                gifLoading.setOpacity(1);
                btnRegister.setOpacity(0);
                errLogin.setText("");
                txtName.setDisable(true);
                txtPass.setDisable(true);
                change = 0;
            } else {
                btnLogin.setText("Login");
                txtName.setDisable(false);
                txtPass.setDisable(false);
                btnLogin.setOpacity(1);
                btnRegister.setOpacity(1);
                gifLoading.setOpacity(0);
                change = 1;
            }
        } else {
            errLogin.setText("Please enter Username & Password.");
        }
    }
public void handleSave(){
        UserAttributes userAttributes = new UserAttributes(txtName.getText(),txtPass.getText());
    UserData userData = new UserData(userAttributes,"REG");
}

}
