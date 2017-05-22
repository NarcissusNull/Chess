package javaSource;

import javafx.event.ActionEvent;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ReadyController {

    public Button beginGame;

    public void initialize(URL url, ResourceBundle rb){
        //TODO 不知道干啥用
    }

    public void beginGameAction(ActionEvent event) throws Exception{
       //“开始”按钮处理机
        HomePage.readyStage.hide();
        runType.initAll();
        HomePage.runStage.show();
    }

}
