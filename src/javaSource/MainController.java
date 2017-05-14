package javaSource;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Button singleGame;
    private Button webGame;
    private Button aboutGame;
    private Button exitGame;
     //UI控件声明

    public void initialize(URL url, ResourceBundle rb){
        //TODO 不知道干啥用
    }
    public void singleGameAction(ActionEvent event)throws Exception{
        //“单人游戏”按钮处理机
        HomePage.mainStage.hide();
        HomePage.readyStage.show();
    }

    public void webGameAction(ActionEvent event)throws Exception{
        //“联机游戏”按钮处理机
        HomePage.mainStage.hide();
        HomePage.logInStage.show();
    }

    public void aboutGameAction(ActionEvent event)throws Exception{
        //“关于”按钮处理机
        HomePage.mainStage.hide();
        HomePage.aboutGameStage.show();
    }

    public void exitGameAction(ActionEvent event)throws Exception{
        //“退出”按钮处理机
        HomePage.mainStage.hide();
        HomePage.exitGameStage.show();
    }

}
