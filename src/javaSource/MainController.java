package javaSource;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button singleGame;
    @FXML
    private Button webGame;
    @FXML
    private Button aboutGame;
    @FXML
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
