package javaSource;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    private Button logIn;
    private Button signUp;
    private TextField userName;
    private PasswordField passWord;
    //UI控件声明

    public void initialize(URL url, ResourceBundle rb){
        //TODO 不知道干啥用的
    }

    public void logInAction(ActionEvent event) throws Exception{
        //“登录”按钮处理机
        //TODO
        HomePage.logInStage.hide();
        HomePage.readyStage.show();
    }

    public void signUpAction(ActionEvent event) throws Exception{
        //“注册”按钮处理机
        //TODO
        HomePage.logInStage.hide();
        HomePage.signUpStage.show();
    }

}
