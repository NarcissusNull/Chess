package javaSource;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ExitGameController {

    public void initialize(URL url, ResourceBundle rb){
        //TODO 不知道干啥用的
    }

    public void yesController(ActionEvent event) throws Exception{
        //“确定”按钮处理机
        System.exit(0);
    }

    public void noController(ActionEvent event) throws Exception{
        //“取消”按钮处理机
        HomePage.exitGameStage.hide();
        HomePage.mainStage.show();
    }

}
