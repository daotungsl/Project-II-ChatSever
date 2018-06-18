package register;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private Label errUsername;
    @FXML
    private Label errPassword;
    @FXML
    private JFXPasswordField txtRepass;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private Label errEmail;
    @FXML
    private Label errRepass;

    public boolean isInputValid(){
        boolean valid = false;

        boolean userName ;
        return valid;
    }

    public boolean validUsername(String userName){
        boolean valid = true;
        String regex = "[A-Za-z0-9]+";

        if(userName == null || userName.isEmpty()){
            errUsername.setText(ErrMap.errMap.get("userName").getErrEmpty());
            valid = false;
        }else if(userName.matches(regex) == false){
            errUsername.setText(ErrMap.errMap.get("userName").getErrCha());
            valid = false;
        }else  if(userName.length() >20){
            errUsername.setText(ErrMap.errMap.get("userName").getErrlength());
        }else  if(userName.matches(regex) == true){
            errUsername.setText("");
            valid = true;
        }
        return valid;
    }

    public boolean validPassword(String pass){
        boolean valid = true;
        if(pass == null || pass.isEmpty()){
            errPassword.setText(ErrMap.errMap.get("password").getErrEmpty());
            valid = false;
        }else if(pass.length() < 6){
            errPassword.setText(ErrMap.errMap.get("password").getErrlength());
        }else {
            errPassword.setText("");
            valid = true;
        }
        return valid;
    }

    public boolean validEmail(String email){
        boolean valid = true;
        String regex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        if(email == null || email.isEmpty()){
            errEmail.setText(ErrMap.errMap.get("email").getErrEmpty());
            valid = false;
        }else if(email.matches(regex) == false){
            errEmail.setText(ErrMap.errMap.get("email").getErrCha());
            valid = false;
        }else {
            errEmail.setText("");
            valid = true;
        }
        return valid;
    }
    public boolean validRepass(String rePass){
        boolean valid = true;
        if(rePass.equals(txtPassword.getText()) == false){
            errRepass.setText("The password does not match try again.");
            valid = false;
        }else {
            errRepass.setText("");
            valid = true;
        }
        return valid;
    }

    public  void onkeyuserName(KeyEvent event) { validUsername(txtUsername.getText());}

    public  void onkeyPass(KeyEvent event) {validPassword(txtPassword.getText());}

    public void onkeyEmail(KeyEvent event) {validEmail(txtEmail.getText());}

    public void onkeyRepass(KeyEvent event) {validRepass(txtRepass.getText());}
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}